import enume.RocketStage;
import exepts.CustomCheckedException;
import object.*;

import java.util.Random;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomCheckedException {
        InterplanetaryShip ship = new InterplanetaryShip("Межзвездный странник");
        Team team = new Team(ship, "Знайка, Фуксия, Селедочка и профессор Звёздочкин");

        RocketEngineers rocketEngineers = new RocketEngineers();

        rocketEngineers.designRocket();

        Random random = new Random();
        int progress = random.nextInt(100);
        System.out.println("Прогресс выполнения проекта: " + progress + "%");

        rocketEngineers.createBlueprints();
        rocketEngineers.startProduction();
        rocketEngineers.monitorProgress();

        ship.designShip();

        team.sendDetailedBlueprints();
        team.startManufacturing();
        team.monitorProgress();

        System.out.println("Процесс проектирования и изготовления корабля продолжается медленнее, чем ожидалось. Знайка испытывает огромное нетерпение.");

        //анонимный класс 
        Rocket rocket = new Rocket("SpaceX") {
            @Override
            public void ForceGravityControl() {

            }
        };

        rocket.launch();
        rocket.fly();
        System.out.println(rocket.toString());

        //локальный класс
         class Zvezdochkin {
            public void superviseManufacturing() {
                System.out.println("Профессор Звездочкин контролирует процесс изготовления.");
            }
        }

        Zvezdochkin zvezdochkin = new Zvezdochkin();
        zvezdochkin.superviseManufacturing();

        Zeznoka zeznoka = new Zeznoka();

        boolean hasLunite = zeznoka.findLuniteInCaves("Пещеры на Луне");
        String planDescription = zeznoka.planDescription(hasLunite);

        System.out.println("Наличие лунита в пещерах на Луне: " + hasLunite);
        System.out.println("Описание плана: " + planDescription);

        Factory factory = new Factory();
        EngineeringDrawing drawing = new EngineeringDrawing("металлическими");
        factory.manufactureParts(drawing);
        factory.produceEquipment();

        Engineers engineers = new Engineers();
        engineers.workOnBlueprints(drawing);

        List<RocketStage> stages = Arrays.asList(RocketStage.FIRST, RocketStage.SECOND, RocketStage.FINAL);
        Device device = new Device(stages);
        System.out.println(device.getFunctionDescription(1));
    }
}



