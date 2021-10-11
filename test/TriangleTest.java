import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;


public class TriangleTest {
    Triangle triangle;

    @BeforeEach //azért van hogy ne kelljen példányosítani minden tesztnél
    void initEach(){
        this.triangle = new Triangle();
    }

    @Test
    void calcAreaTest(){
        double base = 30;
        double height = 35;
        double expectedArea = 525.0;
        double actualArea = this.triangle.calcArea(base, height);

        assertEquals(expectedArea, actualArea);
    }

    @Test
    @DisplayName("Normál területszámítás: 2")
    void calcAreaTestAnother(){
        double base = 102;
        double height = 208;
        double expectedArea = 10608.0;
        double actualArea = this.triangle.calcArea(base, height);

        assertEquals(expectedArea, actualArea);
    }

    @Test 
    @DisplayName("Az alap 0 teszt")
    @Disabled("-1-re átírni az elvártat")
    void calcAreaTestForZero(){
        assertEquals(0, this.triangle.calcArea(0, 35));
    }
/*
    @Test
    void calcAreaLargeBase(){
        //TODO nagy értékre is megvalósítandó
        fail("nincs megvalósítva");
    }
*/
}
