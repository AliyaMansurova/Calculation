import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {
    JTextField display = new JTextField("", 10);
    JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonSum = new JButton("+");
    JButton buttonCancel = new JButton("C");
    JButton buttonDivide = new JButton("/");
    JButton buttonSub = new JButton("-");
    JButton buttonMul = new JButton("*");
    JButton buttonStart = new JButton("=");
    JButton buttonParenOpen = new JButton("(");
    JButton buttonParenClose = new JButton(")");
    JButton buttonComma = new JButton(".");
    JButton buttonBackspaceSymbol = new JButton("<-");
    int firstValue = 0;
    String operation = "+";

    Window() {
        setBounds(500, 100, 400, 400);
        display.setHorizontalAlignment(4);
        display.setFont(new Font("Dialog", 0, 50));
        setResizable(false);
        display.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if((c < 48 || c > 57) && c != 43 && c != 45 && c != 42 && c != 47 && c != 40 && c != 41 && c != 46) {
                    e.consume();
                }

            }
        });
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
display.setText(display.getText() + "4");
            }
        });
button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "5");
            }
        });
button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               display.setText(display.getText() + "9");
            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });
        buttonSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText()).intValue();
                display.setText(display.getText() + "+");
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "*");
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText()).intValue();
                display.setText(display.getText() + "/");
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText()).intValue();
                display.setText(display.getText() + "-");
            }
        });
        buttonParenOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "(");
            }
        });
        buttonParenClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + ")");
            }
        });
        buttonComma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + ".");
            }
        });
        buttonBackspaceSymbol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText(temp.substring(0, temp.length() - 1));
            }
        });
        buttonStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        setLayout(new BorderLayout());
        add(display, "North");
        add(buttonPanel, "Center");
        buttonPanel.add(buttonParenOpen);
        buttonPanel.add(buttonParenClose);
        buttonPanel.add(buttonCancel);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonMul);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonSub);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonSum);
        buttonPanel.add(buttonBackspaceSymbol);
        buttonPanel.add(button0);
        buttonPanel.add(buttonComma);
        buttonPanel.add(buttonStart);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
