package shiyan2;

import java.util.Stack;

public class all_distance_result {
	public void search_path()
	{
		menu1.short2.setText("");
		if(!menu1.T.s_to_int.containsKey(menu1.start1.getText().toLowerCase()))
		{
			menu1.short2.setText("there is no such a word!");
			return;
		}
		Stack []result=menu1.T.all_calcShortestPath(menu1.T,menu1.start1.getText().toLowerCase());
		int i=0;
		while(i<menu1.T.num)
		{
			if(!result[i].isEmpty())
			{
				menu1.short2.setText(menu1.short2.getText()+" "+menu1.start1.getText().toLowerCase()+" ");
				while(!result[i].isEmpty())
				{
					menu1.short2.setText(menu1.short2.getText()+(result[i].pop()+" "));
				}
				menu1.short2.setText(menu1.short2.getText()+("\n"));
			}
			i++;
		}
	}

}
