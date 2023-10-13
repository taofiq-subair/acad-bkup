class NestedLoop{
    public static void main(String[] args) {
//        for(int x = 1; x <= 3; x++){
//            for(int y = 1; y <=3; y++){
//                System.out.println(x + " " + y);
//            }
//        }

        // Printing a star tree

        for (int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++ ){
                System.out.print("+ ");

            }
            System.out.println();

        }

        System.out.println();

        // Descending star tree
/*            int a = 5;
        for(int i=a; i<=a; a++){
            for(int b =a; b >= 0; b--){
                System.out.print("* ");
            }
            System.out.println();
        }*/
//        for(;;){
//            System.out.println("+");
//        }

//        int s = 8;
//        do{
//            System.out.println(s);
//            s++;
//        } while(s<=10);

//        int[] a = {33,4,66,1,55};

//        for(int i =0; i < a.length; i++){
//            System.out.println(a[i]);
//        }

/*        for(int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {
                int buff = 0;
                if(a[i] > a [j]){
                    buff = a[i];
                    a[i]=a[j];
                    a[j]=buff;
                }
            }
            System.out.print(a[i] + ", ");
        }
        Class c =  a.getClass();

        System.out.println();*/

    }
}