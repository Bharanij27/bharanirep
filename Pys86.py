n=int(input())
s=0
for i in range(2,n):
    if n%i==0:
        s=1
if s==0:
    print("no")
else: print("yes")