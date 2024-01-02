#include <iostream>
#include <cstdlib> // for rand() and srand()
#include <ctime>   // for time()
//hello
int main() {
    // Seed the random number generator with the current time
    std::srand(std::time(0));

    // Generate a random number between 1 and 100
    int randomNumber = std::rand() % 100 + 1;

    // Print the random number
    std::cout << "Random Number: " << randomNumber << std::endl;

    return 0;
}

