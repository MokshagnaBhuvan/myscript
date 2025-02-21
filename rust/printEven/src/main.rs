use std::io;
fn main() {
    //let mut input = String::new();
    //io::stdin().read_line(&mut input).expect("Failed to read line");

    let x: i32 ;// = input.trim().parse().expect("Please enter a valid integer");
    for x in 1..20{
    	if (x%2)==0 {
    		println!("{x} is Even.");
    	}
    }
    
}
