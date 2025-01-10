done = True
num = int(input("Enter number : "))
while done:
    # num = int(input("Enter number : "))
    if num <= 8 and num > -1:
        num + 1
        print(num)
    else:
        print("your answer is\'t correct")
        done = False
    
    print("number is ",num,)
    num += 1
    
print()
print("main menu")
menu = "1. print\n"+"2. table\n"

print(menu)
choice = int(input("Choice 1 or 2 : "))
if choice == 1:
    print("good Job !!")
elif choice == 2:
    table = " ll \n"
    table += " ll \n"
    table += " lllllll\n"
    table += " ll   ll\n"
    table += " ll   ll\n"
    
    print(table)