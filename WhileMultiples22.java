import java.util.Scanner;
public class WhileMultiples22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple, sum=0, counter=0;
        int average=0;

        System.out.print("Input the multiple (1-9) = ");
        multiple = input.nextInt();
        
        int i = 1;
        while (i<=50) {
            if (i% multiple == 0) {
                sum += i;
                counter++;
                average = sum/counter;
            }
            i++;
        }
        System.out.printf("The are %d numbers that are multiple of %d in range 1 to 50. \n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
        System.out.printf("The average number of multiples of %d from 1 to 50 is %d/ \n", multiple, average);
    }
}