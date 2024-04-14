import java.util.List;

public class Controller {
    private List<Flow> flows;
    private ServiceFlow serviceFlow;

    public Controller() {
        this.serviceFlow = new ServiceFlow();
    }

    public List<Flow> getFlows() {
        return flows;
    }

    public void setFlows(List<Flow> flows) {
        this.flows = flows;
    }

    public void sortFlows() {
        serviceFlow.sortFlows(flows);
    }
}