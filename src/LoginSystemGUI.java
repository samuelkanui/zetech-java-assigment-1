import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSystemGUI {
    private static final String CORRECT_USERNAME = "samuelkanui";
    private static final String CORRECT_PASSWORD = "e4254@00254";

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel messageLabel;
    private JLabel attemptsLabel;
    private int attempts = 3;

    public LoginSystemGUI() {
        initialize();
    }

    private void initialize() {
        // Create the main frame
        frame = new JFrame("Login System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new BorderLayout());

        // Create the panel for the login form
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        // Username label and field
        panel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        // Password label and field
        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        // Login button
        JButton loginButton = new JButton("Login");
        panel.add(loginButton);

        // Message label for feedback
        messageLabel = new JLabel();
        messageLabel.setForeground(Color.RED);
        panel.add(messageLabel);

        // Attempts remaining label
        attemptsLabel = new JLabel("Attempts remaining: " + attempts);
        attemptsLabel.setForeground(Color.BLUE);
        panel.add(attemptsLabel);

        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                    // Show welcome message and close the application
                    JOptionPane.showMessageDialog(frame,
                            "Welcome to my system, " + username + "!",
                            "Login Successful",
                            JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose(); // Close the login window
                } else {
                    attempts--;
                    if (attempts > 0) {
                        messageLabel.setText("Incorrect username or password.");
                        messageLabel.setForeground(Color.RED);
                        attemptsLabel.setText("Attempts remaining: " + attempts);
                    } else {
                        messageLabel.setText("Incorrect username or password.");
                        messageLabel.setForeground(Color.RED);
                        attemptsLabel.setText("No attempts left.");

                        // Show a message dialog when no attempts are left
                        JOptionPane.showMessageDialog(frame,
                                "Invalid credentials. Access denied. Try again next time.",
                                "Access Denied",
                                JOptionPane.ERROR_MESSAGE);
                        frame.dispose(); // Close the login window
                    }
                }

                // Clear the password field for security
                passwordField.setText("");
            }
        });

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new LoginSystemGUI());
    }
}
