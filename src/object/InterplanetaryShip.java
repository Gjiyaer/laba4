package object;

public class InterplanetaryShip {
    private String name;

    public InterplanetaryShip(String name) {
        this.name = name;
    }

    public void designShip() {
        System.out.println("Проектирование интерпланетарного корабля: " + name);
    }
}
