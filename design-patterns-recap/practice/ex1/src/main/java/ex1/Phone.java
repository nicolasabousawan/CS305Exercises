package ex1;

public class Phone implements Observer{
    protected void printToPhone(String data){
        System.out.println("Phone - New data : " + data);
    }
//this is the universally accepted print function in this example
    @Override
    public void printData(String data) {
        printToPhone(data);
    }
}
