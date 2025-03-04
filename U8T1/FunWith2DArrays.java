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
}
