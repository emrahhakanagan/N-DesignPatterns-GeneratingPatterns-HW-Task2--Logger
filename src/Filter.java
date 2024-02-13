import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer value : source) {
            if (value >= threshold) {
                logger.log("Элемент \"" + value + "\" проходит");
                result.add(value);
            } else {
                logger.log("Элемент \"" + value + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}
