package ticketing.system;

import java.util.Date;

/**
 * A data object for recording invalid uses of passes or tickets which have
 * made their way back into the system after becoming invalid.</br>
 */
public class Infringement {

    private final Date d;
    private final Route r;
    private final TravelPoint tp;
    private final int en;

    Infringement(Date d, Route r, TravelPoint tp, int en) {
        this.d = d;
        this.r = r;
        this.tp = tp;
        this.en = en;
        System.out.println("Infringement created by: " + EmployeeAccountManager.getInstance().getEmployeeById(en).toString() + " on route " + r.toString() + " at travel point " + tp.getName());
    }

    @Override
    public String toString() {
        return EmployeeAccountManager.getInstance().getEmployeeById(en).toString();

    }
}
