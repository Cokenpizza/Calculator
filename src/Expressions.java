import java.util.ArrayList;
import java.util.List;

public class Expressions {

    public static List<Character> holderList = new ArrayList<>();
    public static List<String> toCalculateList = new ArrayList<>();

    // when you hit a number
    public static void addToHolder(char digit) {
        if (digit == '.' && Buttons.decimalUsed) { return; }
        holderList.add(digit);
        if (digit == '.') {
            Buttons.setDecimalUsed(true);
        }
        if (!toCalculateList.isEmpty()) {
            ResultsPanel.setSelectedToCalculateLabelText(toCalculateList+" "+holderList);
        } else {
            ResultsPanel.setSelectedToCalculateLabelText(holderList.toString());
        }

    }

    public static void addToToCalculateList() {
        toCalculateList.add(mergeHolderToDouble(holderList));
    }

    public static String mergeHolderToDouble(List<Character> holderList) {
        StringBuilder sb = new StringBuilder();
        for (char c : holderList) {
            sb.append(c);
        }
        holderList.clear();
        return sb.toString();
    }
    public static String mergeListToExpression(List<String> toCalculateList) {
        StringBuilder sb = new StringBuilder();
        for (String s : toCalculateList) {
            sb.append(s);
        }
        return sb.toString();

    }

    public static void hitEquals() {
        if (!toCalculateList.isEmpty()) {
            try {
                addToToCalculateList();
                ResultsPanel.setSelectedToCalculateLabelText(toCalculateList + " " + holderList);
                String expression = mergeListToExpression(toCalculateList);
                ResultsPanel.setResultsCalculatedLabelText(StringEvaluator.eval(expression));
                toCalculateList.clear();
            } catch (RuntimeException e) {
                ResultsPanel.setSelectedToCalculateLabelText("SYNTAX ERROR");
                toCalculateList.clear();
                holderList.clear();
            }
        }
    }

    //when you hit an operand
    public static void hitOperand(Character operand) {
        if (!holderList.isEmpty()) {
            addToToCalculateList();
            toCalculateList.add(operand.toString());
            ResultsPanel.setSelectedToCalculateLabelText(toCalculateList.toString());
        }
        }
    // hit "CE"
    public static void ClearAllLists() {
        toCalculateList.clear();
        holderList.clear();
        ResultsPanel.setResultsCalculatedLabelText(0.0);
        ResultsPanel.setSelectedToCalculateLabelText("...");
    }
}
