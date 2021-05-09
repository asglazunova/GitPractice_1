package SaimsTasks;

public class biggestSubstring {
    public static void main(String[] args) {
          /*
    Biggest substring of matching characters Given a String find the biggest substring of chars that match and print it.
    Ex: aaabbbcccccddddeeOutput: ccccc
     */
        String str = "aaabbbcccccddddeeeeeeeeeeeeee";
        String longSubstring = "";
        String temp = "";

        for ( int i = 0 ; i < str.length()-1; i++){

            temp += str.charAt(i);

            if (i == str.length() - 2) {
                temp += str.charAt(i + 1);
            }
            if(str.charAt(i) != str.charAt(i + 1)){

                if (temp.length() > longSubstring.length() ){
                    longSubstring = temp;
                }
                temp = "";
            }
        }
        System.out.println("Longest substring :" +longSubstring);


    }
}
