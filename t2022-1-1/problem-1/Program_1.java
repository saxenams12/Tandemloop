import javax.swing.JFrame;
import javax.swing.JTextField; 
import javax.swing.JButton; 

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Program_1 implements ActionListener 
{
    JFrame frame;
	JTextField txt;
	JButton b[]=new JButton[20];
	int k=0,l1=0,l2=100;

    Program_1()
	{
		Font f=new Font("",Font.BOLD,30);
   	    frame=new JFrame();
	    frame.setResizable(false);
	    frame.setLayout(null);
	    frame.setVisible(true);
	    frame.setSize(400,630);
	    frame.setLocation(400,50);
	    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		txt=new JTextField(10);
		txt.setSize(400,100);
	    txt.setLocation(0,0);
		txt.setFont(f);
		frame.add(txt);
		txt.setHorizontalAlignment(JTextField.RIGHT);

		for(int i=1; i<=5 ;i++)
		{
			for(int j=1; j<=4 ;j++)
			{
				b[k]=new JButton();
				b[k].setSize(100,100);
	            b[k].setLocation(l1,l2);
		        b[k].setFont(f);
		        frame.add(b[k]);
				b[k].addActionListener(this);
				k++;
				l1=l1+100;
			}
			l1=0;
			l2=l2+100;
		}

		b[0].setLabel("AC");
		b[1].setLabel("B");
		b[2].setLabel("%");
		b[3].setLabel("/");
		b[4].setLabel("7");
		b[5].setLabel("8");
		b[6].setLabel("9");
		b[7].setLabel("*");
		b[8].setLabel("4");
		b[9].setLabel("5");
		b[10].setLabel("6");
		b[11].setLabel("-");
		b[12].setLabel("1");
		b[13].setLabel("2");
		b[14].setLabel("3");
		b[15].setLabel("+");
		b[16].setLabel("0");
		b[16].setSize(200,100);
		b[18].setLabel(".");
		b[19].setLabel("=");
		Color c19=new Color(255,88,9);
		b[19].setBackground(c19);
	
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==b[0])
		{
			txt.setText("");
		}
		else if (e.getSource()==b[1])
		{
			String s1=txt.getText();
			try
			{
				txt.setText(s1.substring(0,s1.length()-1));
			}
			catch (StringIndexOutOfBoundsException soi)
			{
				//when s1.length()==-1
				txt.setText("");
			}
		}
		else if (e.getSource()==b[19])
		{
			String s1=txt.getText();
			ScriptEngineManager sem=new ScriptEngineManager();
			ScriptEngine se=sem.getEngineByName("js");
			try
			{
				txt.setText(""+se.eval(s1));
			}
			catch(ScriptException see)
			{
				System.out.println(see);
			}
		}
		else
		{
		    JButton b2=(JButton) e.getSource();
            //txt.setText(b2.getLabel());
		    String st=txt.getText()+b2.getLabel();
		    txt.setText(st);
		}
	}
	
	public static void main(String [] a) 
	{	
		Program_1 obj=new Program_1();
	}
}
