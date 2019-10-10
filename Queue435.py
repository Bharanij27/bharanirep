import math
n,k=map(int,input().split())
l=list(map(int,input().split()))
p=[0 for i in range(n)]
for i in range(k):
    for j in range(n):
        p[j]=p[j]+math.ceil(l[j]/2)
print(max(p))
