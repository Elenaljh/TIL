#Password Generator Project
import random
letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+']

print("Welcome to the PyPassword Generator!")
nr_letters= int(input("How many letters would you like in your password?\n")) 
nr_symbols = int(input(f"How many symbols would you like?\n"))
nr_numbers = int(input(f"How many numbers would you like?\n"))

#Eazy Level - Order not randomised:
#e.g. 4 letter, 2 symbol, 2 number = JduE&!91
password_easy = ""
for i in range(0, nr_letters):
  random_index_letter = random.randint(0,len(letters)-1)
  password_easy += letters[random_index_letter]

for j in range(0, nr_symbols):
  random_index_symbols = random.randint(0,len(symbols)-1)
  password_easy += symbols[random_index_symbols]

for k in range(0, nr_numbers):
  random_index_numbers = random.randint(0, len(numbers)-1)
  password_easy += numbers[random_index_numbers]

print(f"password_easy: {password_easy}")

#Hard Level - Order of characters randomised:
#e.g. 4 letter, 2 symbol, 2 number = g^2jk8&P
password_tmp = []
password_hard = ""
prevent_repeat = []

for i in range(0, nr_letters):
  random_index_letter = random.randint(0,len(letters)-1)
  password_tmp += letters[random_index_letter]

for j in range(0, nr_symbols):
  random_index_symbols = random.randint(0,len(symbols)-1)
  password_tmp += symbols[random_index_symbols]

for k in range(0, nr_numbers):
  random_index_numbers = random.randint(0, len(numbers)-1)
  password_tmp += numbers[random_index_numbers]

while len(password_hard) != len(password_tmp):
  order = random.randint(0, len(password_tmp)-1)
  if order in prevent_repeat:
    continue
  password_hard += password_tmp[order]
  prevent_repeat.append(order)

# print(f"prevent_repeat: {prevent_repeat}")
# print(f"password_tmp: {password_tmp}")
print(f"password_hard: {password_hard}")


