package guessgame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class gameOver {

    JPanel jp;
    JFrame frame;

    public void Over(int highScore){
        gameOver(highScore);
    }
    public void gameOver(int highScore) {

        frame = new JFrame("Guess the number and click!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());

        jp = new JPanel();
        jp.setBackground(Color.GRAY);
        Dimension d = new Dimension(600, 400);
        jp.setPreferredSize(d);
        frame.add(jp);

      
        
        JTextArea t = new JTextArea();
        Dimension d2 = new Dimension(200, 50);
        t.setPreferredSize(d2);
        jp.add(t);
        Font myFont2 = new Font("English", Font.BOLD, 30);
        t.setBackground(Color.GRAY);
        t.setForeground(Color.RED);
        t.setFont(myFont2);
        t.setText("Game Over ...");
        
        JTextArea t3 = new JTextArea();
        t3.setBackground(Color.GRAY);
        t3.setPreferredSize(new Dimension(600, 10));
        jp.add(t3);

        
        JTextArea t2 = new JTextArea();
        Dimension d3 = new Dimension(200, 70);
        t2.setPreferredSize(d3);
        jp.add(t2);
        Font myFont3 = new Font("English", Font.BOLD, 40);
        t2.setBackground(Color.GRAY);
        t2.setForeground(Color.WHITE);
        t2.setFont(myFont2);
        t2.setText("High Score : "+highScore);
        
        JTextArea t4 = new JTextArea();
        t4.setBackground(Color.GRAY);
        t4.setPreferredSize(new Dimension(600, 70));
        jp.add(t4);
        
        JTextArea t5 = new JTextArea();
        t5.setBackground(Color.GRAY);
        t5.setPreferredSize(new Dimension(230, 40));
        jp.add(t5);
        
        JButton jb = new JButton("Play Now");
        jb.setBackground(Color.BLACK);
        jb.setForeground(Color.WHITE);
        jp.add(jb);
        Dimension dm = new Dimension(90, 30);
        jb.setPreferredSize(dm);

        JTextArea t6 = new JTextArea();
        t6.setBackground(Color.GRAY);
        t6.setPreferredSize(new Dimension(230, 40));
        jp.add(t6);

        JButton jb2 = new JButton("Not Now");
        jb2.setBackground(Color.BLACK);
        jb2.setForeground(Color.WHITE);
        jp.add(jb2);
        Dimension dm2 = new Dimension(90, 30);
        jb2.setPreferredSize(dm2);

        MyButton mb = new MyButton();
        jb.addActionListener(mb);
        jb2.addActionListener(mb);
        frame.validate();
    }

    int point = 0;

    class MyButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String name = ae.getActionCommand();
                if (name == "Play Again") {
                    frame.setVisible(false);
                    Design d = new Design();
                    Guess g = new Guess();
                    d.start();
                    Thread th = new Thread(g);
                    th.start();
                } else if (name == "Not Now") {
                    frame.setVisible(false);
                }
            } catch (Exception ex) {
                System.out.println("Error " + ex.getMessage());
            }

        }
    }
}
