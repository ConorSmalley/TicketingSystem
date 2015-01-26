/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.io.Serializable;

/**
 *
 * @author Conor
 */
public class Person implements Serializable {

    private String Name;
    private String AddressLine1;
    private String AddressLine2;
    private String AddressLine3;
    private String Town;
    private String County;
    private String Postcode;

    Person(String Name) {
        this.Name = Name;
    }

    public String GetAddressL1() {
        return AddressLine1;
    }

    public String GetAddressL2() {
        return AddressLine2;
    }

    public String GetAddressL3() {
        return AddressLine3;
    }

    public String GetTown() {
        return Town;
    }

    public String GetCounty() {
        return County;
    }

    public String GetPostcode() {
        return Postcode;
    }

    public void SetAddressL1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    public void SetAddressL2(String AddressLine2) {
        this.AddressLine2 = AddressLine2;
    }

    public void SetAddressL3(String AddressLine3) {
        this.AddressLine3 = AddressLine3;
    }

    public void SetTown(String Town) {
        this.Town = Town;
    }

    public void SetCounty(String County) {
        this.County = County;
    }

    public void SetPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getName() {
        return Name;
    }
    @Override
    public String toString(){
        return Name;
    }
}
