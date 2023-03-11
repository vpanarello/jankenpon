package com.tyntec.jankenpon;

public class Scissors implements GameElement {

	public Boolean win(GameElement element) {
		if (element instanceof Scissors) {
			return null;
		} else if (element instanceof Paper) {
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
