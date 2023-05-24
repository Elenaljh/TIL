rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''

#Write your code below this line 👇
import random
Rock_paper_scissors = [rock, paper, scissors]
you = int(input("What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors."))
computer = random.randint(0,2)

if you > 2 or you < 0:  # 사용자가 헛짓거리 하는 경우의 수도 항상 생각하자.
  print("You typed an invalid number, you lose")
  exit()

print(Rock_paper_scissors[you])
print(f"Computer chose:\n{Rock_paper_scissors[computer]}")

if computer - you == 1 or computer - you == -2:
  print("You lose")
elif computer - you == -1 or computer - you == 2:
  print("You win")
else: 
  print("Tied")
