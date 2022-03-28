import sys

if __name__ == '__main__' :
    A_size = sys.stdin.readline().rstrip('\n')                     
    A = sys.stdin.readline().rstrip('\n').split(' ')
    A = [int(numeric_string) for numeric_string in A]
    sorted_A = [int(e) for e in A]
    sorted_A.sort()

    P = []
    for e in A:
        index = sorted_A.index(e)
        P.append(index)
        sorted_A[index] = -1

    for e in P:
        print(e, end= ' ')

