package edu.alenasoft.gildedrose;

public class LegendaryItem extends Item {
    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    @Override
    public void UpdateQuality() {
        this.setQuality(80);
    }
}
