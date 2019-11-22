package ex2;

import java.util.Date;

public class NewLoan {
    CapitalStrategy capitalStrategy;
    double commitment;
    double outstanding;
    int customerRating;
    Date maturity;
    Date expiry;
    int riskTaking;

    public static NewLoan termLoan(double commitment, int riskTaking, Date maturity){
        return new NewLoan(null,commitment, 0.00, riskTaking, maturity, null);
    }

    public static NewLoan RevolverLoan(double commitment, int riskTaking, Date maturity, Date expiry){
        return new NewLoan(null,commitment, 0.00, riskTaking, maturity, expiry);
    }

    public static NewLoan revolverLoan(double commitment, double outstanding, int customerRating, Date maturity, Date expiry){
        return new NewLoan(null, commitment, outstanding, customerRating, maturity, expiry);
    }

    public static NewLoan rctl(CapitalStrategy capitalStrategy, double commitment, int riskTaking, Date maturity, Date expiry){
        return new NewLoan(capitalStrategy, commitment, 0.00, riskTaking, maturity, expiry);
    }

    private NewLoan(CapitalStrategy capitalStrategy, double commitment, double outstanding, int riskTaking, Date maturity, Date expiry){
        this.commitment = commitment;
        this.outstanding = outstanding;
        this.riskTaking = riskTaking;
        this.maturity = maturity;
        this.expiry = expiry;
        this.capitalStrategy = capitalStrategy;

        if (capitalStrategy == null){
            if(expiry == null)
                this.capitalStrategy = new CapitalStrategyTermLoan();
            else if (maturity == null)
                this.capitalStrategy = new CapitalStrategyRevolver();
            else
                this.capitalStrategy = new CapitalStrategyRCTL();
        }
    }
}
