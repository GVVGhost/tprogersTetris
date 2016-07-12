/*
 * @GraphicsModule.java
 *
 * Version 1.0 (11.07.2016)
 *
 * Распространяется под копилефтной лицензией GNU GPL v3
 */
package ru.tproger.graphics;

import ru.tproger.main.GameField;

/**
 * Определяет действия, которые должен производить графический модуль игры.
 *
 * @author DoKel
 * @version 1.0
 */
public interface GraphicsModule {

    /**
     * Отрисовывает переданное игровое поле
     *
     * @param field Игровое поле, которое необходимо отрисовать
     */
    void draw(GameField field);

    /**
     * @return Возвращает true, если в окне нажат "крестик"
     */
    boolean isCloseRequested();

    /**
     * Заключительные действия, на случай, если модулю нужно подчистить за собой.
     */
    void destroy();

    /**
     * Заставляет программу немного поспать, если последний раз метод вызывался
     * менее чем 1/fps секунд назад
     */
    void sync(int fps);
}
