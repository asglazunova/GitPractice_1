package day40b_ReviewClass;

public class CountLetters {
    public static void main(String[] args) {
        countLetters("apple tree");
    }
    public static void countLetters(String str) {
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count = 0;

            if (!checked.contains("" + eachLetter)) {


                for (int j = 0; j < str.length(); j++) {
                    char eachOtherLetter = str.charAt(i);
                    if (eachLetter == eachOtherLetter) {
                        count++;
                    }
                }
                System.out.println(eachLetter + " - " + count);
                checked += eachLetter ;
            }
        }

    }
}
