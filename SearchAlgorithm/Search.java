import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

class Search {

  public static void main(String[] args) throws NumberFormatException, IOException {
/*        int[] a = {1,2,3,4,5,6,7,8,9};
      System.out.println("Binary Search: "+ getIndex(a, 7));
      int[] availableCoins = new int[] {1, 2, 5, 10, 20, 50};
      int targetSum = 923;
      Map<Integer, Integer> selectedCoins = ChooseCoins(availableCoins, targetSum);
      System.out.println(String.format("Number of coins to take: %d", selectedCoins.values().stream().mapToInt(Integer::intValue).sum()));
      for (Integer key : selectedCoins.keySet()) {
        System.out.println(String.format("%d coin(s) with value %d", selectedCoins.get(key), key));
      }*/
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] elements = reader.readLine().substring(10).split(",");
    int[] universe = new int[elements.length];
    for (int i = 0; i < elements.length; i++) {
      universe[i] = Integer.parseInt(elements[i]);
    }
    int numberofSets = Integer.parseInt(reader.readLine().substring(16));
    ArrayList<int[]> sets = new ArrayList<>();
    for (int i = 0; i < numberofSets; i++) {
      String[] setElements = reader.readLine().split(",");
      int[] set = new int[setElements.length];
      for (int j = 0; j < setElements.length; j++) {
        set[j] = Integer.parseInt(setElements[j]);
      }
      sets.add(set);
    }
    List<int[]> chosenSets = chooseSets(sets, universe);
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("Sets to take (%d):%n", chosenSets.size()));
    for (int[] set : chosenSets) {
      sb.append("{");
      sb.append(Arrays.toString(set).replaceAll("\\[|]",""));
      sb.append("}").append(System.lineSeparator());
    }
    System.out.println(sb);
  }
  public static List<int[]> chooseSets(List<int[]> sets, int[] universe) {
    ArrayList<int[]> selectedSets = new ArrayList<>();
    Set<Integer> universeSet = new HashSet<>();
    for (int element : universe) {
        universeSet.add(element);
    }
    while (!universeSet.isEmpty()) {
        int notChosenCount = 0;
        int[] chosenSet = sets.get(0);
        for (int[] set : sets) {
            int count = 0;
            for (int elem : set) {
                if (universeSet.contains(elem)) {
                    count++;
                }
            }
            if (notChosenCount < count) {
                notChosenCount = count;
                chosenSet = set;
            }
        }
        selectedSets.add(chosenSet);
        for (int elem : chosenSet) {
          universeSet.remove(elem);
        }
    }
    return selectedSets;
  }
  private static Map<Integer, Integer> ChooseCoins(int[] availableCoins, int targetSum) {
    Arrays.sort(availableCoins);
    List<Integer> sortedCoins = Arrays.stream(availableCoins).boxed().collect(Collectors.toList());
    Collections.reverse(sortedCoins);
    Map<Integer, Integer> chosenCoins = new LinkedHashMap<>();
    int currentSum = 0;
    int coinIndex = 0;
    while (currentSum != targetSum && coinIndex < sortedCoins.size()) {
        int currentCoinValue = sortedCoins.get(coinIndex);
        int remainingSum = targetSum - currentSum;
        int numberofCoinsToTake = remainingSum / currentCoinValue;
        if (numberofCoinsToTake > 0) {
            chosenCoins.put(currentCoinValue, numberofCoinsToTake);
            currentSum = currentSum + numberofCoinsToTake*currentCoinValue;
        }
        coinIndex++;
    }
    return chosenCoins;
  }
  public static int getIndex(int[] arr, int key) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (key < arr[mid]) {
            end = mid - 1;
        } else if (key > arr[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
  }
}