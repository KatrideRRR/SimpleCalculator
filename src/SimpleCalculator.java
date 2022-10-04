import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class SimpleCalculator {
    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;

    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonMultiply;
    JButton buttonDivide;

    JPanel p1;
    JPanel p2;

    public SimpleCalculator() {
        windowContent = new JPanel();
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        displayField = new JTextField(30);
        windowContent.add(BorderLayout.NORTH, displayField);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");

        p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        p1.setLayout(gl);

        p1.add(button0);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        p2 = new JPanel();
        GridLayout gl1 = new GridLayout(4, 1);
        p2.setLayout(gl1);

        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMultiply);
        p2.add(buttonDivide);

        windowContent.add("Center", p1);

        windowContent.add("East", p2);

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        frame.pack();

        frame.setVisible(true);

        CalculatorEngine calcEngine = new CalculatorEngine(this);

        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);
        buttonPoint.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);
    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
    }
}

