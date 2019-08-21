n=int(input())
l=list(map(int,input().split()))
l=sorted(l)
k=0
s=1
for i in range(n):
    k=max(k,s)
    s=1
    for j in range(i,n):
        if j==0: pass
        elif abs(l[j]-l[j-1])==1: s=s+1
        else: break
print(k)
