class Arrays{
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        // primitve method 
        for(int i = 0; i < 4; i ++){
            System.out.println(arr[i]);
        }
        // advanced method

        for(int i : arr){
            System.out.println(i);
        }

    }
}

class TwoDimensionalArray{

    public static void main(String[] args){

        int[][] arr2 = {{1,2,3},{4,5,6}};
    
        for(int i = 0; i < 2; i ++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%d ",arr2[i][j]);
            }
            System.out.println();
        }

        for(int i[] : arr2){
            for(int j : i){
                System.out.println(j);
            }
        }
    }

}

class ThreeDimensionalArray{
    public static void main(String[] args){
        int[][][] arr3 = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};

        for(int i = 0; i < 2; i++){
            for(int j = 0; j< 2; j ++){
                for(int k = 0; k < 3; k++){
                    System.out.println(arr3[i][j][k]);
                }
            }
        }

        for(int i[][]: arr3){
            for(int j[]: i){
                for(int k : j){
                    System.out.println(k);
                }
            }
        }

    }
}