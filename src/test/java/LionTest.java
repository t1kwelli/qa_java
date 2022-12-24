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

    @Mock
    private Feline feline;

    @Mock
    private Animal animal;

    @Test
    public void getKittensTest() {
        Lion lion = new Lion(feline);
        int expectedKittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensCount = lion.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

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
        Lion lion = null;
        String actualException = null;

        try {
            lion = new Lion("Неизвестно");
        } catch (Exception exception) {
            actualException = exception.toString();
        }

        String expectedException = "java.lang.Exception: Используйте допустимые значения пола животного - самец или самка";
        Assert.assertEquals(expectedException, actualException);
    }
}
