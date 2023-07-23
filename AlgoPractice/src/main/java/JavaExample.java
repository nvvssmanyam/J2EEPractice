public class JavaExample {

    public static void main(String[] args) {

        String str = "catch at a straw";

        if (str.indexOf("t") == -1) {
            System.out.println("None");
        } else {
            String[] splt = str.split(" ");
            int index1 = -1;

            for (int i = 0; i < splt.length; i++) {

                index1 = splt[i].indexOf("t") + 1;

                if (index1 % 2 == 0) {
                    System.out.println(splt[i]);
                } else {

                    String reversed = reverseString(splt[i]);
                    System.out.println(reversed);
                }
            }
        }

    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}