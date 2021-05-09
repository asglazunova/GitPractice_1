package SaimsTasks;



class Practice {
    public static void main(String[] args) {

        // your code
        // ----------------------------

        int year = 1;
        int growth = 1;
        int treeSize = 1 ;

        for( int i = 1 ; i <= 10; i ++ ){
            System.out.println ( "year " + year +" - growth "+ growth +" cm"+"\n"+"tree size: " +treeSize+"cm"  );

            year++;

            if (year <= 3){
                treeSize++;
                growth =1;
            } else if (year > 4) {
                treeSize+=2;
                growth =2;
            }
        }
    }
}