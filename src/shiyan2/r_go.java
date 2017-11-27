package shiyan2;

public class r_go {
	public void go()
	{
		for(int i=0;i<menu1.T.num;i++)
			for(int j=0;j<menu1.T.num;j++)
				menu1.T.visited[i][j]=0;
		java.util.Random r=new java.util.Random();
		menu1.x=(r.nextInt(menu1.T.num));
		menu1.start.setText(menu1.T.int_to_s.get(""+menu1.x));
//		if(!T.s_to_int.containsKey(start.getText().toLowerCase()))
//		{
//			ran_go.setText("no such the word!");
//			return;
//		}
		//x=T.s_to_int.get((start.getText().toLowerCase()));
		menu1.ran_go.setText(null);
		menu1.next.setVisible(true);
		//String result=main_1.randomWalk(T,start.getText().toLowerCase());
		//ran_go.setText(result);
	}

}
