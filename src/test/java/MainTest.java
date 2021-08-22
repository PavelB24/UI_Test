import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;


class MainTest {
   static Logger logger;
    MainTest() {

    }
    @AfterEach
    void toEnd(){
        System.out.println("Конец теста");
    }

    @BeforeEach
    void toStart(){
        System.out.println("Начало теста");
        logger = Logger.getLogger("Лог теста");
    }

    @DisplayName("Поиск максимального эл-та массива")
    @Test
    void toFindMax() throws IOException {
        Handler handler = new FileHandler("src/main/resources/log5.log");
        int[] arr = {1, 5, 56, 44, 88, 95, 14};
        Assertions.assertEquals(95, Main.toFindMax2(arr));
        logger.addHandler(handler);



    }
    @DisplayName("Поиск максимального эл-та массива")
    @Test
    void toMoveLeft() {
    }

    @DisplayName("Проверяет равны ли две части одного массива")
    @Test
    void isEqual() {
    }

    @DisplayName("Сдвиг эл-тов массива на n вправо")
    @Test
    void toMoveRight() {
    }
}