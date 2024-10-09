package First;

public class vowels {

	public static void main(String[] args) {
		String s="WElcome";
		String st=s.toLowerCase();
		int ovals=0;
		for(int i=0;i<s.length();i++)
		{
			if(st.charAt(i)=='a' || st.charAt(i) == 'e' ||  st.charAt(i)=='i' || st.charAt(i) == 'o' || st.charAt(i) == 'u')
			{
				ovals++;
			}
		}
		System.out.println("Ovals "+ovals);

	}

}
