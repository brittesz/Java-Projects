package college;

public class lokaliza {
public static void main(String[] args) {
	String s1 = "abcdefghijklmnopqrstuvwxyz";
	String s2 = "01234567890123456789012345";

	System.out.println (s1.charAt (0) + " " + s2.charAt (0));
	System.out.println (s1.charAt (9) + " " + s2.charAt (9));
	System.out.println (s1.charAt (s1.length () - 1) + " "+ s2.charAt (s2.length () - 1));
}
}
