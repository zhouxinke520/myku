package liuzhanpeng;

public class liuzhanpeng {


	//��һ�ſ�Ƭ
	JPanel  myFriendPanel,
	       liuzhanpengJPanel,
	        myStrangerBlackListPanel;
	JButton myFriendButton,
	        myStrangerButton,
	        myBlackListButton;
	JScrollPaneliuzhanpengJScrollPane;
	public static final int MYFRIENDCOUNT=51;
	JLabel[] myFriendJLabel=new JLabel[MYFRIENDCOUNT];
	
	//
	
	publicliuzhanpeng(){
		myFriendPanel=new JPanel(new BorderLayout());
		//����
		myFriendButton=new JButton("�ҵĺ���");
		myFriendPanel.add(myFriendButton,"North");
		
		//�в�
		myFriendListJPanel=new JPanel(new GridLayout(MYFRIENDCOUNT-1,1));
		for(int i=1;i<MYFRIENDCOUNT;i++){
			myFriendJLabel[i]=new JLabel(i+"",new ImageIcon("images/yy3.gif"),JLabel.LEFT);
			myFriendListJPanel.add(myFriendJLabel[i]);
		}
		myFriendListJScrollPane=new JScrollPane(myFriendListJPanel);
		myFriendPanel.add(myFriendListJScrollPane,"Center");
		
		//�ϲ�
		myStrangerBlackListPanel=new JPanel(new GridLayout(2,1));
		myStrangerButton=new JButton("İ����");
		myBlackListButton=new JButton("������");
		myStrangerBlackListPanel.add(myStrangerButton);
		myStrangerBlackListPanel.add(myBlackListButton);
		myFriendPanel.add(myStrangerBlackListPanel,"South");
		
		
		
		this.add(myFriendPanel);
		
		this.setSize(200, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFriendListliuzhanpeng=newliuzhanpeng();

	}

}
