public class Greedy {
  public static void main(String[] args) {
    int[] availableCoins = new int[] { 1, 2, 5, 10, 20, 50 };
    int targetSum = 923;

    Map<Integer, Integer> selectedCoins = ChooseCoins(availableCoins, targetSum);
  }
}
