package ru.mirea.gib04.lab5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestSwingListeners1 {

    private static int cnt1;
    private static int cnt2;

    public static void main(String[] args) {
        JFrame fr1 = new JFrame("Swing Window");
        Container cp;
        JButton bt1;
        JButton bt2;
        cnt1 = 0;
        cnt2 = 0;
        final String scr = null;
        final String wnr = null;
        JButton btOK, btCancel;
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setSize(300, 200);
        fr1.setResizable(false);
        cp = fr1.getContentPane();
        cp.setLayout(new GridLayout(5, 1));
        btOK = new JButton("AC Milan");
        btCancel = new JButton("Real Madrid");
        final JLabel lbl1 = new JLabel("Result: " + cnt1 + "X" + cnt2);
        final JLabel lbl2 = new JLabel("Last Scorer: " + scr);
        final JLabel lbl3 = new JLabel("Winner: " + wnr);
        cp.add(btOK);
        cp.add(btCancel);
        cp.add(lbl1);
        cp.add(lbl2);
        cp.add(lbl3);
        //lbl1.setText(displayText);

        btOK.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                cnt1++;
                lbl1.setText("Result: " + cnt1 + "X" + cnt2);
                lbl2.setText("Last Scorer: AC Milan");

                if(cnt1>cnt2){
                    lbl3.setText("Winner: AC Milan");
                }
                else if(cnt1<cnt2){
                    lbl3.setText("Winner: Real Madrid");
                }
                else if(cnt1 == cnt2){
                    lbl3.setText("Winner: Draw");
                }
            }
        });

        btCancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                cnt2++;
                lbl1.setText("Result: " + cnt1 + "X" + cnt2);
                lbl2.setText("Last Scorer: Real Madrid");
                if(cnt1>cnt2){
                    lbl3.setText("Winner: AC Milan");
                }
                else if(cnt1<cnt2){
                    lbl3.setText("Winner: Real Madrid");
                }
                else if(cnt1 == cnt2){
                    lbl3.setText("Winner: Draw");
                }

            }
        });
        fr1.show();
    }
}