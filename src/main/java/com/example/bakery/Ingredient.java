package com.example.bakery;

/**
 * Класс, представляющий ингредиент булки.
 * Содержит информацию о названии и количестве ингредиента.
 * 
 * @author Студент
 * @version 1.0
 */
public class Ingredient {
    
    /** Название ингредиента. */
    private String name;
    
    /** Количество ингредиента в граммах. */
    private double quantity;

    /**
     * Конструктор для создания нового ингредиента.
     * 
     * @param name название ингредиента
     * @param quantity количество в граммах
     */
    public Ingredient(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * Возвращает название ингредиента.
     * 
     * @return строку с названием
     */
    public String getName() { 
        return name; 
    }

    /**
     * Возвращает количество ингредиента.
     * 
     * @return количество в граммах
     */
    public double getQuantity() { 
        return quantity; 
    }

    /**
     * Возвращает строковое представление ингредиента.
     * 
     * @return строка вида "название (количество)"
     */
    @Override
    public String toString() { 
        return name + " (" + quantity + "г)"; 
    }
}