package hospitalmanagement;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JButton;

public class BtnAnimation extends JButton {
   Color first,second;
    
    public BtnAnimation(){
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    private String Color1="#090979";

    public String getColor1() {
        return Color1;
    }
    public void setColor1(String Color1) {
        this.Color1 = Color1;
    }
    
    public String Color2="#00d4ff";

    public String getColor2() {
        return Color2;
    }
    public void setColor2(String Color2) {
        this.Color2 = Color2;
    }
    public int radius = 0;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public void paintComponent(Graphics g){
        first=Color.decode(Color1);
        second=Color.decode(Color2);
        Graphics2D gg=(Graphics2D)g;
        gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp=new GradientPaint(0,0,first,getWidth(),getWidth(),second);
        gg.setPaint(gp);
        gg.fillRoundRect(0, 0, getWidth(),getHeight(), radius, radius);
        super.paintComponent(g);   
    }
}
