package Project1;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Start_page implements ActionListener {
	static JButton B1= new JButton();
	
	Start_page(){
		
		ImageIcon image=new ImageIcon(getClass().getClassLoader().getResource("project1\\images\\black.gif"));
		JLabel pic=new JLabel();
		pic.setText(null);
		pic.setIcon(image);
		pic.setSize(515, 500);
		pic.setBackground(Color.black);
		Border out=BorderFactory.createLineBorder(Color.red,3);
		pic.setBorder(out);
		
		
		B1.setBounds(201,204, 85, 31);
		ImageIcon but=new ImageIcon(getClass().getClassLoader().getResource("project1\\images\\start.png"));
		B1.setIcon(but);
		B1.setOpaque(false);
		B1.setContentAreaFilled(false);
		B1.setBorderPainted(false);
		B1.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		B1.addActionListener(this);
	
		JFrame menu=new JFrame();
		menu.setTitle("MINI GAMES");
		
		menu.setSize(500, 480);
		menu.setVisible(true);
		menu.setResizable(false);
		ImageIcon logo=new ImageIcon("");
		menu.setIconImage(logo.getImage());
		menu.add(B1);
		menu.add(pic);
		menu.revalidate();
		menu.setLocationRelativeTo(null);

	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==B1) {
			GAMES_choser lol=new GAMES_choser();
		}
		
	}


}
