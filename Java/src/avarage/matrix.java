package avarage;

import java.util.Scanner;

public class matrix {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("How many students?");
	int studentsNo = input.nextInt();
	
	System.out.println("How many grades for student?");
	int studentsGrades = input.nextInt();
	
	//matrix							external var//internal var
	double [][] classGrades = new double[studentsNo][studentsGrades];
	
	
	double total = 0;
	//i = student
	//j = grade
	for (int i =0; i<classGrades.length; i++) {
		for (int j =0; j<classGrades[i].length; j++) {
			
			System.out.printf("informe a nota %d do aluno %d: ",i+1,j+1);
			classGrades[i][j] = input.nextDouble();
			total+=classGrades[i][j];
		}
	}
	
	double avarage = total/(studentsNo * studentsGrades);
	System.out.println("The class avarage is " +avarage);
	input.close();
	
}
}
