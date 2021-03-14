package TwoSum;
public class Test {

	public static void main(String[] args) {
		TwoSum3 ts=new TwoSum3();
		int[] array = new int[]{3,7,11,15};
		int[] indices = ts.twoSum(array, 26);
		if(indices!=null){
			System.out.println(indices[0]+"    "+indices[1]);
		}
	}

}
