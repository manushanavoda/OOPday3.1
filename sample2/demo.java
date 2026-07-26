
import javax.swing.*;
import java.awt.*;
class demo{
	public static void main(String args[]){
			JFrame f1 = new JFrame();
			f1.setSize(300,300);
			f1.setTitle("Buttons");	
			f1.setLocationRelativeTo(null);
			f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
	/*		JButton btNorth = new JButton("North");
			JButton btSouth = new JButton("South");
			JButton btEast = new JButton("East");
			JButton btWest = new JButton("West");
			JButton btCenter = new JButton("Center");
	*/
			JButton[] btArray = new JButton[5];
			String[] buttonText ={"North","South","East","West","Center"};
			
			
	/*
			
			btNorth.setFont (new Font("",1,30));
			btSouth.setFont (new Font("",1,30));
			btEast.setFont (new Font("",1,30));
			btWest.setFont (new Font("",1,30));
			btCenter.setFont (new Font("",1,30));
			
			f1.add("North",btNorth);
			f1.add("South",btSouth);
			f1.add("East",btEast);
			f1.add("West",btWest);
			f1.add("Center",btCenter);
	*/
	
			for (int i = 0; i<5; i++){
				btArray[i] = new JButton (buttonText[i]);
				btArray[i].setSize(300,400);
				btArray[i].setFont(new Font("",1,30));
				f1.add(buttonText[i],btArray[i]);
			} 
			
			f1.pack();
			f1.setVisible(true);
			
			
			
	}
}
