package com.tyntec.jankenpon.players;

import com.tyntec.jankenpon.elements.GameElement;
import com.tyntec.jankenpon.elements.MatchResult;

public class GamePlayer {

	private GameElement choose;

	private String name;

	private int loses;

	private int wins;

	private int draws;

	public GamePlayer(String name) {
		this.name = name;
		clearStats();
	}

	public MatchResult match(GamePlayer otherPlayer) {

		MatchResult result = this.getChoose().match(otherPlayer.getChoose());

		switch (result) {
		case WIN:
			this.win();
			otherPlayer.lose();
			break;
		case LOSE:
			this.lose();
			otherPlayer.win();
			break;
		case DRAW:
			this.draw();
			otherPlayer.draw();
			break;
		}

		return result;
	}

	public void clearStats() {
		loses = 0;
		wins = 0;
		draws = 0;
	}

	public String getName() {
		return name;
	}

	public void setChoose(GameElement selection) {
		this.choose = selection;
	}

	public GameElement getChoose() {
		return choose;
	}

	public int getRounds() {
		return wins + draws + loses;
	}

	public int getWins() {
		return wins;
	}

	public int getDraws() {
		return draws;
	}

	public int getLoses() {
		return loses;
	}

	public void win() {
		wins++;
	}

	public void lose() {
		loses++;
	}

	public void draw() {
		draws++;
	}
}
