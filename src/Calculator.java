public class Calculator {

    private static boolean solutionExists(String solutionPath, int movesLeft, int currentValue, int solution) {
        if (currentValue == solution) {
            System.out.println(solutionPath);
            return true;
        }

        if (movesLeft == 0) {
            return false;
        }

        return  Calculator.solutionExists(solutionPath + " - 4", movesLeft - 1, currentValue - 4, solution) ||
                Calculator.solutionExists(solutionPath + " * - 4", movesLeft - 1, currentValue * -4, solution) ||
                Calculator.solutionExists(solutionPath + " * - 1", movesLeft - 1, currentValue * -1, solution) ||
                (currentValue % 3 == 0 && Calculator.solutionExists(solutionPath + " / 3", movesLeft - 1, currentValue / 3, solution)) ||
                (currentValue % 8 == 0 && Calculator.solutionExists(solutionPath + " / 8", movesLeft - 1, currentValue / 8, solution));

    }

    public static boolean solutionExists(int possibleMovesCount, int startingValue, int solution) {
        return Calculator.solutionExists(Integer.toString(startingValue), possibleMovesCount, startingValue, solution);
    }
}