package net.iessanclemente.a13oscarfm.katafizzbuzz;

public class KataFizzBuzz {
	
	public String multiplos(int num){
		String resp = "";
		if(num%3 == 0 && num%5 == 0){
			resp = "FizzBuzz";
		}else if(num%3 == 0){
			resp = "Fizz";
		}else if(num%5 == 0){
			resp = "Buzz";
		}else{
			resp = num+"";
		}
		return resp;
	}
}
