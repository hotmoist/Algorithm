"""
 * Programmers coding test practice
 * exercise question(math)(level 1)
 * Problem name : 정수 제곱근 판별
"""

def solution(n):
    answer = 0;

    temp = math.sqrt(n)

    if(temp % 1 == 0):
        answer = (temp+1)**2
    else :
        answer = -1

    return answer
