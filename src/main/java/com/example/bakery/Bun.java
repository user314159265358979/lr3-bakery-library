package com.example.bakery;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактный класс, представляющий булку.
 * Содержит базовые поля: цена, ингредиенты, дата создания.
 * 
 * @author Студент
 * @version 1.0
 */
public abstract class Bun {
    
    /** Цена булки. */
    private double price;
    
    /** Список ингредиентов. */
    private List<Ingredient> ingredients;
    
    /** Дата и время создания булки. */
    private LocalDateTime creationDate;

    /**
     * Конструктор по умолчанию. Устанавливает текущее время как время создания.
     * 
     * @param price цена булки
     * @param ingredients список ингредиентов (может быть null)
     */
    public Bun(double price, List<Ingredient> ingredients) {
        this(price, ingredients, LocalDateTime.now());
    }

    /**
     * Конструктор с возможностью указать конкретное время создания.
     * 
     * @param price цена булки
     * @param ingredients список ингредиентов
     * @param creationDate дата и время создания
     */
    public Bun(double price, List<Ingredient> ingredients, LocalDateTime creationDate) {
        this.price = price;
        this.ingredients = ingredients != null ? new ArrayList<>(ingredients) : new ArrayList<>();
        this.creationDate = creationDate;
    }

    /**
     * Возвращает цену булки.
     * @return цена
     */
    public double getPrice() { 
        return price; 
    }

    /**
     * Возвращает список ингредиентов.
     * @return список ингредиентов
     */
    public List<Ingredient> getIngredients() { 
        return ingredients; 
    }

    /**
     * Возвращает дату и время создания.
     * @return дата и время
     */
    public LocalDateTime getCreationDate() { 
        return creationDate; 
    }

    /**
     * Добавляет новый ингредиент к булке.
     * 
     * @param ing объект ингредиента
     */
    public void addIngredient(Ingredient ing) {
        this.ingredients.add(ing);
    }

    /**
     * Возвращает строковое представление булки.
     * 
     * @return строка с информацией о булке
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{цена=" + price + ", ингредиенты=" + ingredients + ", создана=" + creationDate + "}";
    }
}