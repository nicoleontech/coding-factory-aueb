package gr.aueb.cf.ch7;

public class TraverseApp {

    public static void main(String[] args) {
        String firstName = "Nicole";
        String cf = "Coding Factory";

        for (int i = 0; i < firstName.length(); i++) {
            System.out.print(firstName.charAt(i) + " ");
        }

        //Enhanced for, μετατρέπω το String σε array of chars, αυτό που είναι στην ουσία
        for (char ch : cf.toCharArray()) {
            System.out.print(ch + " ");
        }

        System.out.println("\u2764");


        //Reverse Traverse
        for(int i = cf.length() -1; i>=0; i--){
            System.out.print(cf.charAt(i) +" ");
        }
    }
}
