package shiyan2;

import java.awt.Font;
import java.awt.Label;

public class Bride_word {
	public void search()
	{
		Label l1=new Label("查询桥接词功能");
		l1.setFont(new Font("Dialog",1,25));
		l1.setBounds(menu1.width/2-100,50,300,60);
		menu1.pn1.add(l1);
		menu1.pn1.setLayout(null);
		menu1.pn1.add(menu1.from);
		menu1.pn1.add(menu1.to);
		menu1.pn1.add(menu1.bridge_word);
		menu1.bridge_word.setLineWrap(true);
		menu1.pn1.add(menu1.sure);
		menu1.pn1.add(menu1.exit);
		menu1.from.setBounds(menu1.width/2-100,130,200,30);
		menu1.to.setBounds(menu1.width/2-100,180,200,30);
		menu1.bridge_word.setBounds(menu1.width/2-100,230,200,60);
		menu1.sure.setBounds(menu1.width/2-100,310,200,30);
		menu1.exit.setBounds(menu1.width/2-100,360,200,30);
		menu1.from.setText(null);
		menu1.to.setText(null);
		menu1.bridge_word.setText(null);
		menu1.mypanel.setVisible(false);
		menu1.pn1.setVisible(true);
		menu1.myframe.add(menu1.pn1);
	}
}
