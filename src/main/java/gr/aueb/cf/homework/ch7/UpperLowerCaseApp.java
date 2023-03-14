package gr.aueb.cf.homework.ch7;

/**
 * Ξεκινώντας από το πρώτο γράμμα, αν είναι άρτιος να γίνεται κεφαλαίο,
 * αν είναι περιττός να γίνεται πεζό.
 * πχ "hello" --> "HeLlO"
 */
public class UpperLowerCaseApp {

    public static void main(String[] args) {
        String name = "Nicole";
    }

    public static String toUpperLowerCase(String input) {
        String subString = "";
        String s = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i)) || Character.isLowerCase((input.charAt(i)))) {
                subString = input.substring(i, i + 1);
                s = ((i % 2) == 0) ? subString.toUpperCase() : subString.toLowerCase();
                sb.append(s);
            }
        }
        return sb.toString();
    }

    //2nd solution
    public static String toUpperLowerCaseV2(String input){
        StringBuilder sb = new StringBuilder();
        for(char ch : input.toCharArray()){
            if(ch %2 ==0){

                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }


}
