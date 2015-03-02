package ticketing.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * Implements the scanToken method which allows return of a token ID, given by a
 * travelling user, when a token is detected.
 */
public class DigitalReader {

    private InspectionDevice inspectionDevice;
    private PaymentHub paymentHub;

    DigitalReader() {
        initialize();
    }

    public int scanToken() {
        return Integer.parseInt(JOptionPane.showInputDialog("Enter user id: "));
//        return 0;
        //presumably this should be a listener which passes a token to handleToken

    }

    public void setPaymentHub(PaymentHub paymentHubIn) {
        paymentHub = paymentHubIn;
    }

    public void setInspectionDevice(InspectionDevice inspectionDeviceIn) {
        inspectionDevice = inspectionDeviceIn;
    }

    public void initialize() {
        System.out.println("initialized");
    }

}
