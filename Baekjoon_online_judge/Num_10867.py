test = int(input())

s_list = input().split(" ")

int_list = []

for i in s_list:
    if int_list.__contains__(int(i)):
        continue
    else :
        int_list.append(int(i))

int_list.sort()

for i in int_list:
    print(i, end =' ')
