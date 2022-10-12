import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddStudent implements ActionListener{

	
	public JFrame frame = new JFrame();
	public JFrame frame1 = new JFrame();
    public JButton button = new JButton();
    public JLabel label = new JLabel();
    
	public String name;
	public int grade;
	public long numberPhone;
	
	public AddStudent() {
		
		label.setText("Grade 1");
		label.setBackground(Color.white);
		
		button.setBounds(0,40,250,40);
		button.setBackground(new Color(0xff6a1b9a));
	  	button.add(label);
		
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(250,400);
		frame.getContentPane().setBackground(new Color(0,50,60));
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void addStudent() {
		
	
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setResizable(false);
		frame1.setSize(250,400);
		frame1.getContentPane().setBackground(new Color(0,50,60));
		frame1.setLayout(null);
		frame1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button) {
			frame.dispose();
			addStudent();
		}
	}
}
