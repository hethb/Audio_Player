package defaul;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class OpenScreen extends StartScreen {
	
	
	public OpenScreen() {
		
	}
	
	@Override
	public void onShow() {
		// TODO Auto-generated method stub
		
	}
	
	 @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        
	        Graphics2D g2d = (Graphics2D) g;
	       

	        g.setColor(Color.white);
	        g.fillRect(620, 475, 380, 120); // box dimensions

	        g.setColor(Color.black);
	        Font theFont = new Font("Arial", Font.BOLD, 20);
	        g.setFont(theFont);

	        FontMetrics fm = g.getFontMetrics();
	        int lineHeight = fm.getHeight();
	        int maxWidth = 360; // Max width for text inside the box (380 - 20 padding)

	        int x = 630;
	        int y = 500;

	        
	    }

	@Override
	public void onHide() {
		// TODO Auto-generated method stub
		
	}

}
