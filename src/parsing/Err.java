package parsing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Err extends JFrame {

	JLabel l;
	JButton b;
	eHandler handler = new eHandler();
	
	
	public Err (String s){
	super(s);
	setLayout(new FlowLayout());
	l = new JLabel("Âûבונטעו XML פאיכ!");
	b = new JButton("OK");
	b.addActionListener(handler);
	add(l);	
	add(b);
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b){
				dispose();
				Parser.parsing();
			}
		}
	}
}
