import java.util.ArrayList;

public class Shop {
    ArrayList<Ticket> shop;
    Ticket ticket;

    public Shop(){
        shop = new ArrayList<Ticket>();
    }

    public void addTicket(Ticket ticket){
        shop.add(ticket);
    }

    public void display(){
        for(int x = 0; x < shop.size(); x++){
            Ticket item = shop.get(x);
            System.out.println(item.getMusicGroup() + " @ " + item.getLocation() + " Class:" + item.getCategory());
        }
    }

}
