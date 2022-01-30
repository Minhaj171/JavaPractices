public class JavaSubString {
    public static void main(String[] args){
       test();
       test2();
    }

    private static void test2() {
        // Get the Strings
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;

        System.out.println("Original String: " + originalString);
        System.out.println("String to be inserted: " + stringToBeInserted);
        System.out.println("String to be inserted at index: " + index);

        // Insert the String
        System.out.println("Modified String: " + insertString(originalString, stringToBeInserted, index));
    }

    private static void test() {
        String Str = new String("02022022");
        System.out.println("day - " + Str.substring(0,2));
        System.out.println("month - " + Str.substring(2,4));
        System.out.println("year - " + Str.substring(4));
        System.out.println("length - " + Str.length());
        System.out.println("string - " + Str);
    }

    public static String insertString(String originalString, String stringToBeInserted, int index) {
        // Create a new string
        String newString = originalString.substring(0, index + 1) + stringToBeInserted + originalString.substring(index + 1);
        // return the modified String
        return newString;
    }
}
