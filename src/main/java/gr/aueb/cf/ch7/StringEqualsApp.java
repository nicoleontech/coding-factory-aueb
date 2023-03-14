package gr.aueb.cf.ch7;

public class StringEqualsApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";
        String s3 = "London";

        boolean isEqual = false;

        //Τα περιεχόμενα μπορεί να είναι ίδια αλλά οι δείκτες διαφορετικοί
       // isEqual = s1 == s2;

        isEqual = s1.equals(s2);
        //Αν θέλω να ελέγξω ισότητα χωρίς να λάβω υπόψη κεφαλαία-πεζά, δηλαδή CI
        isEqual = s1.equalsIgnoreCase(s2);

        //Το > ή < είναι ASCII-based, τα μικρά είναι μεγαλύτερα απ΄τα κεφαλαία
        //Η compareTo() εκτός από ισότητα, ελέγχει >, <
        if(s1.compareTo(s2) <0){
            System.out.println("s1 greater than s2");
        }


    }
}
