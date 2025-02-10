public class Machine {
    private String type;
    private String model;
    private Worker operator;

    public Machine(String type, String model, Worker operator) {
        this.type = type;
        this.model = model;
        this.operator = operator;
    }

    public String getMachineDetails() {
        return type + ", " + model;
    }

    public String getWorkerDetails() {
        return operator.getName() + ", " + operator.getRole();
    }
}
