class Rectangle
{
	//data member 		
	int length=fieldInit();
	int width=-1;  
	static int numOfObject=-1;
	
	//default constructor
	public Rectangle()
	{
		length=1;
		width=1;
		System.out.println("Default constructor invoked");		
		numOfObject++;
	}
	
	//parameterized constructor
	public Rectangle(int l, int b)
	{
		System.out.println("Parameterized constructor invoked");
		length=l;
		width=b;
		numOfObject++;
	}

	//copy constructor
	public Rectangle(Rectangle obj)
	{
		System.out.println("Copy constructor invoked");
		length=obj.length;
		width=obj.width;
		numOfObject++;
	}	

	//method to calculate area of rectangle
	public void getArea()
	{
		System.out.println("Length : "+length);
		System.out.println("Width  : "+width);
		System.out.println("Area   : "+length*width);		
	}
	
	//count number of objects created using static field
	public static void getNumOfObject()   
	{
		System.out.println("Number of object created : "+numOfObject);
	}
	
	public int fieldInit()
	{
		System.out.println("Field initialize");
		return(-1);
	}
}
public class q7 {
    public static void main(String args[])
	{
		System.out.println("\n********************************\n");
		Rectangle firstRect=new Rectangle();		
		firstRect.getArea();
		Rectangle.getNumOfObject();
		System.out.println("\n********************************\n");
		Rectangle secondRect1=new Rectangle(firstRect);	
		System.out.println("\n********************************\n");
		Rectangle secondRect=new Rectangle(6,3);				
		secondRect.getArea();
		Rectangle.getNumOfObject();
		System.out.println("\n********************************\n");
	}
}
