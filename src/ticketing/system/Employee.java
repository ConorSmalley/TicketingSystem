/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

/**
 *
 * @author Curtis
 */
public class Employee {

    private String name;
    private int id;
    private String password;

    public Employee(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getPassword(){
        return password;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
