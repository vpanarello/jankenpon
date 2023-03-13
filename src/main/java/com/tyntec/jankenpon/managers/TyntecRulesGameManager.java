package com.tyntec.jankenpon.managers;

import com.tyntec.jankenpon.elements.GameElementBuilder;
import com.tyntec.jankenpon.players.GamePlayer;

public class TyntecRulesGameManager implements GameManager {

	/*
	 * 
	 * Rock-Paper-Scissors
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

	private final int ROUNDS = 100;

	private GamePlayer playerA;
	private GamePlayer playerB;

	public TyntecRulesGameManager(GamePlayer playerA, GamePlayer playerB) {
		this.playerA = playerA;
		this.playerB = playerB;
	}

	public void playARound() {

		playerA.setChoose(GameElementBuilder.getInstance().paper().build());
		playerB.setChoose(GameElementBuilder.getInstance().random().build());
		playerA.match(playerB);

	}

	@Override
	public GameSummary run() {

		for (int round = 1; round <= ROUNDS; round++) {
			playARound();
		}

		return new TyntecRulesGameSummary(playerA, playerB);
	}
}
