import javax.swing.*;

public class Welcome {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Welcome to second year " + name);
    }
}
