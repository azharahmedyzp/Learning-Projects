import time

cycles = int(input("Enter number of cycles: "))

for n in range(cycles):
    print("\nGreen – Go")
    time.sleep(3)
    print("Yellow – Slow down")
    time.sleep(2)
    print("Red – Stop")
    time.sleep(5)