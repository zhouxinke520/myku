package liuxudong ;

import java.awt.*;

import javax.swing.*;

public class liuzhanpeng extends JFrame{

	JLabel jlbl1,jp2_1,jp2_2,jp2_3,jp2_4;
	JButton jb1,jb2,jb3,jp2_5;
	JPanel jp1,jp2,jp3,jp4;
	JTabbedPane jtp1;
	JTextField jp2_6;
	JPasswordField jp2_7;
	JCheckBox jp2_8,jp2_9;
	
	public liuzhanpeng(){
		
		jlbl1=new JLabel(new ImageIcon("images/tou.gif"));
		this.add(jlbl1,"North");
		
		jtp1=new JTabbedPane();
		jp2=new JPanel(new GridLayout(3,3));jp3=new JPanel();jp4=new JPanel();
		jtp1.add(jp2,"YY����");jtp1.add(jp3,"�ֻ�����");jtp1.add(jp4,"�������");
	/*jp2*/{jp2_1=new JLabel("YY����",JLabel.CENTER);
			jp2_2=new JLabel("YY����",JLabel.CENTER);
		    jp2_3=new JLabel("��������",JLabel.CENTER);jp2_3.setForeground(Color.BLUE);
		    jp2_4=new JLabel("�������뱣��",JLabel.CENTER);
		    jp2_5=new JButton(new ImageIcon("images/clear.gif"));
		    jp2_6=new JTextField();
		    jp2_7=new JPasswordField();
		    jp2_8=new JCheckBox("�����½");
		    jp2_9=new JCheckBox("��ס����");
		    jp2.add(jp2_1);jp2.add(jp2_6);jp2.add(jp2_5);
		    jp2.add(jp2_2);jp2.add(jp2_7);jp2.add(jp2_3);
		    jp2.add(jp2_8);jp2.add(jp2_9);jp2.add(jp2_4);
		    
		    
		}
		this.add(jtp1);
		
		jb1=new JButton(new ImageIcon("images/denglu.gif"));
		jb2=new JButton(new ImageIcon("images/zhuce.gif"));
		jb3=new JButton(new ImageIcon("images/quxiao.gif"));
		jp1=new JPanel();
		jp1.add(jb1);jp1.add(jb2);jp1.add(jb3);
		this.add(jp1,"South");
		
		this.setSize(360,240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     @SuppressWarnings("unused")
	liuzhanpeng clientLogin=new liuzhanpeng();
   //  clientLogin=null;,
	}

}






