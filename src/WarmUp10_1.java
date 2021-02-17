/* WarmUp 10_1
 * Create an integer array of size 4, placing any 4 numbers
 * you want into the array. Print out the array so that it
 * looks like [1,5,7,3]. Then increase each element of the 
 * array by 1 and re-print, [2,6,8,4]
 */

public class WarmUp10_1 {

	public static void main(String[] args) {
		int[] array = {1,5,7,3};
		String list = "[";
		String list2 = "[";
		for (int x = 0; x < array.length; x += 1) {

			if (x != array.length -1) {
				list += array[x] + ", ";
			} else {
				list += array[x];
			}
		}
		list += "]";
		System.out.println(list);
		for (int x = 0; x < array.length; x += 1) {
			array[x] += 1;
		}
		for (int x = 0; x < array.length; x += 1) {

			if (x != array.length -1) {
				list2 += array[x] + ", ";
			} else {
				list2 += array[x];
			}
		}
		list2 += "]";
		System.out.println(list2);
	}
}
