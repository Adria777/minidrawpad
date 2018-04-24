package Draw;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Shape {
    private int x;
    private int y;
    private int width;
    private int height;
    private int x11;
    private int x22;
    private int y11;
    private int y22;
    private boolean fillorNot;
    private Color color;
    private Color color2;
    private boolean isGradient;
    private int lineWidth;
    private boolean isDasehed;
    private int dash;

    enum ShapeType {
        Oval,Rectangle,Line
    }


    private ShapeType shapeType;

    public Shape(int x1,int y1,int x2,int y2,ShapeType shapeType,
                 boolean fillorNot,Color color ,Color color2,
                 boolean isGradient,int lineWidth,
                 boolean isDasehed,int dash)

    {
        this.x =x1<x2?x1:x2;
        this.y=y1<y2?y1:y2;
        width=Math.abs(x1-x2);
        height=Math.abs(y1-y2);
        this.shapeType=shapeType;
        x11=x1;
        y11=y1;
        x22=x2;
        y22=y2;
        this.fillorNot=fillorNot;
        this.color=color;
        this.color2=color2;
        this.isGradient=isGradient;
        this.lineWidth=lineWidth;
        this.isDasehed=isDasehed;
        this.dash=dash;


    }




    public void Draw(Graphics g) {
        Graphics2D g2d=(Graphics2D) g;
        float d=(float)dash;
        float[] dashPattern = {d};
        switch (shapeType)
        {
            case Oval:
                g.drawOval(x,y,width,height);
                g.setColor(color);
                if(!isDasehed)
                    ((Graphics2D) g).setStroke(new BasicStroke(lineWidth));
                else
                    ((Graphics2D) g).setStroke(new BasicStroke(lineWidth,BasicStroke.CAP_BUTT,
                            BasicStroke.JOIN_MITER,1.0f,dashPattern,0.0f
                    ));
                break;
            case Rectangle:
                g.drawRect(x,y,width,height);
                g.setColor(color);
                if(!isDasehed)
                    ((Graphics2D) g).setStroke(new BasicStroke(lineWidth));
                else
                    ((Graphics2D) g).setStroke(new BasicStroke(lineWidth,BasicStroke.CAP_BUTT,
                            BasicStroke.JOIN_MITER,1.0f,dashPattern,0.0f
                    ));
                break;
            case Line:
                g.drawLine(x11,y11,x22,y22);
                g.setColor(color);
                if(!isDasehed)
                    ((Graphics2D) g).setStroke(new BasicStroke(lineWidth));
                else
                    ((Graphics2D) g).setStroke(new BasicStroke(lineWidth,BasicStroke.CAP_BUTT,
                            BasicStroke.JOIN_MITER,1.0f,dashPattern,0.0f
                    ));
                break;
        }

        if(fillorNot&&!isGradient)
            switch (shapeType)
            {
                case Oval:
                    g.fillOval(x,y,width,height);
                    g.setColor(color);
                    break;
                case Rectangle:
                    g.fillRect(x,y,width,height);
                    g.setColor(color);
                    break;
                case Line:
                    g.setColor(color);
                    break;
            }
        if(fillorNot&&isGradient) {
            if(color==null)
                color=Color.white;
            if(color2==null)
                color2=Color.BLUE;

            switch (shapeType) {

                case Oval:
                    ((Graphics2D) g).setPaint(new GradientPaint((float)x11,(float)y11,color,(float)x22,(float)y22,color2,false));
                    ((Graphics2D) g).fill(new Ellipse2D.Double((double)x, (double)y, (double)width, (double)height));
                    break;
                case Rectangle:
                    ((Graphics2D) g).setPaint(new GradientPaint((float)x11,(float)y11,color,(float)x22,(float)y22,color2,false));
                    ((Graphics2D) g).fill(new Rectangle2D.Double((double)x, (double)y, (double)width, (double)height));
                    break;
                case Line:

                    ((Graphics2D) g).setPaint(new GradientPaint((float)x11,(float)y11,color,(float)x22,(float)y22,color2,false));

                    break;
            }

        }
    }
}
