import datetime
lower = 1
upper = 10000

print("Prime numbers between", lower, "and", upper, "are:")

start = datetime.datetime.now()
for num in range(lower, upper + 1):
   # all prime numbers are greater than 1
   if num > 1:
       for i in range(2, num):
           if (num % i) == 0:
               break
       else:
           print(num)
end = datetime.datetime.now()
duration = end - start

print("Finished, duration ", duration.microseconds, "microseconds")