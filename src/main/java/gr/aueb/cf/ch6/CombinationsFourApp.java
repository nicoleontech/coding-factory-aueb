package gr.aueb.cf.ch6;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class CombinationsFourApp {



    public static void main(String[] args) throws IOException {

        final int THRESHOLD = 3;
        final int N = 4; //epeidh thelw 4ades

        File inFile =  new File("C:\\temp\\numbers.txt");
        File outFile = new File("C:/temp/combinations.txt");
        Scanner scanner = new Scanner(inFile);

        PrintStream printStream = new PrintStream(outFile, StandardCharsets.UTF_16LE);

        int[] row = new int[4];
        ArrayList<Integer> numbers = new ArrayList<>();

        while (scanner.hasNext()){
            numbers.add(scanner.nextInt());
        }

        //o πρωτος αριθμός έχει το πλαίσιο από την θέση 0 + 2 θεσεις
        for (int i = 0; i< numbers.size()- N; i++){
           for (int j = i +1; j<= numbers.size() - N + 1; j++){
               for (int k = j +1; k<= numbers.size() - N + 2; k++){
                   for (int m = k +1; m< numbers.size(); m++){
                       row[0] = numbers.get(i);
                       row[1] = numbers.get(j);
                       row[2] = numbers.get(k);
                       row[3] = numbers.get(m);

                       if (!isEven(row, THRESHOLD)){
                           printStream.printf("%d\t%d\t%d\t%d\n", row[0],row[1],row[2],row[3]);
                       }

                   }
               }
           }
        }


    }

    //Αν θέλω να περιορίσω το αποτέλεσμα έτσι ώστε να επιτρέπονται μόνο
    public static boolean isEven (int[] row, int threshold){
        int count = 0;

        for(int num : row){
            if (num % 2 ==0){
                count ++;
            }
        }
        return count > threshold;
    }
}
