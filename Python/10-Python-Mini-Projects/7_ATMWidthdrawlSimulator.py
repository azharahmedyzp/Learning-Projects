balance = 10000
amount = int(input("Enter the amount to withdraw: "))

if amount > balance:
    print('Insufficient balance!')
elif amount % 100 != 0:
    print("Amount must be in multiples of 100!")

else:
    print("Withdrawal Successfull.")
    print("Notes given: ")

    if amount >= 1000:
        note1000 = amount // 1000
        print(f"1000: {note1000}")
        amount = amount % 1000

    if amount >= 500:
        note500 = amount // 500
        print(f"500: {note500}")
        amount = amount % 500

    if amount >= 100:
        note100 = amount // 100
        print(f"100: {note100}")
        amount = amount % 100