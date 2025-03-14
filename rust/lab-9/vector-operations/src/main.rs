fn find_average(temperatures: &Vec<f64>) -> f64 {
    let total: f64 = temperatures.iter().sum();
    total / temperatures.len() as f64
}

fn main() {
    let temperatures = vec![30.0, 32.5, 31.0, 29.5, 33.0, 34.0, 30.5];

    println!("Temperatures recorded: {:?}", temperatures);
    let average_temperature = find_average(&temperatures);
    println!("Average temperature: {:.2}°C", average_temperature);
}

