import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Greedy {
    public static Map<Integer, Integer>
    chooseCoins(int[] coins, int targetSum) {
        List<Integer> sortedCoins = Arrays.stream(coins).boxed()
        .sorted(Collections.reverseOrder())
    .collect(Collectors.toList());
    Map<Integer, Integer> chosenCoins = new LinkedHashMap<>();
    int currentSum = 0; int coinIndex = 0;
    while (currentSum != targetSum && coinIndex < sortedCoins.size()) {
        int currentCoin = sortedCoins.get(coinIndex);
        int remainder = targetSum - currentSum;
        int numberOfCoins = remainder / currentCoin;
        if (currentSum + currentCoin <= targetSum) {
            chosenCoins.put(currentCoin, numberOfCoins);
            currentSum += numberOfCoins * currentCoin;
        }
        coinIndex++;
    }
    if (currentSum != targetSum)
        throw new IllegalArgumentException();
    return chosenCoins;
    }
    public static void main(String[] arr){
        int[] availableCoins = new int [] {1,2,5,10,20,50};
        int targetSum = 923;
        Map<Integer, Integer> selectedCoins= chooseCoins( availableCoins,targetSum);
        System.out.println(String.format("Number of coins to take: %d",selectedCoins.values().stream().mapToInt(Integer::intValue).sum()));
        for(Integer key: selectedCoins.keySet()){
            System.out.println(String.format("%d coin(s) with value %d",selectedCoins.get(key),key));
        }
    }
}
// public class Greedy {
//   private static Map<Integer, Integer> ChooseCoins(int[] availableCoins,int targetSum){
//     List<Integer> sortedCoins = new Arrays.stream(coins).boxed().sorted(Collections.reverseOrder())
//         .collect(Collections.toList());
//     Map<Integer, Integer> chosenCoins = new LinkedHashMap<>();
//     int currentSum = 0;
//     int coinIndex = 0;
//     if(currentSum != targetSum)
//       throw new IllegalArgumentException();
//     return chosenCoins;
  //   while (currentSum != targetSum && coinIndex < sortedCoins.size()) {
  //     int currentCoin = sortedCoins.get(coinIndex);
  //     int remainder = targetSum - currentCoin;
  //     int numberOfCoins = remainder / currentCoin;
  //     if (currentCoin + currentCoin <= targetSum) {
  //       chosenCoins.put(currentCoin, numberOfCoins);
  //       currentSum += numberOfCoins * currentCoin;
  //     }
  //     coinIndex++;
  //   }
  // }
//   public static void main(String[] args) {
//     int[] availableCoins = new int[] { 1, 2, 5, 10, 20, 50 };
//     int targetSum = 923;

//     Map<Integer, Integer> selectedCoins = ChooseCoins(availableCoins, targetSum);

//     System.out.println(String.format("Number of coins to take: %d",
//         selectedCoins.values().stream().mapToInt(Integer::intValue).sum()));

//     for (Integer key : selectedCoins.keySet()) {
//       System.out.println(String.format("%d coins(s) with value %d", selectedCoins.get(key),key));
//     }
//   }
// }
