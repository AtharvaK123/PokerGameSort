import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PokerHands
{
	public PokerHands()
	{
		try{
			BufferedReader reader = new BufferedReader(new FileReader("pokerHands.txt"));
			String temp;

			while((temp=reader.readLine())!=null){
				String[] rounds=temp.split("\n");

				for(int i = 0; i < rounds.length; i++)
				{
					String[] hands=rounds[i].split(" ");
					String hand = "High Card";
					String card = "Winner: " + rounds[0];

					for(int j = 0; j < hands.length; j++)
					{
						card = "Winner: " + findWinner(hands);
					}
				}
			}
		}catch(Exception e){

		}
	}

	public String findWinner(String[] arr)
	{
		TreeMap<Integer, String> hands = new TreeMap<Integer, String>();

		for(int i = 0; i < arr.length; i++)
		{
			String[] cards=arr[i].split(",");
			for(int j = 0; j < cards.length; j++)
			{
				hands.put(Integer.parseInt(cards[j].substring(0, cards[j].length()-1)), cards[j].substring(cards[j].length()-1, cards[j].length()));
			}
		}

		return "";
	}

	public static void main(String[]args)
	{
		PokerHands pH = new PokerHands();
	}
}
PokerHands.java
Displaying PokerHands.java.
Poker Hands
Stephen Dentler
•
May 22
10 points
Due May 22

Poker Hands.pdf
PDF

pokerHands.txt
Text
Class comments
Your work
Missing

PokerHands.java
Java
Private comments
