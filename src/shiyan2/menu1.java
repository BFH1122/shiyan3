package shiyan2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;

public class menu1 implements ActionListener {

	JButton jb1=new JButton("上传文件");
	JButton jb2=new JButton("显示图片");
	
	static JButton sure=new JButton("sure");
	static JButton exit=new JButton("exit");
	static JButton next=new JButton("next");
	
	static JButton sure1=new JButton("sure");
	static JButton sure2=new JButton("sure");
	static JButton sure3=new JButton("sure");
	static JButton sure4=new JButton("sure");
	
	JButton gn1=new JButton("桥接词功能");
	JButton gn2=new JButton("生成文本功能");
	JButton gn3=new JButton("两点最短距离");
	JButton gn4=new JButton("点到所有点距离");
	JButton gn5=new JButton("随机游走功能");

	static JTextField from=new JTextField();
	static JTextField to =new JTextField();
	static JTextArea bridge_word=new JTextArea();
	
	static JTextArea User_input=new JTextArea();
	static JTextArea word_output=new JTextArea();
	
	static JTextArea ran_go=new JTextArea();
	static JTextField start=new JTextField();
	
	static JTextField start1=new JTextField();//点到其他顶点
	static JTextArea short2=new JTextArea();
	
	static JFrame myframe=new JFrame();
	static JPanel mypanel=new JPanel();
	
	static JTextField start2=new JTextField();
	static JTextField end=new JTextField();
	static JTextArea short1=new JTextArea();
	static JTextArea short3=new JTextArea();
	
	static JPanel pn1=new JPanel();
	static Graph T=new Graph();
	
	static JScrollPane jsp3 = new JScrollPane(short2);
	
	int height=768-80;
	static int width=1366;
	static int x;
	public menu1()
	{
		
		myframe.setSize(1366,768);
		pn1.setVisible(false);
		myframe.setVisible(true);
		myframe.add(mypanel);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mypanel.setLayout(null);
		
		mypanel.add(jb1);
		jb1.addActionListener(this);
		jb1.setBounds(1366/2-100,height/8,200,50);
		
		jb2.addActionListener(this);
		mypanel.add(jb2);
		jb2.setBounds(1366/2-100,height*2/8,200,50);
		
		gn1.addActionListener(this);
		mypanel.add(gn1);
		gn1.setBounds(1366/2-100,height*3/8,200,50);
		
		gn2.addActionListener(this);
		mypanel.add(gn2);
		gn2.setBounds(1366/2-100,height*4/8,200,50);
		
		gn3.addActionListener(this);
		mypanel.add(gn3);
		gn3.setBounds(1366/2-100,height*5/8,200,50);
		
		gn4.addActionListener(this);
		mypanel.add(gn4);
		gn4.setBounds(1366/2-100,height*6/8,200,50);
		
		gn5.addActionListener(this);
		mypanel.add(gn5);
		gn5.setBounds(1366/2-100,height*7/8,200,50);
		
		next.addActionListener(this);
		exit.addActionListener(this);
		sure.addActionListener(this);
		sure1.addActionListener(this);
		sure2.addActionListener(this);
		sure3.addActionListener(this);
		sure4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1)//选择文件
		{
			new choose().start_demo();
		}
		else if(e.getSource()==jb2)//打开有向图
		{
			new openimag().loadimage();
		}
		else if(e.getSource()==exit)//关闭窗口
		{
			new close().close_window();
//			pn1.removeAll();
//			pn1.setVisible(false);
//			mypanel.setVisible(true);
		}
		else if(e.getSource()==gn1)//查询桥接词的界面
		{
			new Bride_word().search();
		}
		else if(e.getSource()==sure)//实现桥接词的功能
		{
			new bridge_result().bridge();
//			String result=main_1.queryBridgeWords(T,from.getText().toLowerCase(),to.getText().toLowerCase());
//			bridge_word.setText(result);
		}
		else if(e.getSource()==gn2)
		{
			new generate_text().new_text();
		}
		else if(e.getSource()==sure1)
		{
			new new_text().n_text();
//			String result=main_1.generateNewText(T,User_input.getText().toLowerCase());
//			word_output.setText(result);
		}
		else if(e.getSource()==gn5)
		{
			new rand_go().rand();
		}
		else if(e.getSource()==sure2)
		{
			new r_go().go();
//			for(int i=0;i<T.num;i++)
//				for(int j=0;j<T.num;j++)
//					T.visited[i][j]=0;
//			java.util.Random r=new java.util.Random();
//			x=(r.nextInt(T.num));
//			start.setText(T.int_to_s.get(""+x));
////			if(!T.s_to_int.containsKey(start.getText().toLowerCase()))
////			{
////				ran_go.setText("no such the word!");
////				return;
////			}
//			//x=T.s_to_int.get((start.getText().toLowerCase()));
//			ran_go.setText(null);
//			next.setVisible(true);
//			//String result=main_1.randomWalk(T,start.getText().toLowerCase());
//			//ran_go.setText(result);
		}
		else if(e.getSource()==next)
		{
			new r_go_next().next_r();
			
//			String s=main_1.randgo(T,T.num,x);
//			if(s==null)
//			{
//				ran_go.setText(ran_go.getText()+" No words");
//				next.setVisible(false);
//				return;
//			}
//			ran_go.setText(ran_go.getText()+" "+s);
//			if(!T.s_to_int.containsKey(s))
//			{
//				next.setVisible(false);
//				return;
//			}
//			x=T.s_to_int.get(s);
		}
		else if(e.getSource()==gn4)
		{
			new all_distance().dis();
		}
		else if(e.getSource()==sure3)
		{
			new all_distance_result().search_path();
//			short2.setText("");
//			if(!T.s_to_int.containsKey(start1.getText().toLowerCase()))
//			{
//				short2.setText("there is no such a word!");
//				return;
//			}
//			Stack []result=main_1.all_calcShortestPath(T,start1.getText().toLowerCase());
//			int i=0;
//			while(i<T.num)
//			{
//				if(!result[i].isEmpty())
//				{
//					short2.setText(short2.getText()+" "+start1.getText().toLowerCase()+" ");
//					while(!result[i].isEmpty())
//					{
//						short2.setText(short2.getText()+(result[i].pop()+" "));
//					}
//					short2.setText(short2.getText()+("\n"));
//				}
//				i++;
//			}
		}
		else if(e.getSource()==gn3)
		{
			new two_dis().dis();
		}
		else if(e.getSource()==sure4)
		{
			new two_path().search_path();
//			short3.setText(null);
//			short1.setText(null);
//			Stack stack=new Stack();
//			String result="there is no such word!";
//			if(T.s_to_int.containsKey(start2.getText().toLowerCase())&&T.s_to_int.containsKey(end.getText().toLowerCase()))
//			{
//				result=main_1.calcShortestPath(T,start2.getText().toLowerCase(),end.getText().toLowerCase());
//				short3.setText(null);
//				for(int i=0;main_1.arr[i][0]!=-1;i++)
//				{
//					for(int j=0;main_1.arr[i][j]!=-1;j++)
//					{
//						stack.push(T.int_to_s.get(""+main_1.arr[i][j]));
//					}
//					while(!stack.isEmpty())
//					{
//						short3.setText(short3.getText()+" "+stack.pop());
//					}
//					short3.setText(short3.getText()+"\n");
//				}
//			}
//			short1.setText(result);
		}
	}
}
