package guessgame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GuessGame {

    public static void main(String[] args) {
        start s = new start();
    }
}

class Design extends Thread {

    static int n = 0;

    JPanel jp;
    JTextArea t;
    JTextArea t2;
    JTextArea f;
    JTextArea f2;
    JPanel jp2;
    JTextArea ta;
    JFrame frame;
    JLabel j;

    public void run() {
        job();
        set();
    }

    public void job() {

        frame = new JFrame("Guess the number and click!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());

        jp = new JPanel();
        jp.setBackground(Color.GREEN);
        Dimension d = new Dimension(600, 400);
        jp.setPreferredSize(d);
        frame.add(jp);

        f = new JTextArea();
        f.setBackground(Color.GREEN);
        f.setPreferredSize(new Dimension(190, 40));
        jp.add(f);
        Font myFont1 = new Font("English", Font.BOLD, 30);
        f.setForeground(Color.WHITE);
        f.setFont(myFont1);

        t2 = new JTextArea();
        t2.setBackground(Color.GREEN);
        t2.setPreferredSize(new Dimension(400, 40));
        jp.add(t2);
        Font myFont = new Font("English", Font.BOLD, 30);
        t2.setForeground(Color.CYAN);
        t2.setFont(myFont);

        t = new JTextArea();
        t.setBackground(Color.GREEN);
        Dimension d2 = new Dimension(580, 50);
        t.setPreferredSize(d2);
        jp.add(t);
        Font myFont2 = new Font("English", Font.BOLD, 30);
        t.setForeground(Color.MAGENTA);
        t.setFont(myFont2);

        ta = new JTextArea();
        ta.setBackground(Color.GREEN);
        Dimension d9 = new Dimension(230, 85);
        ta.setPreferredSize(d9);
        jp.add(ta);

        j = new JLabel();
        j.setBackground(Color.WHITE);
        j.setPreferredSize(new Dimension(320, 85));
        jp.add(j);

         JTextArea ta3 = new JTextArea();
        ta3.setBackground(Color.GREEN);
        Dimension d12 = new Dimension(195, 40);
        ta3.setPreferredSize(d12);
        jp.add(ta3);
        
        JButton jb = new JButton("1");
        jb.setBackground(Color.BLUE);
         Font myFont11 = new Font("English", Font.BOLD, 27);
        jb.setForeground(Color.white);
        jb.setFont(myFont11);
        jp.add(jb);
        Dimension dm = new Dimension(50, 40);
        jb.setPreferredSize(dm);

        JButton jb2 = new JButton("2");
        jb2.setBackground(Color.CYAN);
        Font myFont12 = new Font("English", Font.BOLD, 27);
        jb2.setForeground(Color.BLACK);
        jb2.setFont(myFont12);
        jp.add(jb2);
        Dimension dm2 = new Dimension(50, 40);
        jb2.setPreferredSize(dm2);

        JButton jb3 = new JButton("3");
        jb3.setBackground(Color.DARK_GRAY);
        Font myFont13 = new Font("English", Font.BOLD, 27);
        jb3.setForeground(Color.white);
        jb3.setFont(myFont12);
        jp.add(jb3);
        Dimension dm3 = new Dimension(50, 40);
        jb3.setPreferredSize(dm3);

         JTextArea ta4 = new JTextArea();
        ta4.setBackground(Color.GREEN);
        Dimension d11 = new Dimension(195, 35);
        ta4.setPreferredSize(d11);
        jp.add(ta4);
        
        JButton jb4 = new JButton("4");
        jb4.setBackground(Color.BLACK);
        Font myFont14 = new Font("English", Font.BOLD, 27);
        jb4.setForeground(Color.white);
        jb4.setFont(myFont14);
        jp.add(jb4);
        Dimension dm4 = new Dimension(50, 40);
        jb4.setPreferredSize(dm4);

        JButton jb5 = new JButton("5");
        jb5.setBackground(Color.YELLOW);
        Font myFont15 = new Font("English", Font.BOLD, 27);
        jb5.setForeground(Color.BLACK);
        jb5.setFont(myFont15);
        jp.add(jb5);
        Dimension dm5 = new Dimension(50, 40);
        jb5.setPreferredSize(dm5);

        JButton jb6 = new JButton("6");
        jb6.setBackground(Color.red);
        Font myFont16 = new Font("English", Font.BOLD, 27);
        jb6.setForeground(Color.white);
        jb6.setFont(myFont16);
        jp.add(jb6);
        Dimension dm6 = new Dimension(50, 40);
        jb6.setPreferredSize(dm6);

        f2 = new JTextArea();
        f2.setBackground(Color.GREEN);
        f2.setPreferredSize(new Dimension(490, 90));
        jp.add(f2);

        JButton jb7 = new JButton("close");
        jb7.setBackground(Color.LIGHT_GRAY);
        jp.add(jb7);
        Dimension dm7 = new Dimension(70, 30);
        jb7.setPreferredSize(dm7);
        frame.validate();

        MyButton mb = new MyButton();
        jb.addActionListener(mb);
        jb2.addActionListener(mb);
        jb3.addActionListener(mb);
        jb4.addActionListener(mb);
        jb5.addActionListener(mb);
        jb6.addActionListener(mb);
        jb7.addActionListener(mb);
    }

    public void set() {
        try {
            while (true) {
                if (n == 1) {
                    j.setIcon(new ImageIcon("D:\\North East University BangladeshCSE\\Java\\Java_theory+lab_class\\GuessGame\\dice1.jpg"));
                } else if (n == 2) {
                    j.setIcon(new ImageIcon("D:\\North East University BangladeshCSE\\Java\\Java_theory+lab_class\\GuessGame\\dice2.jpg"));
                } else if (n == 3) {
                    j.setIcon(new ImageIcon("D:\\North East University BangladeshCSE\\Java\\Java_theory+lab_class\\GuessGame\\dice3.jpg"));
                } else if (n == 4) {
                    j.setIcon(new ImageIcon("D:\\North East University BangladeshCSE\\Java\\Java_theory+lab_class\\GuessGame\\dice4.jpg"));
                } else if (n == 5) {
                    j.setIcon(new ImageIcon("D:\\North East University BangladeshCSE\\Java\\Java_theory+lab_class\\GuessGame\\dice5.jpg"));
                } else if (n == 6) {
                    j.setIcon(new ImageIcon("D:\\North East University BangladeshCSE\\Java\\Java_theory+lab_class\\GuessGame\\dice6.jpg"));
                }
                Thread.sleep(400);
            }
        } catch (Exception ex) {

        }

    }
    int point = 0;

    class MyButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                String name = ae.getActionCommand();
                if (name == "close") {
                    frame.setVisible(false);
                }
                if (name == "1" && n == 1) {
                    t.setText("YOU WIN!");
                    ++point;
                    t2.setText(String.valueOf(point));
                } else if (name == "2" && n == 2) {
                    t.setText("YOU WIN!");
                    ++point;
                    t2.setText(String.valueOf(point));

                } else if (name == "3" && n == 3) {
                    t.setText("YOU WIN!");
                    t2.setText(String.valueOf(point));
                    ++point;
                }
                else if (name == "4" && n == 4) {
                    t.setText("YOU WIN!");
                    t2.setText(String.valueOf(point));
                    ++point;
                }
                else if (name == "5" && n == 5) {
                    t.setText("YOU WIN!");
                    t2.setText(String.valueOf(point));
                    ++point;
                }
                else if (name == "6" && n == 6) {
                    t.setText("YOU WIN!");
                    t2.setText(String.valueOf(point));
                    ++point;
                }else {
                    t.setText("YOU LOSS!");
                    t2.setText(String.valueOf(point));
                }

                f.setText("Total Score:");

            } catch (Exception ex) {
                System.out.println("Error " + ex.getMessage());
            }

        }
    }
}

class Guess extends Thread {

    public void run() {
        job();
    }

    public void job() {
        try {

            while (true) {

                Random r = new Random();
                int n;
                n = (r.nextInt(6)) + 1;
                int i = 0;
                ++i;
                Design.n = n;
                Thread.sleep(400);
            }
        } catch (Exception ex) {

        }
    }
}
