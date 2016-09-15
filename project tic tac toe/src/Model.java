
public class Model {
	private String[][] boardLayout = {{"","",""},
									{"","",""},
									{"","",""}};
	private String player;
	
	Model(){
		player = "X";
	}
	
	public int addMark(String mark, int row, int col) {
		int errorState = 0;
		Boolean isEmpty = checkIfEmpty(row, col);
		if(isEmpty == true){
			boardLayout[row][col] = mark;
		}
		else{
			errorState = 1;
		}
		return errorState;
	}
	
	public Boolean checkIfEmpty(int row, int col){
		String valueHolder = boardLayout[row][col];
		Boolean isEmpty;
		if(valueHolder == ""){
			isEmpty = true;
		}
		else{
			isEmpty = false;
		}
		return isEmpty;
	}
	public String playerAssigner(){
		if(player == "X"){
			player = "O";
		}
		else if(player == "O"){
			player = "X";
		}
		return player;
	}
	public boolean CheckForWin(){
		boolean victoryProgress = false;
		int victories = 0;
		victories = victories + checkForVerticalWin();
		victories = victories + checkForhorizontalWin();
		victories = victories + checkForDiagnalWin();
		if(victories!=0){
			victoryProgress = true;
			System.out.println(victoryProgress);
		}
		System.out.println(victoryProgress);
		return victoryProgress;
	}
	public int checkForVerticalWin(){
		int playerMarksFound;
		int win = 0;
		for(int i = 0; i < 3; ++i){
			playerMarksFound = 0;
			for(int j = 0; j < 3; ++j){
				System.out.print(boardLayout[i][j]);
				if(player == boardLayout[i][j]){
					playerMarksFound = playerMarksFound + 1;
					System.out.println(playerMarksFound);
					if(playerMarksFound == 3){
						win = 1;
						i = 4;
						System.out.println("win");
					}
				}
			}
		}
		return win;
	}
	public int checkForhorizontalWin(){
		int playerMarksFound;
		int win = 0;
		for(int i = 0; i < 3; i++){
			playerMarksFound = 0;
			for(int j = 0; j < 3; j++){
				if(player == boardLayout[j][i]){
					playerMarksFound = playerMarksFound + 1;
					System.out.println(playerMarksFound);
				}
			}
			if(playerMarksFound == 3){
				win = 1;
				i = 4;
			}
		}
		return win;
	}
	public int checkForDiagnalWin(){
		int win = 0;
		if((boardLayout[0][0]==player)&&(boardLayout[1][1]==player)&&(boardLayout[2][2]==player)){
			win += 1;
		}
		if((boardLayout[0][2]==player)&&(boardLayout[1][1]==player)&&(boardLayout[2][0]==player)){
			win += 1;
		}
		return win;
	}
	
	public boolean checkForTie(){
		int markCount = 0;
		boolean tieExist = false;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if("" != boardLayout[j][i]){
					markCount += 1;
				}
				}
			}
		if(markCount == 9){
			tieExist = true;
		}
		return tieExist;
	}
}
