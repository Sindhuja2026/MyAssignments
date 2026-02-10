package week2.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To print prime number

		int primenumber = 5;
		
		boolean isprime =true;
		
		//to find if the number is prime or not
		
		for (int i=2; i<primenumber; i++) {
			if (primenumber % i==0) {
				isprime = false;
				break;
			}
		}
		// print given number is prime or not
				
				if (isprime) {
					System.out.println (primenumber + " is a primenumber");
				}
				
					else {
						System.out.println (primenumber + " is not a primenumber");
					}
				}
			}
			
		
		

