String a[] = new String[5];
a[0] = Integer.toString(input1);
a[1] = Integer.toString(input2);
a[2] = Integer.toString(input3);
a[3] = Integer.toString(input4);
a[4] = Integer.toString(input5);
int stable = 0,unstable = 0;
List<Character> li = new ArrayList<Character>();
Set<Integer> si = new HashSet<Integer>();
for(String s : a)
{
	for(int i=0;i<s.length();i++)
	{
		li.add(s.charAt(i));
	}
	for(Character j : li)
	{
		si.add(Collections.frequency(li, j));
	}
	if(si.size()==1)
	{
		stable += Integer.parseInt(s);
	}
	else
	{
		unstable += Integer.parseInt(s);
	}
	li.clear();
	si.clear();
}
return(stable-unstable);
