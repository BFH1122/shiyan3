package shiyan2;

public class bridge_result {
	public void bridge()
	{
		String result=menu1.T.queryBridgeWords(menu1.T,menu1.from.getText().toLowerCase(),menu1.to.getText().toLowerCase());
		menu1.bridge_word.setText(result);
	}
}
