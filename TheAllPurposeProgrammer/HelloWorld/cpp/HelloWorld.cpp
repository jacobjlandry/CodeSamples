#include <iostream>
#include <string>

using namespace std;

string hello(string first_name, string last_name)
{
    return "Hello " + first_name + " " + last_name + ", how are you doing today?";
}

int main()
{
    string first_name = "Jacob";
    string last_name = "Landry";


    std::cout << hello(first_name, last_name);
}