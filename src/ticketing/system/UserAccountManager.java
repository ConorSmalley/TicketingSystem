/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.List;

/**
 *
 * @author Conor
 */
public class UserAccountManager {
    private List<UserAccount> userAccounts;
    
    UserAccountManager() {
        
    }
    public void addUserAccount(UserAccount u){
        userAccounts.add(u);
    }
    public void deleteUserAccount(UserAccount u){
        userAccounts.remove(u);
    }
    
}
