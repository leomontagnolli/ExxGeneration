package generation.exercicios;

public class Exercicios1 {
	
	public static void main(String[] args) {
		
		float resultado = 0;
		
		
		for(int i = 1; i <= 500; i++) {
			if( (i%3 == 0) && (i%2 != 0)) {
				resultado+= i;
				System.out.println(resultado);
				
			} 
			
			
		}
		
	
		
	}
}
