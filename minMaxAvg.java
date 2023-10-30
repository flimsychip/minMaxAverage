import java.util.Scanner;
public class minMaxAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int min = 2147483647;
        int sum = 0;
        int nums = 0;
        System.out.print("please enter a set of positive integers separated by spaces. put -1 when done: ");
        int input = in.nextInt();
        while (input != -1){
            max = Math.max(max, input);
            min = Math.min(min, input);
            sum += input;
            nums++;
            input = in.nextInt();
            }
        double average = (double)sum/nums;
        System.out.printf("maximum: %d\nminimum: %d\naverage: %f", max, min, average);
        }
    }