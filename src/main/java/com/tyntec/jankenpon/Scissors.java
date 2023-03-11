package com.tyntec.jankenpon;

public class Scissors implements GameElement {

	public MatchResult match(GameElement element) {
		if (element instanceof Scissors) {
			return MatchResult.DRAW;
		} else if (element instanceof Paper) {
			return MatchResult.WIN;
		} else {
			return MatchResult.LOSE;
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
