package SaimsTasks;

public class CamelCase {
    public static void main(String[] args) {
        /**
         * Camel CaseGiven a String of words that follow Camel Case convention.
         * Find and print how many words are in the given
         * String.Every word, except the first word, begin with an uppercase letter.
         * The other characters of the word will be lowercase
         * Ex:Input:thisHasManyWordsToFind Output: 6
         */

        String CaseGiven = "thisHasManyWordsToFind"; // word
        int words = 1;
        String temp = "";

        if(CaseGiven.isEmpty()){
            words = 0;
        }

        for(int i=0; i< CaseGiven.length(); i++){

            if(CaseGiven.charAt(i) >= 'A' && CaseGiven.charAt(i) <= 'Z'){
                words ++ ;


            }
        }
        System.out.println("Words: " + words);


    }
}
