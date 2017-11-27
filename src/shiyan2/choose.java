package shiyan2;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class choose 
{	
	public void start_demo(){
		JFileChooser jfc=new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
		jfc.showDialog(new JLabel(), "Ñ¡Ôñ");
		File file=jfc.getSelectedFile();
		if(file.isFile())
		{
			try {
				menu1.T = menu1.T.createDirectedGraph(file.getAbsolutePath());
				menu1.T.showDirectedGraph(menu1.T);
			} catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
