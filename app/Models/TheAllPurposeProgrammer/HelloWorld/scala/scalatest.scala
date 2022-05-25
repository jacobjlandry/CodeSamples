object Hello {

    def main(args: Array[String]) = {
        var first_name : String = "Jacob"
	var last_name : String = "Landry"

        println(hello(first_name, last_name))
    }

    def hello(first_name : String, last_name : String) : String = {
        return "Hello " + first_name + " " + last_name + ", how are you doing today?"
    }

}

