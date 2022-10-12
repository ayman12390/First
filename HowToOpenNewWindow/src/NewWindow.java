import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewWindow extends JFrame implements ActionListener{

	JButton button;
	JTextField text;
	
	NewWindow(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(250,400);
		//this.getContentPane().setBackground(new Color(127,50,255));
		this.setLayout(new FlowLayout());
		
	    button = new JButton("Submit");
		button.addActionListener(this);
		
		text = new JTextField();
		text.setPreferredSize(new Dimension(250,40));
		
		this.add(button);
		this.add(text);
		this.pack();
		this.setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			System.out.println("Welcome " + text.getText());
		}
	}

	
	
}
