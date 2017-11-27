package shiyan2;

import java.awt.Font;
import java.awt.Label;

import javax.swing.JScrollPane;

public class all_distance {
	public void dis()
	{
		Label l3=new Label("点到其他个点");
		l3.setFont(new Font("Dialog",1,25));
		l3.setBounds(menu1.width/2-100,50,300,60);
		menu1.jsp3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		menu1.jsp3.setBounds(13,10,350,340);
		
		menu1.start1.setBounds(menu1.width/2-100,130,200,30);
		menu1.short2.setBounds(menu1.width/2-250,180,500,400);
		menu1.jsp3.setBounds(menu1.width/2-250,180,500,400);
		menu1.sure3.setBounds(menu1.width/2-100,600,200,30);
		menu1.exit.setBounds(menu1.width/2-100,650,200,30);
		menu1.short2.setLineWrap(true);
		menu1.short2.setEditable(false);
		menu1.pn1.add(l3);
		menu1.pn1.add(menu1.start1);
		menu1.pn1.add(menu1.jsp3);
		//menu1.pn1.add(short2);
		menu1.pn1.add(menu1.sure3);
		menu1.pn1.setLayout(null);
		menu1.pn1.add(menu1.exit);
		
		menu1.start1.setText(null);
		menu1.short2.setText(null);
		menu1.mypanel.setVisible(false);
		menu1.pn1.setVisible(true);
		menu1.myframe.add(menu1.pn1);
	}

}
