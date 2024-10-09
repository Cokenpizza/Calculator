import javax.swing.*;
import java.awt.*;

public class NumbersPanel extends JPanel {

    NumbersPanel() {
        this.setLayout(new GridLayout(5,4,5,5));
        this.setBounds(5, 255, 975, 700);


        this.add(Buttons.getLeftParenthesesButton());
        this.add(Buttons.getRightParenthesesButton());
        this.add(Buttons.getPercentButton());
        this.add(Buttons.getClearAllButton());
        this.add(Buttons.getSevenButton());
        this.add(Buttons.getEightButton());
        this.add(Buttons.getNineButton());
        this.add(Buttons.getDivideButton());
        this.add(Buttons.getFourButton());
        this.add(Buttons.getFiveButton());
        this.add(Buttons.getSixButton());
        this.add(Buttons.getMultiplyButton());
        this.add(Buttons.getOneButton());
        this.add(Buttons.getTwoButton());
        this.add(Buttons.getThreeButton());
        this.add(Buttons.getSubtractButton());
        this.add(Buttons.getZeroButton());
        this.add(Buttons.getDecimalButton());
        this.add(Buttons.getEqualsButton());
        this.add(Buttons.getAddButton());

    }

}
