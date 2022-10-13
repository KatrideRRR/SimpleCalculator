import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class SimpleCalculator {
    JPanel windowContent;
    JTextField displayField;
    JButton[] buttonArray = new JButton[10];
    JButton point;
    JButton equal;

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

        buttonArray[0] = new JButton("0");
        buttonArray[1] = new JButton("1");
        buttonArray[2] = new JButton("2");
        buttonArray[3] = new JButton("3");
        buttonArray[4] = new JButton("4");
        buttonArray[5] = new JButton("5");
        buttonArray[6] = new JButton("6");
        buttonArray[7] = new JButton("7");
        buttonArray[8] = new JButton("8");
        buttonArray[9] = new JButton("9");


        point = new JButton(".");
        equal = new JButton("=");

        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");

        p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        p1.setLayout(gl);

        for (int i = 0; i < 10; i++) {
            p1.add(buttonArray[i]);
        }
        p1.add(point);
        p1.add(equal);

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

        for (int i = 0; i < 10; i++) {
            buttonArray[i].addActionListener(calcEngine);
        }
        point.addActionListener(calcEngine);
        equal.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);

    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
    }
}

