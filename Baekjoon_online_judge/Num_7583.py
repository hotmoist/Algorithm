def change_middle (s) :
    s_list = list(s)
    s_list.reverse()
    if(len(s_list) > 1):
        print(s_list[len(s_list) -1], end = '')
        for i in range(1, len(s_list)-1):
            print(s_list[i], end='')
    print(s_list[0], end = ' ')

while True :
    s_list = input().split(" ")

    if( s_list[0] == "#" and len(s_list) == 1):
        break

    for i in s_list :
        change_middle(i)

    print()

