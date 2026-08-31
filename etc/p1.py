
n = int(input())

def solution(n):
    result = 0
    for i in range(100000):
        if i//n == i%n:
            result+=i
    return result

print(solution(n))