import java.util.List;

public class Flow implements Iterable<StudyGroup> {
    private String name;
    private List<StudyGroup> groups;

    public Flow(String name, List<StudyGroup> groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public int getGroupCount() {
        return groups.size();
    }

    @Override
    public java.util.Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }
}