package parsing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class ParserAbout extends JFrame{
	
	JTextArea win;
	eHandler handler = new eHandler();
	JButton next = new JButton("Далее");
	
	public ParserAbout (String s) {
		super(s);
		setLayout(new FlowLayout());		
		next.addActionListener(handler);
		win = new JTextArea("����������� �������������� ������������!\n "
				+ "\n"
				+ "������ �������� �������������� ������ � ������������ \n"
				+ "������ ����������� xml �����. ������� ������. \n"
				+ "�� �������������, ��� ���������. ������ \"\" \n"
				+ "��� �������� ����� ����������� ��� ����������� �� \n"
				+ "������������� ��� �� ��� ������ ��������� �������  \n"
				+ "�������� e-mail. \n"
				+ "\n"
				+ ""
				+ "\n");
		win.setEditable(false);
		add(win);
		add(next);
		
	}

	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==next){
				dispose();
				Parser.parsing();
			}
		}
	}
}