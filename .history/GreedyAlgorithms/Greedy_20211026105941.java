import java.ulti.Map<Integer,Integer>;

public class Greedy {
  private static Map<Integer, Integer> ChooseCoins(int[] availableCoins, targetSum){
    throw new IllegalArgumentException;
  }
  public static void main(String[] args) {
    int[] availableCoins = new int[] { 1, 2, 5, 10, 20, 50 };
    int targetSum = 923;

    Map<Integer, Integer> selectedCoins = ChooseCoins(availableCoins, targetSum);

    System.out.println(String.format("Number of coins to take: %d",
        selectedCoins.values().stream().mapToInt(Integer::intValue).sum()));

    for (Integer key : selectedCoins.keySet()) {
      System.out.println(String.format("%d coins(s) with value %d", selectedCoins.get(key),key));
    }
  }
}
