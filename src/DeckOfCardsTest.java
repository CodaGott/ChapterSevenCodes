public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for (int printCards = 1; printCards <= 52; printCards++){

            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (printCards % 4 == 0)
                System.out.println();
        }
    }
}