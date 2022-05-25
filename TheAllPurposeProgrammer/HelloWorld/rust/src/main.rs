fn main() {
    let first_name = "Jacob".to_string();
    let last_name = "Landry".to_string();

    println!("{}", hello(first_name, last_name));
}

fn hello(first_name: String, last_name: String) -> String {
    return format!("Hwllo {} {}, how are you doing today?", first_name, last_name);
}
