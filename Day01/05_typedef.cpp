#include <iostream>
using namespace std;

//typedef std::string text_t;
//typedef int number_t;
using text_t = std::string;
using number_t = int;


int main() {

    text_t firstName = "Bro";
    number_t age = 21;

    std::cout << firstName << '\n';
    std::cout << age << '\n';

    return 0;
}

/*
// Typedefs and type aliases (উপনাম / অন্য নাম)
// typedef = reserved keyword used to create an "additional name" (or, alias) for another data type. It is a "New identifier" for an existing data-type. It helps with readability and reduces typos. Use when there is a clear benefit. Replaced with 'using' (work better w/ templates)
//We can give a new identifier to an existing data type.

//naming conventions = best hoy jdi ami new identifier er shesh a akta underscore diye t likhi like this way, "pairlist_t". Ata dekhe shobai bujhbe j eta akta typedef use kore banano name
- gloabally declare kora better
-  eikhane "std::string" hocce akta reserved keywrod and eita hocce akta data-type, ei data type ta onek bar lekhar proyojon porte pare ja khubi boro hoye jay & koshtoshaddho hoye jay barbar lekha ta, tar karon a ami amar moto kore typedef use kore akta choto nam dite pari oi full oto boro data-type tar poribortte. 
ex:
std::vector<std::pair<std::string,int>>
eita purata ekta data-type, jeita amr barbar lekha lagte pare, tar karon a ami eitare shompurnotare dhore akta choto nam diye dilam like "pairlist_t" (_t dilam jate kore bujha jay eta typedef use kore dewa akta nam matro, ei nam dhore compiler khuje bar korbe er malik koi then oi full oto boro code ta jeikhane jeikhane "pairlist_t" name ta ase oikhnae oikhane replace kore akta meaning she bar kore nibe, not necessiarly amra ta live dekhte parbo, eta backend a she calculate kore nibe)

- kokhn use korbo?
- jokhn kina akta data type onek boro hoye jay barbar lekhar jonne, tokhn amara typedef use kore oi data-type er poriborrte or akta onno choto nam hishebe use korte pari (for declaration of course)  


NEW ADDITION

- typedef hocce old akta trick akhn C++ a eshe amra "using" keyword tai prefer korbo over "typedef" 
- "using new_datatype = old_datatype;"  emne kore syntax ta lekhe
ex:
using text_t = std::string;
using number_t = int;

akhn ami "text_t" & "number_t" use korbo shobkhane, oi boro boro datatype barbar lekhar drker nai.

- Lastly "typedef" & "using" duitai akdm similar kaj kore tobe using ta er limitations kom karon eita amra "templates" ew use korte pari.

*/