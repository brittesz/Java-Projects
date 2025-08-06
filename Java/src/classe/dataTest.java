package classe;

public class dataTest {
public static void main(String[] args) {
	//default
	data def = new data(1,1,1970);

	data dataInput = new data();
	dataInput.day = 9;
	dataInput.month = 04;
	dataInput.year = 1945;
	
	System.out.printf("%d/%d/%d default date!", def.day, def.month, def.year);
	System.out.printf("%d/%d/%d input date!", dataInput.day, dataInput.month, dataInput.year);
}
}