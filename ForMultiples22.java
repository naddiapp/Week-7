import java.util.Scanner;

public class ForMultiples22 {   
    public static void main(String[]args) {
        Scanner input22 = new Scanner(System.in);

        int multiple, sum=0, counter=0, average=0;
        System.out.println("Input the multiple (1-9)= ");
        multiple = input22.nextInt();

        for(int i=1;i<=50;i++){
            if(i%multiple == 0){
                sum = sum + i;
                counter++;
                average = sum/counter;

        
            }
        }
        System.out.printf("The are %d numbers that are multiple of %d in range 1 to 50. \n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
        double average1 = sum/counter;
        System.out.println("Average = "+ average1); 
    }
}
