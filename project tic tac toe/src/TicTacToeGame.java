import javax.swing.JFrame;
public class TicTacToeGame {

	public static void main(String[] args) {
		
		GuiBased windowScreen =new GuiBased();
		windowScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowScreen.setSize(500, 500);
		windowScreen.setVisible(true);

	}

}
