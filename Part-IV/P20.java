/**Create a class named 'Shape' with a method to print "This 
is This is shape". Then create two other classes named 
'Rectangle', 'Circle' inheriting the Shape class, both 
having a method to print "This is rectangular shape" and 
"This is circular shape" respectively. Create a subclass 
'Square' of 'Rectangle' having a method to print "Square 
is a rectangle". Now call the method of 'Shape' and 
'Rectangle' class by the object of 'Square' class. */

class Shape
{
    public void shape()
    {
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape
{
    public void rec()
    {
        System.out.println("This is rectangular shape");
    }
}
class Square extends Rectangle
{
    public void sqr()
    {
        System.out.println("Square is a rectangle");
    }
}
class Circle extends  Shape
{
    public void cir()
    {
        System.out.println("This is rectangular shape");
    }
}

public class P20{
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.shape();
        s1.rec();
    }
}