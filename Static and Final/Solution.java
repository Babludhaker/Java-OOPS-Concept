
import java.util.*;

public class Solution {
	public static String isPrime(int num) {
		//Your code goes here
		if(num ==  1){
			return "NO";

		}
		// int n  = (int)Math.sqrt(num);
		for(int i=2;i<=num-1; i++){

			if(num%i==0){
				return "No";
			} 
		}
		return "YES";
	
	}
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPrime(num));
	}
	
}