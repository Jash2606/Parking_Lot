import java.sql.Date;
import java.util.List;

public class Bill {
    private long id;
    private Ticket ticket;
    private Date exitTime;
    private long amount;
    private List<Payment> payment;
    private Status status;
}
