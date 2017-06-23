import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyCodeEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel();
	
	KeyCodeEx() {
		setTitle("Key Code ���� : F1Ű ó�ϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		setSize(300, 150);
		setVisible(true);
	
		contentPane.requestFocus(true);
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode())+"Ű�� �ԷµǾ���");
			
			if(e.getKeyChar() == '%') {
				contentPane.setBackground(Color.YELLOW);
			}else if(e.getKeyCode() == KeyEvent.VK_F1) {
				contentPane.setBackground(Color.GREEN);
			}else if(e.getKeyCode() == KeyEvent.VK_HOME) {
				contentPane.setBackground(Color.RED);
			}
		}
		
		
	}
	public static void main(String[] args) {
		new KeyCodeEx();
	}
}
