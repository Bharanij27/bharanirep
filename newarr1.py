n=int(input())
l=list(map(int,input().split()))
s=0
for i in range(n-1):
    s=s+max(l[i:i+2])
print(s)
