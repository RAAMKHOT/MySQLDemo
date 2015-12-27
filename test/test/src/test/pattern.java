package test;

public class pattern {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==0||(i==j)||(i+j)==n){

					System.out.print("0");
				}
				else
				{
					System.out.print("Invalid pattern");
				}
			}
		}

	}

}
