class JavaActivity1{
    public static void main(String [] args){
        System.out.println(squareMethod(3));
        int [][] arr1 = {};

        displayArray(arr1);
    }

    public static double squareMethod(int num){
        return num * num;
    }

    static void displayArray(int [][] arr){
        System.out.println(arr.length);
        if(arr == null || arr.length == 0){
            System.out.println("Array cannot be empty");
        }
        for (int a = 0; a < arr.length; a++){
            System.out.print("At least I entered here");
            for (int b = 0; b < arr.length; b++){

                System.out.print("At least I entered here");
                System.out.print(arr[a][b] + " ");
//                System.out.print("");

            }
            System.out.println("");
        }

    }
}