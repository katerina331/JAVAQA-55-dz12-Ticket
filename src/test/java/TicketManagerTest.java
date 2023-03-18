import org.junit.jupiter.api.*;

public class TicketManagerTest {
    TicketManager manager = new TicketManager();
    Ticket item1 = new Ticket(1, 1000, "MOV", "LON", 40);
    Ticket item2 = new Ticket(2, 2000, "LED", "URS", 75);
    Ticket item3 = new Ticket(3, 1500, "MOV", "LON", 60);
    Ticket item4 = new Ticket(4, 1800, "BJS", "TYO", 50);
    Ticket item5 = new Ticket(5, 1700, "LED", "URS", 45);
    Ticket item6 = new Ticket(6, 800, "NYC", "BJS", 30);

    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
    }

    @Test
    public void findMOVToLONTest() {

        Ticket[] expected = {item1, item3};
        Ticket[] actual = manager.findAll("MOV", "LON");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findMOVToLONEqTest() {
        Ticket item7 = new Ticket(7, 1500, "MOV", "LON", 40);
        manager.add(item7);

        Ticket[] expected = {item1, item3, item7};
        Ticket[] actual = manager.findAll("MOV", "LON");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLEDToURSSortTest() {

        Ticket[] expected = {item5, item2};
        Ticket[] actual = manager.findAll("LED", "URS");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findNYCToVOZTest() {

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("NYC", "VOZ");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findNYCTest() {

        Ticket[] expected = {item6};
        Ticket[] actual = manager.findAll("NYC", "");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findToTYOTest() {

        Ticket[] expected = {item4};
        Ticket[] actual = manager.findAll("", "TYO");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void delIdTest() {

        Ticket[] expected = {item6, item1, item3, item5, item2};
        manager.delId(4);
        Ticket[] actual = manager.findAll("", "");

        Assertions.assertArrayEquals(expected, actual);
    }
}