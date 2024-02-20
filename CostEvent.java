package Q1;

public class costevent {
    private int[][] costMatrix;

    // Method to insert cost matrix values
    public int[][] insertCostMatrix(int venues, int themes) {
        costMatrix = new int[venues][themes];
        Scanner scanner = new Scanner(System.in);
        for (int venue = 0; venue < venues; venue++) {
            for (int theme = 0; theme < themes; theme++) {
                System.out.print("Enter cost for venue " + (venue + 1) + " and theme " + (theme + 1) + ": ");
                costMatrix[venue][theme] = scanner.nextInt();
            }
        }
        scanner.close();
        return costMatrix;
    }

    // Method to print the cost matrix
    public void printCostMatrix(int[][] matrix) {
        System.out.println("\nCost Matrix:");
        for (int[] row : matrix) {
            for (int cost : row) {
                System.out.print(cost + "\t");
            }
            System.out.println();
        }
    }

    // Method to calculate the minimum cost of events
    public String calculateMinimumCost(int[][] costMatrix) {
        int sum = 0;
        StringBuilder breakdown = new StringBuilder();
        for (int venue = 0; venue < costMatrix.length; venue++) {
            int smallest = Integer.MAX_VALUE;
            int themeIndex = -1;
            for (int theme = 0; theme < costMatrix[0].length; theme++) {
                if (costMatrix[venue][theme] < smallest) {
                    smallest = costMatrix[venue][theme];
                    themeIndex = theme;
                }
            }
            breakdown.append("Venue ").append(venue + 1).append(" with Theme ").append(themeIndex + 1).append(" + ");
            sum += smallest;
        }
        breakdown.setLength(breakdown.length() - 3); // Removing the last " + "
        return "Minimum cost of events: " + sum + "\nBreakdown: " + breakdown.toString();
    }

    public static void main(String[] args) {
        EventCostCalculator calculator = new EventCostCalculator();
        int[][] costMatrix = calculator.insertCostMatrix(3, 3);
        calculator.printCostMatrix(costMatrix);
        System.out.println("\n" + calculator.calculateMinimumCost(costMatrix));
    }
}
