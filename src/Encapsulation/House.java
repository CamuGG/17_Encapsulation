package Encapsulation;

import java.util.ArrayList;

public class House {
    private int floorsNumber;
    private  String address;
    private String[] residentsNames;

    // getter and setter

    public int getFloorsNumber(){
        return floorsNumber;
    }
    public void setFloorsNumber(int floorsNumber){
        this.floorsNumber = floorsNumber;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String[] getResidentsNames(){
        return residentsNames;
    }
    public void setResidentsNames(String[] residentsNames){
        this.residentsNames = residentsNames;
    }
}
