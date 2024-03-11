package object;

public class Team {
    private InterplanetaryShip ship;
    private String teamMembers;

    public Team(InterplanetaryShip ship, String teamMembers) {
        this.ship = ship;
        this.teamMembers = teamMembers;
    }

    public void sendDetailedBlueprints() {
        System.out.println(teamMembers + " направили подробные чертежи узлов ракеты в Научный городок.");
    }

    public void startManufacturing() {
        System.out.println("Начало изготовления деталей корабля инженерами-конструкторами.");
    }

    public void monitorProgress() {
        System.out.println("Отслеживание прогресса работ над проектом инженером Клепкой.");
    }
}