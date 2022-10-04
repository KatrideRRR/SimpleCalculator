import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {
    SimpleCalculator calculator;

    char selectedAction = ' ';
    double currentResult = 0;

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
        } else if (clickedButton == calculator.buttonEqual) {
            if (selectedAction == '+') {
                currentResult += displayValue;
                calculator.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                calculator.displayField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                calculator.displayField.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                calculator.displayField.setText("" + currentResult);
            }
        } else {
            String clickedButtonLabel = clickedButton.getText();
            calculator.displayField.setText(dispFieldText + clickedButtonLabel);
        }


    }

}
