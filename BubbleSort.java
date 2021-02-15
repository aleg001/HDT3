package colocarr;

public class BubbleSort {
	public BubbleSort() {
		
	}
	
	public int[] compareTo(int[] list)
    { 
      int n = list.length; 
      int temp=0;
      for (int i = 0; i < n; i++) 
          for (int j = 1; j < (n-i); j++) 
              if (list[j-1] >list[j] )  
              { 
                  // cambia arr[j+1] con arr[j] 
                  temp = list[j-1]; 
                  list[j-1] = list[j]; 
                  list[j] = temp; 
              }
        return list;
  }
}
