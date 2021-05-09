package day40b_ReviewClass;



public class sumOfNumbers {
    public static void main(String[] args) {
        System.out.println(getSumFromString("a5bc12def100"));
    }

    public static int getSumFromString(String str) {
        int sum = 0;
        String num = "";  //12

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) { // checks if every character is number (digit)
                num += str.charAt(i);


                if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                    //action

                    sum += Integer.parseInt(num);
                    num = ""; //resets our String for the number


                }

            }
        }
        return sum;
    }
}

