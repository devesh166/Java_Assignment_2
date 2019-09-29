public class Panagram {

	public static void main(String[] args) {
		String input= "The quick brown fox jumps over the lazy dog";
		//removing whitespace and converting to lowercase
		input=input.toLowerCase().replace(" ", ""); 
		int alphabet[]= new int[26];
		//incrementing the index of alphabet array according 
		//to the character e.g for 'a' alphabet[0]=1
		for(int i=0;i<input.length();i++) {
			alphabet[input.charAt(i)-97]++;
		}
		//checking if alphabet array contains 0
		for(int i=0;i<26;i++) {
			if(alphabet[i]==0) {
				System.out.println("Not a panagram");
				return;
			}
		}
		System.out.println("its a panagram");
		return;
	}

}
