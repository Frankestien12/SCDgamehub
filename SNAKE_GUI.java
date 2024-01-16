package Project1;

import javax.swing.JFrame;

public class SNAKE_GUI extends JFrame {
	SNAKE_GUI(){
        this.add(new Snake_logic());
        this.setTitle("Snake");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}