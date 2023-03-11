package com.tyntec.jankenpon;

public class Paper implements GameElement {

	public Boolean win(GameElement element) {
		if (element instanceof Paper) {
			return null;
		} else if (element instanceof Rock) {
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
