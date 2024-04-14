import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ServiceFlow {
    public void sortFlows(List<Flow> flows) {
        Collections.sort(flows, new StreamComparator());
    }
}