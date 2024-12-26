public class Find2ndHighestScore {

    public static double findingSecondHighest(double[] array){
        double highest = Float.MIN_VALUE;
        double secondHighest = Float.MIN_VALUE;

        for (double score: array) {
            if(score>highest){
                secondHighest = highest;
                highest = score;
            } else if (score>secondHighest && score != highest) {
                secondHighest = score;
            }
        }
        return secondHighest;
    }
    public static void main(String[] args) {
        double[] array = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double score = findingSecondHighest(array);
        System.out.println("The SecondHighest Number is:" + score);
    }
}
