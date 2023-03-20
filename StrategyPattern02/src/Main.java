import com.example.conc.BubbleSortStrategy;
import com.example.conc.MergeSortStrategy;
import com.example.conc.QuickSortStrategy;
import com.example.conc.Sorter;

public class Main {
    public static void main(String[] args) {

        int [] data={4,2,8,9,7};

        Sorter sorter= new Sorter(new QuickSortStrategy());

        sorter.sort(data);

        sorter.setStrategy(new MergeSortStrategy());

        sorter.sort(data);

        sorter.setStrategy(new BubbleSortStrategy());

        sorter.sort(data);
    }
}