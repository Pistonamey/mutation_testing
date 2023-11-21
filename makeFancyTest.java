import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class makeFancyTest {

    @Test
    void testOriginalBehavior() {
        assertEquals("ab", makeFancy.makeFancyString("aaabbb"));
    }

    @Test
    void testMutant1() {
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            makeFancy.makeFancyString("aaabbb");
        });
        assertNotNull(exception);
    }

    @Test
    void testMutant2() {
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            makeFancy.makeFancyString("aaabbb");
        });
        assertNotNull(exception);
    }

    @Test
    void testMutant3() {
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            makeFancy.makeFancyString("aaabbb");
        });
        assertNotNull(exception);
    }

    @Test
    void testMutant4() {
        assertEquals("bbb", makeFancy.makeFancyString("aaabbb"));
    }

    @Test
    void testMutant5() {
        assertEquals("", makeFancy.makeFancyString("aaabbb"));
    }

    @Test
    void testMutant6() {
        assertEquals("ab", makeFancy.makeFancyString("aaabbb"));
    }

    @Test
    void testMutant7() {
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            makeFancy.makeFancyString("aaabbb");
        });
        assertNotNull(exception);
    }

    @Test
    void testMutant8() {
        assertEquals("ab", makeFancy.makeFancyString("aaabbb"));
    }

    @Test
    void testMutant9() {
        assertEquals("aabbb", makeFancy.makeFancyString("aaabbb"));
    }

    @Test
    void testMutant10() {
        assertEquals("ab",makeFancy.makeFancyString("aaabbb"));
    }

    @Test
    void testMutant11() {
        assertEquals("", makeFancy.makeFancyString("aaabbb"));
    }
}
