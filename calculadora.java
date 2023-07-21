import java.util.Scanner;
public class calculadora{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int opcion;

		int num1 = 0;
		int num2 = 0;
		int num3 = 100;
		do{
			System.out.println("calculadora 2022");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Porcentaje");
			System.out.println("6. Salir");
			opcion = sc.nextInt();

			switch(opcion){
			 case 1:
				System.out.println("Sumar");
				System.out.println("Ingrese el primer numero");
				num1 = sc.nextInt();
				System.out.println("Ingrese el segundo numero");
				num2 = sc.nextInt();
				System.out.println("Resultado: "+(num1+num2));
				break;
			case 2:
				System.out.println("Restar");
				System.out.println("Ingrese el primer numero");
				num1 = sc.nextInt();
				System.out.println("Ingrese el segundo numero");
				num2 = sc.nextInt();
				System.out.println("Resultado: "+(num1-num2));
				break;
			case 3:
				System.out.println("multiplicar");
				System.out.println("Ingrese el primer numero");
				num1 = sc.nextInt();
				System.out.println("Ingrese el segundo numero");
				num2 = sc.nextInt();
				System.out.println("Resultado: "+(num1*num2));
				break;
			case 4:
				System.out.println("Dividir");
				System.out.println("Ingrese el primer numero");
				num1 = sc.nextInt();
				System.out.println("Ingrese el segundo numero");
				num2 = sc.nextInt();
				if (num2 > 0){
					System.out.println("Resultado: "+(num1/num2));
				}else 
				{
					System.out.println("NO ES VALIDO AMIGO");
				}
				break;
			case 5 :
				System.out.println("Porcentaje");
				System.out.println("Ingrese el numero de Porcentaje");
				num1 = sc.nextInt();
				System.out.println("Resultado es:"+((num1*num2)/100));

				break;
				
			case 6:
				System.out.println("ADIOS VUELVE PRONTO");
				break;
			default:
				System.out.println(" NO SE VALE >:(");
			}

		}while(opcion!=6);

		 
	}
}