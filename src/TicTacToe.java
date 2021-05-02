import java.util.Scanner;

public class TicTacToe {
	
	static String[][] outline = {
			{" ","|"," ","|"," "},
			{"-","+","-","+","-"},
			{" ","|"," ","|"," "},
			{"-","+","-","+","-"},
			{" ","|"," ","|"," "},
			
			
	};
	Scanner inp = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter your number:");
		TicTacToe chk = new TicTacToe();
		
		int in=0;
		while(in<=5) {
			int x = chk.inp.nextInt();
			int y = chk.inp.nextInt();
			
			System.out.println("Your choice: (" +x+","+y+")");
			outline[x][y] = "o"; 
			
			new computerChoice();
			
			for(int i =0; i<=4;i++) {
				for(int j = 0;j<=4;j++) {
					System.out.print(outline[i][j]);
				}System.out.println();
			}
			checking chkCondition = new checking();
			chkCondition.condition();
			
			in++;
		}
		System.out.println("Tie!!");
		chk.inp.close();
	}
}

