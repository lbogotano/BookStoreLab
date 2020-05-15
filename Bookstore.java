import java.util.Date;
import java.text.*;

public class Bookstore{

    public String Name;
    public String Address;
    public int SqFt;
    public boolean HasNewBooks;
    public boolean HasUsedBooks;

    private boolean Open;
    private Date currentTime = new Date();
    
    private static final int OPENING_TIME = 7 ;
    private static final int CLOSING_TIME = 20 ;



    public Bookstore() {
        this.Name = "Luis Book store";
        this.Address = "3423 Ave charotte nc";
        this.SqFt = 1300;
        this.HasNewBooks = true;
        this.HasUsedBooks = true;
        this.Open = this.isOpen(currentTime); 
    }
    public void getStoreHours() {
        System.out.println("Store Hours are from " + OPENING_TIME + ":00 to " + CLOSING_TIME + ":00.");
    }

    public boolean isOpen() {
        if (Open) {
            System.out.println("Yes, the store is open right now");
            return true;
        } else {
            System.out.println("No, the store is currently closed");
            return false;
        }
    }


    private boolean isOpen(Date date) {
        SimpleDateFormat ft = new SimpleDateFormat("H");

        int time = Integer.parseInt(ft.format(date));
        
        if (time > OPENING_TIME && time < CLOSING_TIME) {
            return true;
        } else {
            return false;
        }
    }

}    
