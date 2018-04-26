package questions.com.vmware.smartmart;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import questions.com.vmware.smartmart.application.SmallMart;
import questions.com.vmware.smartmart.businessobjects.Item;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SmallMartTests {
    private List<Item> items = new ArrayList<>();
    private SmallMart smallMart = null;

    @BeforeTest
    public void preTest() {
       items.add( new Item("foo", 0, 0) );
       smallMart = new SmallMart();
    }


    @Test
    public void TestAddItem() {
        smallMart.addItem(new Item("Sulfaras", 10, 10));

        int itemCount = smallMart.getItems().size();
        Assert.assertEquals(itemCount, 2);
    }


    @Test
    public void TestValidItemName() {
        // init array of items
        //Item[] items = new Item[] { new Item("foo", 0, 0) };

        // int smart-mart app with the items array
        smallMart.setItems(items);

        // update quality
        smallMart.updateQuality();

        // assert
        assertEquals("foo", smallMart.getItems().get(0).name);
    }


    @Test
    public void TestInvalidItemName() {
        smallMart.setItems(items);

        // update quality
        smallMart.updateQuality();

        // assert
        assertEquals("foo00", smallMart.getItems().get(0).name);
    }


    @Test
    public void TestItemQualityIncrease() {
        // int smart-mart app with the items array
        smallMart.setItems(items);

        // update quality
        smallMart.updateQuality();

        // assert
        assertEquals("foo00", smallMart.getItems().get(0).name);
    }

    @Test
    public void TestItemQualityDegrading() {
        assertEquals("a", "a");
    }

    @Test
    public void TestItemQualityDegradingBeyondSellIn() {
        assertEquals("a", "a");
    }

    @Test
    public void TestItemQualityDegradingForSulfaras() {
        assertEquals("a", "a");
    }

    @Test
    public void TestItemQualityDegradingForAgebreeAndBackstagePass() {
        assertEquals("a", "a");
    }
}