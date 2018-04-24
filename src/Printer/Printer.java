package Printer;

import javax.swing.*;
import java.awt.*;

public class Printer {
    public static void main(String[] args){
        JFrame jf = new JFrame("Printer");
        jf.setSize(800, 400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel label01=new JLabel("Printer:MyPrinter");
        JLabel label02=new JLabel("Print Quality");

        JCheckBox checkBox01 = new JCheckBox("Image");
        JCheckBox checkBox02 = new JCheckBox("Text");
        JCheckBox checkBox03 = new JCheckBox("Code");
        JCheckBox checkBox04 = new JCheckBox("Print to File");

        JRadioButton radioBtn01 = new JRadioButton("Selection");
        JRadioButton radioBtn02 = new JRadioButton("All");
        JRadioButton radioBtn03 = new JRadioButton("Applet");
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(radioBtn01);
        btnGroup.add(radioBtn02);
        btnGroup.add(radioBtn03);
        radioBtn02.setSelected(true);

        JTextField textField01 = new JTextField(6);
        JTextField textField02 = new JTextField(6);
        JTextField textField03 = new JTextField(6);

        String[] listData = new String[]{"High","Low"};
        JComboBox<String> comboBox = new JComboBox<String>(listData);

        JButton btn01 = new JButton("Ok");
        JButton btn02 = new JButton("Cancel");
        JButton btn03 = new JButton("Setup...");
        JButton btn04 = new JButton("Help");

        label01.setFont(new Font(null, Font.PLAIN, 25));
        label02.setFont(new Font(null, Font.PLAIN, 25));
        checkBox01.setFont(new Font(null, Font.PLAIN, 25));
        checkBox02.setFont(new Font(null, Font.PLAIN, 25));
        checkBox03.setFont(new Font(null, Font.PLAIN, 25));
        checkBox04.setFont(new Font(null, Font.PLAIN, 25));
        textField01.setFont(new Font(null, Font.PLAIN, 25));
        textField02.setFont(new Font(null, Font.PLAIN, 25));
        textField03.setFont(new Font(null, Font.PLAIN, 25));
        radioBtn01.setFont(new Font(null, Font.PLAIN, 25));
        radioBtn02.setFont(new Font(null, Font.PLAIN, 25));
        radioBtn03.setFont(new Font(null, Font.PLAIN, 25));
        comboBox.setFont(new Font(null, Font.PLAIN, 25));
        btn01.setFont(new Font(null, Font.PLAIN, 25));
        btn02.setFont(new Font(null, Font.PLAIN, 25));
        btn03.setFont(new Font(null, Font.PLAIN, 25));
        btn04.setFont(new Font(null, Font.PLAIN, 25));

        //水平
        GroupLayout.ParallelGroup hParalGroup01=
                layout.createParallelGroup().addComponent(checkBox01).addComponent(checkBox02).addComponent(checkBox03);
        GroupLayout.ParallelGroup hParalGroup02=
                layout.createParallelGroup().addComponent(radioBtn01).addComponent(radioBtn02).addComponent(radioBtn03);
        GroupLayout.SequentialGroup hSeqGroup01 =
                layout.createSequentialGroup().addComponent(textField01).addGroup(hParalGroup01).
                        addComponent(textField02).addGroup(hParalGroup02).addComponent(textField03);
        GroupLayout.SequentialGroup hSeqGroup02 =
                layout.createSequentialGroup().addComponent(label02).addComponent(comboBox).addComponent(checkBox04);
        GroupLayout.ParallelGroup hParalGroup03=
                layout.createParallelGroup().addComponent(label01).addGroup(hSeqGroup01).addGroup(hSeqGroup02);
        GroupLayout.ParallelGroup hParalGroup04=
                layout.createParallelGroup().addComponent(btn01).addComponent(btn02).addComponent(btn03).addComponent(btn04);
        GroupLayout.SequentialGroup hSeqGroup=
                layout.createSequentialGroup().addGroup(hParalGroup03).addGroup(hParalGroup04);
        layout.setHorizontalGroup(hSeqGroup);

        //竖直


        GroupLayout.SequentialGroup vSeqGroup01=
                layout.createSequentialGroup().addComponent(checkBox01).addComponent(checkBox02).addComponent(checkBox03);
        GroupLayout.SequentialGroup vSeqGroup02=
                layout.createSequentialGroup().addComponent(radioBtn01).addComponent(radioBtn02).addComponent(radioBtn03);


        GroupLayout.ParallelGroup vParalGroup01 =
                layout.createParallelGroup().addComponent(textField01).addGroup(vSeqGroup01).
                        addComponent(textField02).addGroup(vSeqGroup02).addComponent(textField03);

        GroupLayout.ParallelGroup vParalGroup02 =
                layout.createParallelGroup().addComponent(label02).addComponent(comboBox).addComponent(checkBox04);

        GroupLayout.SequentialGroup vSeqGroup04=
                layout.createSequentialGroup().addComponent(label01).addGroup(vParalGroup01).addGroup(vParalGroup02);

        GroupLayout.SequentialGroup vSeqGroup05=
                layout.createSequentialGroup().addComponent(btn01).addComponent(btn02).addComponent(btn03).addComponent(btn04);

        GroupLayout.ParallelGroup vParalGroup=
                layout.createParallelGroup().addGroup(vSeqGroup04).addGroup(vSeqGroup05);

        layout.setVerticalGroup(vParalGroup);


        jf.setContentPane(panel);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);


    }
}
