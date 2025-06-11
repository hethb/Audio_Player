package defaul;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public abstract class StartScreen extends JPanel{
	
	
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
       
    }

    // Each subclass can add sprites to this list as needed
    public abstract void onShow();
    public abstract void onHide();
	
}
