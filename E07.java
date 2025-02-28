import java.util.Scanner;
public class E07{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		float peso,altura;
		System.out.println("Dame el peso de una persona");
		peso=teclado.nextFloat();
		System.out.println("Dame la altura de una persona");
		altura=teclado.nextFloat();
		System.out.println("El indice de masa corporal es "+(peso*(altura*altura)));
	}		
}
