package edu.alenasoft.gildedrose;

public class InverseQualityItem extends Item{
    public InverseQualityItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void UpdateQuality() {
        if (this.getQuality() < 50) {
            if (this.getSellIn() > 0 && this.getSellIn() <=10)
            {
                if (this.getSellIn() > 0 && this.getSellIn() <= 5)
                    this.setQuality(this.getQuality() + 3);
                if (this.getSellIn()>5 && this.getSellIn() <= 10)
                    this.setQuality(this.getQuality() + 2);
            }
            else
            {
                if (this.getSellIn() == 0)
                    this.setQuality(0);
                else
                    this.setQuality(this.getQuality() + 1);
            }
            // if ((IsExpired() || IsLessThan5Days() || IsLessThan10Days()) == false)
            //    this.setQuality(this.getQuality() + 1);
        }
        this.setQuality(ItemUtils.VerifyQualityConditions(this.getQuality()));
    }

//    private boolean IsExpired()
//    {
//        if (this.getSellIn() == 0) {
//            this.setQuality(0);
//            return true;
//        }
//        return false;
//    }
//
//    private boolean IsLessThan5Days()
//    {
//        if (this.getSellIn() > 0 && this.getSellIn() <= 5) {
//            this.setQuality(this.getQuality() + 3);
//            return true;
//        }
//        return false;
//    }
//
//    private boolean IsLessThan10Days()
//    {
//        if (this.getSellIn()>5 && this.getSellIn() <= 10) {
//            this.setQuality(this.getQuality() + 2);
//            return true;
//        }
//        return false;
//    }
}
