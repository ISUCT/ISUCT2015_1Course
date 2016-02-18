/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author stud_17
 */
import javax.swing.*;

class TemperatureConverter {

    int temperature;

    public String convertTemp(int temperature, char convertTo) {

        if (convertTo == 'Ф' || convertTo == 't') {

            this.temperature = (temperature * 9 / 5 + 32);

            return String.valueOf(this.temperature) + " градусов по Фаренгейту";

        } else if (convertTo == 'С' || convertTo == 'c') {

            this.temperature = (temperature - 32) * 5 / 9;

            return String.valueOf(this.temperature) + " градусов по Цельсию";

        } else {
            return "Неверно выбран аргумент";
        }

    }
}
/**
 *
 * @author stud_17
 */
