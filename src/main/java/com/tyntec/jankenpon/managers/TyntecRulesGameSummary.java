package com.tyntec.jankenpon.managers;

import com.tyntec.jankenpon.players.GamePlayer;

public class TyntecRulesGameSummary implements GameSummary {

	private GamePlayer playerA;
	private GamePlayer playerB;

	public TyntecRulesGameSummary(GamePlayer playerA, GamePlayer playerB) {
		this.playerA = playerA;
		this.playerB = playerB;
	}

	private String printPlayerInfo(GamePlayer player) {
		return String.format("%s: wins %d of %d games%n", 
				player.getName(),
				player.getWins(),
				player.getRounds()
				);
	}

	@Override
	public String toString() {

		StringBuilder out = new StringBuilder();

		out.append(printPlayerInfo(playerA));
		out.append(printPlayerInfo(playerB));

		out.append(String.format("Tie: %d of %d games%n", 
				playerA.getDraws(),
				playerA.getRounds())
				);

		return out.toString();
	}

}
