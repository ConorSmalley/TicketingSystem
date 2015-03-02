package ticketing.system;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A central database of much of the information supporting the system.<p>
 * Collections for areas and discounts are found here.<p>
 * A reference to collection classes for other entities can be found here. 
 */
public class SystemSupervisor {

    private String Name;
    private ArrayList<Discount> discounts;
    private int Id;
    private ArrayList<Area> areas;

    public SystemSupervisor(String NameIn, int IdIn) //done
    {
        this.Name = NameIn;
        this.Id = IdIn;
        discounts = new ArrayList<Discount>();
        areas = new ArrayList<Area>();

    }

    public ArrayList getDiscounts() {
        return this.discounts;
    }

    public void addDiscount(Discount d) {
        discounts.add(d);
    }

    public void removeDiscount(Discount d) {
        discounts.remove(d);
    }

    //In the events of the Id of a Discount being found, will remove it. If ot found it will do nothing.
    public void removeDiscountById(int Id) {
        Iterator<Discount> it = discounts.iterator();
        if (!discounts.isEmpty()) {
            boolean found = false;
            while (it.hasNext() && !found) {
                Discount temp = it.next();
                if (temp.getId() == Id) {
                    System.out.println("found");
                    discounts.remove(temp);
                    found = true;
                }
            }
        }
    }

//    public void addArea(String areaNameIn) {
//        areas.add(new Area(areaNameIn));
//    }
    public void addArea(Area a) {
        areas.add(a);
    }

    public void removeArea(Area areaIn) {
        areas.remove(areaIn);
    }
    public ArrayList<Area> getAreas(){
        return areas;
    }
}
