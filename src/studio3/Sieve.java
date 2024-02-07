package studio3;
import java.util.Arrays;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int n = in.nextInt();
		boolean[] sieve = new boolean[n];
		Arrays.fill(sieve, true); 

		for(int i = 2; i < n; i++) {
			if(sieve[i] == true) {
				for(int j = i*i; j < n; j+=i) {
					sieve[j] = false;
			}
		}
	  }
		for (int length = 2; length < sieve.length; length++) {
			if (sieve[length]) { 
			System.out.print(length + " ");
		}
		}
	}
}


