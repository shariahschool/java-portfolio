import javax.swing.JOptionPane;
 
public class GettingUserInput {
    public static void main(String[] args) {
        int age;
        String name;
       
        // Display a simple message, centered on the screen
        JOptionPane.showMessageDialog( null, "Look, no Scanner!" );
       
        // Prompt the user for their name and age using GUI dialogs
        name = JOptionPane.showInputDialog( "What is your full name: " );
        // Read age as a String, but convert it to an int
        age = Integer.parseInt( JOptionPane.showInputDialog( "How old are you: " ) );
       
        //Display a message with the user's name and age, centered on the screen
        JOptionPane.showMessageDialog( null, "Well, " + name+", you are " + age + " years old." );
       
    }  
}
