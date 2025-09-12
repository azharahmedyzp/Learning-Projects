people = int(input("Enter the number of people standing ahead of you: "))

if people == 0:
    print("You are next!")
else:
    for i in range(people, 0, -1):
        print(f"{i} people ahead...")
    
    print(f"\nThere are {people} people standing ahead of you.")
    print(f"\nYou'll have to wait for {people*3} minutes for your turn.")