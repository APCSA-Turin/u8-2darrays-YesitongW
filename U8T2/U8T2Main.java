public class U8T2Main {
    public static void main(String[] args) {

/* --- PROBLEM 1 --- */
System.out.println("PROBLEM 1:");
int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

System.out.println("---------");
// write code below that uses nested ENHANCED for loops
// to print each element in nums in ROW-MAJOR order again;
// print all the numbers in a row on the same line
// with a space in between

// write code here
        for(int[] row : nums){
            for(int elements : row){
                System.out.print(elements + " ");
            }
            System.out.println();
        }
// now, write code below that uses nested INDEX-BASED for loops
// to print each element in nums in ROW-MAJOR order;
// print all the numbers in a row on the same line
// with a space in between
System.out.println("---------");
// write code here
        for (int row = 0; row < nums.length; row++){
            for (int elements = 0; elements < nums[0].length; elements++){
                System.out.print(nums[row][elements] + " ");
            }
            System.out.println();
        }
// finally, write code below that uses nested for loops
// to print each element in nums in COLUMN-MAJOR order;
// print all the numbers in a COLUMN on the same line
// with a space in between
System.out.println("---------");
// write code here
for (int elements = 0; elements < nums[0].length; elements++){
    for (int row = 0; row < nums.length; row++){
        System.out.print(nums[row][elements] + " ");
    }
    System.out.println();
}

System.out.println("---------");

// TEST CODE FOR average
int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
System.out.println(FunWith2DArrays.average(testArr1));
int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
System.out.println(FunWith2DArrays.average(testArr2));
int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
System.out.println(FunWith2DArrays.average(testArr3));
int[][] testArr4 = {{4}, {7}, {8}, {2}};
System.out.println(FunWith2DArrays.average(testArr4));
int[][] testArr5 = {{4}};
System.out.println(FunWith2DArrays.average(testArr5));

/* --- PROBLEM 2 --- */
System.out.println("---------");
System.out.println("PROBLEM 2:");

String[][] animals = {
        {"anteater", "bird"},
        {"camel", "dog"},
        {"elephant", "giraffe"},
        {"hyena", "jackal"}
};
// write code below using a nested loop to update each element
// in animals to its plural form, e.g. bird --> birds;
// (no printing yet)

// write code here
// next, write code below to print out the 2D
// array in column-major order, showing each
// animal in inside a bracketed "enclosure"
// using "|" (like fences separating animal pens
// in a zoo)

// write code here




    }
}