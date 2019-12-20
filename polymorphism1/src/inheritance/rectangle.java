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
public class rectangle extends shapes {
private double height;
private double width;
    public rectangle()
{}
public rectangle(double width,double height,String color,boolean isfilled){
 super(color, isfilled);
 this.height=height;
 this.width=width;
}

public double getwith()
{
return this.width;
    
    

 }
public void setwidth(double width)
{
    this.width=width;
    
    

 }
public double getheight()
{
return this.height;
    
    

 }
public void setheight(double height)
{
    this.height=height;
    
    

 }

    @Override
    public String toString() {
        return "rectangle{" + "height=" + height + ", width=" + width + '}';
    }
public double getarea()
{

return width*height;
 }

}
