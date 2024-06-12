def fibo():
    a, b = 1, 2
    while True:
        yield a
        a, b = b, a+b


fibo_generator = fibo()
sum = 0
limit_crossed = False

while not limit_crossed:
    next_fib = next(fibo_generator)
    if next_fib<=4000000:
        if next_fib%2==0:
            sum += next_fib
    else:
        break


print(sum)