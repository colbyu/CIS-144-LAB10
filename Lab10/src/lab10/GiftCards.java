package lab10;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//Colby Undeerhill

public class GiftCards
    {
    static NumberFormat nf = NumberFormat.getCurrencyInstance();
    DateFormat dateForm = new SimpleDateFormat("MM/dd/yyyy");
    Date today = new Date();
    // define the class data members
    public boolean expires;
    private double balance;
    public int cardNum;
    private char cardType;
    public String issueDate;
    private String holder;
    // define the member methods
    // default constructor
    public GiftCards() {}
    // overloaded constructor
    public GiftCards(String n, double amt)
        {
        holder = n;
        balance = amt;
        }
    public void IssueGiftCard()
        {
        System.out.println("");
        System.out.println(" [ Card Issued ] ");
        System.out.println(" Today's Date is: " + dateForm.format(today));
        System.out.println(" Card Holder . . . " + holder);
        System.out.println(" Card Number . . . " + cardNum);
        System.out.println(" Card Amount . . . " + 
            NumberFormat.getCurrencyInstance().format(balance));
        }
    public double getBalance()
        {
        return balance;
        }
    public void setBalance(double b)
        {
        balance = b;
        }
        public String getHolder()
        {
        return holder;
        }
    public void setHolder(String h)
        {
        holder = h;
        }
    public void printCurrentGiftCardInfo(double spend)
        {
        System.out.println("");
        System.out.println("");
        System.out.println(" [ Card Balance ]");
        System.out.println(" Today's Date is: " + dateForm.format(today));
        System.out.println(" Deducted  . . . . " +
            NumberFormat.getCurrencyInstance().format(spend));
        System.out.println(" Card Amount . . . " +
            NumberFormat.getCurrencyInstance().format(balance - spend));
        }
    }

 