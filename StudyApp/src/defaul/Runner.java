package defaul;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Runner extends JFrame implements MouseListener, ActionListener, KeyListener{
	
	JFrame frame;
	private CardLayout cardLayout;
	private JPanel cards; // The container for the screens
	private StartScreen startScreen;
	private OpenScreen openScreen;
	private int width 	= 1020;
	private int height 	= 900;
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Runner();
	}
	
	public Runner() {
		
		
		frame = new JFrame("Endless Game");
	       cardLayout = new CardLayout();
	       cards = new JPanel(cardLayout);
		
		openScreen = new OpenScreen();
		
		cards.add(openScreen, "Open Screen");
	       // Setup the JFrame
	       frame.setUndecorated(false);
	       frame.setSize(width, height);
	       frame.add(cards);
	       
	       frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
