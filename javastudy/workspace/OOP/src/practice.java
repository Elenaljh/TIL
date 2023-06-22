public class practice {
    public static void main(String[] args) {
        int[] score = {100, 94, 20, 53};
        int sum = 0;

        for (int s : score) {
            sum += s;
        }
        float average = (float)sum/score.length;
        System.out.printf("평균은 %.2f점 입니다\n",average);
    }
}
