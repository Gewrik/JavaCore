package HomeWork1.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main ( ) ;
    int[][] array = new int[][] {{0,1},{2,3}};
    @Test
    void minOfArray() {

        assertEquals ( 0,main.minOfArray(array)) ;
    }

    @Test
    void maxOfArray() {
        assertEquals ( 3, Main.maxOfArray(array)) ;

    }

    @Test
    void avgOfArray() {
        assertEquals ( 3,main.avgOfArray(array)) ;

    }
}