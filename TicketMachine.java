/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
class TicketMachine
{
    //Fields
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private Integer balance;
    // The total amount of money collected by this machine.
    private Integer total;
    // The number of tickets printed.
    private Integer ticketNumber;
    
    //private int count; int
    //private Student representative; Student
    //private Server host; Server
    
    //private boolean alive; alive
    //private Person tutor; tutor
    //private Game game; game
    
    private int status;
    
    //public Student(String name) - class Student
    
    //public Book(String title, double price)  - 2, title is a String, price is a double(big big number)
    //Strings, ints, double, boolean. Title Price Location Author Genre NumberOfPages Edition PurhasedFrom Hardcover(boolean)
    
    /*
     * public Pet(String petsName) {
     *     public String name = petsName;
     * }
     */
    
    //2.20 - price is declared and assigned inside the constructor, can't be called upon outside of that constructor. getPrice() will be 0.

    //2.21 - return different values, ticket price and amount of money added to machine
    //2.22 - How much money has been put in the machine?
    //2.23 - No changes required. Still returns balance.
    
    //2.29 - Not the same name as the class
    
    //2.35 - different instances, different prices
    //2.36 - "# price cents."
    //2.37 - same thing
    //2.38 - can't read price of different instance
    
    //2.43 - balance is not changed, <0 , moves on to else statement that just prints a line. 0 will be same, moves on to else statement
    //2.44 - allows you to enter 0 money, adds it to balance
    //2.45 - visible, yes, you can see it or you can't
    //2.46 - only add price to total, subtracts price from balance
    //2.47 - no, balance must be >= to price
    //2.48 - * / %
    //2.49 int saving = price * discount
    //2.50 int mean = total / count
    //2.51 if (price > budget) { System.out.println("Too expensive")} else { System.out.println("Just right")}
    //2.52 System.out.println("Too expensive. Budget is only: " + budget)
    //2.53 no temp holder of amount refunded. returns 0 regardless of money in balance
    //2.54 return stops the method. balance would never get set to 0
    //2.55 public int emptyMachine() { int amountTaken = total; total=0; return amountTaken;}
    //2.56 mutator
    //2.57 int amountLeftToPay = price - balance; if (amountLeftToPay <= 0) { printTicket } else { System.out.println("Please add " + amountLeftToPay)}
    //2.58 TicketMachine1.setPrice() -> much editing needed.
    
    
    
    
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    //Constuctor
    //Different - Has an input
    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
        ticketNumber = 0;
    }
    
    public TicketMachine(int moneys) {
        price = moneys;
        balance = 0;
        total = 0;
        ticketNumber = 0;
    }
    //2.39 - just creates instance, no prompt for setting price
    
    //2.40 mutator
    public void empty() {
        total = 0;
    }
    
    //2.40 mutator
    public void setPrice(int newPrice) {
        price = newPrice;
    }
    
    public int score;
    public void increase(int points) {
        score += points;
    }
    
    /**
     * Reduce price by the given amount.
     */
    public void discount(int amount) {
        price -= amount;
    }
    
    public void prompt()  {
        System.out.println("Please insert the correct amount of money.");
    }
    
    public void showPrice() {
        System.out.println("The price of a ticket is " + price + " cents.");
    }

    /**
     * Return the price of a ticket.
     */
    //Methods
    public Integer getPrice()
    {
        return price;
    //    return price; missing return statement
    }
    
    /**
     * Return ticketNumber.
     * (Increments on each print.)
     */
    public Integer getTicketNumber()
    {
        return ticketNumber;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public Integer getAmount()
    {
        return balance;
    }
    
    public int getTotal() {
        return total;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    //wouldn't have to return anything, but here it does. Could just System.out.println
    public Integer insertMoney(Integer amount)
    {
        balance = balance + amount;
        return balance;
    }
    
    public Integer calculateTotal(){
        total = balance + total;
        return total;
    }
    
    public Integer incrementTicketNumber(){
        ticketNumber++;
        return ticketNumber;
    }
    

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    
    //2.26 String vs Integer
    public String printTicket()
    {
        //Increment the number of tickets printed
        incrementTicketNumber();
        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
        
        return "Ticket price: " + price + " cents. " + "Your total is " + total + ".";
    }
}
//public class Student {
//}
//public class LabClass {
//}
