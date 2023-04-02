package practica2;
import java.util.Scanner;


public class notas {
	//declaramos la variables que nos hacen falta
	//cambios en las variables
	double notasUF1, notasUF2, notasUF3;
	double acu1, acu2, acu3, def;
	//utilizames ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	///vamos ca crear un metodo para ingresar 
	
	public void IngresaNotas() {
		//cuando ejecutamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		notasUF1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		notasUF2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		notasUF3= entrada.nextDouble();
		
	
	}
	
	// metodo para comprobar bien entroduccion de notas
	
	public void comprobarcion(){
		
		if (notasUF1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (notasUF2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (notasUF3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	// metodo para calcular nota
	
	public void Calculonotas() {
		acu1= notasUF1*0.35;
		acu2 = notasUF2 * 0.35;
		acu3 = notasUF3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada peor no la mostramos
	}
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + notasUF1);
		System.out.println(" nota2 = " + notasUF2);
		System.out.println(" nota3 = " + notasUF3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}

	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}
