import java.io.*;
import java.util.*;

public class PokerHands {

    public static void main(String[] args) {
        new PokerHands().processFile("pokerHands.txt");
    }

    public void processFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int round = 1;

            while ((line = reader.readLine()) != null) {
                String[] handStrings = line.split(" ");
                String[][] hands = new String[4][5];

                // Process each player's hand
                for (int i = 0; i < 4; i++) {
                    hands[i] = handStrings[i].split(",");
                }

                int winner = determineWinner(hands);
                System.out.println("Round " + round++ + " Winner: Player " + (winner + 1));
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public int determineWinner(String[][] hands) {
        int bestScore = -1;
        int bestIndex = -1;

        for (int i = 0; i < hands.length; i++) {
            int score = evaluateHand(hands[i]);
            if (score > bestScore) {
                bestScore = score;
                bestIndex = i;
            }
        }

        return bestIndex;
    }

    public int evaluateHand(String[] hand) {
        // 🔧 You need to implement this: logic to evaluate hand rank
        // Return a score where higher = better hand
        // For now, placeholder
        return new Random().nextInt(100); // Replace with real logic
    }
}
