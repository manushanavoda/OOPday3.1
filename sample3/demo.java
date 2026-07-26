import javax.swing.*;
import java.awt.*;
class demo{
	public static void main(String args[]){
			JFrame f1 = new JFrame();
			f1.setSize(300,300);
			f1.setTitle("Calculator");	
			f1.setLocationRelativeTo(null);
			f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		//	f1.setLayout(new FlowLayout (FlowLayout.RIGHT));
			f1.setLayout(new FlowLayout (FlowLayout.LEFT));
			
			
			
			JButton btAdd = new JButton("Add");
			JButton btDelete = new JButton("Delete");
			JButton btUpdate = new JButton("Update");
			JButton btView = new JButton("View");
			
			btAdd.setFont (new Font("",1,30));
			btDelete.setFont (new Font("",1,30));
			btUpdate.setFont (new Font("",1,30));
			btView.setFont (new Font("",1,30));
			
			f1.add(btAdd);
			f1.add(btDelete);
			f1.add(btUpdate);
			f1.add(btView);
			
			
			
			
		//	f1.pack();
			f1.setVisible(true);
			
			
			
	}
}
