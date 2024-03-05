import ai.Participant;
import ai.MagicalArena;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwiggyTest {

    MagicalArena ma = new MagicalArena();

    @Test
    public void testApplication()
    {
        Participant firstPlayer = new Participant(50, 5, 10);
        Participant secondPlayer = new Participant(100, 10, 5);

        Assert.assertEquals(ma.calculate(firstPlayer, secondPlayer), "Player B wins!", "Player B won, but test was done");
    }
}
