package dates;

import classe.data;

public class dateOutput {
public static void main(String[] args) {
	
	date birthday = new date();
	birthday.day = 15;
	birthday.month = 11;
	birthday.year = 1997;
	
	date birthday2 = new date();
	birthday2.day = 9;
	birthday2.month = 04;
	birthday2.year = 1945;
	
	System.out.println(birthday.formatedDate());
	System.out.println(birthday2.formatedDate());
	
	birthday.printFormatedDate();
	
	birthday2.printOtherFunction();
}
}
