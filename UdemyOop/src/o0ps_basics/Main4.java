package o0ps_basics;

import java.util.Scanner;

class SearchUtil{
	public int search(int[] arr,int ele)
	{
		return search(arr,ele,0);
	}
	public int search(int []arr, int ele, int pos) {
		for(int i=0;i<arr.length;i++)
		{
			if(ele==arr[i])
				return i;
		}
		return -1;
	}
	
}
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SearchUtil obj1 =new SearchUtil();
		int[] array = {45,899,245,928,9,12};
		int elem = sc.nextInt();
		System.out.println(obj1.search(array, elem));
		System.out.println(obj1.search(array, elem,3));
		
		

	}

}
