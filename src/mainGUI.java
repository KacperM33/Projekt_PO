import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainGUI extends JFrame {
    private JPanel mainPanel;
    private JButton loginButton;
    private JButton wypozyButton;
    private JButton kafejkaButton;

    public static void main(String[] args){
        new mainGUI().setVisible(true);
    }

    public mainGUI(){
        super("Kafejka internetowa");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 600);
        setLocationRelativeTo(null);
        kafejkaButton.setIcon(new ImageIcon(getClass().getResource("przycisk1.png")));
        wypozyButton.setIcon(new ImageIcon(getClass().getResource("przycisk2.png")));
        loginButton.setIcon(new ImageIcon(getClass().getResource("admin.png")));

        kafejkaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new kafejGUI().setVisible(true);
            }
        });

        wypozyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new wypozyGUI().setVisible(true);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new loginGUI().setVisible(true);
            }
        });
    }
}
