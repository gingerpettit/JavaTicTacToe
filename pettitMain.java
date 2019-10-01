import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
//This is the main class that allows the user to pick a game


public class pettitMain extends JFrame {

	//Define field/variables

		public final static int WINDOW_WIDTH = 600;
		public final static int WINDOW_HEIGHT = 300;
		
		//define the menu bar and menu
		private JMenuBar menuBar;
		private JPanel textPanel;
		
		private JMenu viewMenu; 
		
		//construction
	public pettitMain(){
		setTitle("Exam Review"); //Set title
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT); //Set size
		
		//close operation 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// prepare the foundation for the windows
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		//Create the menu
		createMenu();
		
		//add the menu bar
		menuBar = new JMenuBar();
		menuBar.add((viewMenu));
		
		//show the menu bar
		setJMenuBar(menuBar);
		
		
		}
	public void createMenu(){
		//instantiate menu
		viewMenu = new JMenu("Pick your game");
		
		//create menu items
		JMenuItem item;
		item = new JMenuItem("Two Player");
		item.addActionListener(new MenuListener());
		viewMenu.add(item);
		
		item = new JMenuItem("VS Computer");
		item.addActionListener(new MenuListener());
		viewMenu.add(item);

	}
	public class MenuListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String actionCommand = e.getActionCommand();
			if(actionCommand.equals("Two Player")){
				Pettit_tictactoe tp = new Pettit_tictactoe();
				tp.setVisible(true);	
			}else if(actionCommand.equals("VS Computer")){
				vsComp vc = new vsComp();
				vc.setVisible(true);
			}else{
				System.out.println("You have not implemented this feature");
			}
		}
	}
	
	
	public static void main(String[] args) {
		pettitMain tc = new pettitMain();
		tc.setVisible(true);

	}

}
