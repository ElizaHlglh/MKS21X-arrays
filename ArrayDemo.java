public class ArrayDemo{
  public static void main(String[] args) {
    //Testing 0a.
    int[] test0a = new int[] {1,2,3,4};
    printArray(test0a);
  }
  //0a. Make a function to print a 1D array of ints.
  public static void printArray(int[]ary){
    System.out.print("testing 0a : [");
    for (int i=0; i < ary.length; i++) {
      if (i == ary.length-1) {
        System.out.print(ary[i] + "] \n");
      }
      else {
      System.out.print(ary[i] + ", ");
      }
    }
  }
}
