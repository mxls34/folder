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
    
    
