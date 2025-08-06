package dates;

public class DataOutput {
public static void main(String[] args) {
	//default
	Data def = new Data(1,1,1970);


	//data by input
	Data dataInput = new Data();
	dataInput.day = 9;
	dataInput.month = 04;
	dataInput.year = 1945;
	
	String formatedDateDef = def.getFormatedDate();
	
	System.out.println(formatedDateDef+ " This is the default date");
	System.out.println(dataInput.getFormatedDate()+ " formated date");
	
	/*def.printFormatedDate();
	dataInput.printFormatedDate();*/
	
}
}