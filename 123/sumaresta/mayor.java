package sumaresta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class mayor {

	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) throws IOException {
	// TODO code application logic here
	int o=0,n = 0,mayor = 0,menor = 0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	for (int i = 0; i < 3; i++) {
	System.out.println("Ingresa un numero");
	
		n = Integer.parseInt(br.readLine());
		
	if(n > mayor){
		mayor = n;
		}
		if(n < menor){
		menor = n;
		}
	
	}
	
	if(mayor == menor){
		System.out.println("error");
	}
	else{System.out.println("Ingresa un numero, MAXIMO [1] & MINIMO [2]");
	o = Integer.parseInt(br.readLine());
	if(o==1){
		System.out.println("El numero mayor es :" + mayor);
	}
	if(o==2){
		System.out.println("El numero menor es :" + menor);
	}	
	
	}

	}
}
	

