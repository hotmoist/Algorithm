test = int(input())

for i in range(0,test):
    s_list = input().split(" ")
    for  j in range (2, len(s_list) + 2):
        if j > len(s_list)-1 :
            j = j % len(s_list)
        print(s_list[j], end = ' ')
    print()
