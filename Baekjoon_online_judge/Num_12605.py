testCase = int(input())

for i in range(0, testCase):
    s_list = input().split(" ")
    s_list.reverse()
    answer = "Case #" + str(i+1) + ": "

    for j in s_list:
        answer += j + ' '

    print(answer)
