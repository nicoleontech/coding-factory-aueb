package gr.aueb.cf.ch8;

import java.util.Arrays;
import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {

        String s = "Coding Plus";
        Optional<String> opt = getStringCopy(s);
        if(opt.isPresent()){
            System.out.println(opt.get());
        } else {
            System.out.println("Null");
        }
    }

    public static Optional<int[]> getCopy(int[] arr) {
        if (arr == null) {
            return Optional.empty();
        }
        //returns Optional που είναι wrapper class και μπορεί να περιέχει κάτι null
        return Optional.of(Arrays.copyOf(arr, arr.length));
    }

    public static Optional<String> getStringCopy(String s) {
        return Optional.ofNullable(s);
    }
}
