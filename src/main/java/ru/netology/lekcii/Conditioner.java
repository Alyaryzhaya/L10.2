package ru.netology.lekcii;

public class Conditioner {

    // научим объекты класса Кондиционер иметь тек.темп
    private int currentTemp; // поле с текущей темп


    // GETTER
    // чтобы получить данные из поля (тек. темп), создаем метод getter
    public int getCurrentTemp() {
        return currentTemp;
    }

    // SETTER
    // чтобы поменять данные, метод setter
    public void setCurrentTemp(int newCurrentTemp) { // мы должны ему сказать, какую темп мы хотим

        // Делаем SETTER нетривиальным:
        if (newCurrentTemp < 0) {
            return;
        }
        if (newCurrentTemp > 30) { // в лекции ошибка - 50?
            return;
        }
        currentTemp = newCurrentTemp; // кладем в поле curTemp - newCurTemp

    }

    // Метод вычисления тек. темп, увеличенной на 50%
    public void increaseTemp50p() {
        int target = currentTemp * 3 / 2;
        // currentTemp = target;   // вместо прямого присвоения вызываем готовый метод setter
        setCurrentTemp(target); // установи полуторакратную от текущей темп target

        // создаем тест
    }

    // метод установки макс темп
    public void setMaxTemp() {
        currentTemp = 30;
    }
}
