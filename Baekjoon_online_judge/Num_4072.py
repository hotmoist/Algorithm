
while True:
    s_list = input().split(" ")

    if len(s_list) == 1 and s_list[0] == "#":
        break

    for i in s_list:
        print(i[::-1], end = ' ')

    print()
