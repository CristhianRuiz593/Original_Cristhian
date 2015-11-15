package Ruiz_Cristhian;

import java.util.Scanner;

public class Cristhian_Ruiz {
	public static Scanner dato=new Scanner (System.in);
	public static int i,valor;
	static double iva;
	static double acum=0;
	static double acum1=0;
	static double acum2=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ======================================================== ");	
		System.out.println(" ||             UNIVERSIDAD DE GUAYAQUIL                ||");
		System.out.println(" ||          FACULTAD DE INGENIERIA INDUSTRIAL          ||");
		System.out.println(" ======================================================== ");
		System.out.println(" ======================================================== ");	
		System.out.println(" ||           CRISTHIAN EDISON RUIZ GAMBOA              ||");
		System.out.println(" ||        TERCER SEMESTRE          GRUPO : 1           ||");
		System.out.println(" ======================================================== ");

		ejercicio_uno();	
		ejercicio_dos();
		ejercicio_tres();
	}
	
	    
	
	
	
	
	
	    public static Object ejercicio_uno(){
		System.out.println(" ======================================================== ");	
		System.out.println(" || ****   *****  ***** EJERCICIO 1 *****  ***** ****** ||");
		System.out.println(" ======================================================== ");
		System.out.print("Cuantos datos desea ingresar: ");
		valor=dato.nextInt();
		int []Array=new int[valor];		
		for (i=0;i<valor;++i){
		System.out.print("Ingrese valor numérico en índice "+i+" :");	
		Array[i]=dato.nextInt();
		acum= acum + Array[i];
        }
		System.out.println("Suma Total :" +acum);
		System.out.println("su promedio es"+ acum/valor);
        return null;
}
     
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    public static Object ejercicio_dos(){
    	System.out.println(" ======================================================== ");	
  		System.out.println(" || ****   *****  ***** EJERCICIO 2 *****  ***** ****** ||");
  		System.out.println(" ======================================================== ");
  		for (int i=1; i<51; i++){
  		System.out.print("Ingrese valor numérico en índice "+i+" :");
  		int not1=dato.nextInt();
  		acum=acum+not1;
  	    if (acum>=70){
  		System.out.println("Nota aprobada");
  		}else
  		System.out.println(" Nota reprobada");
  	    }
  		System.out.println("Suma Total :" +acum);
  		System.out.println("El promedio general es ::"+ acum/50);
        return null;  
        }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
    public static Object ejercicio_tres(){
	System.out.println(" ======================================================== ");	
	System.out.println(" || ****   *****  ***** EJERCICIO 3 *****  ***** ****** ||");
	System.out.println(" ======================================================== ");
	System.out.println ("Ingrese el monto de su conmpra, por favor");
	Scanner monto1= new  Scanner(System.in);
	double monto=monto1.nextDouble();
	System.out.println (" **** *** Menu *** ***");
	System.out.println ("seleccione una bolita por favor");
	System.out.println ("1. Roja");
	System.out.println ("2. Amarilla");
	System.out.println ("3. Blanca ");
	System.out.println ("4. Salir ");
	Scanner bolita=new Scanner(System.in);
	int bola=bolita.nextInt(); 
	switch (bola){
	
	
	
	
			    case 1:
			    iva = ((monto)+monto*0.12);
				System.out.println("Su total es :"+((iva)-iva*0.40));
				acum=acum+((iva)-iva*0.40);
				break;
			
			    case 2:
				iva = ((monto)+monto*0.12);
				System.out.println("Su total a pagar es :"+((iva)-iva*0.25));
				acum1=acum1+((iva)-iva*0.25);
				break;
		
			    case 3:
				iva = ((monto)+monto*0.12);
				System.out.println("Su total  es :"+iva);
				System.out.println("No tiene descuento");
				acum2=acum2+iva;
				break;
			
			    
	}	
    System.out.println("Gracias");
	return null;
}
}
