package code401challenges;

public class ArrayShift {
  public static int[] shiftArray(int[] shiftyArr, int addedValue) {
      int lengthOfArray = shiftyArr.length+1;
      int middleOfArray = lengthOfArray / 2;
      int[] returnArray = new int[lengthOfArray];

      for (int i = 0; i < lengthOfArray; i++){
          if (i > middleOfArray) returnArray[i] = shiftyArr[i];
          else if (i == middleOfArray) returnArray[i] = addedValue;
          else returnArray[i] = shiftyArr[i -1];
      }
       return returnArray;
  }
}
//nich paro helped me with this lab