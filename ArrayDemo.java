public class ArrayDemo{
  public static void main(String[] args) {
    //Testing 0a.
    int[] test0a = new int[] {1,2,3,4};
    System.out.println("test0a :");
    printArray(test0a);
    System.out.print("\n");

    //Testing 0b.
    System.out.println("test0b :");
    int[][] test0b = new int[][] {{1,2,3},{4,5,6}};
    printArray(test0b);
    System.out.print("\n\n");

    //Testing 1.
    System.out.println("test1 :");
    int[][] test1 = new int[][] {{1,0,3},{4,0,6}};
    System.out.print(countZeros2D(test1));
    System.out.print("\nexpecting 2\n\n");

    //Testing 2a.
    System.out.println("test2a :");
    int[][] test2a = new int[][] {{5,6,7},{8,9,10}};
    fill2D(test2a);
    System.out.print("\nexpecting {{3,1,1},{1,3,1}\n\n");

    //Testing 2b.
    System.out.println("test2b :");
    int[][] test2b = new int[][] {{5,6,7},{8,9,10,11}};
    fill2D(fill2DCopy(test2b));
    System.out.print("\nexpecting {{3,1,1},{1,3,1,1}\n\n");
  }

  //0a. Make a function to print a 1D array of ints.
  public static void printArray(int[]ary){
    System.out.print("[");
    for (int i=0; i < ary.length; i++) {
      if (i == ary.length-1) {
        System.out.print(ary[i] + "] \n");
      }
      else {
      System.out.print(ary[i] + ", ");
      }
    }
  }

  //0b. Make a function to print a 2d array of ints.
  public static void printArray(int[][]ary){
    System.out.print("[\n");
    for (int x=0; x < ary.length; x++) {
      System.out.print("[");
      for (int y=0; y < ary[x].length; y++) {
        if (y == ary[x].length-1) {
          System.out.print(ary[x][y] + "] \n");
        }
        else {
        System.out.print(ary[x][y] + ", ");
        }
      }
    }
    System.out.print("]");
  }

  //1. Calculate and return how many zeros are in the parameter
  public static int countZeros2D(int[][] nums){
    int ans = 0;
    for (int x=0; x < nums.length; x++) {
      for (int y=0; y < nums[x].length; y++) {
        if (nums[x][y] == 0) {
          ans++;
        }
      }
    }
    return ans;
  }

  //2a. Modify a given 2D array of integer as follows:
  //Fill the of integers with 1's
  //EXCEPT when the row number is the same as the column number:
  //you must fill those with 3's instead.
  public static void fill2D(int[][] vals){
    for (int x=0; x < vals.length; x++) {
      for (int y=0; y < vals[x].length; y++) {
        if (x == y) {
          vals[x][y] = 3;
        }
        else {
          vals[x][y] = 1;
        }
      }
    }
    printArray(vals);
  }

  //2b. Make a new 2d array the same dimensions as the given parameter.
  //Fill that array with with 1's, except where the value of the original array is negative:
  //you must fill those with 3's instead.
  //You may NOT modify the parameter vals.
  public static int[][] fill2DCopy(int[][] vals){
    int[][] copy = new int[vals.length][];
    for (int x=0; x < copy.length; x++) {
      copy[x] = new int[vals[x].length];
    }
    return copy;
  }

}
