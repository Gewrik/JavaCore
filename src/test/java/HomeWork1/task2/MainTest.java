package HomeWork1.task2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    int[] array = new int[] {2, 34, 74, 35, 4, 17, 88, 82, 8, 70, 89, 86, 41, 49, 21, 91, 89, 22, 59, 25};
    int[] arraySorted = new int[]{2, 4, 8, 17, 21, 22, 25, 34, 35, 41, 49, 59, 70, 74, 82, 86, 88, 89, 89, 91};


    @Test
    void arraySort() {
        assertArrayEquals(arraySorted, Main.arraySort(array));
    }
}