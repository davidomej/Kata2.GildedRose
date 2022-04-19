import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseShould {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void aged_brie(){
        Item[] items = new Item[] { new Item("Age Brie", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Age Brie", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void backstage_passes(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }
}
