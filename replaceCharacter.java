import java.util.Scanner;
public class replaceCharacter {

    public static String replaceCharAtIndex(String str, int index, char replacement) {
        if (str == null || index < 0 || index >= str.length()) {
            return str;
        }

        char[] charArray = str.toCharArray();
        charArray[index] = replacement;

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Original String :");
        String originalString = sc.nextLine();
        System.out.println("Enter index :");
        int indexToReplace = sc.nextInt();
        System.out.println("Enter Replacement character:");
        char replacementChar = sc.next().charAt(0);

        String modifiedString = replaceCharAtIndex(originalString, indexToReplace, replacementChar);
        System.out.println("Modified String: " + modifiedString);
    }
}
