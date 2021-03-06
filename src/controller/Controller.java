package controller;

import model.*;
import model.cardDataTypes.*;
import view.*;
import view.gui.*;

public class Controller {
	double startTime;
	BlackjackGame blackJackGame;
	CardFrame cardFrame;
	CardSymbols cards;
	
	public Controller(){
		cardFrame = new CardFrame(this);
		startTime = (double) System.nanoTime();
		blackJackGame = new BlackjackGame();
	}
	
	public void start(){
		this.addCard(1);
	}
	
	public void addAce(){
		blackJackGame.addSeenCard(CardSymbols.ACE);
	}
	
	public void addTwo(){
		blackJackGame.addSeenCard(CardSymbols.TWO);
	}
	
	public void addThree(){
		blackJackGame.addSeenCard(CardSymbols.THREE);
	}
	
	public void addFour(){
		blackJackGame.addSeenCard(CardSymbols.FOUR);
	}
	
	public void addFive(){
		blackJackGame.addSeenCard(CardSymbols.FIVE);
	}
	
	public void addSix(){
		blackJackGame.addSeenCard(CardSymbols.SIX);
	}
	
	public void addSeven(){
		blackJackGame.addSeenCard(CardSymbols.SEVEN);
	}
	
	public void addEight(){
		blackJackGame.addSeenCard(CardSymbols.EIGHT);
	}
	
	public void addNine(){
		blackJackGame.addSeenCard(CardSymbols.NINE);
	}
	
	public void addTen(){
		blackJackGame.addSeenCard(CardSymbols.TEN);
	}
	
	public void addJack(){
		blackJackGame.addSeenCard(CardSymbols.JACK);
	}
	
	public void addQueen(){
		blackJackGame.addSeenCard(CardSymbols.QUEEN);
	}
	
	public void addKing(){
		blackJackGame.addSeenCard(CardSymbols.KING);
	}
	
	public void addJoker(){
		blackJackGame.addSeenCard(CardSymbols.JOKER);
	}
	
	public void addCard(int cardValue){
		blackJackGame.addSeenCard(CardSymbols.getCard(cardValue));
	}
	
	public int getCards(int cardValue){
		return blackJackGame.getSeenCards(CardSymbols.getCard(cardValue));
	}
	
	public double getWinningPercent(){
		return blackJackGame.getWinningChancePercent();
	}
//	public Suit spades() {
//		
//		return Suit.SPADES;
//		
//	}
//	
//	public Suit clubs() {
//		
//		return Suit.CLUBS;
//		
//	}
//	
//	public Suit diamonds() {
//		
//		return Suit.DIAMONDS;
//		
//	}
//	
//	public Suit hearts() {
//		
//		return Suit.HEARTS;
//	}
//	
//	//Blackjack commands
//	public void bjRemoveAce() {
//		
//		blackJackGame.remove("A");
//		
//	}
//	
//	public void bjRemoveTwo() {
//		
//		blackJackGame.remove("2");
//		
//	}
//	
//	public void bjRemoveThree() {
//		
//		blackJackGame.remove("3");
//		
//	}
//	
//	public void bjRemoveFour() {
//		
//		blackJackGame.remove("4");
//		
//	}
//	
//	public void bjRemoveFive() {
//		
//		blackJackGame.remove("5");
//		
//	}
//	
//	public void bjRemoveSix() {
//		
//		blackJackGame.remove("6");
//		
//	}
//	
//	public void bjRemoveSeven() {
//		
//		blackJackGame.remove("7");
//		
//	}
//	
//	public void bjRemoveEight() {
//		
//		blackJackGame.remove("8");
//		
//	}
//	
//	public void bjRemoveNine() {
//		
//		blackJackGame.remove("9");
//		
//	}
//	
//	public void bjRemoveTen() {
//		
//		blackJackGame.remove("10");
//		
//	}
//	
//	public void bjRemoveJack() {
//		
//		blackJackGame.remove("J");
//		
//	}
//	
//	public void bjRemoveQueen() {
//		
//		blackJackGame.remove("Q");
//		
//	}
//	
//	public void bjRemoveKing() {
//		
//		blackJackGame.remove("K");
//		
//	}
//	
//	public double bjAceChance() {
//		
//		return blackJackGame.cardProbability("A");
//		
//	}
//	
//	public double bjTwoChance() {
//		
//		return blackJackGame.cardProbability("2");
//		
//	}
//	
//	public double bjThreeChance() {
//		
//		return blackJackGame.cardProbability("3");
//		
//	}
//	
//	public double bjFourChance() {
//		
//		return blackJackGame.cardProbability("4");
//		
//	}
//	
//	public double bjFiveChance() {
//		
//		return blackJackGame.cardProbability("5");
//		
//	}
//	
//	public double bjSixChance() {
//		
//		return blackJackGame.cardProbability("6");
//		
//	}
//	
//	public double bjSevenChance() {
//		
//		return blackJackGame.cardProbability("7");
//		
//	}
//	
//	public double bjEightChance() {
//		
//		return blackJackGame.cardProbability("8");
//		
//	}
//	
//	public double bjNineChance() {
//		
//		return blackJackGame.cardProbability("9");
//		
//	}
//	
//	public double bjTenChance() {
//		
//		return blackJackGame.cardProbability("10");
//		
//	}
//	
//	public double bjJackChance() {
//		
//		return blackJackGame.cardProbability("J");
//		
//	}
//	
//	public double bjQueenChance() {
//		
//		return blackJackGame.cardProbability("Q");
//		
//	}
//	
//	public double bjKingChance() {
//		
//		return blackJackGame.cardProbability("K");
//		
//	}
//	
//	public double lessThan21(int knownSum) {
//		
//		return blackJackGame.possibilityLessThan21(knownSum);
//		
//	}
//	
//	public double equalTo21(int knownSum) {
//		
//		return blackJackGame.possibilityEqualTo21(knownSum);
//		
//	}
//	
//	public double greaterThan21(int knownSum) {
//		
//		return blackJackGame.possibilityGreaterThan21(knownSum);
//		
//	}
//	
//	public void bjReset() {
//		
//		blackJackGame.reset();
//		
//	}
//	
//	public void testRun(){
//		
//	}
}
