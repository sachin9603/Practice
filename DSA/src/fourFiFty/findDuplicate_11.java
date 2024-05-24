package fourFiFty;

public class findDuplicate_11 {
	
	public static int findDuplicate(int[] arr) {
        int n=arr.length,i=0;
        
       while(i<n){
           if(arr[i]==i)
           {
               i++;
           }else{
               if(arr[i]==arr[arr[i]]){
                   return arr[i];
               }
               int temp=arr[i];
               arr[i]=arr[temp];
               arr[temp]=temp;
           }
       }
        return -1;
    
   
   }
	
public static void main(String[] args) {
	
	int[] arr = {1,4,3,2,2} ; 
	int ans  = findDuplicate(arr) ;
	System.out.println(ans);
			
	}
	
	
	

	

}
