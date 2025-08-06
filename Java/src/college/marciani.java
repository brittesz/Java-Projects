package college;
import java.util.Scanner;

public class marciani {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int a = input.nextInt();
	int i=a;
	int mil = a/1000; i=i%1000;
	int cem = i/100; i=i%100;
	int dez = i/10; i=i%10;
	int uni = i%10; 

		if(mil ==1) {
			mil = 5;
		}
		if(cem==1) {
			cem = 5;
		}
		
		if(dez ==1) {
			dez = 5;
		}
		
		if(uni ==1) {
			uni = 5;
		}
		
		if(mil ==1) {
			mil = 5;
		}
//, 6, 4, 8, 9, 7, 3, 1, 2.

if(mil ==2) {
	mil = 6;
}
if(cem==2) {
	cem = 6;
}

if(dez ==2) {
	dez = 6;
}

if(uni ==2) {
	uni = 6;
}

	
	//4, 8, 9, 7, 3, 1, 2.

	if(mil ==3) {
		mil = 4;
	}
	if(cem==3) {
		cem = 4;
	}

	if(dez ==3) {
		dez = 4;
	}

	if(uni ==3) {
		uni = 4;
	}

	// 8, 9, 7, 3, 1, 2.

	if(mil ==4) {
		mil = 8;
	}
	if(cem==4) {
		cem = 8;
	}

	if(dez ==4) {
		dez = 8;
	}

	if(uni ==4) {
		uni = 8;
	}
	
	// 9, 7, 3, 1, 2.

	if(mil ==5) {
		mil = 9;
	}
	if(cem==5) {
		cem = 9;
	}

	if(dez ==5) {
		dez = 9;
	}

	if(uni ==5) {
		uni = 9;
	}
	
	//7, 3, 1, 2.

	if(mil ==6) {
		mil = 7;
	}
	if(cem==6) {
		cem = 7;
	}

	if(dez ==6) {
		dez = 7;
	}

	if(uni ==6) {
		uni = 7;
	}
	
	//3, 1, 2.

	if(mil ==7) {
		mil = 3;
	}
	if(cem==7) {
		cem = 3;
	}

	if(dez ==7) {
		dez = 3;
	}

	if(uni ==7) {
		uni = 3;
	}
	
	// 1, 2.

	if(mil ==8) {
		mil = 1;
	}
	if(cem==8) {
		cem = 1;
	}

	if(dez ==8) {
		dez = 1;
	}

	if(uni ==8) {
		uni = 1;
	}
	
	// 1, 2.

	if(mil ==9) {
		mil = 2;
	}
	if(cem==9) {
		cem = 2;
	}

	if(dez ==9) {
		dez = 2;
	}

	if(uni ==9) {
		uni = 2;
	}
	
	System.out.printf("%d%d%d%d",mil,cem,dez,uni);
}
}
