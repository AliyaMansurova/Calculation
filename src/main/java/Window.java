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
        this.setBounds(500, 100, 400, 400);
        this.display.setHorizontalAlignment(4);
        this.display.setFont(new Font("Dialog", 0, 50));
        this.setResizable(false);
        this.display.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if((c < 48 || c > 57) && c != 43 && c != 45 && c != 42 && c != 47 && c != 40 && c != 41 && c != 46) {
                    e.consume();
                }

            }
        });
        this.button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "0");
            }
        });
        this.button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "1");
            }
        });
        this.button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "2");
            }
        });
        this.button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "3");
            }
        });
        this.button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "4");
            }
        });
        this.button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "5");
            }
        });
        this.button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "6");
            }
        });
        this.button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "7");
            }
        });
        this.button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "8");
            }
        });
        this.button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "9");
            }
        });
        this.buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText("0");
            }
        });
        this.buttonSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.firstValue = Integer.valueOf(Window.this.display.getText()).intValue();
                Window.this.display.setText(Window.this.display.getText() + "+");
            }
        });
        this.buttonMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "*");
            }
        });
        this.buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.firstValue = Integer.valueOf(Window.this.display.getText()).intValue();
                Window.this.display.setText(Window.this.display.getText() + "/");
            }
        });
        this.buttonSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.firstValue = Integer.valueOf(Window.this.display.getText()).intValue();
                Window.this.display.setText(Window.this.display.getText() + "-");
            }
        });
        this.buttonParenOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + "(");
            }
        });
        this.buttonParenClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + ")");
            }
        });
        this.buttonComma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window.this.display.setText(Window.this.display.getText() + ".");
            }
        });
        this.buttonBackspaceSymbol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = Window.this.display.getText();
                Window.this.display.setText(temp.substring(0, temp.length() - 1));
            }
        });
        this.buttonStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        this.setLayout(new BorderLayout());
        this.add(this.display, "North");
        this.add(this.buttonPanel, "Center");
        this.buttonPanel.add(this.buttonParenOpen);
        this.buttonPanel.add(this.buttonParenClose);
        this.buttonPanel.add(this.buttonCancel);
        this.buttonPanel.add(this.buttonDivide);
        this.buttonPanel.add(this.button7);
        this.buttonPanel.add(this.button8);
        this.buttonPanel.add(this.button9);
        this.buttonPanel.add(this.buttonMul);
        this.buttonPanel.add(this.button4);
        this.buttonPanel.add(this.button5);
        this.buttonPanel.add(this.button6);
        this.buttonPanel.add(this.buttonSub);
        this.buttonPanel.add(this.button1);
        this.buttonPanel.add(this.button2);
        this.buttonPanel.add(this.button3);
        this.buttonPanel.add(this.buttonSum);
        this.buttonPanel.add(this.buttonBackspaceSymbol);
        this.buttonPanel.add(this.button0);
        this.buttonPanel.add(this.buttonComma);
        this.buttonPanel.add(this.buttonStart);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
