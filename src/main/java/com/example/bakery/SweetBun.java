package com.example.bakery;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Класс, представляющий сладкую булочку.
 * Наследуется от абстрактного класса {@link Bun}.
 * 
 * @author Студент
 * @version 1.0
 */
public class SweetBun extends Bun {
    
    /**
     * Конструктор сладкой булочки (время создания — текущий момент).
     * 
     * @param price цена
     * @param ingredients список ингредиентов
     */
    public SweetBun(double price, List<Ingredient> ingredients) {
        super(price, ingredients);
    }

    /**
     * Конструктор сладкой булочки с заданным временем создания.
     * 
     * @param price цена
     * @param ingredients список ингредиентов
     * @param creationDate дата и время создания
     */
    public SweetBun(double price, List<Ingredient> ingredients, LocalDateTime creationDate) {
        super(price, ingredients, creationDate);
    }
}