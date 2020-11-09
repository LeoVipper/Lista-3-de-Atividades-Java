package Operador;

public class Ternario {
	
	public static void main (String args[]) {
		
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		if(a < b) {
			
			System.out.println("A é menor que B");
				
		}else if(a > b) {
			
			System.out.println("A é maior que B");
			
		}
		
	}

}
//Leonardo Henrique M. de A. Ramos