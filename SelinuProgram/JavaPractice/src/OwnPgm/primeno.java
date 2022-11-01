package OwnPgm;

public class primeno {
      public static void main(String args[])
      {
    	  int i,j,temp=0;
    	  int n=100;
    	  for(i=1;i<=n;i++)
    	  {
    		  for(j=2;j<=i-1;j++)
    		  {
    		  if(i%j==0)
    		  {
    		  temp=temp+1;
    		  }
    	  }
    	  if(temp==0)
    	  {
    		  System.out.println(" Prime no are "+i);
    	  }
    	  else {
    		  temp=0;
    	  }
      }
}
}
