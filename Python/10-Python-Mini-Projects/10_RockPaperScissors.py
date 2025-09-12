import random

print("Let's play Rock, Paper, Scissors!")
user = input("Choose rock, paper, or scissors: ").lower()
computer = random.choice(['rock', 'paper', 'scissors'])

print(f"\nYou chose: {user}")
print(f"Computer chose: {computer}\n")

if user == computer:
    print("It's a tie!")
elif user == 'rock':
    if computer == 'scissors':
        print("You win! Rock smashes scissors.")
    else: 
        print("You lose! Paper covers rock.")
elif user == 'paper':
    if computer == 'rock':
        print("You win! Paper covers rock.")
    else:
        print("You lose! Scissors cut paper.")
elif user == 'scissors':
    if computer == 'paper':
        print("You win! Scissors cut paper.")
    else:
        print("You lose! Rock smashes scissors.")
else:
    print("Invalid choice. Please choose rock, paper, or scissors.")    