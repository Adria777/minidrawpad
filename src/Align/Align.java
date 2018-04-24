package Align;

import javax.swing.*;
import java.awt.*;

public class Align {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Align");
        jf.setSize(600, 300);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);


        JCheckBox checkBox01 = new JCheckBox("Snap to Crid");
        JCheckBox checkBox02 = new JCheckBox("Show Crid");
        JLabel label01=new JLabel("X:");
        JLabel label02=new JLabel("Y:");
        JTextField textField01 = new JTextField(6);
        JTextField textField02 = new JTextField(6);
        JButton btn01 = new JButton("Ok");
        JButton btn02 = new JButton("Cancel");
        JButton btn03 = new JButton("Help");


        checkBox01.setFont(new Font(null, Font.PLAIN, 25));
        checkBox02.setFont(new Font(null, Font.PLAIN, 25));
        label01.setFont(new Font(null, Font.PLAIN, 25));
        label02.setFont(new Font(null, Font.PLAIN, 25));
        textField01.setFont(new Font(null, Font.PLAIN, 25));
        textField02.setFont(new Font(null, Font.PLAIN, 25));
        btn01.setFont(new Font(null, Font.PLAIN, 25));
        btn02.setFont(new Font(null, Font.PLAIN, 25));
        btn03.setFont(new Font(null, Font.PLAIN, 25));


        //水平
        GroupLayout.ParallelGroup hParalGroup01=
                layout.createParallelGroup().addComponent(checkBox01).addComponent(checkBox02);
        GroupLayout.ParallelGroup hParalGroup02=
                layout.createParallelGroup().addComponent(label01).addComponent(label02);
        GroupLayout.ParallelGroup hParalGroup03=
                layout.createParallelGroup().addComponent(textField01).addComponent(textField02);
        GroupLayout.ParallelGroup hParalGroup04=
                layout.createParallelGroup().addComponent(btn01).addComponent(btn02).addComponent(btn03);
        GroupLayout.SequentialGroup hSeqGroup=
                layout.createSequentialGroup().addGroup(hParalGroup01).addGroup(hParalGroup02).addGroup(hParalGroup03).addGroup(hParalGroup04);
        layout.setHorizontalGroup(hSeqGroup);


        //竖直
        GroupLayout.SequentialGroup vSeqGroup01=
                layout.createSequentialGroup().addComponent(checkBox01).addComponent(checkBox02);


        GroupLayout.ParallelGroup vParalGroup01=
                layout.createParallelGroup().addComponent(label01).addComponent(textField01);
        GroupLayout.ParallelGroup vParalGroup02=
                layout.createParallelGroup().addComponent(label02).addComponent(textField02);

        GroupLayout.SequentialGroup vSeqGroup02=
                layout.createSequentialGroup().addGroup(vParalGroup01).addGroup(vParalGroup02);


        GroupLayout.SequentialGroup vSeqGroup03=
                layout.createSequentialGroup().addComponent(btn01).addComponent(btn02).addComponent(btn03);
        GroupLayout.ParallelGroup vParalGroup=
                layout.createParallelGroup().addGroup(vSeqGroup01).addGroup(vSeqGroup02).addGroup(vSeqGroup03);
        layout.setVerticalGroup(vParalGroup);


        jf.setContentPane(panel);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);


    }
    }
