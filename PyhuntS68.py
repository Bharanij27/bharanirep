n=int(input())
m=list(map(int,input().split()))
print(min(m))
print(m.index(min(m))+1,end=" ")
print(m.index(max(m))+1)
