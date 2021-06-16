package edu.alenasoft.gildedrose;

public class LegendaryItem extends Item {
    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void setQuality(int quality) {
        this.quality = 80;
    }

    @Override
    public void UpdateQuality() {
        this.setSellIn(this.getSellIn() - 1);
    }
}
