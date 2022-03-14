inputArr = input().split()

a = int(inputArr[0])
b = int(inputArr[1])

result = a+b

for i in range(1, result+1) :
    if ( result % i == 0):
        j = (int)(result / i)

        if((i-2) * (j-2) == b):
            print(max(i, j), min(i, j))
            break
