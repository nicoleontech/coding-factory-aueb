package gr.aueb.cf.ch6;

public class GradesPercentageApp {

    public static void main(String[] args) {
        int[] grades = {0, 1, 2, 1, 5, 3, 4, 1, 0, 5, 5, 4, 3};

        int[] counts = new int[6];  //0-5

//
//        for(int i = 0; i< grades.length; i++){
//            counts[grades[i]] ++;
//        }

        for (int grade : grades) {
            counts[grade]++; // counts[grade] = counts[grade] + 1;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("Grade: %d , Percentage: %.2f%%\n ", i, (double) counts[i] * 100 / grades.length);
        }
    }
}
