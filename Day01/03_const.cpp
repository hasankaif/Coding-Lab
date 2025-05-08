#include <iostream>
using namespace std;

int main() {

    const double PI = 3.14159;

    //PI = 420.69;  //This will cause an error, because of the const keyword.

    double r = 10;
    double cir = 2 * r * PI ;

    cout << cir << " cm";
 
    
    return 0;
}

/* The const keyword specifices that a variables value is constant
// tells the compiler to prevent anything from modifying it
// (read-only)
/*
- amn kisu ja amra chai na kono developer by mistakenly "pi" er value porobortite change kore fele, tai amra fix kore dibo, jdi she change korte jay tahole alert notice pabe she.
- like PI, SPEED_OF_LIGHT eigular value always constant e thakbe tai egula jdi age thekei fix kore dei taholei better hoy. This will add kinda like a certain level of Data Security. 

//Naming convention for constants is all upper case.



Ex:
const int DPW = 7;    //daysPerWeek
const int MPY = 12;   //monthsPeryear
const int HPD = 24;   //hoursPerDay
const int IPF = 12;   //inchesPerFoot
const int FPM = 5280;  //feetPerMile
const int SPM = 60;   //secondsPerMinute
const double FREEZING_POINT = 0;  // celsius
const double BOILING_POINT = 212; // fahrenheit
Const double G = 9.8;   //gravity
const double E = 2.71828   //Eulers Number




*/