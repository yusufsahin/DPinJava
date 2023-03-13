import com.example.abst.Category;
import com.example.conc.CompositeCategory;
import com.example.conc.SimpleCategory;

public class Main {
    public static void main(String[] args) {
        // Create categories
        Category cat1 = new SimpleCategory("Category 1");
        Category cat2 = new SimpleCategory("Category 2");
        Category subcat1 = new SimpleCategory("Subcategory 1");
        Category subcat2 = new SimpleCategory("Subcategory 2");
        Category group1 = new CompositeCategory("Group 1");
        Category group2 = new CompositeCategory("Group 2");

        // Add categories to groups
        group1.add(cat1);
        group1.add(cat2);
        group2.add(subcat1);
        group2.add(subcat2);

        // Add groups to other groups
        group1.add(group2);

        // Display hierarchy starting from top-level group
        group1.displayHierarchy();

    }
}