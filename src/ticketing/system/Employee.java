
package ticketing.system;

/**
 * Holds login data for an employee who may operate a device which is able 
 * to charge travelling users for embarking and tickets.
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
