package be.dc.ehb.masterdetail.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Courses {

    /**
     * An array of sample (dummy) items.
     */
    public static List<CourseItem> ITEMS = new ArrayList<CourseItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, CourseItem> ITEM_MAP = new HashMap<String, CourseItem>();

    static {
        // Add 3 sample items.
        addItem(new CourseItem("1", "IT Fundamentals","This teaches basic IT fundamentals"));
        addItem(new CourseItem("2", "Android Development","Android!!!! "));
        addItem(new CourseItem("3", "Something PHPish","Le PHP"));
    }

    private static void addItem(CourseItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class CourseItem {
        public String id;
        public String content;
        public String description;

        public CourseItem(String id, String content, String description) {
            this.id = id;
            this.content = content;
            this.description = description;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
