package questions.com.vmware.smartmart.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import questions.com.vmware.smartmart.businessobjects.Item;

import java.util.ArrayList;
import java.util.List;


/**
 * Description: SmartMart application parent class.
 */
public class SmallMart {
    private Logger LOG = LoggerFactory.getLogger(SmallMart.class);
    private List<Item> ITEM_LISTING = new ArrayList<>();


    /**
     * Description: set ITEM_LISTING array
     * @param items - array of ITEM_LISTING
     */
    public SmallMart setItems(List<Item> items) {
        this.ITEM_LISTING = items;
        return this;
    }

    /**
     * Description: a getter for ITEM_LISTING accordingly.
     * @return  - Item[] array object
     */
    public List<Item> getItems() {
        return this.ITEM_LISTING;
    }


    public void addItem(Item item) {
        this.ITEM_LISTING.add(item);
    }


    /**
     *
     * @Comments by mukthar.
     *
     *      - Would prefer a setter rather than "constructor overloading" unless its a light weight operation.
     *      - However, the below is just an item assignment and not doing any heavy lifting operation but is clearly
     *      a setter operation and hence goes as a setter.
     *
     * public SmallMart(Item[] ITEM_LISTING) {
     * this.ITEM_LISTING = ITEM_LISTING;
     * }
     */


    /**
     * Description: updating the quality of the item within SmartMart application proc.
     */
    public void updateQuality() {
        for (int itemId = 0; itemId < ITEM_LISTING.size(); itemId++) {
            Item currentItem = ITEM_LISTING.get(itemId);
            String itemName = currentItem.name;

            /**
             *
             *  aged bri and backstage passes - increase in quality by age (sellIn value decreasing, quality gets increasing in number)
             *
             *  Sulfaras - no change in quality
             *
             *
             *  Change in quality
             *      - quality never greater than 50
             *      - (quality + 2) if <= 10
             *      - (quality + 3) if <= 5
             *              => if quality > 50; then quality = 50
             *
             *
             *  Quality drops to 0 after the concert -> I am assuming that the quality drop to 0 after the sellIn date.
             *
             */

            int sellInValue = currentItem.sellIn;
            int currentQuality = currentItem.quality;

            /** handling "aged brie" and "backstage passes" */
            if (itemName.toLowerCase().contains("aged brie") || itemName.toLowerCase().contains("backstage passes")) {
                if (sellInValue > 10)
                    currentItem.quality = currentQuality + 1;

                if (sellInValue >5 && sellInValue <= 10)
                    currentItem.quality = currentQuality + 2;

                if ( sellInValue >0 &&  sellInValue <= 5 )
                    currentItem.quality = currentQuality + 3;
            }


            /**
             * - "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
             * 	- Once the sell by date has passed, Quality degrades twice as fast
             * 	- The Quality of an item is never negative
             * 	*/
            if (!itemName.toLowerCase().contains("sulfuras") && sellInValue <= 0) {
                int qualityReCalibrated = (currentQuality - (currentQuality * 2));
                currentItem.quality =
                        ( qualityReCalibrated < 0 ) ? 0 : qualityReCalibrated;
            }






            /** Completely comments and refactored as above */
/*            if (!itemName.toLowerCase().contains("aged brie")
                    && !itemName.toLowerCase().contains("backstage passes")) {


                if (currentItem.quality > 0) {
                    if (!itemName.equals("Sulfuras, Hand of Ragnaros")) {
                        currentItem.quality = currentItem.quality - 1;      *//** ToDo: Need to check on this as quality cannot be -1 *//*
                    }
                }

            } else {
                if (currentItem.quality < 50) {
                    currentItem.quality = currentItem.quality + 1;

                    if (itemName.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (currentItem.sellIn < 11) {
                            if (currentItem.quality < 50) {
                                currentItem.quality = currentItem.quality + 1;
                            }
                        }

                        if (currentItem.sellIn < 6) {
                            if (currentItem.quality < 50) {
                                currentItem.quality = currentItem.quality + 1;
                            }
                        }
                    }
                }
            }

            if (!itemName.equals("Sulfuras, Hand of Ragnaros")) {
                currentItem.sellIn = currentItem.sellIn - 1;
            }


            if (currentItem.sellIn < 0) {
                if (!itemName.equals("Aged Brie")) {
                    if (!itemName.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (currentItem.quality > 0) {
                            if (!itemName.equals("Sulfuras, Hand of Ragnaros")) {
                                currentItem.quality = currentItem.quality - 1;
                            }
                        }
                    } else {
                        currentItem.quality = currentItem.quality - currentItem.quality;
                    }
                } else {
                    if (currentItem.quality < 50) {
                        currentItem.quality = currentItem.quality + 1;
                    }
                }
            }*/



        }
    }

}
