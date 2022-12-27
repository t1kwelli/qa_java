import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Feline feline;

    @Mock
    private Animal animal;

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(animal);
        List <String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List <String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void LionExceptionTest() throws Exception {
        String actualException = null;
        try {
            Lion lion = new Lion("Неизвестный пол", feline);
        } catch (Exception exception) {
            actualException = exception.getMessage();
        }
        String expectedException = "Используйте допустимые значения пола животного - самец или самка";
        Assert.assertEquals(expectedException, actualException);
    }

}
