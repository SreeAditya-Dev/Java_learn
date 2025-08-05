import lib.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Java Access Modifiers Demonstration ===");
        
        // Create CSE object and display all variables
        CSE cseObj = new CSE();
        cseObj.displayCSEInfo();
        
        // Create IOT object and try to access CSE members
        IOT iotObj = new IOT();
        iotObj.accessCSEMembers();
        
        // Accessing from main class (different package)
        System.out.println("\nMain class accessing CSE members (different package):");
        
        CSE mainCSE = new CSE();
        
        // Private - NOT accessible
        // System.out.println("Private: " + mainCSE.privateVar); // Compilation error
        
        // Default - NOT accessible (different package)
        // System.out.println("Default: " + mainCSE.defaultVar); // Compilation error
        
        // Protected - NOT accessible (different package, not subclass)
        // System.out.println("Protected: " + mainCSE.protectedVar); // Compilation error
        
        // Public - Accessible
        System.out.println("Public: " + mainCSE.publicVar);
        
        System.out.println("Note: Only public variable is accessible from different package");
    }
}