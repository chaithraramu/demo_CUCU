package First;

public class CountUpperLower {

	public static void main(String[] args) {


		String s="Welcome To SELENium";
		int u=0;
		int l=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				u++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				l++;
			}
		}
		System.out.println("Upper-"+u+ "  Lower-"+l);
	}

}
