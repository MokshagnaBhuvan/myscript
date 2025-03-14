20CYS312 – PPL
Lab Exercise 9 - Rust Lab Exercise Questions

1. Nested Decision Making with if-else
o Write a Rust program that takes a person's age and income as input and
determines their eligibility for a loan. The program should check:
§ If the person is below 21, they are ineligible.
§ If between 21 and 60, they are eligible based on income (> ₹50,000).
§ If above 60, they need a guarantor.

3. Using match with Complex Cases
o Implement a restaurant billing system where a user enters a menu item (e.g.,
"Burger", "Pizza", "Pasta"), and the program prints the price.
o Use a match expression with additional conditions to apply discounts based on the
quantity ordered.
4. Using Loops for Data Processing
o Write a Rust program to generate Fibonacci numbers up to a given n using a for
loop.
o Store the sequence in a list (vector) and print the values.
5. Pattern Matching in Loops with while let
o Implement a program where a user enters multiple numbers, and the program
keeps adding them to a list until they enter 0.
o Use while let to process the list and print only the even numbers.
6. Tuple Manipulation in a Real-World Scenario
o Create a tuple representing an employee’s data (ID, Name, Salary).
o Write a function that takes this tuple as input, applies a 10% salary hike if salary <
₹50,000, and returns an updated tuple.
7. Vector (List) Operations with Iterators
o Write a Rust program that maintains a list of temperatures recorded in a city for a
week. Implement:
§ A function that finds the average temperature.
§ Another function that finds the highest and lowest temperature using
iterators.
8. Structs with Methods
o Define a struct named BankAccount with fields account_number,
holder_name, and balance.
o Implement methods for:
§ Depositing money.
§ Withdrawing money (with balance check).
§ Displaying account details.
9. Structs and Enums Together – Vehicle Registration System
o Define an enum named FuelType with variants Petrol, Diesel, and Electric.
o Define a struct named Vehicle with fields brand, model, and fuel_type.
o Implement a function that takes a list of vehicles and filters only electric vehicles
for display
