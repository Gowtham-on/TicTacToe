
public class checking extends TicTacToe {
	
	public void condition() {

		for(int i =0; i<=4;i+=2) {
			if(TicTacToe.outline[i][0] == "o" && TicTacToe.outline[i][2] == "o"&& TicTacToe.outline[i][4] == "o") {
				System.out.println("You won!!");
				break;
			}
		}
		
		for(int j =0; j<=4;j+=2) {
			if(TicTacToe.outline[0][j] == "o" && TicTacToe.outline[2][j] == "o"&& TicTacToe.outline[4][j] == "o") {
				System.out.println("You won!!");
				break;
			}
		}
		
		if(TicTacToe.outline[0][0] == "o" && TicTacToe.outline[2][2] == "o"&& TicTacToe.outline[4][4] == "o") {
			System.out.println("You Won!!");
			
		}
		else if(TicTacToe.outline[0][4] == "o" && TicTacToe.outline[2][2] == "o"&& TicTacToe.outline[4][0] == "o") {
			System.out.println("You Won!!");
			
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		for(int i =0; i<=4;i+=2) {
			if(TicTacToe.outline[i][0] == "x" && TicTacToe.outline[i][2] == "x"&& TicTacToe.outline[i][4] == "x") {
				System.out.println("Computer won!!");
				break;
			}
		}
		
		for(int j =0; j<=4;j+=2) {
			if(TicTacToe.outline[0][j] == "x" && TicTacToe.outline[2][j] == "x"&& TicTacToe.outline[4][j] == "x") {
				System.out.println("Computer won!!");
				break;
			}
		}
	
		if(TicTacToe.outline[0][0] == "x" && TicTacToe.outline[2][2] == "x"&& TicTacToe.outline[4][4] == "x") {
			System.out.println("Computer Won!!");
			
		}
		else if(TicTacToe.outline[0][4] == "x" && TicTacToe.outline[2][2] == "x"&& TicTacToe.outline[4][0] == "x") {
			System.out.println("Computer Won!!");
	
		} 
		
	}
	
}
