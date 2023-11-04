public class multiArray {
    public static void main(String[] args) {
        
        int[][]multidimentional = {{2,3,4,5,5},{2,7,3,4,5}};
        System.err.println(multidimentional[0][0]);

        // iterate by loop 
        for(int i=0; i< multidimentional.length; i++){
        
            for(int j=0; j<multidimentional[i].length;j++){

                System.err.println(multidimentional[i][j]);
            }
        }
    }
}