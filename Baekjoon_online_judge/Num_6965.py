def change (s):
    if len(s) == 4 :
        print("****", end = ' ')
    else :
        print(s, end = ' ')

test = int(input())

for i in range(0, test):
    s_list = input().split(" ")
    for j in s_list:
        change(j)
    print()
    print()
