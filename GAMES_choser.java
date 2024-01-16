package Project1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;



public class GAMES_choser implements ActionListener {
	static JButton B1= new JButton();
	static JButton B2= new JButton();
	static JButton B3= new JButton();
	static JButton B4= new JButton();
	
	
	GAMES_choser(){
		
		ImageIcon image=new ImageIcon(getClass().getClassLoader().getResource("project1\\images\\background.gif"));
		JLabel pic=new JLabel();
		pic.setText(null);
		pic.setIcon(image);
		pic.setSize(600, 800);
		pic.setBackground(Color.black);
		Border out=BorderFactory.createLineBorder(Color.blue,3);
		pic.setBorder(out);
		
		
		B1.setBounds(220,110, 150, 70);
		ImageIcon but=new ImageIcon(getClass().getClassLoader().getResource("project1\\images\\snake.png"));
		B1.setIcon(but);
		B1.setOpaque(false);
		B1.setContentAreaFilled(false);
		B1.setBorderPainted(false);
		B1.setBorder(BorderFactory.createDashedBorder(Color.blue));
		B1.addActionListener(this);

		
		B2.setBounds(220,250, 150, 75);
		ImageIcon but1=new ImageIcon(getClass().getClassLoader().getResource("project1\\images\\tictactoe.png"));
		B2.setIcon(but1);
		B2.setOpaque(false);
		B2.setContentAreaFilled(false);
		B2.setBorderPainted(false);
		B2.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		B2.addActionListener(this);
		
		
		B3.setBounds(220,390, 150, 100);
		ImageIcon but3=new ImageIcon(getClass().getClassLoader().getResource("project1\\images\\pingpong.png"));
		B3.setIcon(but3);
		B3.setOpaque(false);
		B3.setContentAreaFilled(false);
		B3.setBorderPainted(false);
		B3.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		B3.addActionListener(this);
		
		
		JFrame menu=new JFrame();
		menu.setTitle("MINI GAMES");
		
		menu.setSize(600, 750);
		menu.setVisible(true);
		menu.setResizable(false);
		ImageIcon logo=new ImageIcon("");
		menu.setIconImage(logo.getImage());
		menu.add(B1);
		menu.add(B2);
		menu.add(B3);
		
		menu.add(pic);
		menu.revalidate();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setLocationRelativeTo(null);

	
	}

    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==B3) {
		PPgui lol3=new PPgui();
		}
		else if (e.getSource()==B1) {
			SNAKE_GUI lol4=new SNAKE_GUI();
			}
		else if (e.getSource()==B2) {
			TicTacToe lol4=new TicTacToe();
			}

		
	
        }
}