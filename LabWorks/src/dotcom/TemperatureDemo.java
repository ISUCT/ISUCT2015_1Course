/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dotcom;

import javax.swing.JOptionPane;

/**
 *
 * @author stud_17
 */
public class TemperatureDemo {

    public static void main(String[] args) {

        char convertTo = JOptionPane.showInputDialog("Введите букву 'C' для преобразования в градусы Цельсия и букву 'ф' для преобразования в градусы Фаренгейта").charAt(0);

        int temperature = Integer.parseInt(JOptionPane.showInputDialog("Введите значение градусов"));

        TemperatureConverter t = new TemperatureConverter();

        JOptionPane.showMessageDialog(null, t.convertTemp(temperature, convertTo));

    }
}
