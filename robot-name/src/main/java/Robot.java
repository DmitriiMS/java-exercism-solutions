import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Robot {

    Random randomizer = new Random(System.nanoTime());
    private static Set<String> takenNames = new HashSet<>();

    private String robotName;

    public Robot() {
        generateRobotName();
    }

    private void generateRobotName() {
        while (true) {
            String letters = randomizer.ints(65, 91).limit(2)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            int numbers = randomizer.nextInt(0, 1000);

            String name = letters.concat(Integer.toString(numbers));
            if (takenNames.contains(name)) {
                continue;
            }
            robotName = name;
            takenNames.add(name);
            break;
        }
    }

    public String getName() {
        return robotName;
    }

    public void reset() {
        takenNames.remove(robotName);
        generateRobotName();
    }
}
