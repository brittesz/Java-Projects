package dates;

public class date {
		int day;
		int month;
		int year;
	
		//this one is shown in web/apps!
	String formatedDate(){
		return String.format("%d/%d/%d is the day you were born! ", day, month, year);
	}
	
	//void means the absence of a return
	//this method only works in the terminal, doesnt work in web/app
	void printFormatedDate(){
		System.out.printf("%d/%d/%d printed by void syso \n", day, month, year);
	}
	
	//using another function 
	void printOtherFunction(){
		System.out.println(formatedDate());
	}
}
