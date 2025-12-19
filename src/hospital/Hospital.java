package hospital;
import java.awt.*;

public class Hospital {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
    //This is empty because we used the JFrame Form in order to easily design the GUI for the hospital information system
    //We put the EventQueue.invokeLater(() -> {}); as a function in order to automatically run the class Login even when you are running this file
}