public class Nambiyar {
	  public static void main(String[] args) {
		    String input1="9860857152";
		    String x[]=(input1.split(""));
				int a[]=new int[input1.length()];
				int b[]=new int[5];
				int j=0;
				while(j<x.length){
					a[j]=Integer.parseInt(x[j]);
					j++;
				}
				int i=0;
				int k=0;
				while(i<a.length){
		      if (i==9){ b[k]=a[i];}
					else if (a[i]%2!=0)
					{
						b[k]=b[k]+a[i];
						while(b[k]%2!=0 && i<a.length){
							int w=i+1;
						if (w<a.length)
						{
							i++;
							b[k]=b[k]+a[i];
						} 
						else{ break;}
						}
		        System.out.println(i);
					}
					else{
		        b[k]=b[k]+a[i];
		        while(b[k]%2==0 && i<a.length){
							int w=i+1;
						if (w<a.length)
						{
							i++;
							b[k]=b[k]+a[i];
						} 
						else{ break;}
						}
		        System.out.println(i);	
					}
				k++;
				i++;
				}
				int p=0;
					String res="";
					while (p!=k){ res=res.concat(Integer.toString(b[p]));
					p++;}
					System.out.println(Integer.parseInt(res));		
		  }
}
