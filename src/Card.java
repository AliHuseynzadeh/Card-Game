public class Card {
private char worth;
private boolean guess;
public Card(char c) {
	this.worth = c;
}
public char getWorth() {
	return worth;
}
public void setWorth(char worth) {
	this.worth = worth;
}
public boolean isGuess() {
	return guess;
}
public void setGuess(boolean guess) {
	this.guess = guess;
}

}
