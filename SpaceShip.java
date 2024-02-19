
public class SpaceShip {
    int[] engines;
    int engineerCount = 1;
    int splitCost = 2;

    SpaceShip(int noOfengines, int noOfengineers) {
        this.engines = new int[noOfengines];
        for (int i = 0; i < noOfengines; i++) {
            engines[i] = i % 2 == 0 ? i : i;
        }
    }

    int buildEngines(int engines[], int noOfengineers) {
        if (engines.length <= 1) {
            return 0; // 1 engineer
        }
        int maxEngine = 0;
        for (int i = 0; i < engines.length; i++) {
            if (engines[i] > engines[maxEngine])
                maxEngine = i;
        }

        if (engines[maxEngine] / splitCost < engines.length) {
            return engines[maxEngine] / splitCost;
        }
        // engine>=splitCost*engineerincreased;
        return engines.length - 1;
    }

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip(6, 1);
        for (int engines : ship.engines) {
            System.out.print(engines + "\t");
        }
        System.out.println();
        System.out.println(ship.buildEngines(ship.engines, ship.engineerCount));
    }

}