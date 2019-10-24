public final class App {
    public static void main(String[] args){
        Shop ticketStore = new Shop();

        Ticket ticket1 = new Ticket("Toronto", "Nickleback", Ticket.category.VIP);
        ticketStore.addTicket(ticket1);
        ticketStore.display();
    }
}
