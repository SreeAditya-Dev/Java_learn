package lib;

public class CSE {
    private String privateVar = "Private Variable";      // Only within same class
    String defaultVar = "Default Variable";              // Within same package
    protected String protectedVar = "Protected Variable"; // Same package + subclasses
    public String publicVar = "Public Variable";         // Accessible everywhere
    
    public void displayCSEInfo() {
        System.out.println("CSE Class - All variables accessible within same class:");
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}