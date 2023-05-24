#Write your code below this line 👇
import math
def prime_checker(number):
    sqrt_number = round(math.sqrt(number))
    for i in range(2, sqrt_number+1):
        if number % i == 0:
            print("It's not a prime number.")
            return
    print("It's a prime number.")

#Write your code above this line 👆
    
#Do NOT change any of the code below👇
n = int(input("Check this number: "))
prime_checker(number=n)
