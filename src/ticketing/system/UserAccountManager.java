package ticketing.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A storage class for holding user accounts.<p>
 * Also manages addition and removal of user accounts from system.
 * @author      Group C
 * @version     1.0
 * @since   02/03/2015
 * @serial (or @serialField or @serialData)     Serialized data is used.
 */
public class UserAccountManager implements Serializable {

    private static UserAccountManager usrAccMgr = null;
    private static List<UserAccount> userAccounts;

    private UserAccountManager() {
        userAccounts = new ArrayList<>();
    }

    /**
     * Implemented the singleton pattern. If a UserAccountManager is currently initialized then returns a reference to this object. If not yet initialized then the managers constructor is call and returns a references to it.
     * @return  A reference to the only UserAccountManager which will be in use in the system.
     */
    public static UserAccountManager getInstance() {
        if (usrAccMgr == null) {
            usrAccMgr = new UserAccountManager();
        }
        return usrAccMgr;
    }

    /**
     * Call a method retrieving the size of the collection holding the userAccounts in the system
     * @return  An integer equal to the number of UserAccounts stored in the system.
     */
    public static int getNumberOfUsers() {
        if (usrAccMgr == null) {
            return 0;
        } else {
            return userAccounts.size();
        }
    }

    /**
     * Uses the add method of the collection holding UserAccounts.
     * @param u the UserAccount to be added to the storage of the system.
     */
    public void addUserAccount(UserAccount u) {
        userAccounts.add(u);
    }

    /**
     * Uses a method to remove a single UserAccount from the collection of UserAccounts.
     * @param   u the UserAccount to be removed from the storage of the system.
     */
    public void deleteUserAccount(UserAccount u) {
        userAccounts.remove(u);
    }

    /**
     * Searches the collection storing UserAccounts and removes it if the given ID matches. 
     * @param   id the integer ID of a UserAccount to remove from the system.
     */
    public void deleteUserAccountById(int id) {
        for (UserAccount u : userAccounts) {
            if (u.getId() == id) {
                userAccounts.remove(u);
            }
        }
    }

    /**
     * Uses the given token ID to conduct a linear search of all tokens in all accounts until the token ID is matched.
     * @param   tokenId the ID of a token to be searched for in the system.
     * @return  Returns the last matching UserAccount reference associated with token id found in the system, intended to only be one. If non found then returns null
     */
    public UserAccount getUserAccountByTokenId(int tokenId) {

        for (UserAccount u : userAccounts) {
            for (Token to : u.getTokens()) {
                if (to.getId() == tokenId) {
                    return u;
                }
            }
        }
        return null;
    }

    /**
     * Uses a given ID to conduct a linear search through the system over UserAccounts until specific account found
     * @param   Id the unique ID of a userAccount which the caller is searching for.
     * @return  Returns the last matching UserAccount reference with the given ID.
     */
    public UserAccount getUserAccountById(int Id) {
        for (UserAccount u : userAccounts) {
            System.out.println("here");
            if (u.getId() == Id) {
                System.out.println("here");
                return u;
            }
        }
        return null;
    }

    /**
     * Conducts a linear search through the collection of UserAccounts in the system to match the given name with names on accounts.    
     * @param   name a string which is the full name which you are searching for in the system.
     * @return  Java List of UserAccount a list which is built within the the function containing references to all UserAccounts with given name.
     */
    public List<UserAccount> getUserAccountsByName(String name) {
        List<UserAccount> temp = new ArrayList<>();
        for (UserAccount u : userAccounts) {
            if (u.getPersonData().getName() == name) {
                temp.add(u);
            }
        }
        return temp;
    }

    /**
     *  Stub; not yet implemented.
     */
    public void deactivateInvalidDiscounts() {

    }

    /**
     *  Iterates over all passes in the system and inspects their current validity.
     */
    public void deactivateInvalidPasses() {
        for (UserAccount u : userAccounts) {
            for (Pass p : u.getAllPasses()) {
                if (!p.getPassPlan().isValid()) {

                }
            }
        }
    }

    /*
    *   Creates and returns a newline-seperated string list of every user account in the system using UserAcounts toString method which provides account details.
    */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (UserAccount ua : userAccounts) {
            sb.append(ua).append('\n');
        }
        return sb.toString();
    }
}
