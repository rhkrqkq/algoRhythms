def solution():
    approved = [x.strip() for x in input().split(',')]
    spams = [x.strip() for x in input().split(',')]
    calls = [x.strip() for x in input().split(',')]
    k = int(input())
    result = []
    cnt = {}

    for i in range(len(calls)):
        current = calls[i]

        # 번호 등장 누적
        if current in cnt:
            cnt[current] += 1
        else:
            cnt[current] = 1

        if current in approved:
            result.append(0)
        else:
            if cnt[current] <= k or current in spams:
                result.append(1)
            else:
                result.append(0)

    return result

print(solution())