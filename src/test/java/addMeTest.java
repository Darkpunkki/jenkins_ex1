import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class addMeTest {
    App app = new App();

    @Test
    public void addMeTest() {
        float result = app.addMe(1, 2);
        assertEquals(3, result, 0);
    }
    @Test
    public void subMeTest() {
        float result = app.subMe(2, 1);
        assertEquals(1, result, 0);
    }
}
