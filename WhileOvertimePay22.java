import java.util.Scanner;
public class WhileOvertimePay22 {
    public static void main(String[]args) {
        Scanner input22 = new Scanner(System.in);
        int numEmployee;
        int overtimeHours;
        double overtimePay = 0;
        double totalOvertimePay = 0;
        String position;

        System.out.print("Employee number = ");
        numEmployee = input22.nextInt();

        int i=0;
        while(i<numEmployee){
            System.out.print("Position of employee"+(i+1)+" (director, manager, staff) = ");
            position = input22.next();
            System.out.print("Employee "+(i+1)+" overtime hours = ");
            overtimeHours = input22.nextInt();
            i++;

            if(position.equalsIgnoreCase("director")){
                continue;
            }else if(position.equalsIgnoreCase("manager")){
                overtimePay=overtimeHours*100000;
            }else if(position.equalsIgnoreCase("staff")){
                overtimePay=overtimeHours*75000;
            } else {
               System.out.println("invalid position!");
               i--;
               continue;
            } 
            
            totalOvertimePay += overtimePay;
            System.out.println("Total of Overtime Pay = " + totalOvertimePay);
        }
    }
}
