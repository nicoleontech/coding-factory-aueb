package gr.aueb.cf.ch7;

public class ConcatApp {

    public static void main(String[] args) {
        String firstName = "Nicole";
        String lastName = "Sarrou";
        String title = "LLM";
        //Better to initialise all String to an empty String, otherwise they will be null and NPE is a threat
        String fullName1 = "";
        String fullName2 = "";
        String fullName3 = "";
        String fullName4 = "";

        fullName4 = title.concat(firstName).concat(lastName);
        //String template literals Java 17
    }
}
