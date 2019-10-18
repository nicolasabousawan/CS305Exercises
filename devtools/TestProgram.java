public class TestProgram {
  
  public static void main(String[] args) {
    // array to sum
    int[] numbers = new int[]{ 1, 2, 3, 4, 5};

    int sum = 0;

    for (int i=0; i < numbers.length ; i++) {
      sum = sum + numbers[i];
    }

    System.out.println("Sum value of array elements is : " + sum);
  }

}