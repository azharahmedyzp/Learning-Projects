distance = float(input("Enter the distance in kilometers: "))
fuelEfficiency = float(input("Enter the car's fuel efficiency in kilometers per liter: "))
fuelPrice = float(input("Enter the fuel price in liters: "))

fuelNeeded = distance / fuelEfficiency
totalCost = fuelNeeded * fuelPrice

print(f"\nThe total fuel required in liters is: {fuelNeeded:.2f} L")  #rounded to 2 decimals.
print(f"The total cost of fuel is: {totalCost:.2f} PKR")  #rounded to 2 decimals.

if distance > 500:
    print("\n\"Make sure to check car's tire pressure and fuel midway.\"")