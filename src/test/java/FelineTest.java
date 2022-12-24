import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
        List <String> actualEatMeat = feline.eatMeat();
        Assert.assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void getFamilyTest() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensTest() {
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
