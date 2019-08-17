import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String str="";
    int r=0;
    Scanner s=new Scanner(System.in);
    String input1=s.nextLine();
	String in=input1.toLowerCase();
	   String a[]=in.split(" ");
	   for(int i=0;i<a.length;i++){
		   int sum=0;
		   char c[]=a[i].toCharArray();
       if (c.length%2!=0){r=c.length/2;}
       else{r=c.length/2-1;}
		   for(int j=0;j<=r;j++){
			   char q=c[j];
			   if((c.length%2!=0) && (j==(c.length/2))){
				   sum=sum+(((int)q)-96);
			   }
			   else{
				   char w=c[c.length-1-j];
				   sum=sum+Math.abs((((int)q)-96)-(((int)w)-96));
			   }
		   }
		   String ss=Integer.toString(sum);
		   str=str.concat(ss);
	   }
	   int ans=Integer.parseInt(str);
	   System.out.println(ans);
	}
  }
