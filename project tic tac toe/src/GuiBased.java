import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class GuiBased extends JFrame{
	private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	private JTextField notificationBox;
	Model boardSystem = new Model();
	GuiBased(){
		super("Tic Tac Toe!!!");
		setLayout(new GridLayout(3,3));
		button1 = new JButton(" ");
		add(button1);
		button2 = new JButton(" ");
		add(button2);
		button3 = new JButton(" ");
		add(button3);
		button4 = new JButton(" ");
		add(button4);
		button5 = new JButton(" ");
		add(button5);
		button6 = new JButton(" ");
		add(button6);
		button7 = new JButton(" ");
		add(button7);
		button8 = new JButton(" ");
		add(button8);
		button9 = new JButton(" ");
		add(button9);
		
		EventHasOccurred handler = new EventHasOccurred();
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
		button5.addActionListener(handler);
		button6.addActionListener(handler);
		button7.addActionListener(handler);
		button8.addActionListener(handler);
		button9.addActionListener(handler);
		
	}
	
	public void turnButtonsOff(){
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		button6.setEnabled(false);
		button7.setEnabled(false);
		button9.setEnabled(false);
		button8.setEnabled(false);
	}
	
	
	private class EventHasOccurred implements ActionListener{
		boolean emptyState;
		String playerValue;
		boolean winState = false;
		public void actionPerformed(ActionEvent event){
			if(event.getSource()==button1){
				emptyState = boardSystem.checkIfEmpty(0, 0);
				if(emptyState == true){
					playerValue = boardSystem.playerAssigner();
					boardSystem.addMark(playerValue,0,0);
					button1.setText(playerValue);
					winState = boardSystem.CheckForWin();
					if(winState == true){
						JOptionPane.showMessageDialog(null, "Player " + playerValue + " has won!!", "Victory", JOptionPane.PLAIN_MESSAGE);
						turnButtonsOff();
					}
					else if(boardSystem.checkForTie() == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Unfortunately a tie has occurred", "Tie :(", JOptionPane.PLAIN_MESSAGE);
					}
					
				}
			}
			if(event.getSource()==button2){
				emptyState = boardSystem.checkIfEmpty(0, 1);
				if(emptyState == true){
					playerValue = boardSystem.playerAssigner();
					boardSystem.addMark(playerValue,0,1);
					button2.setText(playerValue);
					winState = boardSystem.CheckForWin();
					if(winState == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Player " + playerValue + " has won!!", "Victory", JOptionPane.PLAIN_MESSAGE);
					}
					else if(boardSystem.checkForTie() == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Unfortunately a tie has occurred", "Tie :(", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
			if(event.getSource()==button3){
				emptyState = boardSystem.checkIfEmpty(0, 2);
				if(emptyState == true){
					playerValue = boardSystem.playerAssigner();
					boardSystem.addMark(playerValue,0,2);
					button3.setText(playerValue);
					winState = boardSystem.CheckForWin();
					if(winState == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Player " + playerValue + " has won!!", "Victory", JOptionPane.PLAIN_MESSAGE);
					}
					else if(boardSystem.checkForTie() == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Unfortunately a tie has occurred", "Tie :(", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
			if(event.getSource()==button4){
				emptyState = boardSystem.checkIfEmpty(1, 0);
				if(emptyState == true){
					playerValue = boardSystem.playerAssigner();
					boardSystem.addMark(playerValue,1,0);
					button4.setText(playerValue);
					winState = boardSystem.CheckForWin();
					if(winState == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Player " + playerValue + " has won!!", "Victory", JOptionPane.PLAIN_MESSAGE);
					}
					else if(boardSystem.checkForTie() == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Unfortunately a tie has occurred", "Tie :(", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
			if(event.getSource()==button5){
				emptyState = boardSystem.checkIfEmpty(1, 1);
				if(emptyState == true){
					playerValue = boardSystem.playerAssigner();
					boardSystem.addMark(playerValue,1,1);
					button5.setText(playerValue);
					winState = boardSystem.CheckForWin();
					if(winState == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Player " + playerValue + " has won!!", "Victory", JOptionPane.PLAIN_MESSAGE);
					}
					else if(boardSystem.checkForTie() == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Unfortunately a tie has occurred", "Tie :(", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
			if(event.getSource()==button6){
				emptyState = boardSystem.checkIfEmpty(1, 2);
				if(emptyState == true){
					playerValue = boardSystem.playerAssigner();
					boardSystem.addMark(playerValue,1,2);
					button6.setText(playerValue);
					winState = boardSystem.CheckForWin();
					if(winState == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Player " + playerValue + " has won!!", "Victory", JOptionPane.PLAIN_MESSAGE);
					}
					else if(boardSystem.checkForTie() == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Unfortunately a tie has occurred", "Tie :(", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
			if(event.getSource()==button7){
				emptyState = boardSystem.checkIfEmpty(2, 0);
				if(emptyState == true){
					playerValue = boardSystem.playerAssigner();
					boardSystem.addMark(playerValue,2,0);
					button7.setText(playerValue);
					winState = boardSystem.CheckForWin();
					if(winState == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Player " + playerValue + " has won!!", "Victory", JOptionPane.PLAIN_MESSAGE);
					}
					else if(boardSystem.checkForTie() == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Unfortunately a tie has occurred", "Tie :(", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
			if(event.getSource()==button8){
				emptyState = boardSystem.checkIfEmpty(2, 1);
				if(emptyState == true){
					playerValue = boardSystem.playerAssigner();
					boardSystem.addMark(playerValue,2,1);
					button8.setText(playerValue);
					winState = boardSystem.CheckForWin();
					if(winState == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Player " + playerValue + " has won!!", "Victory", JOptionPane.PLAIN_MESSAGE);
					}
					else if(boardSystem.checkForTie() == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Unfortunately a tie has occurred", "Tie :(", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
			if(event.getSource()==button9){
				emptyState = boardSystem.checkIfEmpty(2, 2);
				if(emptyState == true){
					playerValue = boardSystem.playerAssigner();
					boardSystem.addMark(playerValue,2,2);
					button9.setText(playerValue);
					winState = boardSystem.CheckForWin();
					if(winState == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Player " + playerValue + " has won!!", "Victory", JOptionPane.PLAIN_MESSAGE);
					}
					else if(boardSystem.checkForTie() == true){
						turnButtonsOff();
						JOptionPane.showMessageDialog(null, "Unfortunately a tie has occurred", "Tie :(", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
		}
	}
}
