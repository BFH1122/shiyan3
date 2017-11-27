package shiyan2;

import java.awt.Font;
import java.awt.Label;

public class rand_go {
	public void rand()
	{
		Label l3=new Label("Ëæ»úÓÎ×ß");
		l3.setFont(new Font("Dialog",1,25));
		l3.setBounds(menu1.width/2-100,50,300,60);
		menu1.start.setBounds(menu1.width/2-100,130,200,30);
		menu1.ran_go.setBounds(menu1.width/2-150,210,300,100);
		menu1.ran_go.setLineWrap(true);
		menu1.ran_go.setEditable(false);
		menu1.pn1.add(l3);
		menu1.pn1.add(menu1.ran_go);
		menu1.pn1.add(menu1.start);
		menu1.pn1.add(menu1.next);
		menu1.pn1.add(menu1.sure2);
		menu1.pn1.setLayout(null);
		menu1.pn1.add(menu1.exit);
		menu1.sure2.setBounds(menu1.width/2-100,330,200,30);
		menu1.exit.setBounds(menu1.width/2-100,380,200,30);
		menu1.next.setBounds(menu1.width/2-100,420,200,30);
		menu1.next.setVisible(false);
		menu1.start.setText(null);
		menu1.ran_go.setText(null);
		menu1.mypanel.setVisible(false);
		menu1.pn1.setVisible(true);
//		JScrollPane sp = new JScrollPane(menu1.ran_go);
//    	myframe.getContentPane().add(sp);
//    	sp.setVisible(true);
		menu1.myframe.add(menu1.pn1);
	}

}
