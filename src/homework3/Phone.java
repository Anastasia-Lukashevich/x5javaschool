package homework3;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public double getWeight() {
        return this.weight;
    }

    public void receiveCall(String name, String phone) {
        System.out.println("Звонит " + name + " по номеру " + phone);
    }

    public void sendMessage(String... phones) {
        for (String phone : phones) {
            System.out.println(phone);
        }
    }
}
