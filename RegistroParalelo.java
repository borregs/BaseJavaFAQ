/*
 * RegistroParalelo.java
 * 
 * En un arreglo guardar el numero de control de N estudiantes
 * En otro guardar los Nombres
 * En un arreglo uni dimendional las materias que llevan (preguntar)
 * En otro bi-dimensional, guradar las 3 calif de cada clase de las N materias
 * Imprimir todo incluyendo y mencionar al estudiante del mejor promedio 
 * 
 */

import java.util.Scanner; 
//libreria para leer desde STDIN (teclado)

public class RegistroParalelo {


	public int NE=1;
	private int	nc[NE]={0}; 
	private String alumNames[NE]={" "};
	private int aluMaterias[NE]={" "};
	private float califs[NE][3]={0.0,0.0};
	
	public static void main (String[] args) {
		Scanner reader = new scanner(System.in);
		
		System.out.print("Ingrese la cantidad de alumnos:");
		NE = reader.nextInt();
		
		for(int x=0;x<NE;x++){
			
			nc[x]=x;
			
			System.out.print("Ingrese el Nombre del alumno #" + x+1);
			String alumNames[x] = reader.next();
			
			System.out.print("Ingrese la cantidad de materias que cursa "+ alumNames[x] +" Actualmente";
			String aluMaterias[x] = reader.nextInt();
			
			
		}
		
		
		
		
	}
}

