"""
 * Programmers coding test practice
 * exercise question( array )(level 1)
 * Problem name : 제일 작은 수 제거하기
"""


import array

def solution(arr):
    
    if len(arr) > 1 :
        arr.remove(min(arr))
        return arr
    else :
        return [-1]
