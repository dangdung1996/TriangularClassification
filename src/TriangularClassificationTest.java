import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangularClassificationTest {

    @Test
    @DisplayName("Case equilateral triangle")
    void triangularClassification1() {
        int canhA = 2;
        int canhB = 2;
        int canhC = 2;
        String expected = "equilateral triangle";
        String result = TriangularClassification.TriangularClassification(canhA ,canhB, canhC);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case isosceles triangle")
    void triangularClassification2() {
        int canhA = 2;
        int canhB = 2;
        int canhC = 3;
        String expected = "isosceles triangle";
        String result = TriangularClassification.TriangularClassification(canhA ,canhB, canhC);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case triangles often")
    void triangularClassification3() {
        int canhA = 3;
        int canhB = 4;
        int canhC = 5;
        String expected = "triangles often";
        String result = TriangularClassification.TriangularClassification(canhA ,canhB, canhC);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case not a triangle")
    void triangularClassification4() {
        int canhA = 8;
        int canhB = 2;
        int canhC = 3;
        String expected = "not a triangle";
        String result = TriangularClassification.TriangularClassification(canhA ,canhB, canhC);
        assertEquals(expected, result);
    }
}