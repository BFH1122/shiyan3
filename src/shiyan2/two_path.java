package shiyan2;

import java.util.Stack;

public class two_path {
	public void search_path()
	{
		menu1.short3.setText(null);
		menu1.short1.setText(null);
		Stack stack=new Stack();
		String result="there is no such word!";
		if(menu1.T.s_to_int.containsKey(menu1.start2.getText().toLowerCase())&&menu1.T.s_to_int.containsKey(menu1.end.getText().toLowerCase()))
		{
			result=menu1.T.calcShortestPath(menu1.T,menu1.start2.getText().toLowerCase(),menu1.end.getText().toLowerCase());
			menu1.short3.setText(null);
			for(int i=0;menu1.T.arr[i][0]!=-1;i++)
			{
				for(int j=0;menu1.T.arr[i][j]!=-1;j++)
				{
					stack.push(menu1.T.int_to_s.get(""+menu1.T.arr[i][j]));
				}
				while(!stack.isEmpty())
				{
					menu1.short3.setText(menu1.short3.getText()+" "+stack.pop());
				}
				menu1.short3.setText(menu1.short3.getText()+"\n");
			}
		}
		menu1.short1.setText(result);
	}

}
