package com.tyntec.jankenpon;

public class GamePlayer {

	private GameElement selection;

	private int loses;

	private int wins;

	private int draws;

	public GamePlayer() {
		super();
		clearStats();
	}

	public void clearStats() {
		loses = 0;
		wins = 0;
		draws = 0;
	}

	public void setSelection(GameElement selection) {
		this.selection = selection;
	}

	public GameElement getSelection() {
		return selection;
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
