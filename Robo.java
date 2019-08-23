class Robo{
public static void main(String args[0]){
String a[]=input3.split("-");
		int init1=Integer.parseInt(a[0]);
		int init2=Integer.parseInt(a[1]);
		String mm=a[2];
		char d=mm.charAt(0);
		input4=input4.replaceAll(" ","");
		char dir[]=input4.toCharArray();
		int i=0;
		while (i!=input4.length())
		{  	char ax=' ';
			char ay=' ';
			if (dir[i]!='M'){
			if ((d=='E' && dir[i]=='R') || (d=='W' && dir[i]=='L')) {
				d='S';
				ax='d';}
			else if((d=='E' &&(dir[i])=='L') || (d=='W' && dir[i]=='R')){ 
				d='N';
				ax='i';}
			else if ((d=='N' && dir[i]=='R') || (d=='S' && dir[i]=='L')) {
				d='E';
				ay='i';}
			else { 
				d='W';
				ay='d';}
		}
		else
		{
			if(ax=='d' &&(init2>0 ||init2<input2)){ init2--;}
			else if(ax=='i' &&(init2>-1 ||init2<input2-1)){ init2++;}
			else if(ay=='i' &&(init1>-1 ||init1<input1-1)){ init1++;}
			else{ init1--;}
		}
		i++;
		}
		init1=input1-init1-1;
		init2=input2-init2-1;
		String res="";
		res=res+Integer.toString(init1)+"-"+Integer.toString(init2)+"-"+Character.toString(d);
		return (res);
}
}
