import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;


@RunWith(Parameterized.class)
public class FelineGetFoodTest {

    private final String animalKind;
    private final List <String> expectedFood;

    public FelineGetFoodTest(String animalKind, List <String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1} {2}")
    public static Object[][] getFoodData () {
        return new Object[][] {
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")},
                //{"Фрукт", List.of("Животные", "Птицы", "Рыба")},
        };
    }


    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        List <String> actualFood = feline.getFood(animalKind);
        Assert.assertEquals(expectedFood, actualFood);
    }

}
