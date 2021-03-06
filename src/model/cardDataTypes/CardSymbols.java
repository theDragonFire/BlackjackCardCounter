package model.cardDataTypes;

public enum CardSymbols {
	ACE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	JOKER(14);
	
	private final int value;
	private CardSymbols(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public static CardSymbols getCard(int cardValue){
		CardSymbols returnCard = null;
		for(CardSymbols card: values()){
			if(card.value == cardValue){
				returnCard = card;
			}
		}
		return returnCard;
	}
}
