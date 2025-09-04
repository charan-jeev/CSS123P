

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class activity extends JFrame implements KeyListener {
    JLabel keyStatus;
    JLabel typedText;

    public activity() {
        setTitle("Charanjeev");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));


        keyStatus = new JLabel("Press any key...", SwingConstants.CENTER);
        keyStatus.setFont(new Font("Arial", Font.PLAIN, 16));
        add(keyStatus);


        typedText = new JLabel("", SwingConstants.CENTER);
        typedText.setFont(new Font("Arial", Font.BOLD, 20));
        add(typedText);

        addKeyListener(this);
        setFocusable(true);
    }

    // TODO: Display the key that was pressed
    public void keyPressed(KeyEvent e) {
        keyStatus.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));

    }

    // TODO: Display the key that was released
    public void keyReleased(KeyEvent e) {
        keyStatus.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));

    }

    // TODO: Append the typed character to the label
    public void keyTyped(KeyEvent e) {
        typedText.setText(typedText.getText() + e.getKeyChar());
    }

    public static void main(String[] args) {
        new activity().setVisible(true);
    }
}
