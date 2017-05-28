import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window extends JFrame implements ItemListener {
    JTextField display = new JTextField("", 6);
    JPanel buttonPanel = new JPanel(new GridLayout(6, 4));
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
    JButton buttonFactorial = new JButton("n!");
    ButtonGroup group = new ButtonGroup();
    JRadioButton simpleCalc = new JRadioButton("Calculation", true);
    JRadioButton factorial = new JRadioButton("Factorial", false);

    Window() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 100, 400, 400);
        display.setHorizontalAlignment(4);
        display.setFont(new Font("Dialog", 0, 30));
        setResizable(false);
        display.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ((c != 8) && (c != 37) && (c != 39)) {
                    e.consume();
                }

                if (c == 48) {
                    button0.doClick();
                }
                if (c == 49) {
                    button1.doClick();
                }
                if (c == 50) {
                    button2.doClick();
                }
                if (c == 51) {
                    button3.doClick();
                }
                if (c == 52) {
                    button4.doClick();
                }
                if (c == 53) {
                    button5.doClick();
                }
                if (c == 54) {
                    button6.doClick();
                }
                if (c == 55) {
                    button7.doClick();
                }
                if (c == 56) {
                    button8.doClick();
                }
                if (c == 57) {
                    button9.doClick();
                }
                if (c == 43) {
                    buttonSum.doClick();
                }
                if (c == 42) {
                    buttonMul.doClick();
                }
                if (c == 45) {
                    buttonSub.doClick();
                }
                if (c == 47) {
                    buttonDivide.doClick();
                }
                if (c == 46) {
                    buttonComma.doClick();
                }
                if (c == 40) {
                    buttonParenOpen.doClick();
                }
                if (c == 41) {
                    buttonParenClose.doClick();
                }
                if (c == 32) {
                    buttonStart.doClick();
                }
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if ((expression.length() == 0))
                    display.setText(display.getText() + "0");
                if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) == ')')) {
                    display.setText(display.getText() + "*");
                    display.setText(display.getText() + "0");
                } else
                    if ((expression.length() > 0 )&&(expression.charAt(expression.length() - 1) != '0')) {
                    if ((expression.charAt(expression.length() - 1) == '.') || ((expression.charAt(expression.length() - 1) > 48)
                            && (expression.charAt(expression.length() - 1) < 58)) || (expression.charAt(expression.length() - 1) == '+')
                            || (expression.charAt(expression.length() - 1) == '-') || (expression.charAt(expression.length() - 1) == '*')
                            || (expression.charAt(expression.length() - 1) == '/')|| (expression.charAt(expression.length() - 1) == '(')
                            ||(expression.charAt(expression.length() - 1) != ')'))
                        display.setText(display.getText() + "0");
                }else
                    if ((expression.length() > 1)) {
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                    (expression.charAt(expression.length()-2) > 47)
                            ||(expression.charAt(expression.length()-2) < 57) &&
                            (expression.charAt(expression.length() - 2) != '+')&&(expression.charAt(expression.length() - 2) != '-') &&
                            (expression.charAt(expression.length() - 2) != '*')
                            &&(expression.charAt(expression.length() - 2) != '/')&&(expression.charAt(expression.length() - 2) != '('))
                    display.setText(display.getText() + "0");
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if ((expression.length() == 0))//если это первая цифра-написать
                    display.setText(display.getText() + "1");
                if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) == ')')) {
                    display.setText(display.getText() + "*");
                    display.setText(display.getText() + "1");
                } else if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) != '0')) {
                    display.setText(display.getText() + "1");
                } else if ((expression.length() > 1)) {
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) > 47)
                            && (expression.charAt(expression.length() - 2) < 57))||(expression.charAt(expression.length() - 2)=='.'))
                        display.setText(display.getText() + "1");
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) == '+')||(expression.charAt(expression.length() - 2) == '-') ||
                                    (expression.charAt(expression.length() - 2) == '*')
                                    ||(expression.charAt(expression.length() - 2) == '/')||(expression.charAt(expression.length() - 2) == '('))) {
                        display.setText(display.getText() + ".");
                        display.setText(display.getText() + "1");
                    }
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if ((expression.length() == 0))//если это первая цифра-написать
                    display.setText(display.getText() + "2");
                if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) == ')')) {
                    display.setText(display.getText() + "*");
                    display.setText(display.getText() + "2");
                } else if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) != '0')) {
                    display.setText(display.getText() + "2");
                } else if ((expression.length() > 1)) {
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) > 47)
                                    && (expression.charAt(expression.length() - 2) < 57))||(expression.charAt(expression.length() - 2)=='.'))
                        display.setText(display.getText() + "2");
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) == '+')||(expression.charAt(expression.length() - 2) == '-') ||
                                    (expression.charAt(expression.length() - 2) == '*')
                                    ||(expression.charAt(expression.length() - 2) == '/')||(expression.charAt(expression.length() - 2) == '('))) {
                        display.setText(display.getText() + ".");
                        display.setText(display.getText() + "2");
                    }
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if ((expression.length() == 0))//если это первая цифра-написать
                    display.setText(display.getText() + "3");
                if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) == ')')) {
                    display.setText(display.getText() + "*");
                    display.setText(display.getText() + "3");
                } else if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) != '0')) {
                    display.setText(display.getText() + "3");
                } else if ((expression.length() > 1)) {
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) > 47)
                                    && (expression.charAt(expression.length() - 2) < 57))||(expression.charAt(expression.length() - 2)=='.'))
                        display.setText(display.getText() + "3");
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) == '+')||(expression.charAt(expression.length() - 2) == '-') ||
                                    (expression.charAt(expression.length() - 2) == '*')
                                    ||(expression.charAt(expression.length() - 2) == '/')||(expression.charAt(expression.length() - 2) == '('))) {
                        display.setText(display.getText() + ".");
                        display.setText(display.getText() + "3");
                    }
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if ((expression.length() == 0))//если это первая цифра-написать
                    display.setText(display.getText() + "4");
                if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) == ')')) {
                    display.setText(display.getText() + "*");
                    display.setText(display.getText() + "4");
                } else if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) != '0')) {
                    display.setText(display.getText() + "4");
                } else if ((expression.length() > 1)) {
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) > 47)
                                    && (expression.charAt(expression.length() - 2) < 57))||(expression.charAt(expression.length() - 2)=='.'))
                        display.setText(display.getText() + "4");
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) == '+')||(expression.charAt(expression.length() - 2) == '-') ||
                                    (expression.charAt(expression.length() - 2) == '*')
                                    ||(expression.charAt(expression.length() - 2) == '/')||(expression.charAt(expression.length() - 2) == '('))) {
                        display.setText(display.getText() + ".");
                        display.setText(display.getText() + "4");
                    }
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if ((expression.length() == 0))//если это первая цифра-написать
                    display.setText(display.getText() + "5");
                if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) == ')')) {
                    display.setText(display.getText() + "*");
                    display.setText(display.getText() + "5");
                } else if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) != '0')) {
                    display.setText(display.getText() + "5");
                } else if ((expression.length() > 1)) {
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) > 47)
                                    && (expression.charAt(expression.length() - 2) < 57))||(expression.charAt(expression.length() - 2)=='.'))
                        display.setText(display.getText() + "5");
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) == '+')||(expression.charAt(expression.length() - 2) == '-') ||
                                    (expression.charAt(expression.length() - 2) == '*')
                                    ||(expression.charAt(expression.length() - 2) == '/')||(expression.charAt(expression.length() - 2) == '('))) {
                        display.setText(display.getText() + ".");
                        display.setText(display.getText() + "5");
                    }
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if ((expression.length() == 0))//если это первая цифра-написать
                    display.setText(display.getText() + "6");
                if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) == ')')) {
                    display.setText(display.getText() + "*");
                    display.setText(display.getText() + "6");
                } else if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) != '0')) {
                    display.setText(display.getText() + "6");
                } else if ((expression.length() > 1)) {
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) > 47)
                                    && (expression.charAt(expression.length() - 2) < 57))||(expression.charAt(expression.length() - 2)=='.'))
                        display.setText(display.getText() + "6");
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) == '+')||(expression.charAt(expression.length() - 2) == '-') ||
                                    (expression.charAt(expression.length() - 2) == '*')
                                    ||(expression.charAt(expression.length() - 2) == '/')||(expression.charAt(expression.length() - 2) == '('))) {
                        display.setText(display.getText() + ".");
                        display.setText(display.getText() + "6");
                    }
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if ((expression.length() == 0))//если это первая цифра-написать
                    display.setText(display.getText() + "7");
                if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) == ')')) {
                    display.setText(display.getText() + "*");
                    display.setText(display.getText() + "7");
                } else if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) != '0')) {
                    display.setText(display.getText() + "7");
                } else if ((expression.length() > 1)) {
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) > 47)
                                    && (expression.charAt(expression.length() - 2) < 57))||(expression.charAt(expression.length() - 2)=='.'))
                        display.setText(display.getText() + "7");
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) == '+')||(expression.charAt(expression.length() - 2) == '-') ||
                                    (expression.charAt(expression.length() - 2) == '*')
                                    ||(expression.charAt(expression.length() - 2) == '/')||(expression.charAt(expression.length() - 2) == '('))) {
                        display.setText(display.getText() + ".");
                        display.setText(display.getText() + "7");
                    }
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if ((expression.length() == 0))//если это первая цифра-написать
                    display.setText(display.getText() + "8");
                if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) == ')')) {
                    display.setText(display.getText() + "*");
                    display.setText(display.getText() + "8");
                } else if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) != '0')) {
                    display.setText(display.getText() + "8");
                } else if ((expression.length() > 1)) {
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) > 47)
                                    && (expression.charAt(expression.length() - 2) < 57))||(expression.charAt(expression.length() - 2)=='.'))
                        display.setText(display.getText() + "8");
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) == '+')||(expression.charAt(expression.length() - 2) == '-') ||
                                    (expression.charAt(expression.length() - 2) == '*')
                                    ||(expression.charAt(expression.length() - 2) == '/')||(expression.charAt(expression.length() - 2) == '('))) {
                        display.setText(display.getText() + ".");
                        display.setText(display.getText() + "8");
                    }
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if ((expression.length() == 0))//если это первая цифра-написать
                    display.setText(display.getText() + "9");
                if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) == ')')) {
                    display.setText(display.getText() + "*");
                    display.setText(display.getText() + "9");
                } else if ((expression.length() > 0) && (expression.charAt(expression.length() - 1) != '0')) {
                    display.setText(display.getText() + "9");
                } else if ((expression.length() > 1)) {
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) > 47)
                                    && (expression.charAt(expression.length() - 2) < 57))||(expression.charAt(expression.length() - 2)=='.'))
                        display.setText(display.getText() + "9");
                    if ((expression.charAt(expression.length() - 1) == '0') &&
                            ((expression.charAt(expression.length() - 2) == '+')||(expression.charAt(expression.length() - 2) == '-') ||
                                    (expression.charAt(expression.length() - 2) == '*')
                                    ||(expression.charAt(expression.length() - 2) == '/')||(expression.charAt(expression.length() - 2) == '('))) {
                        display.setText(display.getText() + ".");
                        display.setText(display.getText() + "9");
                    }
                }
            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                char ch2 = '0';
                if ((expression.length() > 1) || (expression.charAt(0) != '-')) {
                    check();
                    char ch = expression.charAt(expression.length() - 1);
                    if ((expression.length() > 2)) {
                        ch2 = expression.charAt(expression.length() - 2);
                        if (!(ch == '(') && !((ch == '-') && (ch2 == '(')))
                            display.setText(display.getText() + "+");
                    } else if (!(ch == '(') && !((ch == '-')))
                        display.setText(display.getText() + "+");
                }
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                char ch2 = '0';
                if ((expression.length() > 1) || (expression.charAt(0) != '-')) {
                    check();
                    char ch = expression.charAt(expression.length() - 1);
                    if ((expression.length() > 2)) {
                        ch2 = expression.charAt(expression.length() - 2);
                        if (!(ch == '(') && !((ch == '-') && (ch2 == '(')))
                            display.setText(display.getText() + "*");
                    } else if (!(ch == '(') && !((ch == '-')))
                        display.setText(display.getText() + "*");
                }
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                char ch2 = '0';
                if ((expression.length() > 1) || (expression.charAt(0) != '-')) {
                    check();
                    char ch = expression.charAt(expression.length() - 1);
                    if ((expression.length() > 2)) {
                        ch2 = expression.charAt(expression.length() - 2);
                        if (!(ch == '(') && !((ch == '-') && (ch2 == '(')))
                            display.setText(display.getText() + "/");
                    } else if (!(ch == '(') && !((ch == '-')))
                        display.setText(display.getText() + "/");
                }

            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if (!expression.isEmpty()) {
                    check();
                    display.setText(display.getText() + "-");
                } else display.setText(display.getText() + "-");
            }
        });
        buttonParenOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if (expression.length() > 0) {
                    char ch = expression.charAt(expression.length() - 1);
                    if ((ch != '+') && (ch != '-') && (ch != '*') && (ch != '/') && (ch != '(')) {
                        display.setText(display.getText() + "*");
                    }
                }
                display.setText(display.getText() + "(");
            }
        });
        buttonParenClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + ")");
            }
        });
        buttonComma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                if (expression.length() > 0) {
                    check();
                    display.setText(display.getText() + ".");
                }
            }
        });
        buttonBackspaceSymbol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText(temp.substring(0, temp.length() - 1));
            }
        });
        buttonFactorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String expression = display.getText();
                    if (expression.length() > 0) {
                        Long exp=Long.parseLong(expression);
                        if((exp<21)&&(exp>0)){
                        Long result = Factorial.factorial(exp);
                        display.setText(Long.toString(result));}
                        else JOptionPane.showMessageDialog(new JFrame(), "Error!\n" +
                                "The factorial of a given number is too large");
                    }

                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(new JFrame(), "Error!\n" +
                            "Invalid expression!");
                }
            }
        });
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String expression = display.getText();
                    int open = 0;
                    int close = 0;
                    for (int i = 0; i < expression.length(); i++) {
                        if (expression.charAt(i) == '(')
                            open++;
                        if (expression.charAt(i) == ')')
                            close++;
                    }
                    if (open != close) {
                        JOptionPane.showMessageDialog(new JFrame(), "Error!The number of parentheses does not match!");

                    } else {
                        InToPost inToPost = new InToPost(StrToMass.mass(expression));
                        ParsePost parsePost = new ParsePost(inToPost.doTrans());
                        display.removeAll();
                        display.setText(Double.toString(parsePost.doParse()));
                    }
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(new JFrame(), "Error!\n" +
                            "Invalid expression!");
                }
            }

        });
        setLayout(new BorderLayout());
        add(display, "North");
        add(buttonPanel, "Center");
        group.add(simpleCalc);
        group.add(factorial);
        buttonFactorial.setEnabled(false);
        simpleCalc.addItemListener(this);
        factorial.addItemListener(this);
        buttonPanel.add(simpleCalc);
        buttonPanel.add(factorial);
        buttonPanel.add(buttonBackspaceSymbol);
        buttonPanel.add(buttonCancel);
        buttonPanel.add(buttonFactorial);
        buttonPanel.add(buttonParenOpen);
        buttonPanel.add(buttonParenClose);
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
        buttonPanel.add(buttonComma);
        buttonPanel.add(button0);
        buttonPanel.add(buttonStart);
        setVisible(true);
    }

    public void check() {
        String expression = display.getText();
        char ch = expression.charAt(expression.length() - 1);
        System.out.println(ch);
        if ((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/') || (ch == '.')) {
            expression = expression.substring(0, expression.length() - 1);
            display.removeAll();
            display.setText(expression);
        }
    }

    public static void main(String[] args) {
        new Window();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getItemSelectable() == simpleCalc) {
            buttonFactorial.setEnabled(false);
            buttonComma.setEnabled(true);
            buttonSum.setEnabled(true);
            buttonSub.setEnabled(true);
            buttonMul.setEnabled(true);
            buttonDivide.setEnabled(true);
            buttonParenClose.setEnabled(true);
            buttonParenOpen.setEnabled(true);
            buttonStart.setEnabled(true);

        }
        if (e.getItemSelectable() == factorial) {
            buttonFactorial.setEnabled(true);
            buttonComma.setEnabled(false);
            buttonSum.setEnabled(false);
            buttonSub.setEnabled(false);
            buttonMul.setEnabled(false);
            buttonDivide.setEnabled(false);
            buttonParenClose.setEnabled(false);
            buttonParenOpen.setEnabled(false);
            buttonStart.setEnabled(false);

        }
    }
}
