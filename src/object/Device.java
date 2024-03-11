package object;
import enume.RocketStage;
import enume.RocketStage;

import java.util.List;

public class Device {
    private List<RocketStage> functions;

    public Device(List<RocketStage> functions) {
        this.functions = functions;
    }

    public String getFunctionDescription(int index) {
        if (index >= 0 && index < functions.size()) {
            return functions.get(index).getDescription();
        } else {
            return "Функция не найдена.";
        }
    }
}