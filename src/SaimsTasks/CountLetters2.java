package SaimsTasks;

public class CountLetters2 {
    public static void main(String[] args) {
        String source = "aaavvvdfddtttnngddddhhhhkkkffg";
        String[] charsSource = source.split("");
        String result = "";

        for (String eachLetter : charsSource) {
            int count = 0;
            if (!result.contains(eachLetter)) {
                for (String current : charsSource) {
                    if (current.equals(eachLetter)){
                        count++;
                    }
                }
                result += count + eachLetter ;
            }

        }
        System.out.println(result);
    }
}
