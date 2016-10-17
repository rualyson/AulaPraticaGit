package Engenharia;

import java.util.Scanner;
public class ClasseRualyson {
	
	public static void main(String args[]){
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas");
		int quant=ler.nextInt();
		
		double totalnotas=0;
		
		double []array=new double[quant];
		
		for(int i=0 ; i< quant ;i++){
			double nota=ler.nextDouble();
			array[i]=nota;
			totalnotas+=nota;
			
		}
		int cont=1;
		
		for(int x=0 ; x< array.length ; x++){
			System.out.println("Sua  nota "+cont+" foi :"+array[x]);
			cont++;
		}
		
		System.out.println("Sua média foi: "+ totalnotas/array.length);
		
		
	
		
	}
	
}
