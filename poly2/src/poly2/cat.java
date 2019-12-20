/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly2;

/**
 *
 * @author hp
 */
public class cat extends animals {
    
    public cat(String color, int legs, String type) {
        super(color, legs, type);
    }
    
    public String getSound() {
        return "Meow";
    }
}
