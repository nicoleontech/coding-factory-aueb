package gr.aueb.cf.miniprojects.twodimensionalarrayscopies;

class ArrayCopier {

    int[][] makeShallowCopy(int[][] initialArray) {
        int[][] shallowCopy = initialArray;
        return shallowCopy;
    }

    int[][] makeDeepCopy(int[][] initialArray) {
        int[][] deepCopy = new int[initialArray.length][initialArray[0].length];
        for (int i = 0; i < initialArray.length; i++) {
            for (int j = 0; j < initialArray[0].length; j++) {
                deepCopy[i][j] = initialArray[i][j];
            }
        }
        return deepCopy;
    }
}
