use std::io;

fn main() {
    let mut numbers = Vec::new();
    let mut input = String::new();

    println!("Enter numbers (enter 0 to stop): ");
    
    loop {
        io::stdin().read_line(&mut input).expect("Failed to read input");
        let number: i32 = input.trim().parse().expect("Please enter a valid number");
        input.clear();
        
        if number == 0 {
            break;
        }
        
        numbers.push(number);
    }
    
    println!("Even numbers from the list:");
    let mut iter = numbers.iter();
    
    while let Some(&num) = iter.next() {
        if num % 2 == 0 {
            println!("{}", num);
        }
    }
}

