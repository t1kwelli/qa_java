import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {

    private final int kittensCount;

    private final int expectedKittensCount;

    public FelineGetKittensTest (int kittensCount, int expectedKittensCount) {
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}, {1}")
    public static Object[][] getKittensData () {
        return new Object[][]{
                {1, 1},
                {22, 22},
                {333, 333},
                //{1.5, 1.5},
                {-1, -1},
                //{"test", "test"},
        };
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(kittensCount);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
