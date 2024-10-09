import javax.swing.*;
import java.awt.*;

public class ResultsPanel extends JPanel {

    static JLabel selectedToCalculateLabel = new JLabel();
    static JLabel resultsLabel = new JLabel("0.0");

    ResultsPanel() {
        this.setBounds(5, 0, 975, 250);
        this.setLayout(null);
        this.setBackground(Color.white);

        resultsLabel.setForeground(Color.white);
        resultsLabel.setForeground(Color.black);
        resultsLabel.setBounds(-20,-100,975,250);
        resultsLabel.setFont(new Font("Comic Sans", Font.PLAIN, 72));
        resultsLabel.setHorizontalAlignment(JLabel.RIGHT);
        resultsLabel.setVerticalAlignment(JLabel.BOTTOM);
        this.add(resultsLabel);

        selectedToCalculateLabel.setForeground(Color.black);
        selectedToCalculateLabel.setBounds(-10,0,975,250);
        selectedToCalculateLabel.setFont(new Font("Comic Sans", Font.PLAIN, 24));
        selectedToCalculateLabel.setHorizontalAlignment(JLabel.RIGHT);
        selectedToCalculateLabel.setVerticalAlignment(JLabel.BOTTOM);
        selectedToCalculateLabel.setText("...");
        this.add(selectedToCalculateLabel);
    }

    public static void setSelectedToCalculateLabelText(String s) {
        selectedToCalculateLabel.setText(s.replace(",","").replace("[","").replace("]",""));
    }
    public static void setResultsCalculatedLabelText(Double d) {
        resultsLabel.setText(d.toString().replace(",","").replace("[","").replace("]",""));
    }
}
