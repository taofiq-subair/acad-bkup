class LabelledBreakStatement{
    public static void main(String[] args){
//        int j,k;

        // Labelling the outermost loop as outerMost
//        outerMost:
//        for (j=1; j<5; j++){
//
//            innerMost:
//            for (k=1; k<3; k++){
//                System.out.println("j = " + j + " and k =" + k);
//
//                if (j == 3)
//                    break outerMost;
//
//            }
//        }

        // Declare variables

        int x = 1;
        int y = 10;

        // Using continue in do while loop
        do{
            if (x == y/2){
                x++;
                continue; // The continue statement skips the remaining statement
            }
            System.out.println(x);
            x++;

        } while (x <= y);
    }


}