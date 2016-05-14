package net.iessanclemente.a13oscarfm.katafizzbuzz;

public class Main {
	public static void main(String args[]){
		KataFizzBuzz kfb = new KataFizzBuzz();
		for(int i = 1; i <= 100; i++){
			System.out.println(kfb.multiplos(i));
			//System.out.println(kfb.contieneTres(i+""));
		}
	}
}
