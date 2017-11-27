package shiyan2;

import java.awt.Font;
import java.awt.Label;

public class generate_text {
	public void new_text()
	{
		Label l2=new Label("生成文本功能");
		l2.setFont(new Font("Dialog",1,25));
		l2.setBounds(menu1.width/2-100,50,300,60);
		menu1.User_input.setBounds(menu1.width/2-100,130,200,100);
		menu1.word_output.setBounds(menu1.width/2-100,250,200,100);
		menu1.User_input.setLineWrap(true);
		menu1.word_output.setLineWrap(true);
		menu1.word_output.setEditable(false);
		menu1.pn1.add(l2);
		menu1.pn1.add(menu1.User_input);
		menu1.pn1.add(menu1.word_output);
		menu1.pn1.add(menu1.sure1);
		menu1.pn1.setLayout(null);
		menu1.pn1.add(menu1.exit);
		menu1.sure1.setBounds(menu1.width/2-100,370,200,30);
		menu1.exit.setBounds(menu1.width/2-100,420,200,30);
		menu1.User_input.setText(null);
		menu1.word_output.setText(null);
		menu1.mypanel.setVisible(false);
		menu1.pn1.setVisible(true);
		menu1.myframe.add(menu1.pn1);
	}

}
