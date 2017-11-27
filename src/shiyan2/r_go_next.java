package shiyan2;

public class r_go_next {
	public void next_r()
	{
		String s=menu1.T.randgo(menu1.T,menu1.T.num,menu1.x);
		if(s==null)
		{
			menu1.ran_go.setText(menu1.ran_go.getText()+" No words");
			menu1.next.setVisible(false);
			return;
		}
		menu1.ran_go.setText(menu1.ran_go.getText()+" "+s);
		if(!menu1.T.s_to_int.containsKey(s))
		{
			menu1.next.setVisible(false);
			return;
		}
		menu1.x=menu1.T.s_to_int.get(s);
	}

}
