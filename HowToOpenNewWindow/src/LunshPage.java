import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LunshPage implements ActionListener {

	JFrame frame = new JFrame("icon.png");
	JButton myButton = new JButton("Add Student");
	
	
	LunshPage(){
		
		myButton.setBounds(0,0,120,90);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		
		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(250,400);
		frame.getContentPane().setBackground(new Color(127,50,255));
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==myButton) {
			
			frame.dispose();
			AddStudent add = new AddStudent();
		}
	}
}
