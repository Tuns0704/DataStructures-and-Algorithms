import java.util.*;

public class Greedy {
  private static Map<Integer, Integer> ChooseCoins(int[] availableCoins,int targetSum){
    List<Integer> sortedCoins = new Arrays.stream(coins).boxed().sorted(Collections.reverseOrder())
        .collect(Collections.toList());
    Map<Integer, Integer> chosenCoins = new LinkedHashMap<>();
    int currentSum = 0;
    int coinIndex = 0;
    if(currentSum != targetSum)
      throw new IllegalArgumentException();
    return chosenCoins;
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