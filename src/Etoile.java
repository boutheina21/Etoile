
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
		int n=8; int espace = 0;
		triangle(n,espace);
	}
}

