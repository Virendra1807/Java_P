public class MaxWorth {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {1,5,2}, {5,5}, {10}};

        System.out.println("Maximum Worth is : " + maximumSum(arr));
    }

    public static int maximumSum(int [][] array){
        int max = Integer.MIN_VALUE;
        for(int row=0; row<array.length; row++){
            int sum=0;
            for(int col=0; col<array[row].length; col++){
                sum = sum + array[row][col];
            }
            if(sum > max){
                max=sum;
            }
        }

        return max;
    }

    
}
