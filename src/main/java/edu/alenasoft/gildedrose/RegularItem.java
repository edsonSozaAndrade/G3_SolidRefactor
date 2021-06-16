package edu.alenasoft.gildedrose;

public class RegularItem extends Item{
    public RegularItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void UpdateQuality() {
        if (this.getSellIn() <= 0)
            this.setQuality(this.getQuality() - 2);
        else
            this.setQuality(this.getQuality() - 1);
        this.setQuality(ItemUtils.VerifyQualityConditions(this.getQuality()));
    }
}
