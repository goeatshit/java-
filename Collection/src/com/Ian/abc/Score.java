package com.Ian.abc;

public class Score {
	int score;

	public Score(String score) throws ScoreFormatException {
		try {
			this.score = Integer.parseInt(score);

		} catch (NumberFormatException r) {
			throw new ScoreFormatException();
		}

	}
}