import java.util.Scanner;
public class Ordenado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vec = new int[5];
		boolean ordenado = true;
		
		for(int i = 0; i < vec.length; i++) 
		{
			System.out.println("ingresa número: ");
			vec[i] = teclado.nextInt();
		}
		
		teclado.close();
		
		for(int i = 0; i < vec.length - 1; i++) 
		{
			if(vec[i] > vec[i+1])
				ordenado = false;
		}
		
		if(ordenado)
			System.out.println("ordenado");
		else
			System.out.println("no ordonado");
	}
		
}
