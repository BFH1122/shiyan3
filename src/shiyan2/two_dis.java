package shiyan2;

import java.awt.Font;
import java.awt.Label;

public class two_dis {
	public void dis()
	{
		Label l3=new Label("µãµ½µã");
		l3.setFont(new Font("Dialog",1,25));
		l3.setBounds(menu1.width/2-100,50,300,60);
		menu1.start2.setBounds(menu1.width/2-100,130,200,30);
		menu1.end.setBounds(menu1.width/2-100,180,200,30);
		menu1.short1.setBounds(menu1.width/2-200,220,200,200);
		menu1.short1.setLineWrap(true);
		menu1.short1.setEditable(false);
		menu1.short3.setBounds(menu1.width/2+10,220,200,200);
		menu1.short3.setLineWrap(true);
		menu1.short3.setEditable(false);
		menu1.pn1.add(l3);
		menu1.pn1.add(menu1.start2);
		menu1.pn1.add(menu1.end);
		menu1.pn1.add(menu1.short1);
		menu1.pn1.add(menu1.sure4);
		menu1.pn1.setLayout(null);
		menu1.pn1.add(menu1.exit);
		menu1.pn1.add(menu1.short3);
		menu1.sure4.setBounds(menu1.width/2-100,440,200,30);
		menu1.exit.setBounds(menu1.width/2-100,500,200,30);
		menu1.start2.setText(null);
		menu1.short3.setText(null);
		menu1.end.setText(null);
		menu1.short1.setText(null);
		menu1.mypanel.setVisible(false);
		menu1.pn1.setVisible(true);
		menu1.myframe.add(menu1.pn1);
	}
}
