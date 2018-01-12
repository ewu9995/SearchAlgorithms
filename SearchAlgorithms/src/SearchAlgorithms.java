
public class SearchAlgorithms {
	
	public static void main (String[] args)
	{
		int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		int[] test2 = {0,4,5,6,12,15,17,23,29};
		
		System.out.println(binSearch(test1, 3)); //2
		System.out.println(linSearch(test1, 3)); //2
		
		System.out.println(binSearch(test2, 23)); //7
		System.out.println(linSearch(test2, 23)); //7
		
		System.out.println(binSearch(test2, 25)); //-1
		System.out.println(linSearch(test2, 25)); //-1
		
		System.out.println(binSearch(test1, 10)); //9
		System.out.println(linSearch(test1, 1)); //0
	
		System.out.println(binSearch(test1, 1)); //0
	}

	private static int linSearch(int[] test1, int i) {
		for(int x=0; x<test1.length;x++) {
			if(test1[x]==i) {
				return x;
			}
		}
		return -1;
	}


	private static int binSearch(int[] test1, int i) {
		int l =0;
		int r = test1.length -1;
		while(l <= r) {
			int mid = l+(r-l)/2;
			if(i>= mid) {
				l =mid+1;
			}
			else if(i <= mid) {
				r = mid-1;
			}
		}
		return -1;
	}
	
	
	
	
}
