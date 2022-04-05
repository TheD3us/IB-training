package fr.atelier;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = (int) (Math.random() * 100);
	System.out.println("Veuillez deviner le nombre");
	int reponse = -1;
	while(reponse != x) {
	reponse = sc.nextInt();
		if(reponse > x) {
		System.out.println("Trop grand");
	}else if(reponse < x){
		System.out.println("Trop petit");
	}else {
		System.out.println("C'est gagné");
	}
	
	}
	}

}