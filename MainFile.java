import java.util.Scanner;

public class MainFile{

    public static void main (String[] args){
        Scanner in = new Scanner (System.in);



        Bookstore bookstore1 = new Bookstore();

    System.out.println(bookstore1.Name);
    System.out.println("What is the address?");
    System.out.println(bookstore1.Address);
    System.out.println("What time does the store open today?");
    // System.out.println(bookstore1.getOpen);
    // System.out.println("What time does it close?");
    // System.out.println(bookstore1.getClose);
    // System.out.println("Is it open right now?");
    // System.out.println(bookstore1.isOpen(LocalTime.now);
    System.out.println("How big is the store?");
    System.out.println(bookstore1.SqFt + " square feet");
    System.out.println("Does the store have new or used books?");
    // System.out.println(bookstore1.isHasUsedBooks() ? "Both" : "New only");
    


    }

}