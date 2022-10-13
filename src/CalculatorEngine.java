import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.*;

public class CalculatorEngine implements ActionListener {
    SimpleCalculator calculator;

    char selectedAction = ' ';
    double currentResult = 0;

    DecimalFormat df = new DecimalFormat("0.#");

    CalculatorEngine(SimpleCalculator c) {
        this.calculator = c;
    }

    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();
        String dispFieldText = calculator.displayField.getText();
        double displayValue = 0;

        if (!"".equals(dispFieldText)) {
            displayValue = Double.parseDouble(dispFieldText);

        }

        int index = dispFieldText.indexOf('.');
        while(index != -1){
           JOptionPane.showConfirmDialog(null, "Нельзя вводить больше одного POINT", "WARRING", JOptionPane.PLAIN_MESSAGE);
            break;
        }

        if (clickedButton == calculator.buttonPlus) {
            selectedAction = '+';
            currentResult = displayValue;
            calculator.displayField.setText("");
        } else if (clickedButton == calculator.buttonMinus) {
            selectedAction = '-';
            currentResult = displayValue;
            calculator.displayField.setText("");
        } else if (clickedButton == calculator.buttonDivide) {
            selectedAction = '/';
            currentResult = displayValue;
            calculator.displayField.setText("");
        } else if (clickedButton == calculator.buttonMultiply) {
            selectedAction = '*';
            currentResult = displayValue;
            calculator.displayField.setText("");
        } else if (clickedButton == calculator.equal) {
            if (selectedAction == '+') {
                currentResult += displayValue;
                calculator.displayField.setText("" + df.format(currentResult));
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                calculator.displayField.setText("" + df.format(currentResult));
            } else if (selectedAction == '/') {
                if (displayValue == 0) {
                    JOptionPane.showConfirmDialog(null, "Нельзя делить на 0", "WARRING", JOptionPane.PLAIN_MESSAGE);
                } else {
                    currentResult /= displayValue;
                    calculator.displayField.setText("" + df.format(currentResult));
                }
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                calculator.displayField.setText("" + df.format(currentResult));
            }
        } else {
            String clickedButtonLabel = clickedButton.getText();
            calculator.displayField.setText(dispFieldText + clickedButtonLabel);
        }


    }

}
