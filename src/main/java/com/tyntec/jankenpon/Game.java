package com.tyntec.jankenpon;

public class Game {

	/*
	 * Coding Example
	 * 
	 * - The programming language is Java. - The code is to be tested. - Please
	 * submit code as well tests. - Please describe shortly the advantages and
	 * disadvantages of your design. - The IDE is free to choose The build tool
	 * should be Maven or Gradle, but can be different.
	 * 
	 * Please solve this task according to the standards you would apply in your
	 * normal working environment.
	 * 
	 * Task: Rock-Paper-Scissors
	 * 
	 * Build a game in which two players compete in a game of Rock-Paper-Scissors
	 * with different strategies. Who will win more rounds? The rules:
	 * 
	 * - Scissors beats Paper - Rock beat Scissors - Paper beats Rock - If both
	 * players choose the same, the round is counted as a tie.
	 * 
	 * Implement two players: - Player A always chooses Paper - Player B chooses
	 * randomly
	 * 
	 * The game consists of 100 rounds of above two players competing. The output of
	 * the program should be like the following: - "Player A wins 31 of 100 games" -
	 * "Player B wins 37 of 100 games" - "Tie: 32 of 100 games"
	 */

	static final int ROUNDS = 100;

	static GamePlayer playerA;
	static GamePlayer playerB;

	public static void playARound() {

		playerA.setSelection(
				GameElementBuilder.getInstance().paper().build()
				);

		playerB.setSelection(
				GameElementBuilder.getInstance().random().build()
				);

		switch (playerA.getSelection().match(playerB.getSelection())) {
		case WIN:
			playerA.win();
			playerB.lose();
			break;
		case LOSE:
			playerA.lose();
			playerB.win();
			break;
		case DRAW:
			playerA.draw();
			playerB.draw();
			break;
		}
	}

	public static void printStatistics() {

		System.out.printf("Player %s wins %d of %d games%n", "A",
				playerA.getWins(),
				playerA.getRounds()
				);

		System.out.printf(
				"Player %s wins %d of %d games%n", "B",
				playerB.getWins(),
				playerB.getRounds()
				);
		
		if (playerA.getDraws() == playerB.getDraws()) {
			System.out.printf("Tie: %d of %d games%n",
					playerA.getDraws(),
					playerA.getRounds()
					);
		} else {
			throw new RuntimeException("Draws must be same for both players");
		}
	}

	public static void main(String[] args) throws InterruptedException {

		playerA = new GamePlayer();
		playerB = new GamePlayer();

		System.out.printf("Playing...");

		for (int round = 1; round <= ROUNDS; round++) {
			playARound();
			Thread.sleep(10);
			System.out.printf(".");
		}

		System.out.printf("%n%n");
		printStatistics();

	}

}
