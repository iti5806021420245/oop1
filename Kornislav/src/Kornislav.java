import java.util.Scanner;

public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number1,Number2,Number3,Number4,Temp;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number_1 : ");
		Number1=scan.nextInt();
		System.out.print("Enter Number_2 : ");
		Number2=scan.nextInt();
		System.out.print("Enter Number_3 : ");
		Number3=scan.nextInt();
		System.out.print("Enter Number_4 : ");
		Number4=scan.nextInt();
		
		if(Number1>Number2){
			Temp=Number1;
			Number1=Number2;
			Number2=Temp;
		}
		
		if(Number1>Number3){
			Temp=Number1;
			Number1=Number3;
			Number3=Temp;
		}
		
		if(Number1>Number4){
			Temp=Number1;
			Number1=Number4;
			Number4=Temp;
		}
		
		if(Number2>Number3){
			Temp=Number2;
			Number2=Number3;
			Number3=Temp;
		}
		
		if(Number2>Number4){
			Temp=Number2;
			Number2=Number4;
			Number4=Temp;
		}
		
		if(Number3>Number4){
			Temp=Number3;
			Number3=Number4;
			Number4=Temp;
		}
		
		System.out.println("\nRectangle Area = : "+""+Number3+""+" * "+Number1+" = "+Number3*Number1);
	}

}
