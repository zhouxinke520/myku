package liuzhanpeng;

public class liuzhanpeng {


	//第一张卡片
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
		//北部
		myFriendButton=new JButton("我的好友");
		myFriendPanel.add(myFriendButton,"North");
		
		//中部
		myFriendListJPanel=new JPanel(new GridLayout(MYFRIENDCOUNT-1,1));
		for(int i=1;i<MYFRIENDCOUNT;i++){
			myFriendJLabel[i]=new JLabel(i+"",new ImageIcon("images/yy3.gif"),JLabel.LEFT);
			myFriendListJPanel.add(myFriendJLabel[i]);
		}
		myFriendListJScrollPane=new JScrollPane(myFriendListJPanel);
		myFriendPanel.add(myFriendListJScrollPane,"Center");
		
		//南部
		myStrangerBlackListPanel=new JPanel(new GridLayout(2,1));
		myStrangerButton=new JButton("陌生人");
		myBlackListButton=new JButton("黑名单");
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
