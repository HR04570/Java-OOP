/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Inheritance  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//circle c=new circle(20, "yellow", true);
//        System.out.println(c.area());
//       
//        System.out.println( c.getcolor());
//        c.printcircle();
//rectangle r=new rectangle(34, 20,"red", true);
//        checkobject(r);
//        checkobject(c);
//
//    }
// public static void checkobject(shapes s)
// {
// 
//     System.out.println("Color is "+s.getcolor());
// }

ArrayList<shapes> a= new ArrayList<>();

a.add(new circle(23, "yellow", true));
a.add(new rectangle(23, 40, "black", true));
        for (shapes object : a) {
            
            System.out.println(object.getcolor());
            if(object instanceof circle)
            {
            System.out.println(object.getcolor());
                System.out.println(((circle) object).getradius());
             }
        }

    
    
    }
}
