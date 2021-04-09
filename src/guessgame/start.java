package guessgame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class start {

    JPanel jp;
    JFrame frame;

    public start() {

        frame = new JFrame("Guess the number and click!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());

        jp = new JPanel();
        jp.setBackground(Color.ORANGE);
        Dimension d = new Dimension(600, 400);
        jp.setPreferredSize(d);
        frame.add(jp);

        JTextArea f = new JTextArea();
        f.setBackground(Color.ORANGE);
        f.setPreferredSize(new Dimension(80, 250));
        jp.add(f);

        JButton jb = new JButton("Play Now");
        jb.setBackground(Color.YELLOW);
        jp.add(jb);
        Dimension dm = new Dimension(90, 30);
        jb.setPreferredSize(dm);

        JTextArea t2 = new JTextArea();
        t2.setBackground(Color.ORANGE);
        t2.setPreferredSize(new Dimension(80, 250));
        jp.add(t2);

        JButton jb2 = new JButton("Not Now");
        jb2.setBackground(Color.YELLOW);
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
                if (name == "Play Now") {
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
