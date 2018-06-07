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



	public static void main (String[] args) {

		int NE = 1;
		int[] nc={0}; 
		String[] alumNames={""};
		String[][] matNames={{""}};
		int[] aluMaterias={0};
		double[][] califs={};
	
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de alumnos:");
		NE = reader.nextInt();
		
		for(int x=0;x<NE;x++){
			
			nc[x]=x;
			
			System.out.print("Ingrese el Nombre del alumno #" + x+1);
			alumNames[x] = reader.next();
			
			System.out.print("Ingrese la cantidad de materias que cursa "+ alumNames[x] +" Actualmente");
			aluMaterias[x] = reader.nextInt();
			
			for(int y=0;y<aluMaterias[x];y++){
				System.out.print("Ingrese el nombre de la materia #"+ y+1 +" de " + alumNames[x]);
				matNames[x][y]=reader.next();
				
			
				for(int j=0;j<3;j++){				
					System.out.print("Ingrese la Calificacion #"+ j+1 +" de " + matNames[y]);
					califs[x][j] = reader.nextInt();
					}
			}
			
		}
		
		System.out.println("ID    Nombre       Materias   Prom");
		System.out.println("----  ----------  ----------  -----");
		
				for(int x=0;x<NE;x++){

				}
		
		
		
	}
}

