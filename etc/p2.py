def solution(expression):
    exp = expression.replace('x','*')

    max = 0
    n = len(exp)

    for i in range(0, n, 2):
        for j in range(i, n, 2):
            temp_exp = exp[:i] + '(' + exp[i:j+1] + ')' + exp[j+1:]

            result = eval(temp_exp)

            if result>max:
                max = result

    return max

expression = input()
print(solution(expression))