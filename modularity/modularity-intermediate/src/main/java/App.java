public class App {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(BankAccount.CurrencyType.EURO, 9001);
        account.add(BankAccount.CurrencyType.DOLLAR, 100);
        account.remove(BankAccount.CurrencyType.POUND, 10);
        System.out.println("Balance: " + account.getAmount());
    }
}

class BankAccount {
    public enum CurrencyType { DOLLAR, EURO, POUND };

    public BankAccount(CurrencyType currencyType, double amount) {
        this.currencyType = currencyType;
        this.amount = amount;
    }

    private CurrencyType currencyType;
    private double amount;

    public double convert(CurrencyType addedType,double addedAmount){
        double inCurrency = 0;
        if(currencyType == addedType) {
            inCurrency = addedAmount;
        }
        else if(currencyType == CurrencyType.DOLLAR && addedType == CurrencyType.EURO) {
            inCurrency = 1.15 * addedAmount;
        }
        else if(currencyType == CurrencyType.DOLLAR && addedType == CurrencyType.POUND) {
            inCurrency = 1.31 * addedAmount;
        }
        else if(currencyType == CurrencyType.EURO && addedType == CurrencyType.DOLLAR) {
            inCurrency = 0.87 * addedAmount;
        }
        else if(currencyType == CurrencyType.EURO && addedType == CurrencyType.POUND) {
            inCurrency = 1.14 * addedAmount;
        }
        else if(currencyType == CurrencyType.POUND && addedType == CurrencyType.DOLLAR) {
            inCurrency = 0.76 * addedAmount;
        }
        else if(currencyType == CurrencyType.POUND && addedType == CurrencyType.EURO) {
            inCurrency = 0.88 * addedAmount;
        }
        return inCurrency;
    }

    public boolean add(CurrencyType addedType, double addedAmount) {
        amount += convert(addedType,addedAmount);
        return true;
    }

    public boolean remove(CurrencyType removedType, double removedAmount) {
        amount -= convert(removedType,removedAmount);
        return true;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public double getAmount() {
        return amount;
    }
}


