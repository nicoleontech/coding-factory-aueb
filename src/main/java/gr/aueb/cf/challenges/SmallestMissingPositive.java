package gr.aueb.cf.challenges;

class SmallestMissingPositive {

    int getSmallestMissingPositive(int[] arr) {
        int smallestPositive = arr[0];
        int smallestMissingPositive = 0;

        for (int num : arr) {
            if (num <= 0) {
                smallestPositive = num;
                smallestMissingPositive = smallestPositive + 1;
            } else if (num <= smallestPositive) {
                smallestPositive = num;
            }
        }
        for (int num : arr) {
            if (num == smallestPositive + 1) {
                smallestPositive = num;
            } else {
                smallestMissingPositive = smallestPositive + 1;
            }
        }
        return smallestMissingPositive;
    }


}
