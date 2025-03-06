import java.util.*;
public class FunWith2DArrays {
    public static int totalElements(int[][] numArray){
        int totalNum = 0;
        totalNum = numArray.length * numArray[0].length;
        return totalNum;
    }

    public static void fourCorners(String[][] StringArray){
        int numRows = StringArray.length;
        int numColumns = StringArray[0].length;

        System.out.println(StringArray[0][0]);
        System.out.println(StringArray[0][numColumns-1]);
        System.out.println(StringArray[numRows-1][0]);
        System.out.println(StringArray[numRows-1][numColumns-1]);
    }

    public static void swapFrontAndBackRows (String[][] StringArray){
        String[] temp = StringArray[0];
        int numRows = StringArray.length;
        String[] lastRow = StringArray[numRows - 1];
        StringArray[0]= lastRow;
        StringArray[numRows -1] = temp;
    }

    public static double average(int[][] numArr){
        double sum = 0.0;
        int numRows = numArr.length;
        int numColumns = numArr[0].length;
        int totalItem = numRows * numColumns;
            for (int[] row : numArr){
                for(int col : row){
                    sum += col;
                }
            }
        return sum/totalItem;
    }

    public static int edgeSum(int[][] numArr){
        int sum = 0;
        
        int numRows = numArr.length;
        int[] firstRow = numArr[0];
            for(int num : firstRow){
                sum +=num;
            }
        
            int[] lastRow = numArr[0];
            for(int num : lastRow){
                sum +=num;
            }

            for (int i =1; i< numArr.length - 1; i++){
                sum += numArr[i][0];

                int col = numArr[0].length;
                sum += numArr[i][col - 1];
            }
            return sum;
        }

        public static int[] indexFound (String[][] StringArr, String target){
            int[] foundInd = new int[2];

            for (int col = 0; col < StringArr[0].length; col++){
                for (int row = 0; row < StringArr.length; row++){
                   String element = StringArr[row][col];
                   if (element.equals(target)){
                    foundInd[0]= row;
                    foundInd[1] = col;
                    return foundInd;
                   }
                }
            }
            foundInd[0]=-1;
            foundInd[1]=-1;
            return foundInd;
        }

        public static int[][] split(int[][] arr, int rowNum, int colNum) {
            if (rowNum >= arr.length || colNum >= arr[0].length) {
                return new int[0][0];
            }
        
            int[][] splitArr = new int[rowNum + 1][colNum + 1];
        
            for (int row = 0; row <= rowNum; row++) {
                for (int col = 0; col <= colNum; col++) {
                    splitArr[row][col] = arr[row][col];
                }
            }
            return splitArr;
        }
        
        public static int[][] invert(int[][] arr){
            int[][] intverted = new int[arr[0].length][arr.length];

            for(int row = 0; row < arr.length; row++){
                for(int col = 0; col < arr[row].length; col++){
                    int num = arr[row][col];
                    intverted[col][row] = num;
                }
            }
            return intverted;
        }

    }
