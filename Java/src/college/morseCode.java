package college;
import java.util.Scanner;

public class morseCode {

    private static final String[] morseCodes = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
        "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
        ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"
    };

    private static final char[] letters = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
        'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'
    };

    public static String encodeToMorse(String text) {
        StringBuilder morseCode = new StringBuilder();
        text = text.toUpperCase();

        for (char c : text.toCharArray()) {
            for (int i = 0; i < letters.length; i++) {
                if (c == letters[i]) {
                    morseCode.append(morseCodes[i]).append(" ");
                    break;
                }
            }
        }
        return morseCode.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            String encodedText = encodeToMorse(userInput);
            System.out.println(encodedText);
        }
        scanner.close();
    }
}