age = int(input("Enter your age: "))
day = input("Enter the day (weekday/weekend): ")
day = day.lower()

if age < 0:
    print("Invalid age")

elif age <=6:
    print("Ticket price: FREE.")

elif age > 65:
    print("Ticket price: $5.")

else:
    if day == "weekend":
        price = 10
    else:
        price = 12

    print(f"Ticket price: ${price}.")