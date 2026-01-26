public class Student2 {
    
    // Private instance variable
    private int studentID;
    
    // Public getter method (to READ the ID)
    public int getID() { 
        return studentID; 
    }
    
    // *** NEW: Public setter method (to WRITE/CHANGE the ID) ***
    public void setID(int newID) { 
        // We can add validation logic here before setting the variable
        if (newID > 0) {
            this.studentID = newID;
            System.out.println("ID successfully updated.");
        } else {
            System.out.println("Invalid ID. Must be positive.");
        }
    }
    
    /* Private and other methods not shown */
}
