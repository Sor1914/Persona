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
public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }
    
    public String toStrings(){
        String cadena = getName() + "," + getAddress() + "," + getYear() + "," + getFee();
        return cadena;
    }
}
