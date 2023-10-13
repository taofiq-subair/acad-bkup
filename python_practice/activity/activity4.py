snacks = [
    {"id": 1, "name": "Eggroll", "price": 150},
    {"id": 2, "name": "Meatpie", "price": 200},
    {"id": 3, "name": "Fishroll", "price": 350},
    {"id": 4, "name": "Donut", "price": 250},
    {"id": 5, "name": "Shawarma", "price": 1500}
]

# print(2 in snacks.keys())


def userShopping(s):
    totalCost = 0
    itemIds = []

    for a in s:
        itemIds.append(a["id"])

    userCart = []

    while (True):
        for a in s:
            print(a)
        print()
        print("Your current cart is: ", userCart)
        print()

        itemToAdd = int(input("Add item to cart (by id):"))

        if (itemToAdd == -1):
            if (len(userCart) == 0):
                print("Nothing in cart! Cannot checkout.")
                continue
            print("Checkout successful")
            print("Your cart: ", userCart)

            for a in userCart:
                sum = a["price"] * a["quantity"]
            return

        if (itemToAdd not in itemIds):
            print()
            print("INVALID PRODUCT ID! PLEASE SELECT A VALID ITEM ID.")
            continue

        quantity = int(input("How many would you like? "))

        for a in s:
            for b in userCart:
                if (a["id"] == itemToAdd):
                    totalPrice = a["price"] * quantity
                    print(totalPrice)
                    if (b["item"] == itemToAdd):
                        b["quantity"] += quantity
                        b["quantity"] += totalPrice
                    else:
                        userCart.append(
                            {"item": a["name"], "quantity": quantity, "totalPrice": totalPrice})

        print(userCart)


userShopping(snacks)


# snacks = {
#     1: ['Eggrolls', 150],
#     2: ['Meatpie', 200],
#     3: ['Fishroll', 100],
#     4: ['Donuts', 250],
#     5: ['Shawarma', 1500]}

# print(2 in snacks.keys())


# def userShopping(s):
#     userCart = []
#     while (True):
#         for a in s.items():
#             print(a)
#         print()
#         print("Your current cart is: ", userCart)
#         print()

#         itemToAdd = int(input("Add item to cart (by id):"))
#         if (itemToAdd == -1):
#             print("Checkout successful")
#             print("Your cart: ", userCart)

#         if (itemToAdd not in s.keys()):
#             print()
#             print("INVALID PRODUCT ID! PLEASE SELECT AN ID FROM 1 TO 5.")
#             continue

#         quantity = int(input("How many would you like? "))

#         userCart.append({itemToAdd: quantity})
#         print(userCart)

#         for a in userCart:
#             if()

#         print(userCart)


# userShopping(snacks)
