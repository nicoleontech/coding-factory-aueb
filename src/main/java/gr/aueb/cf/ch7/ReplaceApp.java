package gr.aueb.cf.ch7;

public class ReplaceApp {

    public static void main(String[] args) {
        String firstName = "     Nicole-Sp";

        String nickname = "";
        String simpleName = "";
        String newNameWithReplaceAll = "";

        //η replace δημιουργεί νέο String, δεν το αντικαθιστά, γιατί είναι immutable
        //η replace είτε αντικαθιστά, είτε διαγράφει κατά μία έννοια, αν αντικαθιστά με το τίποτα
        nickname = firstName.replace("-Sp","");
        simpleName = firstName.replace("-","");

        newNameWithReplaceAll = firstName.replaceAll("\\s","");


        System.out.println(nickname);
        System.out.println(newNameWithReplaceAll);
    }
}
