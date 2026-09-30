// Base Interface
interface BasicCalculator {
    void add(int a, int b);
}

// Child Interface - eta BasicCalculator-ke extends korche
interface AdvancedCalculator extends BasicCalculator {
    void multiply(int a, int b);
}

// Class-e Child Interface-ta implement kora holo
class SmartCalculator implements AdvancedCalculator {

    // BasicCalculator-er method implement korte hobe
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // AdvancedCalculator-er method-o implement korte hobe
    public void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
}

// Main Class
public class MainC {
    public static void main(String[] args) {
        SmartCalculator calc = new SmartCalculator();
        
        calc.add(10, 20);      // Parent interface-er method
        calc.multiply(5, 4);   // Child interface-er method
    }
}

