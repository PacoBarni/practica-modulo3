
public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1, num2=2, num3=30, num4=4;
		if (num1>num2 && num1>num3 && num1>num4) {
			System.out.printf("El número 1 de valor (%d) es el mayor", num1).println();
		} else {
			if (num2>num1 && num2>num3 && num2>num4) {
				System.out.printf("El número 2 de valor (%d) es el mayor", num2).println();
			}
		
			else {
				if (num3>num1 && num3>num2 && num3>num4) {
					System.out.printf("El número 3 de valor (%d) es el mayor", num3).println();
				}
		
			else {
				System.out.printf("El número 4 de valor (%d) es el mayor", num4).println();
			}
}
		}
	}
}
