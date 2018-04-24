package Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{

    public  Calculator()
    {
        Container container=getContentPane();

        GridLayout layout=new GridLayout(5,1);
        layout.setHgap(5);
        layout.setVgap(5);
        container.setLayout(layout);

        JPanel panel1=new JPanel(new GridLayout(1,1));
        JPanel panel2=new JPanel(new GridLayout(1, 4,5,5));
        JPanel panel3=new JPanel(new GridLayout(1, 4,5,5));
        JPanel panel4=new JPanel(new GridLayout(1, 4,5,5));
        JPanel panel5=new JPanel(new GridLayout(1, 4,5,5));

        JTextField textField01 = new JTextField(10);
        JButton btn11 = new JButton("7");
        JButton btn12 = new JButton("8");
        JButton btn13 = new JButton("9");
        JButton btn14 = new JButton("/");
        JButton btn21 = new JButton("4");
        JButton btn22 = new JButton("5");
        JButton btn23 = new JButton("6");
        JButton btn24 = new JButton("*");
        JButton btn31 = new JButton("1");
        JButton btn32 = new JButton("2");
        JButton btn33 = new JButton("3");
        JButton btn34 = new JButton("-");
        JButton btn41 = new JButton("0");
        JButton btn42 = new JButton(".");
        JButton btn43 = new JButton("=");
        JButton btn44 = new JButton("+");

        textField01.setFont(new Font(null, Font.PLAIN, 25));
        btn11.setFont(new Font(null, Font.PLAIN, 25));
        btn12.setFont(new Font(null, Font.PLAIN, 25));
        btn13.setFont(new Font(null, Font.PLAIN, 25));
        btn14.setFont(new Font(null, Font.PLAIN, 25));
        btn21.setFont(new Font(null, Font.PLAIN, 25));
        btn22.setFont(new Font(null, Font.PLAIN, 25));
        btn23.setFont(new Font(null, Font.PLAIN, 25));
        btn24.setFont(new Font(null, Font.PLAIN, 25));
        btn31.setFont(new Font(null, Font.PLAIN, 25));
        btn32.setFont(new Font(null, Font.PLAIN, 25));
        btn33.setFont(new Font(null, Font.PLAIN, 25));
        btn34.setFont(new Font(null, Font.PLAIN, 25));
        btn41.setFont(new Font(null, Font.PLAIN, 25));
        btn42.setFont(new Font(null, Font.PLAIN, 25));
        btn43.setFont(new Font(null, Font.PLAIN, 25));
        btn44.setFont(new Font(null, Font.PLAIN, 25));


        panel1.add(textField01);
        panel2.add(btn11);
        panel2.add(btn12);
        panel2.add(btn13);
        panel2.add(btn14);
        panel3.add(btn21);
        panel3.add(btn22);
        panel3.add(btn23);
        panel3.add(btn24);
        panel4.add(btn31);
        panel4.add(btn32);
        panel4.add(btn33);
        panel4.add(btn34);
        panel5.add(btn41);
        panel5.add(btn42);
        panel5.add(btn43);
        panel5.add(btn44);

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);
        container.add(panel5);


        setTitle("Calculator");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }



    public static void main(String[] args){

        Calculator c1=new Calculator();

    }
}
