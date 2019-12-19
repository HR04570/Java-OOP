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
public class shapes {
    private String color;
     private boolean isfilled;
    public shapes()
    {
        
        System.out.println("");
      }
    public shapes(String color,boolean isfilled)
    {
        this.isfilled=isfilled;
     this.color=color;   
    
      }
    public void setcolor(String color)
    {
        this.color=color;
    
      }
     public String getcolor()
    {
        
    return color;
      }
     public void setisfilled(Boolean isfilled)
    {
        this.isfilled=isfilled;
    
      }
     public boolean getisfilled()
    {
        
    return getisfilled();
      }
     public String tostring()
     {
     
     return "coloris"+color+"and filled"+isfilled;
      }
     
}
