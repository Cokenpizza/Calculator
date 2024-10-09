import javax.swing.*;

public class Frame extends JFrame {

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1000, 1000);
        this.setResizable(false);
        this.setTitle("Keegan's Calculator");
        this.setLayout(null);

        this.add(new ResultsPanel());
        this.add(new NumbersPanel());

        this.setVisible(true);
    }

}
