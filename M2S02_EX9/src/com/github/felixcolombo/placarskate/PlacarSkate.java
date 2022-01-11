package com.github.felixcolombo.placarskate;

import java.util.Arrays;
import java.util.Scanner;

public class PlacarSkate {
	
	private static Scanner keyboard = new Scanner(System.in);
	double [] notas = new double[5];
	double [] notasConsideradas = new double[3];
	private double notaMaior=0;
	private double notaMenor=0;
	private int e;
	private double media;
	private double soma;
		
	public void placarSkate() {
		
		for(int i=0; i<notas.length; i++) {
			System.out.printf("Digite a nota %d: ", i+1);
			notas[i] = keyboard.nextDouble();
			if(i==0) {
				notaMenor = notas[0];
			}
			if(notas[i] > notaMaior) {
				notaMaior = notas[i];
			}
			if(notas[i] < notaMenor) {
				notaMenor = notas[i];
			}
		}
		
		for(int d=0; d<notas.length; d++) {
			if((notas[d]!=notaMaior)&&(notas[d]!=notaMenor)){
				notasConsideradas[e] = notas[d];
				soma = soma+notasConsideradas[e];
				e++;
			}
		}
		
		media = (soma/notasConsideradas.length);
		
		System.out.printf("A média das notas consideradas foi: %.2f\n", media);
		System.out.printf("A maior nota foi: %.2f\n", notaMaior);
		System.out.printf("A menor nota foi: %.2f\n", notaMenor);
		System.out.printf("Notas consideradas: "+Arrays.toString(notasConsideradas));
		
	}
}
	


