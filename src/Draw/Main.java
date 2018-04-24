package Draw;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import static java.awt.Color.white;

public class Main {
    public static void main(String[] args){
        JFrame jf=new JFrame();
        jf.setSize(1000, 800);
        jf.setLayout(new BorderLayout());
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel1=new JPanel();
        JPanel panel2=new Draw.MyPanel();
        JPanel panel3=new JPanel();
        panel2.setBackground(white);

        String[] listData = new String[]{"Oval","Line","Rectangle"};
        final JComboBox<String> comboBox = new JComboBox<String>(listData);
        JButton btn01 = new JButton(" Undo ");
        JButton btn02 = new JButton(" Clear ");
        JButton btn03 = new JButton(" 1st Color... ");
        JButton btn04 = new JButton(" 2nd Color... ");
        JLabel label01=new JLabel(" Shape ");
        JLabel label02=new JLabel(" Line Width ");
        JLabel label03=new JLabel(" Dash Length ");
        JLabel label04=new JLabel("                ");
        JLabel label05=new JLabel("                ");
        JLabel label06=new JLabel("                ");
        JLabel label07=new JLabel(" ");
        JCheckBox checkBox01 = new JCheckBox(" Filled ");
        JCheckBox checkBox02 = new JCheckBox(" Use Gradient ");
        JCheckBox checkBox03 = new JCheckBox(" Dashed ");
        JTextField textField01 = new JTextField(3);
        JTextField textField02 = new JTextField(3);



        //undo
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ((Draw.MyPanel) panel2).undo();
            panel2.repaint();

        }
    });

        //clear
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Draw.MyPanel.shapes.clear();
                panel2.repaint();
            }
        });


        //color1
        btn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Draw.MyPanel) panel2).color=JColorChooser.showDialog(null,"请选择你喜欢的颜色" ,((Draw.MyPanel) panel2).color);
                if (((Draw.MyPanel) panel2).color==null ) ((Draw.MyPanel) panel2).color=Color.lightGray;
            }
        });

        //color2
        btn04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Draw.MyPanel) panel2).color2=JColorChooser.showDialog(null,"请选择你喜欢的颜色" ,((Draw.MyPanel) panel2).color2);
                if (((Draw.MyPanel) panel2).color2==null ) ((Draw.MyPanel) panel2).color2=Color.lightGray;
            }
        });

        //Shape
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String str=listData[comboBox.getSelectedIndex()];
                    if(str.equals("Oval"))
                        ((Draw.MyPanel) panel2).setShape(Shape.ShapeType.Oval);
                    if(str.equals("Rectangle"))
                        ((Draw.MyPanel) panel2).setShape(Shape.ShapeType.Rectangle);
                    if(str.equals("Line"))
                        ((Draw.MyPanel) panel2).setShape(Shape.ShapeType.Line);

                }

            }
        });
        comboBox.setSelectedIndex(0);

        // fillorNot
        checkBox01.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            if(checkBox01.isSelected())
                ((Draw.MyPanel) panel2).fillorNot=true;
            else
                ((Draw.MyPanel) panel2).fillorNot=false;
            }
        });

        // isGradient
        checkBox02.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(checkBox02.isSelected())
                    ((Draw.MyPanel) panel2).isGradient=true;
                else
                    ((Draw.MyPanel) panel2).isGradient=false;
            }
        });

        // isDashed
        checkBox03.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(checkBox03.isSelected())
                    ((Draw.MyPanel) panel2).isDasehed=true;
                else
                    ((Draw.MyPanel) panel2).isDasehed=false;
            }
        });



        //lineWidth
        textField01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Draw.MyPanel) panel2).lineWidth=Integer.parseInt(textField01.getText());
                System.out.print("lineWidth "+((Draw.MyPanel) panel2).lineWidth+"\n");

            }
        });

        textField02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Draw.MyPanel) panel2).dash=Integer.parseInt(textField02.getText());
                System.out.print("dash "+((Draw.MyPanel) panel2).dash+"\n");

            }
        });

        label01.setFont(new Font(null, Font.PLAIN, 20));
        label02.setFont(new Font(null, Font.PLAIN, 20));
        label03.setFont(new Font(null, Font.PLAIN, 20));
        label04.setFont(new Font(null, Font.PLAIN, 20));
        label05.setFont(new Font(null, Font.PLAIN, 20));
        label06.setFont(new Font(null, Font.PLAIN, 20));
        label07.setFont(new Font(null, Font.PLAIN, 20));
        checkBox01.setFont(new Font(null, Font.PLAIN, 20));
        checkBox02.setFont(new Font(null, Font.PLAIN, 20));
        checkBox03.setFont(new Font(null, Font.PLAIN, 20));
        textField01.setFont(new Font(null, Font.PLAIN, 20));
        textField02.setFont(new Font(null, Font.PLAIN, 20));
        comboBox.setFont(new Font(null, Font.PLAIN, 20));
        btn01.setFont(new Font(null, Font.PLAIN, 20));
        btn02.setFont(new Font(null, Font.PLAIN, 20));
        btn03.setFont(new Font(null, Font.PLAIN, 20));
        btn04.setFont(new Font(null, Font.PLAIN, 20));

        Box hBox01 = Box.createHorizontalBox();
        hBox01.add(label04);
        hBox01.add(btn01);
        hBox01.add(btn02);
        hBox01.add(label01);
        hBox01.add(comboBox);
        hBox01.add(checkBox01);
        hBox01.add(label05);

        Box hBox02 = Box.createHorizontalBox();
        hBox02.add(checkBox02);
        hBox02.add(btn03);
        hBox02.add(btn04);
        hBox02.add(label02);
        hBox02.add(textField01);
        hBox02.add(label03);
        hBox02.add(textField02);
        hBox02.add(checkBox03);

        Box hBox03 = Box.createHorizontalBox();
        hBox03.add(label06);

        Box vBox = Box.createVerticalBox();
        vBox.add(hBox01);
        vBox.add(hBox03);
        vBox.add(hBox02);

        panel1.add(vBox);

        panel3.add(label07);






        jf.add(panel1,BorderLayout.NORTH);
        jf.add(panel2);
        jf.add(panel3,BorderLayout.SOUTH);

        jf.setVisible(true);



    }
}
