import java.util.Scanner;
public class Encode {
	
	public static void main(String[] args) {
		
	String s1,s2;
	char c1;
	int i=0;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter text : ");
	s1=scan.nextLine();
	s2=s1.toUpperCase();
	
	for(i=s2.length()-1;i>=0;i--)
	{
		c1=s2.charAt(i);
		
		if(c1=='R'){
			c1='E';
		}
		else if(c1=='W'){
			c1='R';
		}
		else if(c1=='E'){
			c1='W';
		}
		System.out.print(c1);
	}
  }
}
