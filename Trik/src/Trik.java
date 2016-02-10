import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left=1,center=0,right=0,temp,i; 
		String Change; 
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter Value : "); 
		Change = scan.next(); 
		for(i=0;i<Change.length();i++){
			if(Change.charAt(i) == 'A' || Change.charAt(i) == 'a'){ 
				temp=left; left=center; center=temp;}
			else if(Change.charAt(i) == 'B' || Change.charAt(i) == 'b'){ temp=center; center=right; right=temp; 
			}
			else{ temp=left; left=right; right=temp; } 
			} 
			if(left == 1) System.out.println("Coin is in Left glass"); 
			else if(center == 1) System.out.println("Coin is in Center glass"); 
			else System.out.println("Coin is in Right glass");
	}

}
