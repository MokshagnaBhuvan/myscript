fn main() {
    let n = 10; // You can change this value as needed
    let mut fibonacci = vec![0, 1]; // Initializing the vector with the first two Fibonacci numbers

    for i in 2..n {
        let next_value = fibonacci[i-1] + fibonacci[i-2];
        fibonacci.push(next_value);
    }

    println!("Fibonacci sequence up to {}: {:?}", n, fibonacci);
}

