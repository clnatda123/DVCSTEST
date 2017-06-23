import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlyingTextEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HELLO");
	final int FLYING_UNIT = 10;
	
	FlyingTextEx() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		la.setLocation(50, 50);
		la.setSize(100, 20);
		contentPane.add(la);
		setSize(300, 300);
		setVisible(true);
		
		contentPane.requestFocus();
	}
	
		class MyKeyListener extends KeyAdapter {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
			
			switch(keyCode) {
				case KeyEvent.VK_UP :
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
					if(la.getY() < 0) {
						la.setLocation(la.getX(), 0);
					}
					break;
				case KeyEvent.VK_DOWN :
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
					if(la.getY() > contentPane.getHeight()) {
						la.setLocation(la.getX(), contentPane.getHeight()-6);
					}
					break;
				case KeyEvent.VK_LEFT :
					la.setLocation(la.getX()-FLYING_UNIT, la.getY());
					if(la.getX() < 0) {
						la.setLocation(0, la.getY());
					}
					break;
				case KeyEvent.VK_RIGHT :
					la.setLocation(la.getX()+FLYING_UNIT, la.getY());
					if(la.getX() > contentPane.getWidth()) {
						la.setLocation(contentPane.getWidth(), la.getY());
					}
					break;
			
			
			}
		}
	}	
		public static void main(String[] args) {
			new FlyingTextEx();
		}
}
