package dates;

public class Data {
	int day;
	int month;
	int year;
	

	Data(int daydef, int monthdef, int yeardef){
		day = daydef;
		month = monthdef;
		year = yeardef;
	}
	
	Data(){}
	
	String getFormatedDate() {
		return String.format("%d/%d/%d", day, month, year);
	}
	
	void printFormatedDate() {
		System.out.println(getFormatedDate());
	}
	
}