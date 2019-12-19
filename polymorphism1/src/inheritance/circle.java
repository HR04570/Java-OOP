/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author hp
 */
public class circle extends shapes {
    private double radius;
    public circle()
    {
    
     }
    public circle(double radius,String color,boolean isfilled)
    {
        
       // super(color, isfilled);
        setcolor(color);
        
        setisfilled(isfilled);
        
        this.radius=radius;
    
    
      }
    public double getradius()
    {
    
    
    return radius;
    
     }
    public void setradius(double radius)
    {
    
    this.radius=radius;
    
    
     }
    public double area()
    {
    
    return radius*radius*Math.PI;
    
    
     }
    public void printcircle()
    {
        System.out.println(super.tostring());
        System.out.println("The radius is "+radius);
     }
    
}
