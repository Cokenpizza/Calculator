import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JButton implements ActionListener {
    // declare buttons for class, set getters at end

    //operands
    private static Buttons leftParenthesesButton = new Buttons("(", "operand");
    private static Buttons rightParenthesesButton = new Buttons(")", "operand");
    private static Buttons percentButton = new Buttons("%", "operand");
    private static Buttons clearAllButton = new Buttons("CE", "operand");
    private static Buttons divideButton = new Buttons("÷", "operand");
    private static Buttons multiplyButton = new Buttons("x", "operand");
    private static Buttons subtractButton = new Buttons("-", "operand");
    private static Buttons addButton = new Buttons("+", "operand");
    private static Buttons equalsButton = new Buttons("=", "equal");
    //numbers
    private static Buttons zeroButton = new Buttons("0", "number");
    private static Buttons oneButton = new Buttons("1", "number");
    private static Buttons twoButton = new Buttons("2", "number");
    private static Buttons threeButton = new Buttons("3", "number");
    private static Buttons fourButton = new Buttons("4", "number");
    private static Buttons fiveButton = new Buttons("5", "number");
    private static Buttons sixButton = new Buttons("6", "number");
    private static Buttons sevenButton = new Buttons("7", "number");
    private static Buttons eightButton = new Buttons("8", "number");
    private static Buttons nineButton = new Buttons("9", "number");
    //
    private static Buttons decimalButton = new Buttons(".", "number");
    //



    /* type = number, operand, misc */

    public Buttons(String buttonText, String type) {
        this.setFocusable(false);
        this.setFocusPainted(false);
        this.setText(buttonText);
        this.setFont(new Font("Comic Sans", Font.PLAIN, 36));
        this.addActionListener(this);

        switch (type) {
            case "number":
                numbersButton();
                break;
            case "operand":
                operandsButton();
                break;
            case "equal":
                equalButton();
                break;
        }
        this.setVisible(true);


    }

    void numbersButton() {Color boxColor = Color.lightGray, textColor = Color.black; this.setForeground(textColor); this.setBackground(boxColor); this.setBorder(BorderFactory.createLineBorder(boxColor, 2)); }
    void operandsButton() {Color boxColor = Color.darkGray, textColor = Color.white; this.setForeground(textColor); this.setBackground(boxColor); this.setBorder(BorderFactory.createLineBorder(boxColor, 2)); }
    void equalButton() {Color boxColor = new Color(0x4169e1) , textColor = Color.white; this.setForeground(textColor); this.setBackground(boxColor); this.setBorder(BorderFactory.createLineBorder(boxColor, 2)); }

    public static Buttons getLeftParenthesesButton() { return leftParenthesesButton; }
    public static Buttons getRightParenthesesButton() { return rightParenthesesButton; }
    //TODO design the percent button if you want to.
    public static Buttons getPercentButton() { percentButton.setEnabled(false); return percentButton;}
    public static Buttons getClearAllButton() {return clearAllButton;}
    public static Buttons getDivideButton() {return divideButton;}
    public static Buttons getMultiplyButton() {return multiplyButton;}
    public static Buttons getSubtractButton() {return subtractButton;}
    public static Buttons getAddButton() {return addButton;}
    public static Buttons getEqualsButton() {return equalsButton;}
    public static Buttons getZeroButton() {return zeroButton;}
    public static Buttons getOneButton() {return oneButton;}
    public static Buttons getTwoButton() {return twoButton;}
    public static Buttons getThreeButton() {return threeButton;}
    public static Buttons getFourButton() {return fourButton;}
    public static Buttons getFiveButton() {return fiveButton;}
    public static Buttons getSixButton() {return sixButton;}
    public static Buttons getSevenButton() {return sevenButton;}
    public static Buttons getEightButton() {return eightButton;}
    public static Buttons getNineButton() {return nineButton;}
    public static Buttons getDecimalButton() {return decimalButton;}

    public static boolean decimalUsed = false;
    static void setDecimalUsed(boolean b) {
        decimalUsed = b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == decimalButton) {
            if (!decimalUsed) {
                Expressions.addToHolder('.');
                setDecimalUsed(true);
            }
        } else
        if (e.getSource() == leftParenthesesButton) {
            Expressions.addToHolder('(');
        } else if (e.getSource() == rightParenthesesButton) {
            Expressions.addToHolder(')');
        } else if (e.getSource() == clearAllButton) {
            Expressions.ClearAllLists();
            setDecimalUsed(false);
        } else if (e.getSource() == divideButton) {
            Expressions.hitOperand('/');
            setDecimalUsed(false);
        } else if (e.getSource() == multiplyButton) {
            Expressions.hitOperand('*');
            setDecimalUsed(false);
        } else if (e.getSource() == subtractButton) {
            Expressions.hitOperand('-');
            setDecimalUsed(false);
        } else if (e.getSource() == addButton) {
            Expressions.hitOperand('+');
            setDecimalUsed(false);
        } else if (e.getSource() == equalsButton) {
                Expressions.hitEquals();
            setDecimalUsed(false);
        } else if (e.getSource() == zeroButton) {
            Expressions.addToHolder('0');
        } else if (e.getSource() == oneButton) {
            Expressions.addToHolder('1');
        } else if (e.getSource() == twoButton) {
            Expressions.addToHolder('2');
        } else if (e.getSource() == threeButton) {
            Expressions.addToHolder('3');
        } else if (e.getSource() == fourButton) {
            Expressions.addToHolder('4');
        } else if (e.getSource() == fiveButton) {
            Expressions.addToHolder('5');
        } else if (e.getSource() == sixButton) {
            Expressions.addToHolder('6');
        } else if (e.getSource() == sevenButton) {
            Expressions.addToHolder('7');
        } else if (e.getSource() == eightButton) {
            Expressions.addToHolder('8');
        } else if (e.getSource() == nineButton) {
            Expressions.addToHolder('9');
        } else {
            throw new IllegalStateException("Unexpected value: " + e.getSource());
        }
    }



}

