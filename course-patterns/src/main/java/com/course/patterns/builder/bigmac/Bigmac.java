package com.course.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {

        private static String bun;
        private static int burgers;
        private static String sauce;
        private static List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (!("normal".equals(bun) || "sesame".equals(bun))) {
                throw new IllegalStateException("bun must be normal or sesame");
            } else {
                this.bun = bun;
                return this;
            }
        }

        public BigmacBuilder burgers(int burgers) {
            if (!(burgers > 0 && burgers < 4)) {
                throw new IllegalStateException("burgers must be 1 , 2 or 3 ");
            } else {
                this.burgers = burgers;
                return this;
            }
        }

        public BigmacBuilder sauce(String sauce) {
            if (!("standard".equals(sauce) || "1000 islands".equals(sauce) || "barbecue".equals(sauce))) {
                throw new IllegalStateException("sauce must be standard, 1000 islands or barbecue ");
            } else {
                this.sauce = sauce;
                return this;
            }
        }

        public BigmacBuilder ingredients(String ingredient) {
            if (!("lettuce".equals(ingredient) || "onion".equals(ingredient) || "bacon".equals(ingredient)
                    || "cucumber".equals(ingredient) || "chilli".equals(ingredient) || "mushrooms".equals(ingredient)
                    || "shrimps".equals(ingredient) || "cheese".equals(ingredient))) {
                throw new IllegalStateException("ingredients must be lettuce, onion, bacon, cucumber, chilli, mushrooms, shrimps or cheese ");

            } else {
                ingredients.add(ingredient);
                return this;
            }
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

}

