public class result {
    

interface Exam
{
	public boolean pass(int mark);
}

interface Classify
{
	public String division (int average);
}

public class Result implements Exam, Classify
{
	public boolean pass(int mark)
	{
		return(mark>=50);		
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
}

}
