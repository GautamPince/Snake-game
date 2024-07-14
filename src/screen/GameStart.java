package screen;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameStart extends JFrame implements ActionListener {
    JButton newGame, exit;
    Random random;
    public GameStart() {
        random = new Random();
        setSize(600, 600);
        setTitle("Snake Game");
        setBackground((new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JLabel headingLabel = new JLabel("Snake Game");
        headingLabel.setBounds(20, 150, 560, 90);
        headingLabel.setFont(new Font("ink Free",Font.BOLD,100));
        // headingLabel.setBackground(Color.blue);
        headingLabel.setForeground((new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))));
        add(headingLabel);
        
        newGame = new JButton("New Game");
        newGame.setBounds(225, 280, 150, 40);
        newGame.setFocusable(false);
        newGame.setBackground(new Color(25, 210, 10));
        newGame.setForeground(Color.WHITE);
        newGame.setFont(new Font("ink Free",Font.BOLD,20));
        newGame.addActionListener(this);
        add(newGame);
        
        exit = new JButton("exit");
        exit.setBounds(225, 340, 150, 40);
        exit.setFocusable(false);
        exit.setBackground(new Color(250, 20, 10));
        exit.setFont(new Font("ink Free",Font.BOLD,20));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGame) {
            setVisible(false);
            new GameFrame();

        } else if (e.getSource() == exit) {
            setVisible(false);
            System.exit(0);
        }
    }

    // public static void main(String[] args) {
    //     new GameStart();
    // }
}
