package Observer;

class CurrentConditionsDisplay implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees.");
    }
}

class StatisticsDisplay implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Statistics: " + temperature + "F degrees.");
    }
}
