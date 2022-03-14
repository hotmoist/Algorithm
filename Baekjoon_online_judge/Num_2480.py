import sys
from collections import Counter
from operator import itemgetter

if __name__ == '__main__':
    input = sys.stdin.readline().rstrip('\n').split(' ')
    counted = sorted(Counter(input).items(), key=itemgetter(1))
    max_key = counted[-1][0]
    max_val = counted[-1][1]

    if max_val == 1:
        input.sort(reverse=True)

    if max_val == 3:
        print(10000 + (int(max_key) * 1000))
    elif max_val == 2:
        print(1000 + (int(max_key) * 100))
    else:
        print(int(input[0]) * 100)
