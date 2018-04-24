package Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;

public class MyPanel  extends JPanel implements MouseListener,MouseMotionListener {

    Shape.ShapeType shapeType;



    static LinkedList<Shape> shapes = new LinkedList<>();  /*保存画过的图形*/

    public void undo()
    {

        shapes.remove(shapes.size()-1);
        repaint();

    }

    int x0;
    int y0;
    int x1;
    int y1;
    int xx;
    int yy;
    boolean fillorNot;
    boolean isGradient;
    Color color;
    Color color2;
    int lineWidth;
    boolean isDasehed;
    int dash;


    public MyPanel() {
        shapeType = Shape.ShapeType.Oval;
        setSize(400, 400);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.Draw(g);

        }
        Shape shape = new Shape(x0, y0, x1, y1, shapeType,fillorNot,color,color2,isGradient,lineWidth,isDasehed,dash);
        shape.Draw(g);

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        xx = e.getX();
        yy = e.getY();


    }


    @Override
    /*过程中鼠标的位置*/
    public void mouseDragged(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        repaint();
    }

    public void setShape(Shape.ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    /*释放时鼠标的位置*/
    public void mouseReleased(MouseEvent e) {
        shapes.add(new Shape(x0, y0, e.getX(), e.getY(), shapeType,fillorNot,color,color2,isGradient,lineWidth,isDasehed,dash));
        repaint();
    }

    @Override
    /*鼠标按下的起始点*/
    public void mousePressed(MouseEvent e) {
        x1 = x0 = e.getX();
        y1 = y0 = e.getY();
    }


    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    /*右键清屏*/
    public void mouseClicked(MouseEvent e) {
        if(e.getButton()==MouseEvent.BUTTON3){
            shapes.clear();
        }
    }


}
