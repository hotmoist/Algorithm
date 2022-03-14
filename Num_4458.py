t = int(input())

for i in range(0, t) :
    str_list = list(input())
    str_list[0] = str_list[0].upper()

    for j in str_list :
        print(j, end = "")

    print()
