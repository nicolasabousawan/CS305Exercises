package ch.epfl.sweng.dp1.solutions.ex3;

public class Phone implements Observer {

    private void printToPhone(String data){
        System.out.println("Phone - New data : " + data);
    }

    @Override
    public void update(String data) {
        this.printToPhone(data);
    }
}
