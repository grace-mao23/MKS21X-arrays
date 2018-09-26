public class ArrayDemo{
  // first function - print out 1D array
  public static void printArray(int[]ary){
    System.out.print("[ ");
    for (int i = 0; i < ary.length - 1; i++) {
      System.out.print(ary[i] + ", ");
    }
    System.out.print(ary[ary.length - 1] + " ]");
  }
  // second function - print out 2D array
  public static void printArray(int[][]ary){
    System.out.print("[ ");
    for (int r = 0; r < ary.length - 1; r++) {
      for (int i = 0; i < ary[r].length - 1; i++) {
        System.out.print(ary[r][i] + ", ");
      }
      System.out.print(ary[r][(ary[r].length - 1)] + ",\n  ");
    }
    int last = ary.length - 1;
    for (int l = 0; l < ary[last].length - 1; l++) {
      System.out.print(ary[last][l] + ", ");
    }
    System.out.print(ary[last][ary[last].length - 1]);
    System.out.print(" ]");
  }
  // third function - count 0s in 2D array
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int x = 0; x < nums[i].length; x++) {
        if (nums[i][x] == 0) {
          count++;
        }
      }
    }
    return count;
  }
  // fourth function - modify 2D array with 1s and 3s
  public static void fill2D(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
      for (int x = 0; x < vals[i].length; x++) {
        if (i == x) {
          vals[i][x] = 3;
        } else {
          vals[i][x] = 1;
        }
      }
    }
    printArray(vals);
  }
  // fifth function - make new array with 1s and 3s
  public static int[][] fill2DCopy(int[][] vals){
    int[][] newA = new int[vals.length][];
    for (int rows = 0; rows < vals.length; rows++) {
      newA[rows] = new int[vals[rows].length];
    }
    for (int i = 0; i < vals.length; i++) {
      for (int x = 0; x < vals[i].length; x++) {
        if (vals[i][x] < 0) {
          newA[i][x] = 3;
        } else {
          newA[i][x] = 1;
        }
      }
    }
    return newA;
  }

  public static void main(String[] args){
    int[] testA = {
      2, 3, 5, 7, 11, 13, 17, 19, 23
    };
    printArray(testA);
    int[][] testB = {
      {2, 0, -6, 8, -10},
      {-1, 3, 0, 7},
      {11, 0, 17, 0},
      {-30, 300},
    };
    System.out.println("\n-----------");
    printArray(testB);
    System.out.println("\n-----------");
    System.out.println(countZeros2D(testB)); // 4
    System.out.println("------------");
    int[][] testC = new int[4][5];
    fill2D(testC);
    System.out.println("\n------------");
    printArray(fill2DCopy(testB));
  }
}
