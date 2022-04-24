package com.example;

import java.util.List;

public class LionAlex extends Lion{

    private Feline feline;

    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
        this.feline = feline;
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Марти, Глория, Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
