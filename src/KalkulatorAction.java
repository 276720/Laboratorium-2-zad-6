import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorAction implements ActionListener {
    private JTextField heightInput,weightInput;
    private JLabel resultLabel;
    public KalkulatorAction(JTextField heightInput,JTextField weightInput,JLabel resultLabel){
        this.heightInput = heightInput;
        this.weightInput = weightInput;
        this.resultLabel = resultLabel;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        double height = Double.parseDouble(heightInput.getText());
        double weight = Double.parseDouble(weightInput.getText());
        double result = 0.0;

        result = weight/(height*height)*10000;
        resultLabel.setText("Wynik: " + String.format("%.1f", result));
    }
}
