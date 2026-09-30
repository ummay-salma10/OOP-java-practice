// 1st Interface
interface Printable {
    void printDocument();
}

// 2nd Interface
interface Showable {
    void showPreview();
}

// Class duiti Interface-kei implement korche
class MultiFunctionPrinter implements Printable, Showable {
    
    // Printable-er method implementation
    public void printDocument() {
        System.out.println("Document is printing...");
    }

    // Showable-er method implementation
    public void showPreview() {
        System.out.println("Displaying preview on screen...");
    }
}

// Main Class
public class MainB {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        
        // Dui interface-er method-ii call kora jacche
        mfp.showPreview();
        mfp.printDocument();
    }
}
