package ticketing.system;

import java.util.ArrayList;
import java.util.Date;

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

        //do not presume valid token
        int tokenId = (reader.scanToken());    //retrieves token id
        // currentUserAccount = UserAccountManager.getUserAccountByTokenId(tempToken);
        this.setCurrentUserAccount(UserAccountManager.getInstance().getUserAccountByTokenId(tokenId));

        boolean validPass = false;
        boolean validTicket = false;
        boolean travelIsValid = false;

        if (currentUserAccount != null) {
            //search of valid pass so can return true or escapes
            validPass = currentUserAccount.checkActivePasses(assignedRoute);

            validTicket = currentUserAccount.checkActiveTicket(assignedRoute, nextStop);
            //handle a ticket
        }
        
        travelIsValid = anyValidTicketOrPass(validTicket, validPass);
        return travelIsValid;
        //I suppose this is actually called by digital reader   //old thought
        //determines validity based of accesibly current info, not passed info
    }

    //incomplete untested   //User Account is a travelers account not a inspector
    public void setCurrentUserAccount(UserAccount accountIn) {
        currentUserAccount = accountIn;
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
    public boolean generateInfringement() {

        boolean LogSuccesful = false;
        LogSuccesful = Area.getInstance().logInfringement(new Date(), assignedRoute, nextStop, Id);
    if (LogSuccesful){clearCurrentUser();} 
        return LogSuccesful;
        
    }

    //incomplete untested
    public void clearCurrentUser() {
        currentUserAccount = null;
    }

    // public int inspectionToken

    private boolean anyValidTicketOrPass(boolean validTicket, boolean validPass) {
        return (validTicket || validPass);
    }
}
