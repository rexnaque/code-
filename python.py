Username = "REX"
Password = "NAQUE"
loop = True
while loop:
  typeUsername = input("Enter Username: ")
  typePassword = input("Enter Password: ")

  if(typeUsername==Username) and          (typePassword==Password):
   print("Login Successfully")
   loop = False
  else:
   print("Login Failed")