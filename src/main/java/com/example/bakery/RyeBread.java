package com.example.bakery;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Класс, представляющий ржаной хлеб.
 * Наследуется от абстрактного класса {@link Bun}.
 * 
 * @author Студент
 * @version 1.0
 */
public class RyeBread extends Bun {
    
    /**
     * Конструктор ржаного хлеба (время создания — текущий момент).
     * 
     * @param price цена
     * @param ingredients список ингредиентов
     */
    public RyeBread(double price, List<Ingredient> ingredients) {
        super(price, ingredients);
    }

    /**
     * Конструктор ржаного хлеба с заданным временем создания.
     * 
     * @param price цена
     * @param ingredients список ингредиентов
     * @param creationDate дата и время создания
     */
    public RyeBread(double price, List<Ingredient> ingredients, LocalDateTime creationDate) {
        super(price, ingredients, creationDate);
    }
}