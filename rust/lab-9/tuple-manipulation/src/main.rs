type Employee = (u32, String, f64);

fn apply_salary_hike(employee: Employee) -> Employee {
    let (id, name, salary) = employee;
    let new_salary = if salary < 50_000.0 {
        salary * 1.10
    } else {
        salary
    };

    (id, name, new_salary)
}

fn main() {
    let employee = (1, String::from("John Doe"), 45_000.0);
    let updated_employee = apply_salary_hike(employee);

    println!("Updated employee data: {:?}", updated_employee);
}

