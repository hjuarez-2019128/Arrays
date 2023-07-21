import java.util.Scanner;
public class Ecuaciones{
 
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		int v;
		double [] formula;
		Scanner sca = new Scanner(System.in);
		formula = new double [19];
		
		do{

		     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		     System.out.println("             1. Raiz Cuadrada ");
		     System.out.println("             2. Operaiones Cuadraticas      ");
			 System.out.println("             3. Ecuaciones 2x2          ");
			 System.out.println("             4. Ecuaciones 3x3                    ");
			 System.out.println("             5.  Suma de Vectores");
			 System.out.println("             6. Serie fibonacci");
			 System.out.println("             7. Dejar de operar");
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	         System.out.println("Escoje una opcion bro");
	         opcion  = sca.nextInt();
		
         switch (opcion){
         	case 1:

			System.out.println("Ingrese el numero a obtener de la raiz cuadrada");

	        formula[1] = sca.nextDouble();

	        formula[2] = Math.sqrt(formula[1]);

	        System.out.println("la raiz cuadrada de "+formula[1]+"es"+formula[2]);
	        
	        break;

 
			case 2:

			System.out.println("Ingresa el numero de valor a");
			formula[0]=sca.nextDouble();
			System.out.println("Ingrese el numero de valor b:");
			formula[1]=sca.nextDouble();
	        System.out.println("Ingrese el numero de valor c");
			formula[2]=sca.nextDouble();;

			formula[3] = formula[1]*formula[1] -(4*formula[0]*formula[2]);

			if(formula[3]<0){
				formula[4] = formula[3]*(-1);
				formula[5] = (-1)*formula[1]/(2*formula[0]);
				formula[6] = Math.sqrt(formula[4])/(2 * formula[0]);

				System.out.println("resulatdo x1:"+formula[5]*(-1)+"+"+formula[6]+"i");
				System.out.println("resulatdo x2:"+formula[5]*(-1)+formula[6]*(-1)+"i");
			}else{
				formula[5] = -(formula[1]-Math.sqrt(formula[3]))/2*formula[0];
				formula[6] = -(formula[1]+Math.sqrt(formula[3]))/2*formula[0];

				System.out.println("resulatado x1:"+formula[5]);
				System.out.println("resulatado x2:"+formula[6]);
			}
			break;

		    case 3:

			  System.out.println("Escribe el valor del coeficiente X1:");
		  	  formula[0]=sca.nextDouble();
			  System.out.println("Escribe el valor del coeficiente Y1:");
			  formula[1]=sca.nextDouble();
			  System.out.println("Escribe el valor del coeficiente R1:");
			  formula[2]=sca.nextDouble();
			  System.out.println("Escribe el valor del coeficiente X2:");
			  formula[3]=sca.nextDouble();
			  System.out.println("Escribe el valor del coeficiente Y2:");
			  formula[4]=sca.nextDouble();
			  System.out.println("Escribe el valor del coeficiente R2:");
			  formula[5]=sca.nextDouble();
     
			 
			  formula[6]=(formula[2]*formula[4]-formula[1]*formula[5])/(formula[0]*formula[4]-formula[1]*formula[3]);
			  formula[7]=(formula[0]*formula[5]-formula[2]*formula[3])/(formula[0]*formula[4]-formula[1]*formula[3]);
			  System.out.println("El resultado de x es:"+formula[6]);
			  System.out.println("El resultado de y es:"+formula[7]);
			 
			
			break; 

		    case 4:
				System.out.println("Ingrese el numero de valor X1");
				formula[0]=sca.nextDouble();
				System.out.println("Ingrese el numero de valor Y1");
				formula[1]=sca.nextDouble();
				System.out.println("Ingrese el numero de valor Z1");
				formula[2]=sca.nextDouble();
				System.out.println("Ingrese el numero de valor R1");
				formula[3]=sca.nextDouble();


				System.out.println("Ingrese el numero de valor X2");
				formula[4]=sca.nextDouble();
				System.out.println("Ingrese el numero de valor Y2");
				formula[5]=sca.nextDouble();
				System.out.println("Ingrese el numero de valor Z2");
				formula[6]=sca.nextDouble();
				System.out.println("Ingrese el numero de valor R2");
				formula[7]=sca.nextDouble();

				System.out.println("Ingrese el numero de valor X3");
				formula[8]=sca.nextDouble();
				System.out.println("Ingrese el numero de valor Y3");
				formula[9]=sca.nextDouble();
				System.out.println("Ingrese el numero de valor Z3");
				formula[10]=sca.nextDouble();
				System.out.println("Ingrese el numero de valor R3");
				formula[11]=sca.nextDouble();

			
				formula[12]=(formula[0]*formula[5]*formula[10])+(formula[1]*formula[6]*formula[8])+(formula[2]*formula[4]*formula[9])-(formula[2]*formula[5]*formula[8])-(formula[0]*formula[6]*formula[9])-(formula[1]*formula[4]*formula[10]);
				formula[13]=(formula[3]*formula[5]*formula[10])+(formula[1]*formula[6]*formula[11])+(formula[2]*formula[7]*formula[9])-(formula[2]*formula[5]*formula[11])-(formula[3]*formula[6]*formula[9])-(formula[1]*formula[7]*formula[10]);
				formula[14]=(formula[0]*formula[7]*formula[10])+(formula[3]*formula[6]*formula[8])+(formula[2]*formula[4]*formula[11])-(formula[2]*formula[7]*formula[8])-(formula[0]*formula[6]*formula[11])-(formula[3]*formula[4]*formula[10	]);
				formula[15]=(formula[0]*formula[5]*formula[11])+(formula[1]*formula[7]*formula[8])+(formula[3]*formula[4]*formula[9])-(formula[3]*formula[5]*formula[8])-(formula[0]*formula[7]*formula[9])-(formula[1]*formula[4]*formula[11]);
				formula[16]=formula[13]/formula[12];formula[17]=formula[14]/formula[12];formula[18]=formula[15]/formula[12];

				System.out.println("El valor de la determinante es:"+formula[12]); 
				System.out.println( "El valor de la determinante de X:"+formula[16]);
				System.out.println( "El valor de la determinante de Y:"+formula[17]);
				System.out.println( "El valor de la determinante de Z:"+formula[18]);
				
			break;

			case 5:

				System.out.println("SUMA DE VECTORES");	
			
			System.out.println("Cuantas sumas desea realizar?");
			v = sca.nextInt();
			int [] formula1 = new int [v];
			int [] formula2 = new int [v];
			int [] formula3 = new int [v];

			for (int i = 0;i < v ;i++ ) {
				formula1[i] = 1 + (int)(Math.random()*100);
				formula2[i] = 1 + (int)(Math.random()*100);
			}
			for (int i = 0;i < v ;i++ ) 
				formula3[i] = formula1[i] + formula2[i];

			System.out.println("Primer Vector");
			for (int i = 0;i < v ;i++ ) 
				System.out.println("Vector 1: "+formula1[i]);

			System.out.println("Segundo Vector");
			for (int i = 0;i < v ;i++ ) 
				System.out.println("Vector 2: "+formula2[i]);	

			System.out.println("Suma de Vectores");
				for (int i = 0;i < v ;i++ ) 
					System.out.println("Resultado de los vectores: " +formula1[i]+ "+" + formula2[i]+ "=" +formula3[i]);	
			break;

			 case 6:

			formula[0] = 0;
				formula[1] = 1;
				System.out.println("SERIE FIBONACCI");
				System.out.println("Ingresa el numero");
				formula[2] = sca.nextDouble();
				
				System.out.println("Serie Fibonacci hasta: " +formula[2]);
				for (formula[4] = 0;formula[4]< formula[2] ;formula[4]++ ) {
					System.out.println(formula[0]);
					formula[3] = formula[0] + formula[1];
					formula[0] = formula[1];
					formula[1] = formula[3];
				}
				break;
				 		


		 	case 7:
			System.out.println("ADIOS VUELVE PARA APRENDER");
				break;



			default:
				System.out.println("NO SE VALE PRESTA ATENCION >:(");

		 	

		 	

         }//switch

     }while(opcion!=7);//do while
   }//metodo main
 }//public class

    
