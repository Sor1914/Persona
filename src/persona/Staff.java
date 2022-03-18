/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author xXSorzXx
 */
public class Staff extends Person{
    
    private String school;
    private double pay;
    
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }
    
     public String toStrings(){
        String cadena = getName() + "," + getAddress() + "," + getSchool() + "," + getPay();
        return cadena;
    }
}
