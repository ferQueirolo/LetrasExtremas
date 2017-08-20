package miPaquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Palabra {
	//
	private int cantPalabras;
	private String[] arrayPalabras;
	
	public Palabra(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		StringBuilder palabra;
		
		cantPalabras = sc.nextInt();
		sc.nextLine();
		arrayPalabras = new String[cantPalabras];
		for (int i = 0; i < arrayPalabras.length; i++) {
			arrayPalabras[i] = sc.nextLine();
		}
		
		sc.close();
	}
	
	public void Mostrar(){
		for (int i = 0; i < arrayPalabras.length; i++) {
			System.out.println(arrayPalabras[i]);
		}
	}
	
	public void Resolver(String path){
		
	}
	
}
