import java.util.Scanner;
public class E06{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		float t;
		System.out.println("Dame una temperatura en celsius");
		t=teclado.nextFloat();
		System.out.println(t+" en grados fahrenheit es "+(1.8*t+32));
	}		
}
