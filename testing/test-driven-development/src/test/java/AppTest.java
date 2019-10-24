import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class AppTest {
    Shop ticketStore = new Shop();

    Ticket ticket1 = new Ticket("Toronto", "Nickleback", Ticket.category.VIP);
    void addTicketToStore(){
        ticketStore.addTicket(ticket1);
        ticketStore.display();
    }

}
