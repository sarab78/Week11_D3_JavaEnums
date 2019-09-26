import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void queenHasAValue10() {
        assertEquals(10, card.getValueFromEnum());
    }

    //    @Test
//    public void suitCanBeMispelled() {
//        card = new Card("Heearts");
//        assertEquals("Heearts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBananas() {
//        card = new Card("Bananas");
//        assertEquals("Bananas", card.getSuit());
//    }
}
