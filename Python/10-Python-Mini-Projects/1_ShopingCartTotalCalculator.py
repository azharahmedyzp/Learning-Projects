total = 0

while True: 
    
    price = input("Enter the price of the item: ")

    if price == "done":
        break

    price = float(price)

    if price > 1000:
        price *= 0.9

    total += price

print(f"Total price of all items is: {total}")