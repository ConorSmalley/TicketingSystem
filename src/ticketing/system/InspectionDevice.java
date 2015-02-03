package ticketing.system;

import java.util.ArrayList;

/**
 *
 */
public class InspectionDevice {

    private int Id;
    private UserAccount currentUserAccount;
    private Employee currentEmployee;   //via GUI
    private TravelPoint nextStop;   //via GUI
    private Route assignedRoute;    //via GUI
    private DigitalReader reader;
    private GUI inspecGUI;

    // untested
    public void activateScanning() {
        reader.initialize();
    }

    //incomplete untested
    public Boolean inspectToken() {
        return false;       //I suppose this is actually called by digital reader
        //determines vlidity based of accesibly current info, not passed info
    }

    //incomplete untested   //User Account is a travelers account not a inspector
    public String setCurrentUserAccount() {
        return "Incomplete";
    }

    //incomplete untested
    public Boolean anyValidTicketOrPass() {
        return false;
    }

    //incomplete untested
    public ArrayList<Pass> requestCurrentPasses() {
        return new ArrayList<Pass>();
    }

    //incomplete untested
    public UserAccount getCurrentUserAccount() {
        return currentUserAccount;
    }

    //incomplete untested
    public boolean generateIfringement() {
        return false;
    }

    //incomplete untested
    public void clearCurrentUser() {
        currentUserAccount = null;
    }

    // public int inspectionToken
}
