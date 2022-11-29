

public class student extends result
{
	private int enNo;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	private int m4;
	private int m5;
	public student()
	{
		this.enNo=0;
		this.name="undefine";
		this.m1=0;
		this.m2=0;
		this.m3=0;
		this.m4=0;
		this.m5=0;
	}
	public student(int enNo,String name,int m1,int m2,int m3,int m4,int m5)
	{
		this.enNo=enNo;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
	}
	public int getTotal()
	{
		return(this.m1+this.m2+this.m3+this.m4+this.m5);
	}
	public int getAverage()
	{
		return((this.m1+this.m2+this.m3+this.m4+this.m5)/5);
	}
	public void getStudent()
	{
		System.out.println("********************************");
		System.out.println("Enrollment : "+this.enNo);
		System.out.println("Mark Sub 1 : "+this.m1);
		System.out.println("Mark Sub 2 : "+this.m2);
		System.out.println("Mark Sub 3 : "+this.m3);
		System.out.println("Mark Sub 4 : "+this.m4);
		System.out.println("Mark Sub 5 : "+this.m5);
		System.out.println("Average    : "+this.getTotal());
		System.out.println("Total      : "+this.getAverage());
		String x=this.pass(this.getTotal())?"PASS":"FAIL";
		System.out.println("Result     : "+x);
		System.out.println("Division   : "+this.division(this.getAverage()));
		System.out.println("********************************");
	}
    public String division (int average)
	{
		String d="undefine";
		if(average>=60)
			d="First";
		else if(average>=50)
			d="Second";
		else
			d="No division";
		
		return(d);
	}
    public boolean pass(int mark)
	{
		return(mark>=50);		
	}
}
