#include <iostream>
using namespace std;

namespace first{
    int x = 15;
}
namespace second{
    int x = 100;
}

int main() {

    int x = 0;

    std::cout << x <<endl;          //local var, value 0
    std::cout << first::x <<endl;   //global var, value 15
    std::cout << second::x <<endl;  //global var, value 100
    
    return 0;
}

/*
Namespace = provides a solution for preventing name conflicts in large projects. Each entity needs a unique name. A namespace allows for identically named entities as long as the namespaces are different.

:: ---> is know as Scope Resolution operator
- Local Variable (Inside of the main function) & Global Variable (outside of the main function)
- what is Precede means?
- namespace hocce variable er shathe connected
- Main kotha hocce ami chai same variable er nam ami use korbo, ja kina kora jay na (karon shob name unique hote hobe), jar karone akhn ami oder alada alada category er modhhe rakhte pari jmn food category, travel category, engineering category (jeikhane prottek ta tei ami same amr "x" nam a variable use korte pari tobe kon categpry ta access korte chaile amr "x" / variable name er age oi namespace er name with a scope resolution dite hobe, taholei ami parbo add korte)

- namespace er rekta joss jinish hocce "using namespace variable_name;" dile tahole oi variable er jonno jeikhane jeikhane "variable_name::" dewa lagto oikhane akhon shudhu "variable_name" dillei hobe. like, 
using namespace std; 
dile
std::cout<< "Hello";
eta dewar drker nai ami khali dibo j,
cout<< "Hello";
means that, the "using" keyword vanishes the "std::" term from the entire code.  
same eikhanew jdi ami declare kori shurutei j,
using namespace first;  &  using namespace std;  dei tahole,
std::cout<< first::x;
ei line ta etotuk likhelei kaj hoye jabe,
cout << x;


*/