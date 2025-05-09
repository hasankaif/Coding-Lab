#include <iostream>

int main() 
{
   std::string name;
   int age;

   std::cout << "What's your full name?: ";
   std::getline(std::cin >> std::ws, name);

   std::cout << "What's your age?: ";
   std::cin >> age;

   std::cout << "Hello " << name << '\n';
   std::cout << "You are " << age << " years old";

   return 0;
}

// cout << (insertion operator)
// cin >> (extraction operator)
/*
std::getline(std::cin >> std::ws, name);
ei line er karon a ??


*/