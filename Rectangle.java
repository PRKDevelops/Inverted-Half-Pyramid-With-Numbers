
public class Rectangle {
public static void Inverted_Half_Pyramid(int n){
    for(int i = 1; i<=n; i++){
    	//inner-numbers
    	for(int j=1; j<= n-i+1; j++){
    		System.out.print(j);
    	}
    	System.out.println();
    	
    	}
    }
    	

	public static void main(String args[]){
		Inverted_Half_Pyramid(5);
		
}
}
