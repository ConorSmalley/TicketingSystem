/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Conor
 */
public class UserAccountManager implements Serializable {
    private UserAccountManager usrAccMgr = null;
    private List<UserAccount> userAccounts;

    private UserAccountManager() {
        userAccounts = new ArrayList<>();
    }
    
    public UserAccountManager getInstance(){
        if(usrAccMgr == null){
            usrAccMgr = new UserAccountManager();
        }
        return usrAccMgr;
    }

    public void addUserAccount(UserAccount u) {
        userAccounts.add(u);
    }

    public void deleteUserAccount(UserAccount u) {
        userAccounts.remove(u);
    }

    public void deleteUserAccountById(int id) {
        for (UserAccount u : userAccounts) {
            if (u.getId() == id) {
                userAccounts.remove(u);
            }
        }
    }

    public UserAccount getUserAccountByToken(Token t) {
        for (UserAccount u : userAccounts) {
            for (Token to : u.getTokens()) {
                if (to == t) {
                    return u;
                }
            }
        }
        return null;
    }

    public UserAccount getUserAccountById(int Id) {
        for (UserAccount u : userAccounts) {
            if (u.getId() == Id) {
                return u;
            }
        }
        return null;
    }

    public List<UserAccount> getUserAccountsByName(String name) {
        List<UserAccount> temp = new ArrayList<>();
        for (UserAccount u : userAccounts) {
            if (u.getPersonData().getName() == name) {
                temp.add(u);
            }
        }
        return temp;
    }

    public void deactivateInvalidDiscounts() {

    }

    public void deactivateInvalidPasses() {
        for (UserAccount u : userAccounts) {
            for (Pass p : u.getAllPasses()) {
                if (!p.getPassPlan().isValid()) {
                    
                }
            }
        }
    }
}
