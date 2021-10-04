package view;

import javax.swing.*;

public class View2021  extends JFrame {
    private JPanel panel;
    private JButton button1;

    public View2021(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    public JButton getButton1() {
        return button1;
    }
}
