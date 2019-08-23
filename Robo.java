class Robo{
public static void main(String args[0]){
	int input1=3;//3 3 2-2-E  R M L M L M
        int input2=3;
        String input3="2-2-E";
        String input4="R M L M L M";
	String a[]=input3.split("-");
		int init1=Integer.parseInt(a[0]);
		init1=init1-input1;
		int init2=Integer.parseInt(a[1]);
		init2=init2-input2;
		String mm=a[2];
		char d=mm.charAt(0);
		input4=input4.replaceAll(" ","");
		char dir[]=input4.toCharArray();
		int i=0;
		char ax=' ';
		char ay=' ';
		if(dir[i]=='M'){
			if(d=='N'){ay='d';}
			else if(d=='S'){ay='i';}
			else if(d=='E'){ax='i';}
			else {ax='d';}
		}
		while (i<input4.length())
		{  	
			if (dir[i]!='M'){
			if ((d=='E' && dir[i]=='R') || (d=='W' && dir[i]=='L')) {
				d='S';
				ay='i';}
			else if((d=='E' &&(dir[i])=='L') || (d=='W' && dir[i]=='R')){ 
				d='N';
				ay='d';}
			else if ((d=='N' && dir[i]=='R') || (d=='S' && dir[i]=='L')) {
				d='E';
				ax='i';}
			else { 
				d='W';
				ax='d';}
		}
		else
		{
			if(ax=='d' &&(init1>0 ||init1<input2)){ init1--;}
			else if(ax=='i' &&(init1>-1 ||init2<input2)){ init1++;}
			else if(ay=='i' &&(init2>-1 ||init2<input1)){ init2++;}
			else{ 
				if(ay=='d' &&(init2>0 ||init2<input1)){init2--;}}
		}
		i++;
		}
		init1=init1;
		init2=init2;
		String res="";
		res=res+Integer.toString(init1)+"-"+Integer.toString(init2)+"-"+Character.toString(d);
		System.out.println(res);// 3-2-N
}
}
