package sumaresta;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;


public class gcd {

	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int o=0,num, max = 0, min = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        for (int i = 1; i < 4; i++) {
            System.out.print(i + " Ingrese un numero: ");
            num = in.nextInt();
            if (min != 0 && max != 0) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                min = num;
                max = num;
            }
        }
        if(max == min){
    		System.out.println("error");
    	}
    	else{System.out.println("Ingresa un numero, MAXIMO [1] & MINIMO [2]");
    	o = Integer.parseInt(br.readLine());
    	if(o==1){
    		System.out.println("El numero mayor es :" + max);
    	}
    	if(o==2){
    		System.out.println("El numero menor es :" + min);
    	}	
    }}}
	
