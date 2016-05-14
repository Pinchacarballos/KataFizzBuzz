package net.iessanclemente.a13oscarfm.katafizzbuzz;

public class KataFizzBuzz {
	
	/**
	 * This method checks if given number is multiple of 3, 5 or both
	 * and returns 'Fizz', 'Buzz' or 'FizzBuzz', respectively.
	 * 
	 * @param num: The given number
	 * @return 'Fizz'|'Buzz'|'FizzBuzz'
	 */
	public String multiplos(int num){
		String resp = "";
		if(num%3 == 0 && num%5 == 0){
			resp = "FizzBuzz";
		}else if(num%3 == 0){
			resp = "Fizz";
		}else if(num%5 == 0 || (num+"").contains("5")){
			resp = "Buzz";
		}else{
			resp = num+"";
		}
		return resp;
	}
}
