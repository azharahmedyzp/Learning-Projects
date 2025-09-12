a = 0
b = 0
c = 0

while True:
    vote = input("Vote for A, B or C (type STOP to end): ")
    vote = vote.upper()
    if vote == "STOP":
        break

    if vote == "A":
        a += 1
    elif vote == "B":
        b += 1
    elif vote == "C":
        c +=1
    else:
        print("Invalid vote. Please try again.")

#displaying result
print("\nFinal Result")
print(f"A: {a}")
print(f"B: {b}")
print(f"C: {c}")

#Find the winner:
if a > b and a > c:
    print("\nA is the WINNER!")
elif b > a and b > c:
    print("\nB is the WINNER!")
elif c > a and c > b:
    print("\nC is the WINNER!")
else:
    print("\nIt's a tie!")