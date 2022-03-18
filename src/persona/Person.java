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
public class Person {
    private String name, address;
    
    public Person(String name, String address){
        
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toStrings(){
        String cadena = getName() + "," + getAddress();
        return cadena;
        
    }
    
    
}
