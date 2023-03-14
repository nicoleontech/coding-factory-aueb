package gr.aueb.cf.ch7;

/**
 * Η δήλωση String s = new String(“Alice”);
 * δημιουργεί πρώτα το αλφαριθμητικό “Alice” στο heap και μετά δημιουργεί ένα copy του “Alice”στο Constant String Poll.
 */
public class StringConstantPool {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "Coding Factory";  //under the hood καλείται String.intern() και αν υπάρχει ήδη
        //επιστρέφεται το reference του ήδη υπάρχοντος αλλιώς κάνει new

        //new String is redundant
        String s3 = new String("CF");

        s1 = "My Coding Factory";

        System.out.println(s1);

        String s4 ="ABC";
        String s5 = s4.substring(0, 2);
        System.out.println(s5);
        System.out.println(s4.charAt(0));

//        String s7;
//        String s8 = new String("Bob");
//        System.out.println(s7.equals(s8));
    }
}
