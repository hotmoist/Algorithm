s_input = input().split(" ")

n = int(s_input[0])
m = int(s_input[1])

for i in range (1, n+1):
    k = (i-1)*m+1
    for j in range(k, k+m):
        if j == k+m-1 :
            print(j)
        else :
            print(j, end = ' ')
