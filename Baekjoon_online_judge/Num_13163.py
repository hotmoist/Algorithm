testCase = int(input())

for i in range(0, testCase):
    s_list = input().split(" ")
    name = "god"
    for j in range(1, len(s_list)):
        name += s_list[j]

    print(name)
