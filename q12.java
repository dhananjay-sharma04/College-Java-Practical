import java.util.Scanner;

public class q12 {
    public static String toggleString(String sentence) 
	{
		StringBuilder toggled = new StringBuilder(sentence.length());
		for (char letter : sentence.toCharArray()) 
		{
			if(Character.isUpperCase(letter)) 
			{
				letter = Character.toLowerCase(letter);
			} 
			else if(Character.isLowerCase(letter)) 
			{
				letter = Character.toUpperCase(letter);
			}
			toggled.append(letter);
		}
		return toggled.toString();
	}
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

		String x=sc.nextLine();		
		System.out.println("old : "+x);
		x=toggleString(x);
		System.out.println("new : "+x);
	}
}
