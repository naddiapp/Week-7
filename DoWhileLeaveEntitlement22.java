import java.util.Scanner;
public class DoWhileLeaveEntitlement22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement;
        int leaveNumber;
        String confirmation;

        System.out.print("Leave entitlement: ");
        leaveEntitlement = input.nextInt();

        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.next();
            
            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Leave number: ");
                leaveNumber = input.nextInt();

                if (leaveNumber <= leaveEntitlement) {
                    leaveEntitlement -= leaveNumber;
                    System.out.println("The remaining leave entitlement: " +leaveEntitlement);
                } else {
                    System.out.println("The remaining leave entitlement is not sufficient!");
                    break;
                }
            }
        } while (leaveEntitlement > 0);
    }
}