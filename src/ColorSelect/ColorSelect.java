package ColorSelect;
import javax.swing.*;
import java.awt.*;

public class ColorSelect {
    public static void main(String[] args) {
        JFrame jf = new JFrame("ColorSelect");
        jf.setSize(800, 400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        String[] listData = new String[]{"RED","BLUE","YELLOW"};
        JComboBox<String> comboBox = new JComboBox<String>(listData);
        JCheckBox checkBox01 = new JCheckBox("Background");
        JCheckBox checkBox02 = new JCheckBox("Foreground");
        JButton btn01 = new JButton("Ok");
        JButton btn02 = new JButton("Cancel");
        JLabel label01=new JLabel(" ");
        JLabel label02=new JLabel("          ");
        JLabel label03=new JLabel("          ");
        JLabel label04=new JLabel("          ");
        JLabel label05=new JLabel("          ");
        JLabel label06=new JLabel("    ");

        comboBox.setFont(new Font(null, Font.PLAIN, 25));
        checkBox01.setFont(new Font(null, Font.PLAIN, 25));
        checkBox02.setFont(new Font(null, Font.PLAIN, 25));
        btn01.setFont(new Font(null, Font.PLAIN, 25));
        btn02.setFont(new Font(null, Font.PLAIN, 25));
        label01.setFont(new Font(null, Font.PLAIN, 15));
        label02.setFont(new Font(null, Font.PLAIN, 25));
        label03.setFont(new Font(null, Font.PLAIN, 25));
        label04.setFont(new Font(null, Font.PLAIN, 15));
        label05.setFont(new Font(null, Font.PLAIN, 15));
        label06.setFont(new Font(null, Font.PLAIN, 25));

        Box hBox01 = Box.createHorizontalBox();
        hBox01.add(comboBox);



        Box hBox02 = Box.createHorizontalBox();
        hBox02.add(label02);
        hBox02.add(checkBox01);
        hBox02.add(checkBox02);
        hBox02.add(label03);

        Box hBox03=Box.createHorizontalBox();
        hBox03.add(Box.createHorizontalGlue());
        hBox03.add(btn01);
        hBox03.add(label06);
        hBox03.add(btn02);
        hBox03.add(Box.createHorizontalGlue());

        Box hBox04 = Box.createHorizontalBox();
        hBox04.add(Box.createHorizontalGlue());
        hBox04.add(label01);
        hBox04.add(Box.createHorizontalGlue());

        Box hBox05 = Box.createHorizontalBox();
        hBox05.add(label04);


        Box hBox06 = Box.createHorizontalBox();
        hBox06.add(label05);


        Box vBox = Box.createVerticalBox();
        vBox.add(hBox01);
        vBox.add(hBox04);
        vBox.add(hBox02);
        vBox.add(hBox05);
        vBox.add(hBox03);
        vBox.add(hBox06);

        jf.setContentPane(vBox);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

}
