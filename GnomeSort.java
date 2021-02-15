package colocarr;

public class GnomeSort {
	public GnomeSort() {
		
	}
	public int[] compareTo(int[] list){
		int i = 1;
        int n = list.length;
        while (i < n) {
            if (i == 0 || list[i - 1] <= list[i]) {
                i++;
            } else {
                int t = list[i];
                list[i] = list[i - 1];
                list[--i] = t;
            }
        }
        return list;
    }

}
