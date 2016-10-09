import java.util.*;
public class Etoile {
	
	
	public static void triangle(int n,int espace){
	String etoile = " ";
	for(int i=0;i<n;i++){
		espace =n-i;
		for(int j=0;j<espace;j++){
			System.out.print(" ");
		}
		etoile =etoile+"* ";
		System.out.println(etoile);
		}
	
}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int espace = 0;
		triangle(n,espace);
	}
}

