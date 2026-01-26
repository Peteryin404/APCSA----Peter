public class Student {
    
    // Private instance variable (data hiding)
    private int studentID;
    
    // Public method to access the private data
    public int getID() { 
        return studentID; 
    }
    
    // Private method containing sensitive or internal logic
    private String getGrade() { 
        /* implementation not shown (e.g., checks final score) */
        return "B+"; // Placeholder return
    }
    
    /* Other variables, methods, and constructors not shown */
}

public class Classroom {
    
    private Student studentA;
    private Student studentB;
    
    public void checkInfo() {
        
        // --- Accessing Public Information ---
        
        // We can call getID() because it is PUBLIC in the Student class.
        System.out.println("Student A ID: " + studentA.getID());
        System.out.println("Student B ID: " + studentB.getID());
        
        // --- Accessing Private Information (Attempt Fails) ---
        
        // The following line would cause a compile-time error
        // because getGrade() is PRIVATE in the Student class.
        // System.out.println("Student A Grade: " + studentA.getGrade()); 
        
        /* missing code to display valid information */
    }
    
    /* Other variables, methods, and constructors not shown */
}
