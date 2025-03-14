use std::io;

fn main() {
    let mut age = String::new();
    let mut income = String::new();

    println!("Enter your age: ");
    io::stdin().read_line(&mut age).expect("Failed to read input");
    let age: u32 = age.trim().parse().expect("Please enter a valid number");

    println!("Enter your monthly income in ₹: ");
    io::stdin().read_line(&mut income).expect("Failed to read input");
    let income: u32 = income.trim().parse().expect("Please enter a valid number");

    if age < 21 {
        println!("You are ineligible for a loan.");
    } else if age <= 60 {
        if income > 50_000 {
            println!("You are eligible for a loan.");
        } else {
            println!("You are ineligible for a loan due to insufficient income.");
        }
    } else {
        println!("You need a guarantor for a loan.");
    }
}

