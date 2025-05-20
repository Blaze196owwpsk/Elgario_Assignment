import random


correct_username = "ivan"
correct_password = "ivan"


username = input("Enter your username: ")
password = input("Enter your password: ")


if username == correct_username and password == correct_password:

    auth_code = random.randint(100000, 999999)
    print("Login successful!")
    print("Your 6-digit authentication code is:", auth_code)
else:
    print("Invalid username or password. Access denied.")
