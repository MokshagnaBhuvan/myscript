use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).expect("Failed to read line");

    let x: i32 = input.trim().parse().expect("Please enter a valid integer");

    if x > 0 {
        print!("{x} is positive.");
    } else if x == 0 {
        print!("{x} is Zero.");
    } else {
        print!("{x} is negative.");
    }
}

