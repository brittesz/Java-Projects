package avarage;

import java.util.Scanner;

public class avarageNotesWithInput {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//how many grades
	System.out.println("How many grades do you want to input?");
	int gradesNum = input.nextInt();
	
	double[] grades = new double[gradesNum];
	
	int count = 1;
	for(int i=0; i<gradesNum; i++, count++) {
		System.out.println("Type grade "+ count +": ");
		double gradesInput = input.nextDouble();
		grades[i] = gradesInput;
	}
	
	double total = 0;
	for(int i=0; i<grades.length; i++) {
		total+=grades[i];
	}
	double avarage = total/grades.length;
	System.out.println("Avarage grade: " + avarage);
	
	input.close();
}
}
