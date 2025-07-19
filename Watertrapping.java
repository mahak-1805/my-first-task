public class Watertrapping {
    public static void main(String[]args){
        int []height ={0,1,0,2,1,0,1,3,2,1,2,1};
        int n = height.length;
        int[]leftMax = new int[n];
        int[]rightMax = new int [n];
        int[]waterAtEachIndex= new int[n];

        //Fill leftMax
        leftMax[0]=height[0];
        for(int i = 1; i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        //Fill rightMax
        rightMax[n-1]=height[n-1];
        for(int i = n -2; i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);

     }
     int totalWater=0;
     int affectedBlocks=0;
     for (int i = 0;i<n; i++){
        int water = Math.min(leftMax[i],rightMax[i])-height[i];
        if(water>0){
            waterAtEachIndex[i]=water;
            affectedBlocks++;
            totalWater+=water;
        }
     }
     System.out.println("Water trapped at each index:");
     for (int i = 0; i < n; i++) {
        System.out.print(waterAtEachIndex[i]+" ");
    }
    System.out.println("\nToatl water trapped: "+totalWater);
    System.out.println("total affected blocks: "+affectedBlocks);
}
     }
    


    
    

