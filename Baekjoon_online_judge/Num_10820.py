while True:
    try:
        s_input = input()
        s_list = list(s_input)
        s_upper = 0
        s_lower = 0
        s_blank = 0
        s_number = 0

        for i in s_list:
            if i == " ":
                s_blank += 1
            elif ord(i) >= 48 and ord(i) <= 57:
                s_number += 1
            elif i.isupper():
                s_upper += 1
            else:
                s_lower += 1

        print(str(s_lower) + ' ' + str(s_upper) + ' ' + str(s_number) + ' ' + str(s_blank))
    except :
        break
