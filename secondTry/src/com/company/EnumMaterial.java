package com.company;

public enum EnumMaterial {
    METAL("металл"),
    WOOD("дерево"),
    PLASTIC("пластик"),
    PAPER("бумага"),
    CARDBOARD("картон"),
    PLASTICINE("пластилин"),
    NOUN("материал не указан");

    private final String description;

    private EnumMaterial(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}