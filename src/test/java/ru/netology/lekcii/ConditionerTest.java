package ru.netology.lekcii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    @Test
    public void shouldSetTemp() { // установи текущую температуру

        Conditioner cond = new Conditioner(); // объект в переменной

        // cond.currentTemp = 15; // тестируемое действие (кладем темп 15)
        // заменяем на setter:
        cond.setCurrentTemp(15); // SETTER


        int expected = 15;
        int actual = cond.getCurrentTemp(); // GETTER

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetTempAboveMax() { // установи темп выше максимума
        Conditioner cond = new Conditioner();

        // cond.currentTemp = 50; // темп выше макисмума
        // заменим на setter:
        cond.setCurrentTemp(50); // SETTER
        // однако setter тривиальный - попросили установить 50  - он установил
        // нужно превратить этот сеттер в НЕтривиальный


        int expected = 0;
        // int actual = cond.currentTemp; // спрашиваем его из поля
        // заменим на getter
        int actual = cond.getCurrentTemp(); // GETTER


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetMaxTemp() {  // Установи макс темп

        Conditioner cond = new Conditioner();

        cond.setMaxTemp();

        // здесь мы не использовали setter

        int expected = 30;
        int actual = cond.getCurrentTemp(); // GETTER

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTemp50p() {
        // 1. ПОДГОТОВКА
        Conditioner cond = new Conditioner();
        cond.setCurrentTemp(25);

        // 2. ТЕСТИРУЕМОЕ ДЕЙСТВИЕ
        cond.increaseTemp50p();

        // 3. ПРОВЕРКА
        int expected = 25;
        int actual = cond.getCurrentTemp();
        Assertions.assertEquals(expected, actual);
    }
}
