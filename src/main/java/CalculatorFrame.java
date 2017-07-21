import javax.swing.*;

/**
 * Created by Kutafin Oleg on 21.07.2017.
 */
public class CalculatorFrame extends JFrame {

    public CalculatorFrame() {
        setTitle("Calculator");
        CalculatorPanel panel = new CalculatorPanel();
        add(panel);
        pack();
    }

}
