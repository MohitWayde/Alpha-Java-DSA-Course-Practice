import java.util.*;
public class binarySearch
{
    public static int binarySearch(int numbers[], int key)
    {   
        int start = 0;
        int end = numbers.length -1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(numbers[mid] > key)
            {
                end  = mid-1;
            }
            else if(numbers[mid] < key)
            {
                start = mid + 1;
            }
            else if(numbers[mid] == key)
            {
                return mid;
            }
            
            
            
        }
            return -1;
    }
      
	public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,14};
        int key = 10;
        int indexResult = binarySearch(numbers, key);
        System.out.println("The key is on index "+indexResult);
    
	}
}