import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionGetKittensTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    Feline feline = Mockito.mock(Feline.class);

    private final String sex;

    public LionGetKittensTest (String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[][] getHaveManeData () {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
        };
    }

    @Test
    public void getKittensTest () throws Exception {
        Lion lion = new Lion(sex, feline);
        int expectedKittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensCount = lion.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
