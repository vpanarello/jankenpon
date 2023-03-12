package com.tyntec.jankenpon.elements;

public class Paper implements GameElement {

	public MatchResult match(GameElement element) {
		if (element instanceof Paper) {
			return MatchResult.DRAW;
		} else if (element instanceof Rock) {
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
