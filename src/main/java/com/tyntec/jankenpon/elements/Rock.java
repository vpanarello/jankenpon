package com.tyntec.jankenpon.elements;

public class Rock implements GameElement {

	public MatchResult match(GameElement element) {
		if (element instanceof Rock) {
			return MatchResult.DRAW;
		} else if (element instanceof Scissors) {
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
