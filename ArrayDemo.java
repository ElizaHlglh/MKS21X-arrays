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
    System.out.print("\n");
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
}
