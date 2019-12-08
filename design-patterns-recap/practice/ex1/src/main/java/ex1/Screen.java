package ex1;

public class Screen implements Observer {
    protected void display(String data){
        System.out.println("Screen - New data : " + data);
    }
//this is the universally accepted print function in this example
    @Override
    public void printData(String data) {
        display(data);
    }
}