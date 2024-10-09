package First;

public class Ovalspresentornot {

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
		if(ovals>=1)
		{
			System.out.println(+ovals+ "- number of ovals present");
		}
		
	}

}

