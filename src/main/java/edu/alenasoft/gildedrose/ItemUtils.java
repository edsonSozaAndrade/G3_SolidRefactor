package edu.alenasoft.gildedrose;

public class ItemUtils {
    public static int VerifyQualityConditions (int quality)
    {
        if (quality < 0)
            return 0;
        if (quality > 50)
            return  50;
        return quality;
    }
}
