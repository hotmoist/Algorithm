testCase = int(input())

for i in range(0, testCase):
    answer = 0
    num_list = list(map(int, input().split()))
    for j in num_list :
        answer += j

    print(answer)
