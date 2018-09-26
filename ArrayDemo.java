public class ArrayDemo{
  public static void printArray(int[]ary){
    System.out.print("[ ");
    for (int i = 0; i < ary.length() - 1; i++) {
      System.out.print(ary[i] + ", ");
    }
    System.out.print(ary[ary.length - 1] + " ]")
  }



  public static void main(String[] args){
        int[] testA {
            2, 3, 5, 7, 11, 13, 17, 19, 23
        }
        System.out.println(printArray(testA));
  }
}
