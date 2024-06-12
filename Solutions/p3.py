def isPrime(num):
    for i in range(2, int(num**.5)+1):
        if num%i==0:
            return False
    return True


dividend = 600851475143
for num in range((dividend//3) + 1, 3, -1):
    if dividend%num==0 and isPrime(num):
        break


print(num)