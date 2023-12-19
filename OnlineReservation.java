import java.util.Scanner;

public class OnlineReservation
{
    
    private static boolean [] seats = new boolean[10];// initialize array of 10 seats, all empty
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            // display name 
            System.out.println("\nplease select an option:");
            System.out.println("1.view seat map");
            System.out.println("2.Reserve Seat");
            System.out.println("3.Cancel Reservtaion");
            System.out.println("4.Exit");
            
            //get user input
            int option = scanner.nextInt();
            
            switch (option) {
            
             case 1:
                 viewSeatmap();
                 break;
                 
            case 2:
                reserveSeat();
                break;
                
            case 3:
                cancelReservation();
                break;
                
            case 4:
                System.exit(0); //exit the program
                
            default:
            System.out.println("Invalid Option");
        }
    }
}


 private static void viewSeatmap()  {
     System.out.println("\nCurrent seat map:");
     for (int i = 0; i < seats.length; i++) {
         if (seats[i]) {
             System.out.print("x "); // Print an "X" if the seat is reserved
         } else {
             System.out.print((i + 1) +  "  "); // print the seat number if it's empty
         }
     }
      System.out.println();
    }
     

    private static void reserveSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter seat Number (1-10): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat Number!");
        } else if (seats[seatNumber - 1])  {
            System.out.println("Seat already reserved!");
        
        } else {
            seats[seatNumber - 1] = true; //reserve the seat
            System.out.println("Seat reserved!");
         }
      }
        
        private static void cancelReservation()  {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter seat number (1-10): ");
            int seatNumber = scanner.nextInt();
            if(seatNumber < 1|| seatNumber > 10) {
                System.out.println("Invalid seat number!");
            } else if (!seats[seatNumber - 1]) {
                System.out.println("seat not reserved!");
            } else {
                seats[seatNumber - 1] = false; // unreserve the seatNumber
               System.out.println("Reservation cancelled!");
            }    
            
        }
        
    }