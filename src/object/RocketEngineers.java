package object;


import exepts.CustomCheckedException;

public class RocketEngineers {

    static class RocketProject {
        public void startProject() {
            System.out.println("Проект ракеты начат.");
        }
    }

    public void designRocket() {
        System.out.println("Инженеры работают над дизайном интерпланетарного корабля 'Межзвездный странник'.");
    }

    public void createBlueprints() {
        System.out.println("Инженеры создают подробные чертежи узлов и систем корабля.");
    }

    // Метод для старта производства
    public void startProduction() {
        System.out.println("Началось производство деталей для сборки ракеты.");
    }

    // Метод для мониторинга прогресса
    public void monitorProgress() {
        System.out.println("Инженеры следят за выполнением работ и координируют усилия команды.");
    }



}


