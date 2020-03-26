package dmacc.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Random;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;

	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
		
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getComputerPlayer() {
		return computerPlayer;
	}

	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	private void determineWinner() {
		// TODO Auto-generated method stub
		String winner = "Computer";
		String computerChoice = getComputerPlayer();
		String playerChoice = getPlayer1();
		
		
		if (playerChoice.equalsIgnoreCase(computerChoice)) {
			winner = "tie";
		} else if (playerChoice.equals("rock")) {
			if (computerChoice.equals("paper")) {
				winner = "User Wins";
			}
		} else if (playerChoice.equals("paper")) {
			if (computerChoice.equals("rock")) {
				winner = "User Wins";
			}
		} else if (playerChoice.equals("scissors")) {
			if (computerChoice.equals("paper")) {
				winner = "User Wins";
			}
		}

		this.setWinner(winner);
	}

	private void setComputerPlayerToRandom() {
		// TODO Auto-generated method stub
		String[] choices = { "rock", "paper", "scissors" };
		int theChoice = (int) (3.0 * Math.random());
		setComputerPlayer(choices[theChoice]);

	}
}