package edu.alenasoft.gildedrose;

public class ConjuredItem extends Item{
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void UpdateQuality() {
        this.setQuality(this.getQuality()-2);
        this.setQuality(ItemUtils.VerifyQualityConditions(this.getQuality()));
    }
}
