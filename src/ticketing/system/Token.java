package ticketing.system;

/**
 * A token is just a number which pertains to a user to identify them from a pass or ticket
 */
public class Token{
    private int Id;
    
    public Token(int Id){
        this.Id = Id;
    }
    public int getId(){
        return Id;
    }
}
