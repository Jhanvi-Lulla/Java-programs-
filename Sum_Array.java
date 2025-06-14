package loop;

public class Sum_Array {
    public static void main(String[] args) {
        int[] score={2,58,8,7,59,7,4,1,2,5,8,9,6,2,8,7,6,3,78};
        int sum=0;
        for(int i=0; i<score.length; i++){
            System.out.println(" element: "+score[i] );
            sum=sum+score[i];
            // System.out.println("sum : "+sum );
        }System.out.println("sum : "+sum );

    }
    
}
