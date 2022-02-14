class Rectangle
{
   private double length;
   private double width;
   public void setRectangle(double length, double width){
      this.length = length;
      this.width  = width;
   }
 
   
   public double getArea(){
      return length * width;
   }
}

class Box extends Rectangle
{
   private double height;
   public void setBox(double length, double width, double height){
      setRectangle(length,width); 
      this.height = height;
   }

   public double getVolume(){
      return getArea() * height;
   }
}

public class Q1
{
   public static void main(String[] args){
      Box room = new Box();

      room.setBox(12.5, 10.5, 9.5);
      
      System.out.println("Volume is " + room.getVolume());
   }
}