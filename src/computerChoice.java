import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class computerChoice {
	public computerChoice() {
	
		int[] inX = {0,2,4};
		int[] inY = {0,2,4};
		LinkedList<Integer> lsx = new LinkedList<Integer>(Arrays.asList());
		LinkedList<Integer> lsy = new LinkedList<Integer>(Arrays.asList());
		
		for(int i : inX) {
			lsx.add(i);
		}
		for(int j : inY) {
			lsy.add(j);
		}
		
		for(int i =0; i<=10;) {

			Collections.shuffle(lsx);
			Collections.shuffle(lsy);
			
			int cposX = lsx.get(0);
			int cposy = lsy.get(0);
			
			if(TicTacToe.outline[cposX][cposy] == " ") {
				TicTacToe.outline[cposX][cposy] = "x";
				System.out.println("Computer's choice: ("+cposX+","+cposy+")");
				break;
			}else if(TicTacToe.outline[cposX][cposy] == "o" || TicTacToe.outline[lsx.get(0)][lsy.get(0)] == "x") {
				i++;
				continue;
			}
		}
	}
}
