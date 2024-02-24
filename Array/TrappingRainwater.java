import java.util.*;

class TrappingRainwater{
    public static int trappingRainwaterAlgorithm(int heights[]){
        int n = heights.length;
        
        // Calculate the leftMaxBoundary
        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0] = heights[0];

        for(int i=1;i<n;i++){
            leftMaxBoundary[i] = Math.max(heights[i], leftMaxBoundary[i-1]);
            System.out.println("leftMaxBoundary for "+i+ "th element between " +heights[i] +" & "+ leftMaxBoundary[i-1]+ " is "+leftMaxBoundary[i]);
        }
        
        // Calculate the rightMaxBoundary
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n-1] = heights[n-1];
        
        for(int i=n-2;i>=0;i--){
            rightMaxBoundary[i] = Math.max(heights[i], rightMaxBoundary[i+1]);
            System.out.println("rightMaxBoundary for "+i+ "th element between " +heights[i] +" & "+ rightMaxBoundary[i+1]+ " is "+rightMaxBoundary[i]);
            
        }
        
        
        // waterLevel = min(leftMaxBoundary, rightMaxBoundary) 
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            // trappedWater = WaterHeight - barHeight
             trappedWater += waterLevel - heights[i];
             System.out.println("Trapped water is "+trappedWater);
            
        }
        return trappedWater;
    }
    
    
    public static void main(String args[]){
        int heights[] = {4,2,0,6,3,2,5};
        
        
        System.out.println("The trapped water is "+trappingRainwaterAlgorithm(heights));
        
    }
}
