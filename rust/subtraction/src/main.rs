fn main() {
    let x:u32 = 14;
    let y:u32 = 3;
    let diff:u32;
    if x>y {
    	 diff = x-y;
    } else {
 	 diff = y-x;
    }

    println!("Difference of these {x} and {y} is {diff}");
}
