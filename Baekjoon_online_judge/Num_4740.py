stirng = ""
while True:
    string = input()

    if string == "***" :
        break

    s_list = list(string)
    s_list.reverse()
    print(''.join(s_list))
