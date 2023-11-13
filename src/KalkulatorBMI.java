import javax.swing.*;
import java.awt.*;

public class KalkulatorBMI extends JFrame{
    private JTextField heightInput,weightInput;
    private JButton button;
    private JLabel resultLabel;
    private JPanel panel;
    public KalkulatorBMI(){
        super("Kalkulator BMI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        heightInput = new JTextField(10);
        heightInput.setToolTipText("Wzrost");
        weightInput = new JTextField(10);
        weightInput.setToolTipText("Waga");
        button = new JButton("Oblicz");
        resultLabel = new JLabel("Wynik:");


        panel.add(heightInput);
        panel.add(weightInput);
        panel.add(button);

        KalkulatorAction kalkulatorAction = new KalkulatorAction( heightInput,weightInput,resultLabel);
        button.addActionListener(kalkulatorAction);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);


        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    KalkulatorBMI test = new KalkulatorBMI();
                    test.setVisible(true);
                }catch (Exception e ){
                    e.printStackTrace(System.err);
                }
            }
        });
    }
}