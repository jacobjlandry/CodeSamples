package main

import "fmt"

func main() {
    var first_name string = "Jacob"
    var last_name string = "Landry"

    fmt.Println(hello(first_name, last_name))
}

func hello(first_name string, last_name string) string {
    return "Hello, " + first_name + " " + last_name + ", how are you doing today?"
}
