package matveenko.practice5;
/*Известен рост каждого из 25 учеников класса. Рост мальчиков условно задан
отрицательными числами. Определить средний рост мальчиков и средний рост девочек.*/
public class Task7 {
    public static void main(String[] args) {
        int[] heights = {165, -178, 158, -175, -182, 175, 160, 170, -187, 161};
        System.out.println(averageForBoys(heights));
        System.out.println(averageForGirl(heights));
    }

    public static double averageForBoys(int[] heights) {
        double sum = 0;
        int boys = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < 0) {
                sum += heights[i];
                boys++;
            }

        }
        return Math.abs(sum / boys);
    }

    public static double averageForGirl(int[] heights) {
        double sum = 0;
        int girl = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > 0) {
                sum += heights[i];
                girl++;
            }

        }
        return sum / girl;
    }
}

