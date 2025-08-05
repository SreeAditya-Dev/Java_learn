package lib;

public class IOT {
    public void accessCSEMembers() {
        CSE cseObj = new CSE();
        
        System.out.println("\nIOT Class accessing CSE members (same package):");
        
        // Private - NOT accessible
        // System.out.println("Private: " + cseObj.privateVar); // Compilation error
        
        // Default - Accessible (same package)
        System.out.println("Default: " + cseObj.defaultVar);
        
        // Protected - Accessible (same package)
        System.out.println("Protected: " + cseObj.protectedVar);
        
        // Public - Accessible
        System.out.println("Public: " + cseObj.publicVar);
        
        System.out.println("Note: Private variable is NOT accessible from IOT class");
    }
}