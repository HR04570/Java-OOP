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
public class Poly2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  animals a=new dog("Brown", 4, "German");
        System.out.println(a.getSound());
        animals b=new cat("white", 4, "Persian");
        System.out.println(b.getSound());
    }
    
}
