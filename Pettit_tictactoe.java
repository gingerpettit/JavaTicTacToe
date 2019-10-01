/*Ginger Pettit
Final Project: Tic tac toe
This program is a simulation of a tic tac toe game
where the player and another player can play a game of tic tac toe

*/
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.scene.paint.Color;

 
// An AWT GUI program inherits the top-level container java.awt.Frame
public class Pettit_tictactoe extends JFrame {
   

private Button[] btnNumbers;  // Array of 9 Buttons
private Button btnNewGame, btnExit,b1,b2,b3,b4,b5,b6,b7,b8,b9;

int turn=0;
 
   // Constructor to setup GUI components and event handlers
   public Pettit_tictactoe () {
		setTitle("Tic Tac Toe!!!! Play with a friend");
		setSize(500, 500);  
		
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		   
      // Set up display panel
      Panel panelBottom = new Panel(new FlowLayout());
      
 
      // Set up button panel
      Panel panelButtons = new Panel(new GridLayout(4, 3));
      
     //Add buttons
     b1 = new Button(" ");
     panelButtons.add(b1);
     b1.addActionListener(new ClickActionListener1());
     
     b2 = new Button(" ");
     panelButtons.add(b2);
     b2.addActionListener(new ClickActionListener2());
     
     b3 = new Button(" ");
     panelButtons.add(b3);
     b3.addActionListener(new ClickActionListener3());
    
     b4 = new Button(" ");
     panelButtons.add(b4);
     b4.addActionListener(new ClickActionListener4());
     
     
     b5 = new Button(" ");
     panelButtons.add(b5);
     b5.addActionListener(new ClickActionListener5());
     
     b6 = new Button(" ");
     panelButtons.add(b6);
     b6.addActionListener(new ClickActionListener6());
     
     b7 = new Button(" ");
     panelButtons.add(b7);
     b7.addActionListener(new ClickActionListener7());
     
     b8 = new Button(" ");
     panelButtons.add(b8);
     b8.addActionListener(new ClickActionListener8());
     
     b9 = new Button(" ");
     panelButtons.add(b9);
     b9.addActionListener(new ClickActionListener9());
        
      btnNewGame = new Button("New Game");
      panelBottom.add(btnNewGame);
      btnNewGame.addActionListener(new NewGameActionListener());
      
      btnExit = new Button("Exit");
      panelBottom.add(btnExit);
      btnExit.addActionListener(new ExitActionListner());
 
      setLayout(new BorderLayout());  
      add(panelBottom, BorderLayout.SOUTH);
      add(panelButtons, BorderLayout.CENTER);
 
      setVisible(true);       
   }
 //Action listeners for buttons
   public class ClickActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		if(turn%2==0){b1.setLabel("X");b1.setEnabled(false);turn++;} //If the turn is even set label to X
		else{b1.setLabel("O");b1.setEnabled(false);turn++;}
		checkXScore();}}//Calls for the score to be checked
   	
   
   public class ClickActionListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		if(turn%2==0){b2.setLabel("X");b2.setEnabled(false);turn++;
		}else{b2.setLabel("O");b2.setEnabled(false);turn++;}
		checkXScore();}}
  
   public class ClickActionListener3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		if(turn%2==0){b3.setLabel("X");b3.setEnabled(false);turn++;
		}else{b3.setLabel("O");b3.setEnabled(false);turn++;}
		checkXScore();}}
   
   public class ClickActionListener4 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		if(turn%2==0){b4.setLabel("X");b4.setEnabled(false);turn++;
		}else{b4.setLabel("O");b4.setEnabled(false);turn++;}
		checkXScore();}}
   
   public class ClickActionListener5 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		if(turn%2==0){b5.setLabel("X");b5.setEnabled(false);turn++;
		}else{b5.setLabel("O");b5.setEnabled(false);turn++;}
		checkXScore();}}
   
   public class ClickActionListener6 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		if(turn%2==0){b6.setLabel("X");b6.setEnabled(false);turn++;
		}else{b6.setLabel("O");b6.setEnabled(false);turn++;}
		checkXScore();}}
   
   public class ClickActionListener7 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		if(turn%2==0){b7.setLabel("X");b7.setEnabled(false);turn++;
		}else{b7.setLabel("O");b7.setEnabled(false);turn++;}
		checkXScore();}}
   
   public class ClickActionListener8 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		if(turn%2==0){b8.setLabel("X");b8.setEnabled(false);turn++;
		}else{b8.setLabel("O");b8.setEnabled(false);turn++;}
		checkXScore();}}

   public class ClickActionListener9 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		if(turn%2==0){b9.setLabel("X");b9.setEnabled(false);turn++;
		}else{b9.setLabel("O");b9.setEnabled(false);turn++;}
		checkXScore();}}
   
   //New game resets all the button labels and resets the turn
   public class NewGameActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			b1.setLabel(" ");
			b1.setEnabled(true);
			b2.setLabel(" ");
			b2.setEnabled(true);
			b3.setLabel(" ");
			b3.setEnabled(true);
			b4.setLabel(" ");
			b4.setEnabled(true);
			b5.setLabel(" ");
			b5.setEnabled(true);
			b6.setLabel(" ");
			b6.setEnabled(true);
			b7.setLabel(" ");
			b7.setEnabled(true);
			b8.setLabel(" ");
			b8.setEnabled(true);
			b9.setLabel(" ");
			b9.setEnabled(true);
			turn=0;

		}

	}
   /* Button format
    * 1 2 3 
      4 5 6  
      7 8 9
    */
   private void checkXScore(){
	   //Check if there is a winner 
	   if(b1.getLabel()=="X" && b2.getLabel()=="X"&&b3.getLabel()=="X" || b1.getLabel()=="O" && b2.getLabel()=="O"&&b3.getLabel()=="O" ){
		   JOptionPane.showMessageDialog(null, "Game over! "+b1.getLabel()+" wins!");
	   }else if(b1.getLabel()=="X" && b4.getLabel()=="X"&&b7.getLabel()=="X" || b1.getLabel()=="O" && b4.getLabel()=="O"&&b7.getLabel()=="O" ){
		   JOptionPane.showMessageDialog(null, "Game over! "+b1.getLabel()+" wins!");
	   }else if(b1.getLabel()=="X" && b5.getLabel()=="X"&&b9.getLabel()=="X" || b1.getLabel()=="O" && b5.getLabel()=="O"&&b9.getLabel()=="O"){
		   JOptionPane.showMessageDialog(null, "Game over! "+b1.getLabel()+" wins!");
	   }else if(b3.getLabel()=="X" && b6.getLabel()=="X"&&b9.getLabel()=="X" ||b3.getLabel()=="O" && b6.getLabel()=="O"&&b9.getLabel()=="O" ){
		   JOptionPane.showMessageDialog(null, "Game over! "+b3.getLabel()+" wins!");
	   }else if(b4.getLabel()=="X" && b5.getLabel()=="X"&&b6.getLabel()=="X" ||b4.getLabel()=="O" && b5.getLabel()=="O"&&b6.getLabel()=="O" ){
		   JOptionPane.showMessageDialog(null, "Game over! "+b3.getLabel()+" wins!");
	   }else if(b7.getLabel()=="X" && b8.getLabel()=="X"&&b9.getLabel()=="X" || b7.getLabel()=="o" && b8.getLabel()=="O"&&b9.getLabel()=="O" ){
		   JOptionPane.showMessageDialog(null, "Game over! "+b7.getLabel()+" wins!");
	   }else if(b2.getLabel()=="X" && b5.getLabel()=="X"&&b8.getLabel()=="X" || b2.getLabel()=="O" && b5.getLabel()=="O"&&b8.getLabel()=="O" ){
		   JOptionPane.showMessageDialog(null, "Game over! "+b2.getLabel()+" wins!");
	   }else if(!b1.isEnabled()&&!b2.isEnabled() &&!b3.isEnabled() &&!b4.isEnabled() && !b5.isEnabled() 
			   && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
		   JOptionPane.showMessageDialog(null, "It was a tie!");}
	   
   }
   
  
   
   public class ExitActionListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
   

   public static void main(String[] args) {
      new Pettit_tictactoe();  // Play the game!
   }
}