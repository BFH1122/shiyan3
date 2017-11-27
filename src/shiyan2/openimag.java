package shiyan2;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class openimag {
	public void loadimage()
	{
		JFrame frm=new JFrame();
		JPanel pnl=new JPanel(new BorderLayout());
    	frm.add(pnl);
    	frm.setSize(1000,1000);
    	JScrollPane sp = new JScrollPane(pnl);
    	frm.getContentPane().add(sp);
    	pnl.setBounds(0, 0, 500, 500);
    	frm.setVisible(true);
    	JLabel imag=new JLabel(new ImageIcon("E:\\javaapp.gif"));
    	imag.setBounds(0,0,pnl.getWidth(),pnl.getHeight());
    	pnl.add(imag);
	}
}
