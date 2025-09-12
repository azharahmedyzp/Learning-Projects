weight = float(input("Enter the weight of the package (in kg): "))

if weight < 0:
    print("Weight cannot be negative")
elif weight < 1:
    print("Light package")
elif weight <= 5:
    print("Regular package")
elif weight <= 20:
    print("Heavy package - Extra shipping cost applies")
else:
    print("Package exceeds maximum weight limit (20kg) and cannot be shipped")