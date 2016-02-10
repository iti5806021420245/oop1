import java.util.Scanner;
public class Seven_Dwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int D1,D2,D3,D4,D5,D6,D7,D8,D9,sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Dwarf 1 : ");
		D1 = scan.nextInt();
		System.out.print("Enter Dwarf 2 : ");
		D2 = scan.nextInt();
		System.out.print("Enter Dwarf 3 : ");
		D3 = scan.nextInt();
		System.out.print("Enter Dwarf 4 : ");
		D4 = scan.nextInt();
		System.out.print("Enter Dwarf 5 : ");
		D5 = scan.nextInt();
		System.out.print("Enter Dwarf 6 : ");
		D6 = scan.nextInt();
		System.out.print("Enter Dwarf 7 : ");
		D7 = scan.nextInt();
		System.out.print("Enter Dwarf 8 : ");
		D8 = scan.nextInt();
		System.out.print("Enter Dwarf 9 : ");
		D9 = scan.nextInt();
		
		sum = D1 + D2 + D3 + D4 + D5 + D6 + D7 + D8 + D9;
		
		if(sum-(D9+D8)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D7);
		}
		
		else if(sum-(D9+D7)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D8);
		}
		
		else if(sum-(D9+D6)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D7+"\n"+D8);
		}
		
		else if(sum-(D9+D5)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D4+"\n"+D6+"\n"+D7+"\n"+D8);
		}
		
		else if(sum-(D9+D4)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D8);
		}
		
		else if(sum-(D9+D3)==100){
		System.out.println(D1+"\n"+D2+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D8);
		}
		
		else if(sum-(D9+D2)==100){
		System.out.println(D1+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D8);
		}
		
		else if(sum-(D9+D1)==100){
		System.out.println(D2+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D8);
		}
		
		else if(sum-(D8+D7)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D9);
		}
		
		else if(sum-(D8+D6)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D8+D5)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D4+"\n"+D6+"\n"+D7+"\n"+D9);
		}
		
		else if(sum-(D8+D4)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D9);
		}
		
		else if(sum-(D8+D3)==100){
		System.out.println(D1+"\n"+D2+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D9);
		}
		
		else if(sum-(D8+D2)==100){
		System.out.println(D1+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D9);
		}
		
		else if(sum-(D8+D1)==100){
		System.out.println(D2+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D9);
		}
		
		else if(sum-(D7+D6)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D7+D5)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D4+"\n"+D6+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D7+D4)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D5+"\n"+D6+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D7+D3)==100){
		System.out.println(D1+"\n"+D2+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D7+D2)==100){
		System.out.println(D1+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D7+D1)==100){
		System.out.println(D2+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D6+D5)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D4+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D6+D4)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D5+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D6+D3)==100){
		System.out.println(D1+"\n"+D2+"\n"+D4+"\n"+D5+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D6+D2)==100){
		System.out.println(D1+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D6+D1)==100){
		System.out.println(D2+"\n"+D3+"\n"+D4+"\n"+D5+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D5+D4)==100){
		System.out.println(D1+"\n"+D2+"\n"+D3+"\n"+D6+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D5+D3)==100){
		System.out.println(D1+"\n"+D2+"\n"+D4+"\n"+D6+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D5+D2)==100){
		System.out.println(D1+"\n"+D3+"\n"+D4+"\n"+D6+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D5+D1)==100){
		System.out.println(D2+"\n"+D3+"\n"+D4+"\n"+D6+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D4+D3)==100){
		System.out.println(D1+"\n"+D2+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D4+D2)==100){
		System.out.println(D1+"\n"+D3+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D4+D1)==100){
		System.out.println(D2+"\n"+D3+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D3+D2)==100){
		System.out.println(D1+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D3+D1)==100){
		System.out.println(D2+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else if(sum-(D2+D1)==100){
		System.out.println(D3+"\n"+D4+"\n"+D5+"\n"+D6+"\n"+D7+"\n"+D8+"\n"+D9);
		}
		
		else{
		System.out.println("Error");
		}
	}

}
