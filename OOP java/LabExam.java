// 1.interface declar
interface SecurityCheck {
    boolean verifyPin(int pin);
}

// abstract class
abstract class Payment {
    protected double amount;
    public Payment(double amount)
    {
        this.amount = amount;
    }
    //abstract method kono body takbe na
    public abstract void processPayment();

    //concreat method ...has implementation
    public void printReceipt(){
        System.out.println("Receipt: payment of $ " + amount + "processed successfully.");
    }
}

//bkashpayment class
class BkashPayment extends Payment implements SecurityCheck {
    private int userpin = 1216;
    public BkashPayment(double amount){
        super(amount);
    }

    @Override 
    public boolean verifyPin(int pin){
        return userpin == pin;

    }
    @Override 
    public void processPayment(){
        System.out.println("Processing bkash payment of $: " + amount);
    }

}
//cardpayment class
class CardPayment extends Payment implements SecurityCheck {
   private int cardpin = 1007;
    public CardPayment(double amount){
        super(amount);
    }

    @Override 
    public boolean verifyPin(int pin){
        return cardpin == pin;

    }
    @Override 
    public void processPayment(){
        System.out.println("Processing card payment of $: " + amount);
    }

}
//main class
public class LabExam {
    public static void main(String[] args) {
        //bkash 
        BkashPayment bkash = new BkashPayment(1400.000);
        bkash.processPayment();
        
        System.out.println("bkash sofol");

        //card
         CardPayment card = new CardPayment(20000.000);
        card.processPayment();
        
        System.out.println("card sofol");

        
    }
}