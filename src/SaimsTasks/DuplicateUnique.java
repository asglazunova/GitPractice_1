package SaimsTasks;

public class DuplicateUnique {
    public static void main(String[] args) {
        String charactersDuplicate = "AAABCCDEEF";
        String checked = "";

        for (int i = 0 ; i < charactersDuplicate.length();i++) {

            int count = 0;
if (checked.contains(""+ charactersDuplicate.charAt(i))){
    continue;
}
            //charactersDuplicate.charAt(i);

            for (int j=0; j < charactersDuplicate.length() ; j ++){
                if (charactersDuplicate.charAt(i) == charactersDuplicate.charAt(j)) {
                    count ++ ;

                }
            }

            if (count >1) {
                System.out.println(charactersDuplicate.charAt(i) + " is duplicate");

                checked += charactersDuplicate.charAt(i);
            }
        }
    }
}
