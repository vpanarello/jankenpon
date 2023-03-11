package com.tyntec.jankenpon;

public class Rock implements GameElement {

	public Boolean win(GameElement element) {
		if (element instanceof Rock) {
			return null;
		} else if (element instanceof Scissors) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
