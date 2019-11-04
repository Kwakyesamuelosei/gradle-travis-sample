package io.turntabl;

public class Client {
    private String name;
    private Integer id;
    private ServiceLevel serviceLevel;

    public Client(String name, Integer id, ServiceLevel serviceLevel) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }
}
