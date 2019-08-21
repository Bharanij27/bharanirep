String a[]=new String[5];
		int stable=0;
		int unstable=0;
		a[0]=Integer.toString(input1);
		a[1]=Integer.toString(input2);
		a[2]=Integer.toString(input3);
		a[3]=Integer.toString(input4);
		a[4]=Integer.toString(input5);
		for(String i:a)
		{
			if(isstable(i)==1){
				stable=stable+Integer.parseInt(i);
			}
			else{
				unstable=unstable+Integer.parseInt(i);
			}
		}
	return(Math.abs(stable-unstable));
	}
	public int isstable(String s)
	{
		HashSet<String> h =new HashSet<String>();
		int a=Integer.parseInt(s);
		int count[]=new int[10];
		for(int i=0;i<10;i++) {count[i]=0;}
		while(a!=0){
			int x=a%10;
			count[x]++;
			a=a/10;
		}
		for (int i:count)
		{
			String x=Integer.toString(i);
			h.add(x);
		}
		if (h.size()==2) return 1;
		else return 0;
