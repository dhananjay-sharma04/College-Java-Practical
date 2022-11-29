/*
Describe abstract class called Shape which has three subclasses say Triangle,Rectangle, and Circle. Define one method area () in the abstract class and override this area () in these three subclasses to calculate for specific object i.e. area () of Triangle subclass should calculate area of triangle etc. Same for Rectangle and Circle
*/
import java.lang.Math;

abstract class Shape
{	
	double area;
	Shape()
	{
		this.area=0;
	}	 
	abstract void area();
}

class Triangle extends Shape
{ 
	double base=0,height=0;
	Triangle()
	{		
		this.base=0;
		this.height=0;
	}
	Triangle(double height,double base)
	{			
		this.height=height;
		this.base=base;		
	}
	void area()
	{
		area = (base*height)/2;
		System.out.println("area of Triangle :"+area);
	}
}

class Rectangle extends Shape
{
	double width=0,height=0;
	Rectangle()
	{			
		this.height=0;
		this.width=0;
	}
	Rectangle(double height,double width)
	{			
		this.height=height;
		this.width=width;		
	}
	void area()
	{
		area = width*height;
		System.out.println("area of Rectangle :"+area);
	}
}

class Circle extends Shape
{
	double radius=0;
	Circle()
	{
		this.radius=0;
	}
	Circle(double x)
	{
		this.radius=x;
	}
	void area()
	{
		area = Math.PI * (radius * radius);
		System.out.println("area of Circle :"+area);
	}
}

class Ex23
{
	public static void main(String [] args)
	{
		Triangle t= new Triangle(50,15);
		Rectangle r =new Rectangle(70,20);
		Circle c =new Circle(5);

		t.area();
		r.area();
		c.area();
	}
}
/*
 * ______________output_____________
 * area of Triangle :375.0
area of Rectangle :1400.0
area of Circle :78.53981633974483
 * 
 */