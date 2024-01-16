package Project1;
import java.awt.*;
import javax.swing.*;

public class PPgui extends JFrame{

	PP_Main_Panel panel;
	
	PPgui(){
		panel = new PP_Main_Panel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

	}
}
