package com.example.bakery;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Главный класс приложения для демонстрации работы иерархии булок.
 * 
 * @author Студент
 * @version 1.0
 */
public class Main {
    
    /**
     * Точка входа в программу.
     * Создает объекты булок, демонстрирует фильтрацию по времени и ингредиентам.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        LocalDateTime fiveMinsAgo = LocalDateTime.now().minusMinutes(5);

        // Создаем 4 булки, которые были созданы ровно 5 минут назад
        WhiteBread wb1 = new WhiteBread(2.5, List.of(new Ingredient("мука", 200)), fiveMinsAgo);
        RyeBread rb1 = new RyeBread(3.0, List.of(new Ingredient("мука ржаная", 180)), fiveMinsAgo);
        SweetBun sb1 = new SweetBun(4.0, List.of(new Ingredient("сахар", 50)), fiveMinsAgo);
        WhiteBread wb4 = new WhiteBread(2.6, List.of(new Ingredient("молоко", 50)), fiveMinsAgo);

        // Создаем остальные 6 булок в данный момент времени
        WhiteBread wb2 = new WhiteBread(2.0, List.of(new Ingredient("вода", 100)));
        RyeBread rb2 = new RyeBread(2.8, List.of(new Ingredient("соль", 5)));
        SweetBun sb2 = new SweetBun(3.5, List.of(new Ingredient("шоколад", 30)));
        WhiteBread wb3 = new WhiteBread(2.3, List.of(new Ingredient("дрожжи", 10)));
        RyeBread rb3 = new RyeBread(3.2, List.of(new Ingredient("отруби", 20)));
        SweetBun sb3 = new SweetBun(4.5, List.of(new Ingredient("корица", 5)));

        // Добавляем перец в некоторые булки
        wb1.addIngredient(new Ingredient("перец", 2));
        rb1.addIngredient(new Ingredient("перец", 3));
        sb2.addIngredient(new Ingredient("перец", 1));

        Bun[] buns = {wb1, rb1, sb1, wb2, rb2, sb2, wb3, rb3, sb3, wb4};

        System.out.println("=== ВСЕ БУЛКИ ===");
        for (Bun b : buns) {
            System.out.println(b);
        }

        System.out.println("\n=== СОЗДАННЫЕ 5 МИНУТ НАЗАД ===");
        LocalDateTime targetTime = LocalDateTime.now().minusMinutes(5);
        for (Bun b : buns) {
            long diff = Math.abs(java.time.Duration.between(b.getCreationDate(), targetTime).toSeconds());
            if (diff <= 1) {
                System.out.println(b);
            }
        }

        System.out.println("\n=== БУЛКИ, СОДЕРЖАЩИЕ ПЕРЕЦ ===");
        for (Bun b : buns) {
            for (Ingredient ing : b.getIngredients()) {
                if (ing.getName().equalsIgnoreCase("перец")) {
                    System.out.println(b);
                    break;
                }
            }
        }
    }
}