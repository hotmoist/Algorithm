import sys

if __name__ == '__main__':
    t = int(sys.stdin.readline())

    triangle = [n*(n+1)//2 for n in range(1, 46)]
    check = [0] * 1001

    for i in triangle:
        for j in triangle:
            for k in triangle:
                if i+j+k <= 1000:
                    check[i+j+k] = 1

    for _ in range(t):
        print(check[int(sys.stdin.readline())])
