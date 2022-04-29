import sys

if __name__ == '__main__':
    input = sys.stdin.readline().strip('\n').split(' ')
    money = int(input[0]) // int(input[1])
    left = int(input[0]) % int(input[1])

    print(money)
    print(left, end='')
