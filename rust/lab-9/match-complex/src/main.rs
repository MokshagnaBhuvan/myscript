use std::io;

fn main() {
    let menu = vec![
        ("Burger", 150.0),
        ("Pizza", 250.0),
        ("Pasta", 200.0),
    ];

    let mut item = String::new();
    let mut quantity = String::new();

    println!("Enter the menu item (Burger, Pizza, Pasta): ");
    io::stdin().read_line(&mut item).expect("Failed to read input");
    let item = item.trim();

    println!("Enter the quantity: ");
    io::stdin().read_line(&mut quantity).expect("Failed to read input");
    let quantity: u32 = quantity.trim().parse().expect("Please enter a valid number");

    let price = match item {
        "Burger" => Some(150.0),
        "Pizza" => Some(250.0),
        "Pasta" => Some(200.0),
        _ => None,
    };

    match price {
        Some(p) => {
            let total = if quantity >= 5 {
                p * quantity as f64 * 0.9 // 10% discount for 5 or more items
            } else if quantity >= 3 {
                p * quantity as f64 * 0.95 // 5% discount for 3 or more items
            } else {
                p * quantity as f64
            };

            println!("Total price for {} {}(s) is ₹{:.2}", quantity, item, total);
        }
        None => println!("Invalid menu item entered."),
    }
}

