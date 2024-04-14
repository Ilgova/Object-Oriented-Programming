import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {
    @Override
    public int compare(Flow s1, Flow s2) {
        return Integer.compare(s1.getGroupCount(), s2.getGroupCount());
    }
}