package questions.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallMartTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        SmallMart app = new SmallMart(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}