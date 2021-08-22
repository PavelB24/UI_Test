import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


class MainTest {
    private static Logger logger;

    MainTest() {
    }

    @AfterEach
    void toEnd() {
        System.out.println("Конец теста");
    }

    @BeforeEach
    void toStart() {
        System.out.println("Начало теста");
        logger = Logger.getLogger("Лог теста");
    }

    @DisplayName("Поиск максимального эл-та массива")
    @Test
    void toFindMax() throws IOException {
        Handler handler = new FileHandler("src/main/resources/log5.log");
        logger.addHandler(handler);
        logger.getHandlers()[0].setLevel(Level.ALL);
        int[] arr = {1, 5, 56, 44, 88, 95, 14};
        try {
            Assertions.assertEquals(96, Main.toFindMax2(arr));
        } catch (AssertionError error) {
            logger.info("Произошла ошибка");
            throw error;

        }

    }


    @DisplayName("Поиск минимального эл-та массива")
    @Test
    void toFindMin() throws IOException {
        Handler handler = new FileHandler("src/main/resources/log6.log");
        logger.addHandler(handler);
        logger.getHandlers()[0].setLevel(Level.ALL);
        int[] arr = {1, 5, 56, 44, 88, 95, 14};
        try {
            Assertions.assertEquals(96, Main.toFindMin2(arr));
        } catch (AssertionError error) {
            logger.info("Произошла ошибка");
            throw error;
        }
    }


    @DisplayName("Проверяет равны ли две части одного массива")
    @Test
    void isEqual() throws IOException {
        Handler handler = new FileHandler("src/main/resources/log7.log");
        logger.addHandler(handler);
        logger.getHandlers()[0].setLevel(Level.ALL);
        int[] arr = {1, 5, 56, 44, 88, 95, 14};
        try {
            Assertions.assertEquals(true, Main.isEqual(arr));
        } catch (AssertionError error) {
            logger.info("Произошла ошибка");
            throw error;
        }
    }


    @DisplayName("Сдвиг эл-тов массива на n вправо")
    @Test
    void toMoveRight() throws IOException {
        Handler handler = new FileHandler("src/main/resources/log8.log");
        logger.addHandler(handler);
        logger.getHandlers()[0].setLevel(Level.ALL);
        int step = 1;
        //Измените массив expected для ошибки
        int[] arr = {1, 5, 56, 44, 88, 95, 14};
        int[] expected = {14, 1, 5, 56, 44, 88, 95};
        try {
            Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(Main.toMoveRight(arr, step)));
        } catch (AssertionError error) {
            logger.info("Произошла ошибка");
            throw error;
        }
    }

    @DisplayName("Сдвиг эл-тов массива на n влево")
    @Test
    void toMoveLeft() throws IOException {
        Handler handler = new FileHandler("src/main/resources/log9.log");
        logger.addHandler(handler);
        logger.getHandlers()[0].setLevel(Level.ALL);
        int step = 1;
        //Измените массив expected для ошибки
        int[] arr = {1, 5, 56, 44, 88, 95, 14};
        int[] expected = {5, 56, 44, 88, 95, 14, 1};
        try {
            Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(Main.toMoveLeft(arr, step)));
        } catch (AssertionError error) {
            logger.info("Произошла ошибка");
            throw error;
        }
    }


}