public class App {
  public static void main(String[] args) throws Exception {
    // Clear console in Windows, Linux and MacOS
    if (System.getProperty("os.name").contains("Windows")) {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } else {
      Runtime.getRuntime().exec("clear");
    }

    int[] numbers = { 3, 6, 8, 1, 4, 9, 0 };
    selectionSort(numbers.clone());
    bubbleSort(0, numbers.clone());
  }

  private static void selectionSort(int[] numbers) {
    boolean continueOrdination = true;
    while (continueOrdination) {
      boolean ordinationPerformed = false;
      for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i + 1] < numbers[i]) {
          ordinationPerformed = true;
          int temp = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = temp;
        }
      }
      continueOrdination = ordinationPerformed;
    }
    showOrdinatedNumbers(numbers, "SELECTION SORT");
  }

  private static void bubbleSort(int currentIndex, int[] numbers) {
    for (int compareIndex = currentIndex + 1; compareIndex < numbers.length; compareIndex++) {
      if (numbers[compareIndex] < numbers[currentIndex]) {
        int temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[compareIndex];
        numbers[compareIndex] = temp;
      }
    }

    if (currentIndex == numbers.length - 1) {
      showOrdinatedNumbers(numbers, "BUBBLE SORT");
      return;
    }

    bubbleSort(currentIndex + 1, numbers);
  }

  private static void showOrdinatedNumbers(int[] numbers, String ordinationType) {
    System.out.print(String.format("- %s: ", ordinationType));
    for (int i = 0; i < numbers.length; i++) {
      String output = String.format("[%s] ", String.valueOf(numbers[i]));
      System.out.print(output);
    }
    System.out.println("\n");
  }
}
