## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

# Login System 

## Overview

The Login System GUI is a simple Java-based graphical user interface (GUI) application that provides a basic login functionality. Users can enter their username and password, and the system will verify the credentials against predefined values. It features a user-friendly interface with feedback messages and a limited number of login attempts.

## Features

- User authentication with a predefined username and password.
![alt text](<../images/Screenshot 2025-02-08 230025.png>)

- Feedback messages indicating incorrect credentials.
![alt text](<../images/Screenshot 2025-02-08 230307.png>)

- Limited login attempts (3 attempts).
![alt text](<../images/Screenshot 2025-02-08 230450.png>)

- Clear messages when the user has no attempts left.
![alt text](<../images/Screenshot 2025-02-08 231420.png>)

- Responsive design that centers the window on the screen.

## Requirements

To run the application, you need:

- Java Development Kit (JDK) version 8 or higher.
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse, or any text editor).

## Installation

1. **Clone the Repository**:
   Clone this repository to your local machine using the following command:
   ```bash
   git clone <repository-url>
   ```

2. **Navigate to the Project Directory**:
   Change your directory to the project folder:
   ```bash
   cd <project-folder>
   ```

3. **Compile the Application**:
   Compile the Java file using the following command:
   ```bash
   javac LoginSystemGUI.java
   ```

4. **Run the Application**:
   Execute the compiled class:
   ```bash
   java LoginSystemGUI
   ```

## Usage

- Launch the application.
- Enter the username: `samuelkanui`.
- Enter the password: `e4254@00254`.
- Click the **Login** button to attempt to log in.
- If the credentials are correct, a welcome message will be displayed, and the application will close.
- If the credentials are incorrect, the user will receive feedback and will have up to 3 attempts to log in.

## Code Explanation

- The `LoginSystemGUI` class is the main class that initializes the GUI and handles user interactions.
- The main components include:
  - `JFrame`: The main window that holds the login form.
  - `JTextField`: For entering the username.
  - `JPasswordField`: For entering the password securely.
  - `JButton`: For submitting the login information.
  - `JLabel`: For displaying messages and attempts remaining.
- The login logic verifies the entered credentials and provides feedback accordingly.

## Customization

You can customize the following aspects of the application:

- Change the predefined username and password by modifying the `CORRECT_USERNAME` and `CORRECT_PASSWORD` constants.
- Modify the layout, colors, and fonts to enhance the visual appearance of the GUI.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any improvements or bugs you find.

## Acknowledgments

- Java Swing for the GUI components.
- Open-source contributions for inspiration and guidance.

---

Feel free to adapt and modify this README as necessary for your project!
