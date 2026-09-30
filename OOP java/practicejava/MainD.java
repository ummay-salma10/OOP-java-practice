interface Vehicle {
    // 1. Abstract method (body nai, implement kora mandatory)
    void startEngine();

    // 2. Default method (body ache, override kora optional)
    default void horn() {
        System.out.println("Beep Beep! (Default Horn)");
    }

    // 3. Static method (direct Interface name দিয়ে call করতে হয়)
    static void serviceInfo() {
        System.out.println("Vehicles require servicing every 5000 km.");
    }
}

class Bike implements Vehicle {
    // Shudhu abstract method compulsory implementation
    public void startEngine() {
        System.out.println("Bike engine started with self start.");
    }
    
    // horn() override na korleo code cholbe, tobe iccha korle override-o kora jay
}

// Main Class
public class MainD {
    public static void main(String[] args) {
        Bike myBike = new Bike();

        // Abstract method call
        myBike.startEngine();

        // Default method call (Class-e na likheo interface theke pache)
        myBike.horn();

        // Static method call (Direct Interface Name diye call korte hoy)
        Vehicle.serviceInfo();
    }
}
