package variousConcepts;

public class GitTest4 {

	public static void main(String[] args){
		System.out.println(middleTwo("mother"));

	}
	
	public static String middleTwo(String str) {
		if (str.length()%2==0){
			int mid = str.length()/2;
			return str.substring(mid-1, mid+1);
		}
		return "";
	}

}