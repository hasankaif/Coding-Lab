
---
# 📜 All in One Sheet

(***TABLE OF CONTENTS***)

| SL. | TOPICS                              | TOTAL PROBLEMS |
| --- | ----------------------------------- | -------------- |
| 01  | BASIC PROGRAMMING                   | 18             |
| 02  | BITWISE OPERATOR EXERCISES          | 16             |
| 03  | CONDITIONAL OPERATPRS               | 5              |
| 04  | SWITCH                              | 8              |
| 05  | IF ELSE                             | 21             |
| 06  | LOOP                                | 51             |
| 07  | PRINTING PATTERNS : STAR PATTERNS   |                |
| 08  | PRINTING PATTERNS : NUMBER PATTERNS |                |
| 09  | FUNCTIONS                           | 24             |
| 10  | ARRAYS : 1D                         |                |
| 11  | ARRAYS : 2D                         |                |
| 12  | ARRAYS : 3D                         |                |
| 13  | STRING                              | 38             |
| 14  | POINTER                             | 18             |
| 15  | STRUCTURES                          |                |
| 16  | RECURSION                           |                |
| 16  | FILE HANDLING                       |                |
| 17  | MEMORY MANAGEMENT                   |                |

==These are all Classical Problems in Programming==


---
# 🟢 BASIC PROGRAMMING 

---
# 1 - Hello World

| ***Input:*** | ***Output:***  |
| ------------ | -------------- |
| NA           | Hello World !! |

```c 
#include <stdio.h>
int main(){

    printf("Hello World !!");
    
    return 0;
}
```
---
# 2 - Sum of two numbers

| ***Input:***                                        | ***Output:*** |
| --------------------------------------------------- | ------------- |
| Enter first number: 20  <br>Enter second number: 10 | Sum = 30      |

```c
#include <stdio.h>

int main()
{
    int num1, num2, sum;
    
    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number:");
    scanf("%d", &num2);
    
    sum = num1 + num2;
    
    printf("Sum = %d", sum);
    
    return 0;
}
```

OR,

```c
	//Variable Declaration
	 
    printf("Enter any two numbers : ");
    scanf("%d %d", &num1, &num2);

```

OR,

```c
	//Output printing
	
	printf("Summation = %d", a+b);

```
---
# 3 - All arithmetic operations of two numbers

| ***Input:***                          | ***Output:***                                                                    |
| ------------------------------------- | -------------------------------------------------------------------------------- |
| Enter any two numbers: <br>10<br>5    | SUM = 15<br>DIFFERENCE = 5<br>PRODUCT = 50<br>QUOTIENT = 2.00<br>MODULUS = 0     |
| Enter any two numbers: <br>4<br>5<br> | SUM = 9<br>DIFFERENCE = -1<br>PRODUCT = 20<br>QUOTIENT = 0.800000<br>MODULUS = 4 |

```c
#include <stdio.h>

int main()
{
	int a, b;
	
    printf("Enter any two numbers: \n");
    scanf("%d %d", &a, &b);
	
    
    int sum = a + b;
    int sub = a - b;
    int mult = a * b;
    float div = (float)a / b;  // Typecasting
    int mod = a % b;

    
    printf("SUM = %d\n", sum);
    printf("DIFFERENCE = %d\n", sub);
    printf("PRODUCT = %d\n", mult);
    printf("QUOTIENT = %f\n", div);   // ভাগফল, div jehetu float a tai %f
    printf("MODULUS = %d", mod);

    return 0;
}
```
---
# 4 - Find a rectangle's perimeter (using length and breadth)

| ***Input:***                       | ***Output:***                     |
| ---------------------------------- | --------------------------------- |
| Enter length: 5<br>Enter width: 10 | Perimeter of rectangle = 30 units |

```C
#include <stdio.h>

int main()
{
    float l, w;
    
    printf("Enter length: ");
    scanf("%f", &l);
    printf("Enter width: ");
    scanf("%f", &w);


    float perimeter = 2*(l+w);
    
    printf("Perimeter of rectangle = %f units ", perimeter);

    return 0;
}
```

OR,

```c
	...
	printf("Enter lenth & width of the rectangle: ");
	scanf("%f %f", &l, &w);
	...
	printf("Perimeter of rectangle = %f units ", (2*(l+w)));  
```
---
# 5 - Find a rectangle's area (using length and breadth)

| ***Input:***                       | ***Output:***                    |
| ---------------------------------- | -------------------------------- |
| Enter length: 5<br>Enter width: 10 | Area of rectangle = 50 sq. units |

```C
#include <stdio.h>
int main()
{
    float l, w;
    
    printf("Enter length: ");
    scanf("%f", &l);
    printf("Enter width: ");
    scanf("%d", &w);

    float area = l * w;
    
    printf("Area of rectangle = %f sq. units ", area);

    return 0;
}
```
---
# 6 - Find a circle's diameter, circumference and area (using radius)

| ***Input:***     | ***Output:***                                                                     |
| ---------------- | --------------------------------------------------------------------------------- |
| Enter radius: 10 | Diameter = 20.000 units<br>Circumference = 62.79 units<br>Area = 314.00 sq. units |

```C
#include <stdio.h>

int main()
{
    float radius; 
    
    printf("Enter radius of circle: ");
    scanf("%f", &radius);

    float diameter = 2 * radius;  // ব্যাস
    float circumference = 2 * 3.14 * radius;  // পরিধি
    float area = 3.14 * (radius * radius);  // এলাকা


    printf("Diameter = %.3f units \n", diameter);
    printf("Circumference = %.2f units \n", circumference);
    printf("Area = %.2f sq. units ", area);

    return 0;
}
```

OR,

```C
#include <stdio.h>
#include <math.h>  // for more accuracy 

int main()
{
    float radius, diameter, circumference, area;
    printf("Enter radius of circle: ");
    scanf("%f", &radius);
    
    diameter = 2 * radius;
    circumference = 2 * M_PI * radius;
    area = M_PI * (radius * radius);

    printf("Diameter = %.3f units \n", diameter);
    printf("Circumference = %.2f units \n", circumference);
    printf("Area = %.2f sq. units ", area);

    return 0;
}
```
---
# 7 - Convert a centimeter value into meter and kilometer 

| ***Input:***                      | ***Output:***                                              |
| --------------------------------- | ---------------------------------------------------------- |
| Enter length in centimeter = 1000 | Length in meter = 10.00 m<br>Length in kilometer = 0.01 km |

```c
#include <stdio.h>

int main()
{
    float cm;
    printf("Enter length in centimeter: ");
    scanf("%f", &cm);

    float meter = cm / 100.0;   // 10 ^ 2 (1m = 100cm)
    float km = cm / 100000.0;   // 10 ^ 5 (1km = 100000mm, 1cm = 10mm)
    
    printf("Length in Meter = %.2f m \n", meter);
    printf("Length in Kilometer = %.2f km", km);

    return 0;
}
```
---
# 8 - Enter temperature in Celsius and convert it into Fahrenheit

| ***Input:***                       | ***Output:***                        |
| ---------------------------------- | ------------------------------------ |
| Enter temperature in Celsius = 100 | Temperature in Fahrenheit = 212.00 F |

```c
#include <stdio.h>

int main()
{
    float celsius;
    printf("Enter temperature in Celsius: ");
    scanf("%f", &celsius);

    float fahrenheit = (celsius * 9 / 5) + 32;
    
    printf("Temperature in Fahrenheit = %.2f Fahrenheit", fahrenheit);

    return 0;
}
```
---
# 9 - Enter temperature in Fahrenheit and convert to Celsius

| ***Input:***                    | ***Output:***                    |
| ------------------------------- | -------------------------------- |
| Temperature in fahrenheit = 205 | Temperature in celsius = 96.11 C |

```c
#include <stdio.h>

int main()
{
    float fahrenheit;
    printf("Enter temperature in Fahrenheit: ");
    scanf("%f", &fahrenheit);
    
    float celsius = (fahrenheit - 32) * 5 / 9;
    
    printf("Temperature in celsius = %.2f Celsius", celsius);

    return 0;
}
```
---
# 10 - Convert days into Years, Months, Weeks and Days🚩

| ***Input:***    | ***Output:***                                    |
| --------------- | ------------------------------------------------ |
| Enter days: 373 | Years : 1<br>Months: 0<br>Weeks : 1<br>Days  : 1 |
| Enter days: 485 | Years : 1<br>Months: 3<br>Weeks : 2<br>Days  : 1 |

```c
#include <stdio.h>

int main()
{
    int total_days;
    printf("Enter days: ");
    scanf("%d", &total_days);


    int years = total_days / 365;
    int remaining_days = total_days % 365;


    int months = remaining_days / 30;
    remaining_days = remaining_days % 30;


    int weeks = remaining_days / 7;
    remaining_days = remaining_days % 7;


    printf("Years : %d\n", years);
    printf("Months: %d\n", months);
    printf("Weeks : %d\n", weeks);
    printf("Days  : %d\n", remaining_days);

    return 0;
}
```
---
# 11 - Find power of any number like x ^ y

| ***Input:***                       | ***Output:*** |
| ---------------------------------- | ------------- |
| Enter base: 5<br>Enter exponent: 2 | 5 ^ 2 = 25    |
| Enter base: 5<br>Enter exponent: 3 | 5 ^ 3 = 125   |

```c
#include <stdio.h>
#include <math.h> // Used for pow() function

int main()
{
    int b ,e ;
    printf("Enter base: ");
    scanf("%d", &b);
    printf("Enter exponent: ");
    scanf("%d", &e);


    int power = pow(b, e);  // pow(base , exponent) eitai niyom power er operation chalanor jonno


    printf("%d ^ %d = %d", b, e, power);

    return 0;
}
```
---
# 12 - Find any number's square root

| ***Input:***          | ***Output:***                 |
| --------------------- | ----------------------------- |
| Enter any number: 9   | Square root of 9.00 = 3.00    |
| Enter any number: 144 | Square root of 144.00 = 12.00 |

```c
#include <stdio.h>
#include <math.h>  //used for square root function

int main()
{
    double n;
    printf("Enter any number to find square root: ");
    scanf("%lf", &n);

    
    double root = sqrt(n);

    
    printf("Square root of %.2lf = %.2lf", n, root);

    return 0;
}
```
---
# 13 - Find the third angle of a triangle (using other two angles)

| ***Input:***                                    | ***Output:***    |
| ----------------------------------------------- | ---------------- |
| Enter first angle: 60<br>Enter second angle: 80 | Third angle = 40 |
| Enter first angle: 60<br>Enter second angle: 30 | Third angle = 90 |

```c
#include <stdio.h>

int main()
{
    int a, b, c;
    printf("Enter two angles of triangle: ");
    scanf("%d %d", &a, &b);

    c = 180 - (a + b);

    printf("Third angle of the triangle = %d", c);

    return 0;
}
```
---
# 14 - Find a triangle's area (using Base & Height)

| ***Input:***                                                        | ***Output:***                          |
| ------------------------------------------------------------------- | -------------------------------------- |
| Enter base of the triangle: 10<br>Enter height of the triangle: 15  | Area of the triangle = 75.00 sq. units |
| Enter base of the triangle: 4.3<br>Enter height of the triangle: 34 | Area of the triangle = 73.10 sq. units |

```c
#include <stdio.h>

int main()
{
    float base, height;
    printf("Enter base of the triangle: ");
    scanf("%f", &base);
    printf("Enter height of the triangle: ");
    scanf("%f", &height);

    
    float area = (base * height) / 2;    // A = ½ (b × h)

    
    printf("Area of the triangle = %.2f sq. units", area);

    return 0;
}
```
---
# 15 - Calculate area of an equilateral triangle

| ***Input:***                                | ***Output:***                                 |
| ------------------------------------------- | --------------------------------------------- |
| Enter side of the equilateral triangle: 10  | Area of equilateral triangle = 43.3 sq. units |
| Enter side of the equilateral triangle: 4.2 | Area of equilateral triangle = 7.64 sq. units |

```c
#include <stdio.h>
#include <math.h> // Used for sqrt() function

int main()
{
    float side;
    printf("Enter side of an equilateral triangle: ");   // সমবাহু ত্রিভুজ
    scanf("%f", &side);

    
    float area = (sqrt(3) / 4) * (side * side);  //(√3/4) * (a^2)

    
    printf("Area of equilateral triangle = %.2f sq. units", area);

    return 0;
}
```
---
# 16 - Enter marks of five subjects and calculate total, average and percentage

| ***Input:***                                                | ***Output:***                                              |
| ----------------------------------------------------------- | ---------------------------------------------------------- |
| Enter marks of five subjects:<br>95<br>76<br>85<br>90<br>89 | Total = 435.000<br>Average = 87.000<br>Percentage = 87.000 |

```c
#include <stdio.h>

int main()
{
    float eng, phy, chem, math, bio;    
    printf("Enter marks of five subjects: \n");
    scanf("%f %f %f %f %f", &eng, &phy, &chem, &math, &bio);


    float total = eng + phy + chem + math + bio; 
    float average = total / 5.0;    
    float percentage = (total / 500.0) * 100;  //explaination?
	/*
	Explaination:
	Sum of marks you got from 5 subjects is "total"
	Then 500.0 is the maximum possible marks assuming each subject is out of 100, so 5×100 = 500,
	Dividing total by 500.0 gives you a value between 0 and 1 (like 0.83 if you got 415).
	Multiplying by 100 turns that into a percentage
	*/

    
    printf("Total marks = %.3f \n", total);
    printf("Average marks = %.3f \n", average);
    printf("Percentage = %.3f \n", percentage);

    return 0;
}
```
---
# 17 - Enter P, T, R and calculate Simple Interest

| ***Input:***                                              | ***Output:***                |
| --------------------------------------------------------- | ---------------------------- |
| Enter principle: 1200<br>Enter time: 2<br>Enter rate: 5.4 | Simple Interest = 129.600006 |

```c
#include <stdio.h>

int main()
{
    float P, T, R;
    printf("Enter principle (amount): ");
    scanf("%f", &p);

    printf("Enter time: ");
    scanf("%f", &t);

    printf("Enter rate: ");
    scanf("%f", &r);

    
    float SI = (p * t * r) / 100;  //Formula: SI = PTR /100

    
    printf("Simple Interest = %f ", SI);

    return 0;
}
```
---
# 18 - Enter P, T, R and calculate Compound Interest

| ***Input:***                                                       | ***Output:***                  |
| ------------------------------------------------------------------ | ------------------------------ |
| Enter principle (amount): 1200<br>Enter time: 2<br>Enter rate: 5.4 | Compound Interest = 133.099243 |

```c
#include <stdio.h>
#include <math.h>

int main()
{
    float p, t, r;
    printf("Enter principle (amount): ");
    scanf("%f", &p);

    printf("Enter time: ");
    scanf("%f", &t);

    printf("Enter rate: ");
    scanf("%f", &r);

    
    float amount = p* (pow((1 + r / 100), t));   //Formula: A = P* ((1+r/n)^t)
	float CI = amount - p;

    
    printf("Compound Interest = %f", CI);

    return 0;
}
```
---
# 19 - All input or output data types in C

| ***Input:***                                               | ***Output:***                                                  |
| ---------------------------------------------------------- | -------------------------------------------------------------- |
| Enter a character: C<br>Enter a signed short value: -32768 | You entered character: 'C'<br>You entered signed short: -32768 |

```c
#include <stdio.h>
int main()
{
    //Declare all primitive and derived types
     
    char charVal;
    unsigned char uCharVal;
    
    short shortVal;
    unsigned short uShortVal;
    
    int intVal;
    unsigned int uIntVal;
    
    long longVal;
    unsigned long uLongVal;
    
    long long longLongVal;
    unsigned long long uLongLongVal;
    
    float floatVal;
    double doubleVal;
    long double longDoubleVal;
    
    //Read input in each type
    
    printf("Enter a character: ");
    charVal = getchar();
    getchar(); // <-- Dummy getchar() to capture enter
    
    printf("Enter another character: ");
    uCharVal = getchar();
    getchar(); // <-- Dummy getchar() to capture enter
    
    printf("Enter a signed short value: ");
    scanf("%hi", &shortVal);
    
    printf("Enter an unsigned short value: ");
    scanf("%hu", &uShortVal);
    
    printf("Enter an signed integer value: ");
    scanf("%d", &intVal);
    
    printf("Enter an unsigned integer value: ");
    scanf("%lu", &uIntVal);
    
    printf("Enter a signed long value: ");
    scanf("%ld", &longVal);
    
    printf("Enter an unsigned long value: ");
    scanf("%lu", &uLongVal);
    
    printf("Enter a signed long long value: ");
    scanf("%lld", &longLongVal);
    
    printf("Enter an unsigned long long value: ");
    scanf("%llu", &uLongLongVal);
    
    printf("Enter a float value: ");
    scanf("%f", &floatVal);
    
    printf("Enter a double value: ");
    scanf("%lf", &doubleVal);
    
    printf("Enter a long double value: ");
    scanf("%Lf", &longDoubleVal);
    
    
    /*
     * Print the value of all variable
     */
    printf("\nYou entered character: '%c' \n", charVal);
    printf("You entered unsigned character: '%c' \n\n", uCharVal);
    
    printf("You entered signed short: %hi \n", shortVal);
    printf("You entered unsigned short: %hu \n\n", uShortVal);
    
    printf("You entered signed int: %d \n", intVal);
    printf("You entered unsigned int: %lu \n\n", uIntVal);
    
    printf("You entered signed long: %ld \n", longVal);
    printf("You entered unsigned long: %lu \n\n", uLongVal);
    
    printf("You entered signed long long: %lld \n", longLongVal);
    printf("You entered unsigned long long: %llu \n\n", uLongLongVal);
    
    printf("You entered float: %f \n", floatVal);
    printf("You entered double: %lf \n", doubleVal);
    printf("You entered long double: %Lf \n", longDoubleVal);

    return 0;
}
```

```
Enter a character: C
Enter another character: P
Enter a signed short value: -32768
Enter an unsigned short value: 65535
Enter an signed integer value: -2147483648
Enter an unsigned integer value: 4294967295
Enter a signed long value: -2147483648
Enter an unsigned long value: 4294967295
Enter a signed long long value: -9223372036854775808
Enter an unsigned long long value: 18446744073709551615
Enter a float value: 1.28766
Enter a double value: 10.915074
Enter a long double value: 100.12345

You entered character: 'C'
You entered unsigned character: 'P'

You entered signed short: -32768
You entered unsigned short: 65535

You entered signed int: -2147483648
You entered unsigned int: 4294967295

You entered signed long: -2147483648
You entered unsigned long: 4294967295

You entered signed long long: -9223372036854775808
You entered unsigned long long: 18446744073709551615

You entered float: 1.287660
You entered double: 10.915074
You entered long double: 100.123450
```
---
# 🟢 BITWISE OPERATOR EXERCISES

---
# 1. Write a C program to check Least Significant Bit (LSB) of a number is set or not.

| ***Input:***     | ***Output:***                           |
| ---------------- | --------------------------------------- |
| Input number: 11 | Least Significant Bit of 11 is set (1). |

```c
#include <stdio.h>

int main()
{
    int num;


    printf("Enter any number: ");
    scanf("%d", &num);


    if(num & 1)
        printf("LSB of %d is set (1).", num);
    else
        printf("LSB of %d is unset (0).", num);

    return 0;
}

```

```
Enter any number: 11
LSB of 11 is set (1).
```
---
# 2. Write a C program to check Most Significant Bit (MSB) of a number is set or not.

| ***Input:***     | ***Output:***                                |
| ---------------- | -------------------------------------------- |
| Input number: -1 | Most Significant Bit (MSB) of -1 is set (1). |

```c
#include <stdio.h>
#define BITS sizeof(int) * 8 // Total bits required to represent integer

int main()
{
    int num, msb;

    
    printf("Enter any number: ");
    scanf("%d", &num);

    /* Move first bit of 1 to highest order */
    msb = 1 << (BITS - 1);

    /* Perform bitwise AND with msb and num */
    if(num & msb)
        printf("MSB of %d is set (1).", num);
    else
        printf("MSB of %d is unset (0).", num);

    return 0;
}

```

```
Enter any number: -1
MSB of -1 is set (1).
```
---
# 3. Write a C program to get nth bit of a number.

| ***Input:***                                | ***Output:***          |
| ------------------------------------------- | ---------------------- |
| Input number: 12<br>Input nth bit number: 2 | 2 bit of 12 is set (1) |

```c
#include <stdio.h>

int main()
{
    int num, n, bitStatus;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    /* Input bit position you want to check */
    printf("Enter nth bit to check (0-31): ");
    scanf("%d", &n);

    /* Right shift num, n times and perform bitwise AND with 1 */
    bitStatus = (num >> n) & 1;

    printf("The %d bit is set to %d", n, bitStatus);

    return 0;
}

```

```
Enter any number: 12
Enter nth bit to check (0-31): 2
The 2 bit is set to 1
```
---
# 4. Write a C program to set nth bit of a number.

| ***Input:***                                | ***Output:***                               |
| ------------------------------------------- | ------------------------------------------- |
| Input number: 12<br>Input nth bit to set: 0 | Number after setting nth bit: 13 in decimal |

```c
/**
 * C program to set the nth bit of a number
 */

#include <stdio.h>

int main()
{
    int num, n, newNum;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    /* Input bit position you want to set */
    printf("Enter nth bit to set (0-31): ");
    scanf("%d", &n);

    /* Left shift 1, n times and perform bitwise OR with num */
    newNum = (1 << n) | num;

    printf("Bit set successfully.\n\n");
    printf("Number before setting %d bit: %d (in decimal)\n", n, num);
    printf("Number after setting %d bit: %d (in decimal)\n", n, newNum);

    return 0;
}

```

```
Enter any number: 12
Enter nth bit to set (0-31): 0
Bit set successfully.

Number before setting 0 bit: 12 (in decimal)
Number after setting 0 bit: 13 (in decimal)
```
---
# 5. Write a C program to clear nth bit of a number.

| ***Input:***                                  | ***Output:***                                  |
| --------------------------------------------- | ---------------------------------------------- |
| Input number: 13<br>Input nth bit to clear: 0 | Number after clearing nth bit: 12 (in decimal) |

```c
/**
 * C program to clear the nth bit of a number
 */

#include <stdio.h>

int main()
{
    int num, n, newNum;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    /* Input bit number you want to clear */
    printf("Enter nth bit to clear (0-31): ");
    scanf("%d", &n);

    /*
     * Left shifts 1 to n times
     * Perform complement of above
     * finally perform bitwise AND with num and result of above
     */
    newNum = num & (~(1 << n));

    printf("Bit cleared successfully.\n\n");
    printf("Number before clearing %d bit: %d (in decimal)\n", n, num);
    printf("Number after clearing %d bit: %d (in decimal)\n", n, newNum);

    return 0;
}

```

```
Enter any number: 13
Enter nth bit to clear (0-31): 0
Bit cleared successfully.

Number before clearing 0 bit: 13 (in decimal)
Number after clearing 0 bit: 12 (in decimal)
```
---
# 6. Write a C program to toggle nth bit of a number.

| ***Input:***                                   | ***Output:***                           |
| ---------------------------------------------- | --------------------------------------- |
| Input number: 22<br>Input nth bit to toggle: 1 | After toggling nth bit: 20 (in decimal) |

```c
/**
 * C program to toggle nth bit of a number
 */

#include <stdio.h>

int main()
{
    int num, n, newNum;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    /* Input bit position you want to toggle */
    printf("Enter nth bit to toggle (0-31): ");
    scanf("%d", &n);

    /*
     * Left shifts 1, n times
     * then perform bitwise XOR with num
     */
    newNum = num ^ (1 << n);

    printf("Bit toggled successfully.\n\n");
    printf("Number before toggling %d bit: %d (in decimal)\n", n, num);
    printf("Number after toggling %d bit: %d (in decimal)\n", n, newNum);

    return 0;
}

```

```
Enter any number: 22
Enter nth bit to toggle (0-31): 1
Bit toggled successfully.

Number before toggling 1 bit: 22 (in decimal)
Number after toggling 1 bit: 20 (in decimal)
```
---
# 7. Write a C program to get highest set bit of a number.

| ***Input:***         | ***Output:***                     |
| -------------------- | --------------------------------- |
| Input any number: 22 | Highest order set bit in 22 is 4. |

```c
/**
 * C program to find highest order set bit in a number
 */

#include <stdio.h>
#define INT_SIZE sizeof(int) * 8 /* Integer size in bits */

int main()
{
    int num, order = -1, i;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    /* Iterate over each bit of integer */
    for(i=0; i<INT_SIZE; i++)
    {
        /* If current bit is set */
        if((num>>i) & 1)
            order = i;
    }

    if (order != -1)
        printf("Highest order set bit in %d is %d", num, order);
    else 
        printf("0 has no set bits.");

    return 0;
}

```

```
Enter any number: 22
Highest order set bit in 22 is 4
```
---
# 8. Write a C program to get lowest set bit of a number.

| ***Input:***         | ***Output:***    |
| -------------------- | ---------------- |
| Input any number: 22 | First set bit: 1 |

```c
/**
 * C program to get lowest order set bit in a number
 */

#include <stdio.h>
#define INT_SIZE sizeof(int) * 8 /* Integer size in bits */

int main()
{
    int num, order, i;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    /* Initially set the order to max size of integer */
    order = INT_SIZE - 1;

    /* Iterate through each bit of integer */
    for(i=0; i<INT_SIZE; i++)
    {
        /* If current bit is set */
        if((num>>i) & 1)
        {
            order = i;

            /* Terminate the loop */
            break;
        }
    }

    printf("Lowest order set bit in %d is %d", num, order);

    return 0;
}

```

```
Enter any number: 22
Lowest order set bit in 22 is 1
```
---
# 9. Write a C program to count trailing zeros in a binary number.

| ***Input:***         | ***Output:***     |
| -------------------- | ----------------- |
| Input any number: 22 | Trailing zeros: 1 |

```c
 //C program to count trailing zeros in a binary number using bitwise operator
 
#include <stdio.h>
#define INT_SIZE sizeof(int) * 8  //Bits required to represent an integer

int main()
{
    int num, count, i;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    count = 0;

    /* Iterate over each bit of the number */
    for(i=0; i<INT_SIZE; i++)
    {
        /* If set bit is found the terminate from loop*/
        if((num >> i ) & 1)
        {
            /* Terminate from loop */
            break;
        }

        /* Increment trailing zeros count */
        count++;
    }

    printf("Total number of trailing zeros in %d is %d.", num, count);

    return 0;
}

```

OR,

```c
/**
 * C program to count trailing zeros in a binary number using bitwise operator
 */

#include <stdio.h>

int main()
{
    int num, count=0;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    while(!(num & 1))
    {
        count++;
        num >>= 1;
    }

    printf("Total number of trailing zeros = %d.", count);

    return 0;
}

```

```
Enter any number: 48
Total number of trailing zeros in 48 is 4.
```
---
# 10. Write a C program to count leading zeros in a binary number.

| ***Input:***         | ***Output:***                                          |
| -------------------- | ------------------------------------------------------ |
| Input any number: 22 | Output leading zeros: 27 (using 4 byte signed integer) |

```c
/**
 * C program to count leading zeros in a binary number using bitwise operator
 */

#include <stdio.h>
#define INT_SIZE sizeof(int) * 8

int main()
{
    int num, count, msb, i;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    // Equivalent to
    // 10000000 00000000 00000000 00000000
    msb = 1 << (INT_SIZE - 1);

    count = 0;

    /* Iterate over each bit */
    for(i=0; i<INT_SIZE; i++)
    {
        /* If leading set bit is found */
        if((num << i) & msb)
        {
            /* Terminate the loop */
            break;
        }

        count++;
    }

    printf("Total number of leading zeros in %d is %d", num, count);

    return 0;
}

```

OR,

```c
/**
 * C program to count leading zeros in a binary number using bitwise operator
 */

#include <stdio.h>
#include <limits.h> // Used for INT_MAX

int main()
{
    int num, count;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    count = 0;
    while(!(num & (~INT_MAX)))
    {
        count++;
        num <<= 1;
    }

    printf("Total number of leading zeros = %d", count);

    return 0;
}

```

```
Enter any number: 22
Total number of leading zeros in 22 is 27
```
---
# 11. Write a C program to flip bits of a binary number using bitwise operator.

| ***Input:***         | ***Output:***                                   |
| -------------------- | ----------------------------------------------- |
| Input any number: 22 | Number after bits are flipped: -23 (in decimal) |

```c
/**
 * C program to count flip all bits of a binary number using bitwise operator
 */

#include <stdio.h>

int main()
{
    int num, flippedNumber;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    flippedNumber = ~num;

    printf("Original number = %d (in decimal)\n", num);
    printf("Number after bits are flipped = %d (in decimal)", flippedNumber);

    return 0;
}

```

```
Enter any number: 22
Original number = 22 (in decimal)
Number after bits are flipped = -23 (in decimal)
```
---
# 12. Write a C program to count total zeros and ones in a binary number.

| ***Input:***         | ***Output:***                                          |
| -------------------- | ------------------------------------------------------ |
| Input any number: 22 | Output number of ones: 3<br>Output number of zeros: 29 |

```c
/**
 * C program to count total of zeros and ones in a binary number using bitwise operator
 */

#include <stdio.h>
#define INT_SIZE sizeof(int) * 8 /* Total number of bits in integer */

int main()
{
    int num, zeros, ones, i;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    zeros = 0;
    ones = 0;

    for(i=0; i<INT_SIZE; i++)
    {
        /* If LSB is set then increment ones otherwise zeros */
        if(num & 1)
            ones++;
        else
            zeros++;

        /* Right shift bits of num to one position */
        num >>= 1;
    }

    printf("Total zero bit is %d\n", zeros);
    printf("Total one bit is %d", ones);

    return 0;
}

```

```
Enter any number: 22
Total zero bit is 29
Total one bit is 3
```
---
# 13. Write a C program to rotate bits of a given number.

| ***Input:***                                  | ***Output:***                                                            |
| --------------------------------------------- | ------------------------------------------------------------------------ |
| Input number = -15<br>Number of rotations = 2 | -15 left rotated 2 times = -57<br>-15 right rotated 2 times = 2147483644 |

```c
#include <stdio.h>

#define INT_SIZE sizeof(int)        // Size of int in bytes
#define INT_BITS INT_SIZE * 8 - 1   // Size of int in bits - 1


/* Function declarations */
int rotateLeft(int num, unsigned int rotation);
int rotateRight(int num, unsigned int rotation);


int main()
{
    int num;
    unsigned int rotation;

    /* Input number from user */
    printf("Enter a number: ");
    scanf("%d", &num);

    /* Input number of rotation */
    printf("Enter number of rotation: ");
    scanf("%u", &rotation);


    /* Print rotated number */
    printf("%d left rotated %u times = %d\n\n",  num, rotation, rotateLeft(num, rotation));
    printf("%d right rotated %u times = %d\n", num, rotation, rotateRight(num, rotation));


    return 0;
}



/**
 * Function to rotate bits of a number to left.
 *
 * @num         Number to rotate.
 * @rotation    Number of times to rotate left.
 */
int rotateLeft(int num, unsigned int rotation)
{
    int DROPPED_MSB;

    // The effective rotation
    rotation %= INT_BITS;


    // Loop till rotation becomes 0
    while(rotation--)
    {
        // Get MSB of num before it gets dropped
        DROPPED_MSB = (num >> INT_BITS) & 1; 

        // Left rotate num by 1 and 
        // Set its dropped MSB as new LSB
        num = (num << 1) | DROPPED_MSB;
    }

    return num;
}



/**
 * Function to rotate bits of a number to right.
 *
 * @num         Number to rotate.
 * @rotation    Number of times to rotate right.
 */
int rotateRight(int num, unsigned int rotation)
{
    int DROPPED_LSB;

    // The effective rotation
    rotation %= INT_BITS;


    // Loop till rotation becomes 0
    while(rotation--)
    {
        // Get LSB of num before it gets dropped
        DROPPED_LSB = num & 1;

        // Right shift num by 1 and 
        // Clear its MSB
        num = (num >> 1) & (~(1 << INT_BITS));

        // Set its dropped LSB as new MSB
        num = num | (DROPPED_LSB << INT_BITS);
    }

    return num;
}

```

add, 

```c
int rotateLeft(int num, unsigned int rotation)
{
    rotation %= INT_BITS;

    while(rotation--)
        num = (num << 1) | (1 & (num >> INT_BITS));

    return num;
}

int rotateRight(int num, unsigned int rotation)
{
    rotation %= INT_BITS;

    while(rotation--)
        num = ((num >> 1) & (~(1 << INT_BITS)) | ((num & 1) << INT_BITS));

    return num;
}
```

```
Enter a number: -15
Enter number of rotation: 2

-15 left rotated 2 times = -57
-15 right rotated 2 times = 2147483644
```
---
# 14. Write a C program to convert decimal to binary number system using bitwise operator.

| ***Input:***         | ***Output:***                                   |
| -------------------- | ----------------------------------------------- |
| Input any number: 22 | Binary number: 00000000000000000000000000010110 |

```c
/**
 * C program to convert decimal to binary number system
 */

#include <stdio.h>
#define INT_SIZE sizeof(int) * 8 /* Size of int in bits */

int main()
{
    int num, index, i;
    int bin[INT_SIZE];

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    index = INT_SIZE - 1;

    while(index >= 0)
    {
        /* Store LSB of num to bin */
        bin[index] = num & 1;

        /* Decrement index */
        index--;

        /* Right Shift num by 1 */
        num >>= 1;
    }

    /* Print converted binary */
    printf("Converted binary: ");
    for(i=0; i<INT_SIZE; i++)
    {
        printf("%d", bin[i]);
    }

    return 0;
}

```

```
Enter any number: 22
Converted binary : 00000000000000000000000000010110
```
---
# 15. Write a C program to swap two numbers using bitwise operator.

| ***Input:***                                      | ***Output:***                                                       |
| ------------------------------------------------- | ------------------------------------------------------------------- |
| Input first number: 22<br>Input second number: 65 | First number after swapping: 65<br>Second number after swapping: 22 |

```c
/**
 * C program to swap two numbers using bitwise operator
 */

#include <stdio.h>

int main()
{
    int num1, num2;

    /* Input two numbers from user */
    printf("Enter any two numbers: ");
    scanf("%d%d", &num1, &num2);

    printf("Original value of num1 = %d\n", num1);
    printf("Original value of num2 = %d\n", num2);

    /* Swap two numbers */
    num1 ^= num2;
    num2 ^= num1;
    num1 ^= num2;

    printf("Num1 after swapping = %d\n", num1);
    printf("Num2 after swapping = %d\n", num2);

    return 0;
}

```

```
Enter any two numbers: 22
65
Original value of num1 = 22
Original value of num2 = 65
Num1 after swapping = 65
Num2 after swapping = 22
```
---
# 16. Write a C program to check whether a number is even or odd using bitwise operator.

| ***Input:***     | ***Output:*** |
| ---------------- | ------------- |
| Input number: 12 | 12 is even    |

```c
/**
 * C program to check even or odd number using bitwise operator
 */

#include <stdio.h>

int main()
{
    int num;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    if(num & 1)
    {
        printf("%d is odd.", num);
    }
    else
    {
        printf("%d is even.", num);
    }

    return 0;
}

```

OR,

```c
/**
 * C program to check whether a number is even or odd using bitwise operator
 */

#include <stdio.h>

int main()
{
    int num;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    (num & 1) 
        ? printf("%d is odd.", num) 
        : printf("%d is even.", num);

    return 0;
}
```

```
Enter any number: 15
15 is odd.
```
---
# 🟢 CONDITIONAL OPERATORS

---
# 1. Find the maximum between two numbers (using conditional operator).

| ***Input:***                                      | ***Output:*** |
| ------------------------------------------------- | ------------- |
| Input first number: 10<br>Input second number: 20 | Maximum: 20   |

```c
#include <stdio.h>

int main()
{
    int num1, num2;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    
    int max = (num1 > num2) ? num1 : num2;

    printf("Maximum between %d and %d is %d", num1, num2, max);

    return 0;
}

// think like this , (num1 > num2) ? num1 : num2;
// the greater number will be assigned to max bcz of the = sign
// and if we just print the max variable then the greatest number will be printed as well


/*
     * If num1 > num2 then
     *     assign num1 to max
     * else
     *     assign num2 to max 
     */ // these four lines were just been compacted into that one line

```

```
Enter two numbers: 10
20
Maximum between 10 and 20 is 20
```
---
# 2. Find the maximum between three numbers (using conditional operator).

| ***Input:***                                       | ***Output:*** |
| -------------------------------------------------- | ------------- |
| Input num1: 10<br>Input num2: 20<br>Input num3: 30 | Maximum is 30 |

```c
// C program to find maximum between three numbers using conditional operator
 

#include <stdio.h>

int main()
{
    int num1, num2, num3;
    printf("Enter three numbers: \n");
    scanf("%d %d %d", &num1, &num2, &num3);

    
    int max;
    max = (num1 > num2 && num1 > num3) ? num1 :
          (num2 > num3) ? num2 : num3;

    printf("\nMaximum = %d \n", max);

    return 0;
}


/*
     * If num1 > num2 and num1 > num3 then
     *     assign num1 to max
     * else if num2 > num3 then
     *     assign num2 to max
     * else
     *     assign num3 to max
     */

```

```
Enter three numbers:
10
20
30

Maximum = 30
```
---
# 3. Check whether a number is even or odd (using conditional operator).

| ***Input:***                              | ***Output:***       |
| ----------------------------------------- | ------------------- |
| Enter any number to check even or odd: 10 | The number is even. |

```c
/**
 * C program to check even or odd number using conditional operator
 */

#include <stdio.h>

int main()
{
    int num;
    printf("Enter any number to check even or odd: ");
    scanf("%d", &num);

    
    (num%2 == 0) ? printf("The number is EVEN") : printf("The number is ODD");

    return 0;
}


/* 
     * If n%2==0 then 
     *     print it is even
     * else
     *     print it is odd
     */

```

OR,

```c
/**
 * C program to check even or odd number using conditional operator
 */

#include <stdio.h>

int main()
{
    int num;
    printf("Enter any number to check even or odd: ");
    scanf("%d", &num);

    
    printf("The number is %s", (num%2==0 ? "EVEN" : "ODD"));

    return 0;
}
```

```
Enter any number to check even or odd: 10
The number is EVEN
```
---
# 4. Check whether year is leap year or not (using conditional operator).

| ***Input:***         | ***Output:***     |
| -------------------- | ----------------- |
| Enter any year: 2016 | It is a Leap Year |

```c
#include <stdio.h>

int main()
{
    int year;
    printf("Enter any year: ");
    scanf("%d", &year);

    
    (year%400 == 0 || year%4 == 0 && year%100 != 0) 
		    
			? printf("LEAP YEAR")
		    : printf("COMMON YEAR");


    return 0;
}

// ( n%400==0 || n%4==0 && n%100!=0 )   //reason ki??

```

OR,

```c
// C program to check leap year using conditional operator

#include <stdio.h>

int main()
{
    int year;
    printf("Enter any year: ");
    scanf("%d", &year);

    
    (year%4 == 0 && year%100 != 0) ? printf("LEAP YEAR") :
        (year%400 == 0) ? printf("LEAP YEAR") : printf("COMMON YEAR");


    return 0;
}


/*
     * If year%4 == 0 and year%100 != 0 then
     *     print leap year
     * else if year%400 == 0 then
     *     print leap year
     * else
     *     print common year 
     */

```

OR,

```c
/**
 * C program to check leap year using conditional operator
 */

#include <stdio.h>

int main()
{
    int year;
 
    /*
     * Input year from user
     */
    printf("Enter any year: ");
    scanf("%d", &year);

    printf("%s", ((year%4==0 && year%100!=0)
				? "LEAP YEAR" 
				: (year%400 ==0 ) 
					? "LEAP YEAR" 
					: "COMMON YEAR"));

    return 0;
}
```

```
Enter any year: 2016
It is a LEAP YEAR
```
---
# 5. Check whether character is an alphabet or not (using conditional operator).

| ***Input:***           | ***Output:***  |
| ---------------------- | -------------- |
| Enter any character: a | It is ALPHABET |

```c
// C program to check alphabets using Conditional operator

#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);
    
    
    (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') 
    
        ? printf("It is ALPHABET")
        : printf("It is NOT ALPHABET");

    return 0;
}
```

```
Enter any character: a
It is ALPHABET
```
---
# 🟢 SWITCH

---
# 1. Print day of week name using switch case.

| ***Input:***              | ***Output:***                                        |
| ------------------------- | ---------------------------------------------------- |
| Input week number(1-7): 2 | Tuesday                                              |
| Input week number(1-7): # | Invalid input! Please enter week number between 1-7. |
| Input week number(1-7): 4 | Thursday                                             |

```c
#include <stdio.h>

int main()
{
    int week;
    printf("Enter week number(1-7): ");
    scanf("%d", &week);


    switch(week)
    {
        case 1: 
            printf("Monday");
            break;
        case 2: 
            printf("Tuesday");
            break;
        case 3: 
            printf("Wednesday");
            break;
        case 4: 
            printf("Thursday");
            break;
        case 5: 
            printf("Friday");
            break;
        case 6: 
            printf("Saturday");
            break;
        case 7: 
            printf("Sunday");
            break;
        default: 
            printf("Invalid input! Please enter week number between 1-7.");
    }

    return 0;
}
```
---
# 2. Print total number of days in a month using switch case.

| ***Input:***          | ***Output:***             |
| --------------------- | ------------------------- |
| Input month number: 3 | Total number of days = 31 |

```c
#include <stdio.h>

int main()
{
    int month;
    printf("Enter month number(1-12): ");
    scanf("%d", &month);



    switch(month)
    {
        case 1: 
            printf("31 days");
            break;
        case 2: 
            printf("28/29 days");
            break;
        case 3: 
            printf("31 days");
            break;
        case 4: 
            printf("30 days");
            break;
        case 5: 
            printf("31 days");
            break;
        case 6: 
            printf("30 days");
            break;
        case 7: 
            printf("31 days");
            break;
        case 8: 
            printf("31 days");
            break;
        case 9: 
            printf("30 days");
            break;
        case 10: 
            printf("31 days");
            break;
        case 11: 
            printf("30 days");
            break;
        case 12: 
            printf("31 days");
            break;
        default: 
            printf("Invalid input! Please enter month number between 1-12");

    }

    return 0;
}

```

OR,

```c
switch(month)
{
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        printf("31 days.");
        break;
}
```

OR,

```c
#include <stdio.h>

int main()
{
    int month;
    printf("Enter month number(1-12): ");
    scanf("%d", &month);



    switch(month)
    {
        
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: 
            printf("31 days");
            break;

        
        case 4:
        case 6:
        case 9:
        case 11: 
            printf("30 days");
            break;

        
        case 2: 
            printf("28/29 days");
            break;


        default: 
            printf("Invalid input! Please enter month number between 1-12");
    }

    return 0;
}

//Group all 31 days cases together 
//Group all 30 days cases together
//Remaining case


```
---
# 3. Check whether an alphabet is vowel or consonant using switch case.

| ***Input:***      | ***Output:***    |
| ----------------- | ---------------- |
| Input alphabet: c | 'c' is consonant |
|                   |                  |

```c
#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any alphabet: ");
    scanf("%c", &ch);


    switch(ch)
    {
        case 'a': 
            printf("Vowel");
            break;
        case 'e': 
            printf("Vowel");
            break;
        case 'i': 
            printf("Vowel");
            break;
        case 'o': 
            printf("Vowel");
            break;
        case 'u': 
            printf("Vowel");
            break;
        case 'A': 
            printf("Vowel");
            break;
        case 'E': 
            printf("Vowel");
            break;
        case 'I': 
            printf("Vowel");
            break;
        case 'O': 
            printf("Vowel");
            break;
        case 'U': 
            printf("Vowel");
            break;
            
        default: 
            printf("Consonant");
    }

    return 0;
}

```

OR,

```c
switch(ch)
{
    case 'a': 
    case 'e': 
    case 'i':
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
        printf("Vowel");
        break;
        
	default: 
        printf("Consonant");
}

```

OR,

```c
#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);


    /* Switch ch value */
    switch(ch)
    {
        case 'a': 
        case 'e': 
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U': 
            printf("Vowel");
            break;

        default: printf("Consonant");
    }

    return 0;
}

```
---
# 4. Find maximum between two numbers using switch case.

| ***Input:***                                      | ***Output:*** |
| ------------------------------------------------- | ------------- |
| Input first number: 12<br>Input second number: 40 | Maximum: 40   |

```c
#include <stdio.h>

int main()
{
    int num1, num2;
    printf("Enter two numbers to find maximum: ");
    scanf("%d %d", &num1, &num2);


    
    switch(num1 > num2)
    {   
        case 1: 
            printf("%d is maximum", num1);
            break;
            
        case 0: 
            printf("%d is maximum", num2);
            break;

    }

    return 0;
}

/* Expression (num1 > num2) will return either 0 or 1 */
/* If condition (num1>num2) is false */
/* If condition (num1>num2) is true */

```

```
Enter two numbers to find maximum: 20
10
20 is maximum

```
---
# 5. Check whether a number is even or odd using switch case.

| ***Input:***     | ***Output:*** |
| ---------------- | ------------- |
| Input number: 12 | Even number   |

```c
#include <stdio.h>

int main()
{
    int num;
    printf("Enter any number to check even or odd: ");
    scanf("%d", &num);


    switch(num % 2)
    {
        case 1: 
            printf("Number is Odd");
            break;
            
        case 0: 
            printf("Number is Even");
            break;

    }

    return 0;
}

// num%2 er result either 1 (true) or 0 (false) ashbe
// first a operation ta cholbe then true or false oi hishabe vitore dhuke case run korbe
/* Else if n%2 == 1 */
/* If n%2 == 0 */

```

```
Enter any number to check even or odd: 6
Number is Even

```
---
# 6. Check whether a number is positive, negative or zero using switch case.

| ***Input:***     | ***Output:***  |
| ---------------- | -------------- |
| Input number: 23 | 23 is positive |

```c
#include <stdio.h>

int main()
{
    int num;
    printf("Enter any number: ");
    scanf("%d", &num);



    switch (num > 0)
    {
        
        case 1:
            printf("%d is positive.", num);
        break;

        
        case 0:
            switch (num < 0)
            {
                case 1: 
                    printf("%d is negative.", num);
                    break;
                case 0:
                    printf("%d is zero.", num);
                    break;
            }
        break;
    }

    return 0;
}


// Num is positive
// Num is either negative or zero


```

```
Enter any number: 23
23 is positive.

Enter any number: -22
-22 is negative.

Enter any number: 0
0 is zero.

```
---
# 7. Find roots of a quadratic equation using switch case.

| ***Input:***                              | ***Output:***                   |
| ----------------------------------------- | ------------------------------- |
| Input a: 4<br>Input b: -2<br>Input c: -10 | Root1: 1.85<br>Root2: -1.35<br> |

```c

#include <stdio.h>
#include <math.h> //Used for sqrt()

int main()
{
    float a, b, c;
    float root1, root2, imaginary;
    float D;

    printf("Enter values of a, b, c of quadratic equation (aX^2 + bX + c): ");
    scanf("%f %f %f", &a, &b, &c);

    
    D = (b*b) - (4 *a *c);


    
    switch(D > 0)
    {
        case 1:
            root1 = (-b + sqrt(D)) / (2 * a);
            root2 = (-b - sqrt(D)) / (2 * a);

            printf("Two distinct and real roots exists: %.2f and %.2f", 
                    root1, root2);
            break;


        case 0:
            switch(D < 0)
            {
                case 1:
                    root1 = root2 = -b / (2 * a);
                    imaginary = sqrt(-D) / (2 * a);

                    printf("Two distinct complex roots exists: %.2f + i%.2f and %.2f - i%.2f", root1, imaginary, root2, imaginary);
                    break;


                case 0:
                    root1 = root2 = -b / (2 * a);

                    printf("Two equal and real roots exists: %.2f and %.2f", root1, root2);
                    break;
            }
    }

    return 0;
}

```

```
Enter values of a, b, c of quadratic equation (aX^2 + bX + c): 4 -2 -10
Two distinct and real roots exists: 1.85 and -1.35

```
---
# 8. Create Simple Calculator using switch case.

| ***Input:*** | ***Output:*** |
| ------------ | ------------- |
| 5.2, - 3     | 2.2           |
|              |               |

```c
#include <stdio.h>

int main()
{
    char op;
    float num1, num2, result=0.0f;
    printf("WELCOME TO SIMPLE CALCULATOR\n");
    printf("----------------------------\n");
    printf("Enter [number 1] [+ - * /] [number 2]\n");

    
    scanf("%f %c %f", &num1, &op, &num2);

    
    switch(op)
    {
        case '+': 
            result = num1 + num2;
            break;

        case '-': 
            result = num1 - num2;
            break;

        case '*': 
            result = num1 * num2;
            break;

        case '/': 
            result = num1 / num2;
            break;

        default: 
            printf("Invalid operator");
    }

    
    printf("%.2f %c %.2f = %.2f", num1, op, num2, result);

    return 0;
}

```

OR,

```c
#include <stdio.h>

//float add(float num1, float num2);
//float sub(float num1, float num2);
//float mult(float num1, float num2);
//float div(float num1, float num2);


float add(float num1, float num2)
{
    return num1 + num2;
}


float sub(float num1, float num2)
{
    return num1 - num2;
}


float mult(float num1, float num2)
{
    return num1 * num2;
}


float div(float num1, float num2)
{
    return num1 / num2;
}




int main()
{
    float num1, num2, result=0.0f;
	char op;
    printf("WELCOME TO SIMPLE CALCULATOR\n");
    printf("----------------------------\n");
    printf("Enter [number 1] [+ - * /] [number 2]\n");


    scanf("%f %c %f", &num1, &op, &num2);


    switch(op)
    {
        case '+': 
            result = add(num1, num2);
            break;

        case '-': 
            result = sub(num1, num2);
            break;

        case '*': 
            result = mult(num1, num2);
            break;

        case '/': 
            result = div(num1, num2);
            break;

        default: 
            printf("Invalid operator");
    }


    printf("%.2f %c %.2f = %.2f", num1, op, num2, result);

    return 0;
}

// Function declarations for calculator


```

```
WELCOME TO SIMPLE CALCULATOR
----------------------------
Enter [number 1] [+ - * /] [number 2]
22 * 6
22.00 * 6.00 = 132.00

```
---
# 🟢 IF ELSE

---
# 1. Find maximum between two numbers.

| ***Input:***                     | ***Output:*** |
| -------------------------------- | ------------- |
| Input num1: 10<br>Input num2: 20 | Maximum = 20  |

```c
#include <stdio.h>

int main()
{
    int num1, num2;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    
    if(num1 > num2)
    {
        printf("%d is maximum", num1);        
    }

    
    if(num2 > num1)
    {
        printf("%d is maximum", num2);
    }

    
    if(num1 == num2)   /* Additional condition check for equality */
    {
        printf("Both are equal");
    }

    return 0;
}

// not the perfect way to do this kind of math, its not a good practice


```

OR,

```c
#include <stdio.h>

int main()
{
    int num1, num2;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);


    if(num1 > num2)
    {
        printf("%d is maximum", num1);        
    }
    else
    {
        printf("%d is maximum", num2);
    }

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    int num1, num2;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);


    int max;
    
    if(num1 > num2) max = num1;
    else max = num2;

    printf("%d is maximum.", max);

    return 0;
}

```
---
# 2. Find maximum between three numbers.

| ***Input:***                                       | ***Output:***  |
| -------------------------------------------------- | -------------- |
| Input num1: 10<br>Input num2: 20<br>Input num3: 15 | Maximum is: 20 |

```c
#include <stdio.h>

int main()
{
    int num1, num2, num3;
    printf("Enter three numbers: \n");
    scanf("%d %d %d", &num1, &num2, &num3);


	int max;
	
    if(num1 > num2)
    {
        if(num1 > num3)
        {
            max = num1;
        }
        else
        {
            max = num3;
        }
    }
    else
    {
        if(num2 > num3)
        {
            max = num2;
        }
        else
        {
            max = num3;
        }
    }

    printf("Maximum = %d", max);

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    int num1, num2, num3;
    printf("Enter three numbers: \n");
    scanf("%d %d %d", &num1, &num2, &num3);


	int max;
	
    if((num1 > num2) && (num1 > num3))
    {
        max = num1;
    }
    else if((num2 > num1) && (num2 > num3))
    {
        max = num2;
    }
    else if((num3 > num1) && (num3 > num2))
    {
        max = num3;
    }

    

    printf("Maximum = %d", max);

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    int num1, num2, num3;
    printf("Enter three numbers: \n");
    scanf("%d %d %d", &num1, &num2, &num3);


	int max;
	
    if((num1 > num2) && (num1 > num3))
    {
        max = num1;
    }
    else if(num2 > num3)
    {
        max = num2;
    }
    else
    {
        max = num3;
    }


    printf("Maximum = %d", max);

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    int a, b, c;
    printf("Enter three numbers: \n");
    scanf("%d %d %d", &a, &b, &c);

	
    if( a > b )
    {
        printf("%d is the greatest. \n", a);
    }
    
    else
    {
        if( b > c )
		{
			printf("%d is the greatest. \n", b);
		}
		else
		{
			printf("%d is the greatest. \n", c);
		}


    }


    return 0;
}


```
---
# 3. Check whether a number is negative, positive or zero.

| ***Input:***     | ***Output:***  |
| ---------------- | -------------- |
| Input number: 23 | 23 is positive |

```c
#include <stdio.h>

int main()
{
    int num;
    printf("Enter any number: \n");
    scanf("%d", &num);
    

    if(num > 0)
    {
        printf("Number is POSITIVE");
    }
    else if(num < 0)
    {
        printf("Number is NEGATIVE");
    }
    else if(num == 0)
    {
        printf("Number is ZERO");
    }
    

    return 0;
}
```
---
# 4. Check whether a number is divisible by 5 and 11 or not.

| ***Input:***     | ***Output:***                   |
| ---------------- | ------------------------------- |
| Input number: 55 | Number is divisible by 5 and 11 |

```c
#include <stdio.h>

int main()
{
    int num;
    printf("Enter any number: ");
    scanf("%d", &num);


    if((num % 5 == 0) && (num % 11 == 0))
    {
        printf("Number is divisible by 5 and 11");
    }
    else
    {
        printf("Number is not divisible by 5 and 11");
    }

    return 0;
}

/*
     * If  num modulo division 5 is 0 
     * and num modulo division 11 is 0 then
     * the number is divisible by 5 and 11 both
     */

```

OR,

```c
if(!(num % 5) && !(num % 11))
    printf("Number is divisible by 5 and 11");
else
    printf("Number is not divisible by 5 and 11");

```
---
# 5. Check whether a number is even or odd.

| ***Input:***     | ***Output:***     |
| ---------------- | ----------------- |
| Input number: 10 | 10 is even number |

```c
#include <stdio.h>

int main()
{
    int num;
    printf("Enter any number to check even or odd: ");
    scanf("%d", &num);
    
    
    if(num % 2 == 0)
    {
        printf("Number is Even.");
    }
    else
    {
        printf("Number is Odd.");
    }

    return 0;
}

```
---
# 6. Check whether a year is leap year or not.

| ***Input:***      | ***Output:*** |
| ----------------- | ------------- |
| Enter year : 2004 | LEAP YEAR     |
| Enter year : 2024 | LEAP YEAR     |
| Enter year : 2015 | COMMON YEAR   |

```c
#include <stdio.h>

int main()
{
    int year;
    printf("Enter year : ");
    scanf("%d", &year);


    if(  ((year % 4 == 0) && (year % 100 !=0)) || (year % 400==0)  )
    {
        printf("LEAP YEAR");
    }
    else
    {
        printf("COMMON YEAR");
    }

    return 0;
}
```
---
# 7. Check whether a character is alphabet or not.

| ***Input:***       | ***Output:***   |
| ------------------ | --------------- |
| Input character: a | 'a' is alphabet |

```c
#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);
    

    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
    {
        printf("Character is an ALPHABET.");
    }
    else
    {
        printf("Character is NOT ALPHABET.");
    }

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);


    if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
    {
        printf("Character is an ALPHABET.");
    }
    else
    {
        printf("Character is NOT ALPHABET.");
    }

    return 0;
}

// must be remembered 'A' = 65 , 'a' = 97

```
---
# 8. Input any alphabet and check whether it is vowel or consonant.

| ***Input:***       | ***Output:*** |
| ------------------ | ------------- |
| Input character: a | 'a' is vowel  |

```c
#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);


    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    {
        printf("'%c' is Vowel.", ch);
    }
    else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
    {
        
        printf("'%c' is Consonant.", ch);  
    }
    else 
    {
        printf("'%c' is not an alphabet.", ch);
    }

    return 0;
}
```

OR,

```c
#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);


    if(ch==97 || ch==101 || ch==105 || ch==111 || ch==117 || 
       ch==65 || ch==69  || ch==73  || ch==79  || ch==85)
    {
        printf("'%c' is Vowel.", ch);
    }
    else if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
    {
        printf("'%c' is Consonant.", ch);
    }
    else 
    {
        printf("%c is not an alphabet.", ch);
    }

    return 0;
}

// this one is HARDER , dont try this

```

```
Enter any character: a
'a' is Vowel.
```
---
# 9. Input any character and check whether it is alphabet, digit or special character.

| ***Input:***           | ***Output:*** |
| ---------------------- | ------------- |
| Input any character: 3 | 3 is digit    |

```c
#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);



    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
    {
        printf("'%c' is alphabet.", ch);
    }
    else if(ch >= '0' && ch <= '9')
    {
        printf("'%c' is digit.", ch);
    }
    else 
    {
        printf("'%c' is special character.", ch);
    }

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);


    if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
    {
        printf("'%c' is alphabet.", ch);
    }
    else if(ch >= 48 && ch <= 57)
    {
        printf("'%c' is digit.", ch);
    }
    else
    {
        printf("'%c' is special character.", ch);
    }

    return 0;
}

// dont try this

```

```
Enter any character: a
'a' is alphabet.
```
---
# 10. Check whether a character is uppercase or lowercase alphabet.

| ***Input:***       | ***Output:***             |
| ------------------ | ------------------------- |
| Input character: C | 'C' is uppercase alphabet |
|                    |                           |

```c
#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);


    if(ch >= 'A' && ch <= 'Z')
    {
        printf("'%c' is uppercase alphabet.", ch);
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        printf("'%c' is lowercase alphabet.", ch);
    }
    else
    {
        printf("'%c' is not an alphabet.", ch);  //additional
    }

    return 0;
}

//additional, to not get an error

```

OR,

```c
#include <stdio.h>
#include <ctype.h>  //Used for isupper() and islower()

int main()
{
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);



    if(isupper(ch))
    {
        printf("'%c' is uppercase alphabet.", ch);
    }
    else if(islower(ch))
    {
        printf("'%c' is lowercase alphabet.", ch);
    }
    else
    {
        printf("'%c' is not an alphabet.", ch);
    }

    return 0;
}

```

```
Enter any character: C
'C' is uppercase alphabet.
```
---
# 11. Input week number and print week day.

| ***Input:***         | ***Output:*** |
| -------------------- | ------------- |
| Input week number: 1 | Monday        |

```c
#include <stdio.h>

int main()
{
    int week;
    printf("Enter week number (1-7): ");
    scanf("%d", &week);


    if(week == 1)
    {
        printf("Monday");
    }
    else if(week == 2)
    {
        printf("Tuesday");
    }
    else if(week == 3)
    {
        printf("Wednesday");
    }
    else if(week == 4)
    {
        printf("Thursday");
    }
    else if(week == 5)
    {
        printf("Friday");
    }
    else if(week == 6)
    {
        printf("Saturday");
    }
    else if(week == 7)
    {
        printf("Sunday");
    }
    else
    {
        printf("Invalid Input! Please enter week number between 1-7.");
    }

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    /* Declare constant name of weeks */
    const char * WEEKS[] = { "Monday", "Tuesday", "Wednesday", 
							"Thursday", "Friday", "Saturday", 
							"Sunday"};
    int week;

    /* Input week number from user */
    printf("Enter week number (1-7): ");
    scanf("%d", &week);
	
    if(week > 0 && week < 8)
    {
        /* Print week name using array index */
        printf("%s", WEEKS[week-1]);
    }
    else
    {
        printf("Invalid input! Please enter week number between 1-7.");
    }

    return 0;
}


```

```
Enter week number (1-7): 1
Monday
```
---
# 12. Input month number and print number of days in that month.

| ***Input:***          | ***Output:***        |
| --------------------- | -------------------- |
| Enter month number: 1 | It contains 31 days. |

```c
/**
 * C program to print number of days in a month
 */

#include <stdio.h>

int main()
{
    int month;
    printf("Enter month number (1-12): ");
    scanf("%d", &month);


    if(month == 1)  //january
    {
        printf("31 days");  
    }
    else if(month == 2)  //february
    {
        printf("28 or 29 days");  
    }
    else if(month == 3)
    {
        printf("31 days");
    }
    else if(month == 4)
    {
        printf("30 days");
    }
    else if(month == 5)
    {
        printf("31 days");
    }
    else if(month == 6)
    {
        printf("30 days");
    }
    else if(month == 7)
    {
        printf("31 days");
    }
    else if(month == 8)
    {
        printf("31 days");
    }
    else if(month == 9)
    {
        printf("30 days");
    }
    else if(month == 10)
    {
        printf("31 days");
    }
    else if(month == 11)  //november
    {
        printf("30 days");  
    }
    else if(month == 12)  //december
    {
        printf("31 days");  
    }
    else
    {
        printf("Invalid input! Please enter month number between (1-12).");
    }

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    int month;
    printf("Enter month number (1-12): ");
    scanf("%d", &month);


    /* Group all 31 days conditions together using logical OR operator */
    if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
    {
        printf("31 days");
    }
    else if(month==4 || month==6 || month==9 || month==11)
    {
        /* Group all 30 days months together */
        printf("30 days");
    }
    else if(month==2)
    {
        printf("28 or 29 days");
    }
    else
    {
        printf("Invalid input! Please enter month number between (1-12).");
    }

    return 0;
}

```

OR,

```c 
#include <stdio.h>
 
int main()
{
    
    const int MONTHS[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int month;
    printf("Enter month number (1-12): ");
    scanf("%d", &month);


 
    if(month >= 1 && month <= 12)
    {
		printf("%d days", MONTHS[month - 1]);
    }
    else
    {
        printf("Invalid input! Please enter month number between (1-12).");
    }
 
    return 0;
}

```

```
Enter month number (1-12): 12
31 days
```
---
# 13. Count total number of notes in given amount. 🚩

| ***Input:***           | ***Output:***                                                                                                  |
| ---------------------- | -------------------------------------------------------------------------------------------------------------- |
| Enter amount: 575      | Total number of notes: <br>500: 1<br>100: 0<br>50: 1<br>20: 1<br>10: 0<br>5: 1<br>2: 0<br>1: 0                 |
| Enter amount: 4673<br> | Total number of notes = <br>500 = 9 <br>100 = 1 <br>50 = 1 <br>20 = 1 <br>10 = 0 <br>5 = 0 <br>2 = 1 <br>1 = 1 |

```c
#include <stdio.h>

int main()
{
    int amount;
    int note500, note100, note50, note20, note10, note5, note2, note1;


    note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;   // Initialize all notes to 0
 
    printf("Enter amount: ");
    scanf("%d", &amount);    // suppose, amount = 2356 BDT

	
	//operations
    if(amount >= 500)    
    {
        note500 = amount/500; //note500 er value int dekhe 4 assign hoye jabe
        amount = amount - (note500 * 500);  //new_amount = old_amount - (note500 * 500)
    }
    if(amount >= 100)
    {
        note100 = amount/100;
        amount = amount - (note100 * 100);
    }
    if(amount >= 50)
    {
        note50 = amount/50;
        amount = amount - (note50 * 50);
    }
    if(amount >= 20)
    {
        note20 = amount/20;
        amount = amount - (note20 * 20);
    }
    if(amount >= 10)
    {
        note10 = amount/10;
        amount = amount - (note10 * 10);
    }
    if(amount >= 5)
    {
        note5 = amount/5;
        amount = amount - (note5 * 5);
    }
    if(amount >= 2)
    {
        note2 = amount /2;
        amount = amount - (note2 * 2);
    }
    if(amount >= 1)
    {
        note1 = amount;
    }



    printf("Total number of notes = \n");   //ouput
    printf("500 = %d \n", note500);
    printf("100 = %d \n", note100);
    printf("50 = %d \n", note50);
    printf("20 = %d \n", note20);
    printf("10 = %d \n", note10);
    printf("5 = %d \n", note5);
    printf("2 = %d \n", note2);
    printf("1 = %d \n", note1);

    return 0;
}

```
---
# 14. Input angles of a triangle and check whether triangle is valid or not.

| ***Input:***                                                             | ***Output:***         |
| ------------------------------------------------------------------------ | --------------------- |
| Input first angle: 60<br>Input second angle: 30<br>Input third angle: 90 | Triangle is valid     |
| Input first angle: 60<br>Input second angle: 40<br>Input third angle: 60 | Triangle is not valid |

```c
#include <stdio.h>

int main()
{
    int a, b, c;  // angles 3ta a, b, c diye indicate korsi 
    printf("Enter three angles of triangle: \n");
    scanf("%d %d %d", &a, &b, &c);

    
    int sum = a + b + c; 

    
    if(sum==180  &&  a>0  &&  b>0  &&  c>0)    // 0 means there is no angle, so it has to be greater than zero
    {
        printf("Triangle is valid.");
    }
    else
    {
        printf("Triangle is not valid.");
    }

    return 0;
}
```
---
# 15. Input all sides of a triangle and check whether triangle is valid or not.

| ***Input:***                                                        | ***Output:***     |
| ------------------------------------------------------------------- | ----------------- |
| Input first side: 7<br>Input second side: 10<br>Input third side: 5 | Triangle is valid |

```c
#include <stdio.h>

int main()
{
    int a, b, c;   //side1, side2, side3
    printf("Enter three sides of triangle: \n");
    scanf("%d %d %d", &a, &b, &c);

    if((a + b > c) && (a + c > b) && (b + c > a))
    {
        printf("Triangle is valid.");
    }
    else
    {
        printf("Triangle is not valid.");
    }

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    int a, b, c;  // side 3ta
    printf("Enter three sides of triangle: \n");
    scanf("%d %d %d", &a, &b, &c);



    if((a + b) > c)
    {
        if((b + c) > a)
        {
            if((a + c) > b) 
            {
                printf("Triangle is valid.");
            }
            else
            {
                printf("Triangle is not valid.");
            }
        }
        else
        {
            printf("Triangle is not valid.");
        }
    }
    else
    {
        printf("Triangle is not valid.");
    }

    return 0;
}


/*
                 * If side1 + side2 > side3 and
                 *    side2 + side3 > side1 and
                 *    side1 + side3 > side2 then
                 * the triangle is valid.
                 */

```

OR,

```c
/** 
 * C program to check whether a triangle is valid using nested if 
 */  
  
#include <stdio.h>  
  
int main()  
{  
    int side1, side2, side3; 

    /* Initially assume that the triangle is not valid */
    int valid = 0;
  
    /* Input all three sides of a triangle */  
    printf("Enter three sides of triangle: \n");  
    scanf("%d%d%d", &side1, &side2, &side3);  
      
    if((side1 + side2) > side3)  
    {  
        if((side2 + side3) > side1)  
        {  
            if((side1 + side3) > side2)
            {  
                /*
                 * If side1 + side2 > side3 and
                 *    side2 + side3 > side1 and
                 *    side1 + side3 > side2 then
                 * the triangle is valid. Hence set
                 * valid variable to 1.
                 */
                valid = 1;
            }  
        }
    }  
    
    /* Check valid flag variable */
    if(valid == 1)
    {
        printf("Triangle is valid.");
    }
    else
    {
        printf("Triangle is not valid.");
    }
  
    return 0;  
}

```

```
Enter three sides of triangle: 7
4
10
Triangle is valid.
```
---

# 16. Check whether the triangle is equilateral, isosceles or scalene triangle.

| ***Input:***                                                          | ***Output:***                    |
| --------------------------------------------------------------------- | -------------------------------- |
| Input first side: 30<br>Input second side: 30<br>Input third side: 30 | Triangle is equilateral triangle |

```c
#include <stdio.h>

int main()
{
    int a, b, c;
    printf("Enter three sides of triangle: \n");
    scanf("%d %d %d", &a, &b, &c);

    if( a==b && b==c ) 
    {
        printf("Equilateral triangle.");  // If all sides are equal
    }
    else if( a==b || a==c || b==c ) 
    {
        printf("Isosceles triangle.");  // If any two sides are equal
    }
    else 
    {
        printf("Scalene triangle.");  // If none sides are equal 
    }

    return 0;
}

```

```
Enter three sides of triangle: 
30
30
30
Equilateral triangle.,

```
---
# 17. Find all roots of a quadratic equation. 🚩

| ***Input:***                             | ***Output:***               |
| ---------------------------------------- | --------------------------- |
| Input a: 8<br>Input b: -4<br>Input c: -2 | Root1: 0.80<br>Root2: -0.30 |

```c
#include <stdio.h>
#include <math.h> /* Used for sqrt() */

int main()
{
    float a, b, c;
    printf("Enter values of a, b, c of quadratic equation (aX^2 + bX + c): \n");
    scanf("%f %f %f", &a, &b, &c);
    
    
    float D = (b*b) - (4*a*c);  
    float root1, root2, imaginary;
   



	if(D == 0)
    {
        root1 = root2 = -b / (2 * a);

        printf("Two equal and real roots exists: %.2f and %.2f", root1, root2);
    }


    else if(D > 0)  
    {
        root1 = (-b + sqrt(D)) / (2*a);
        root2 = (-b - sqrt(D)) / (2*a);

        printf("Two distinct and real roots exists: %.2f and %.2f", root1, root2);
    }
    
    else if(D < 0)
    {
        root1 = root2 = -b / (2 * a);
        imaginary = sqrt(-D) / (2 * a);

        printf("Two distinct and complex roots exists: %.2f + i%.2f and %.2f - i%.2f", root1, imaginary, root2, imaginary);
    }

    return 0;
}


// discriminant formula to get the value of D
// comparing with the natures of Discriminant (Natures must be memorize kora)
//disticnt = আলাদা


```

```
Enter values of a, b, c of quadratic equation (aX^2 + bX + c): 
8
-4
-2
Two distinct and real roots exists: 0.81 and -0.31

```

OR,

```
Enter values of a, b, c of quadratic equation (aX^2 + bX + c): 
893
-32
323
Two distinct and complex roots exists: 0.02 + i0.60 and 0.02 - i0.60

```

---
# 18. Calculate profit or loss.

| ***Input:***                                        | ***Output:*** |
| --------------------------------------------------- | ------------- |
| Input cost price: 1000<br>Input selling price: 1500 | Profit: 500   |

```c
#include <stdio.h>

int main()
{
    int cp,sp; 
    printf("Enter cost price: ");
    scanf("%d", &cp);
    printf("Enter selling price: ");
    scanf("%d", &sp);
    
    if(sp > cp)
    {
        printf("Profit = %d", sp - cp);  //selling price beshi hoile Profit
    }
    else if(cp > sp)
    {
        printf("Loss = %d", cp - sp);  //selling price kom hoile Loss
    }
    else
    {
        printf("No Profit No Loss.");  //SP and CP jdi same hoy
    }

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    int cp,sp, amt; 
    printf("Enter cost price: ");
    scanf("%d", &cp);
    printf("Enter selling price: ");
    scanf("%d", &sp);
    
    if(sp > cp)
    {
        amt = sp - cp;
        printf("Profit = %d", amt);
    }
    else if(cp > sp)
    {
        amt = cp - sp;
        printf("Loss = %d", amt);
    }
    else
    {
        printf("No Profit No Loss.");
    }

    return 0;
}

```

```
Enter cost price: 1000
Enter selling price: 1500
Profit = 500

```
---
# 19. Enter student marks and find percentage and grade 

Write a C program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer, calculate percentage and grade according to given conditions:  
If percentage >= 90% : Grade A  
If percentage >= 80% : Grade B  
If percentage >= 70% : Grade C  
If percentage >= 60% : Grade D  
If percentage >= 40% : Grade E  
If percentage < 40% : Grade F

| ***Input:***                                             | ***Output:***                  |
| -------------------------------------------------------- | ------------------------------ |
| Input marks of five subjects: 95<br>95<br>97<br>98<br>90 | Percentage = 95.00 <br>Grade A |

```c
#include <stdio.h>

int main()
{
    int phy, chem, bio, math, comp; 
    printf("Enter five subjects marks: \n");
    scanf("%d %d %d %d %d", &phy, &chem, &bio, &math, &comp);


    float per = (phy + chem + bio + math + comp) / 5.0;  //percentage?
    printf("Percentage = %.2f \n", per);


    if(per >= 90)  //grade?
    {
        printf("Grade A");
    }
    else if(per >= 80)
    {
        printf("Grade B");
    }
    else if(per >= 70)
    {
        printf("Grade C");
    }
    else if(per >= 60)
    {
        printf("Grade D");
    }
    else if(per >= 40)
    {
        printf("Grade E");
    }
    else
    {
        printf("Grade F");
    }

    return 0;
}

```

```
Enter five subjects marks:
95
95
97
98
90
Percentage = 95.00
Grade A
```
---
# 20. Enter basic salary and calculate gross salary of an employee.

Write a C program to input basic salary of an employee and calculate gross salary according to given conditions.  
Basic Salary <= 10000 : HRA = 20%, DA = 80%  
Basic Salary is between 10001 to 20000 : HRA = 25%, DA = 90%  
Basic Salary >= 20001 : HRA = 30%, DA = 95%

How to calculate gross salary of an employee using if else in C programming. Program to calculate gross salary of an employee using if else in C program. Logic to find gross salary of employee in C program.

| ***Input:***                             | ***Output:***        |
| ---------------------------------------- | -------------------- |
| Input basic salary of an employee: 22000 | Gross salary = 44000 |

```c
#include <stdio.h>

int main() {
    float basic, hra, da;
    printf("Enter the basic salary of the employee: ");
    scanf("%f", &basic);



    if (basic <= 10000) {
        da  = basic * 0.80;
        hra = basic * 0.20;
    }
    
    else if (basic > 10000 && basic <= 20000)
    {
        da  = basic * 0.90;
        hra = basic * 0.25;
    }
    
    else  // 20000 < basic
    {
        da  = basic * 0.95;
        hra = basic * 0.30;
    }

    
    float gross = basic + hra + da;  //Formula

    
    printf("Gross salary = %.2f\n", gross);

    return 0;
}


```


```c
#include <stdio.h>

int main()
{
    float basic, da, hra;
    printf("Enter basic salary of an employee: ");
    scanf("%f", &basic);


    
    if(basic <= 10000)
    {
        da  = basic * 0.80;
        hra = basic * 0.20;
    }
    
    else if(basic <= 20000)
    {
        da  = basic * 0.90;
        hra = basic * 0.25;
    }
    
    else  //between 10001 to 20000 
    {
        da  = basic * 0.95;
        hra = basic * 0.30;
    }

    
    float gross = basic + hra + da;  //Formula


    printf("GROSS SALARY OF EMPLOYEE = %.2f", gross);

    return 0;
}


//"gross" refers to the total amount of money earned by an employee before any deductions or taxes are taken out.
//House Rent Allowance = HRA
//Dearness Allowance = DA


```

```
Enter basic salary of an employee: 22000
GROSS SALARY OF EMPLOYEE = 49500.00
```
---
# 21. Input electricity unit charges and calculate total electricity bill

Write a C program to input electricity unit charge and calculate the total electricity bill according to the given condition:  
For first 50 units Rs. 0.50/unit  
For next 100 units Rs. 0.75/unit  
For next 100 units Rs. 1.20/unit  
For unit above 250 Rs. 1.50/unit  

An additional surcharge of 20% is added to the bill.

How to calculate electricity bill using if else in C programming. Program to find electricity bill using if else in C. Logic to find net electricity bill in C program.

| ***Input:***                    | ***Output:***                 |
| ------------------------------- | ----------------------------- |
| Enter total units consumed: 150 | Electricity Bill = Rs. 120.00 |

```c
#include <stdio.h>

int main()
{
    int unit;
    printf("Enter total units consumed: ");
    scanf("%d", &unit);


	float amount;  // surcharge na thakle eitarei print koraitam

    
    if(unit <= 50)  //For first 50 units
    {
        amount = unit * 0.50;
    }
    
    else if(unit <= 150)  //For next 100 units, 50 + 100
    {
        amount = 25 + ((unit-50) * 0.75);
    }
    
    else if(unit <= 250)  //For next 100 units, 150 + 100
    {
        amount = 100 + ((unit-150) * 1.20);
    }
    
    else  //For unit above 250, unit > 250 or, unit >= 251
    {
        amount = 220 + ((unit-250) * 1.50);
    }


    
    float sur_charge = amount * 0.20;
    float final_amount = amount + sur_charge;


    printf("Electricity Bill = Rs. %.2f", final_amount);

    return 0;
}

```

OR,

```c

    float final_amount = amount + (amount * 0.20);  //surcharge r newai lagbe na
    
```
---
# 🟢 LOOP

---
# 1. Print all natural numbers from 1 to n.

| ***Input:***          | ***Output:***                                                                     |
| --------------------- | --------------------------------------------------------------------------------- |
| Input upper limit: 10 | Natural numbers from 1 to 10: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10                       |
| Enter any number: 10  | Natural numbers from 1 to 10 :<br>1<br>2<br>3<br>4<br>5<br>6<br>7<br>8<br>9<br>10 |

```c
#include <stdio.h>

int main()
{
    int n;
    printf("Enter any number: ");
    scanf("%d", &n);

    printf("Natural numbers from 1 to %d : \n", n);


    for(int i=1; i<=n; i++)
    {
        printf("%d\n", i);
    }

    return 0;
}
```

OR, 

```c
//kono akta Limit or, Range er modhhe jodi bair korte chai 
//Start --- End


#include <stdio.h>

int main()
{
    int start, end;
    printf("Enter start value: ");
    scanf("%d", &start);
    printf("Enter end value: ");
    scanf("%d", &end);


    printf("Natural numbers from %d to %d : \n", start, end);

    
    for(int i=start; i<=end; i++)
    {
        printf("%d\n", i);
    }

    return 0;
}
```

```
Enter start value: 10
Enter end value: 15
Natural numbers from 10 to 15 :
10
11
12
13
14
15
```
---
# 2. Print all natural numbers in reverse (from n to 1).

| ***Input:*** | ***Output:***                                                           |
| ------------ | ----------------------------------------------------------------------- |
| Input N: 10  | Natural numbers from 10-1 in reverse: <br>10, 9, 8, 7, 6, 5, 4, 3, 2, 1 |

```c
#include <stdio.h>

int main()
{
    int start;
    printf("Enter starting value: ");
    scanf("%d", &start);

     
    for(int i=start; i>=1; i--)
    {
        printf("%d\n", i);
    }

    return 0;
}


	 /*
     * Run loop from 'start' to 1 and
     * decrement 1 in each iteration
     */

```

OR,

```c
//kono akta Limit or, Range er modhhe jodi bair korte chai
//Start --- End


#include <stdio.h>

int main()
{
    int start, end;
    printf("Enter starting value: ");
    scanf("%d", &start);
    printf("Enter end value: ");
    scanf("%d", &end);

    
    for(int i=start; i>=end; i--)
    {
        printf("%d\n", i);
    }

    return 0;
}


	/*
     * Run loop from 'start' to 'end' and 
     * decrement by 1 in each iteration
     */ 

```

```
Enter starting value: 15
Enter end value: 5
15
14
13
12
11
10
9
8
7
6
5

```
---
# 3. Print all alphabets from a to z.

| ***Input:*** | ***Output:***                     |
| ------------ | --------------------------------- |
| NA           | Alphabets: a, b, c, ... , x, y, z |

```c
#include <stdio.h>

int main()
{
    printf("Alphabets from a - z are: \n");


    for(char ch='a'; ch<='z'; ch++)
    {
        printf("%c\n", ch);
    }

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    printf("Alphabets from a - z are: \n");

    
    for(int i=97; i<=122; i++)
    {
        printf("%c\n", i); 
    }

    return 0;
}



// ASCII value of a = 97
/*
    * Integer i with %c will convert integer
    * to character before printing. %c will
    * take ascii from i and display its character
    * equivalent.
    */

```

```
Alphabets from a - z are:
a
b
c
d
e
f
g
h
i
j
k
l
m
n
o
p
q
r
s
t
u
v
w
x
y
z


```
---
# 4. Print all even numbers between 1 to 100.

| ***Input:***          | ***Output:***                                   |
| --------------------- | ----------------------------------------------- |
| Input upper range: 10 | Even numbers between 1 to 10:<br>2, 4, 6, 8, 10 |

```c
//normally

#include <stdio.h>

int main()
{
    int n;
    printf("Print all even numbers till: ");
    scanf("%d", &n);


    printf("All even numbers from 1 to %d are: \n", n);

    
    for(int i=2; i<=n; i+=2)
    {
        printf("%d\n",i);
    }

    return 0;
}
//Start loop from 2 and increment by 2,in each repetition
```

OR,

```c
//loop + If-else diye kora hoise

#include <stdio.h>

int main()
{
    int n;
    printf("Print all even numbers till: ");
    scanf("%d", &n);

    printf("Even numbers from 1 to %d are: \n", n);

    
    for(int i=1; i<=n; i++)
    {
        if(i%2 == 0)
        {
            printf("%d\n", i);
        }
    }

    return 0;
}



// Check even condition before printing 
// Start loop counter from 1, increment it by 1, will iterate till n


```

```
Print all even numbers till: 100
All even numbers from 1 to 100 are: 
2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100

```
---
# 5. Print all odd number between 1 to 100..

| ***Input:***          | ***Output:***                                 |
| --------------------- | --------------------------------------------- |
| Input upper limit: 10 | Odd numbers between 1 to 10:<br>1, 3, 5, 7, 9 |

```c
//normally

#include <stdio.h>

int main()
{
    int n;
    printf("Print odd numbers till: ");
    scanf("%d", &n);


    printf("All odd numbers from 1 to %d are: \n", n);


    
    for(int i=1; i<=n; i+=2)
    {
        printf("%d\n", i);
    }


    return 0;
}


/*
     * Start a loop from 1, increment it by 2.
     * For each repetition prints the number.
     */

```

OR,

```c
//Loop + If-else diye kora hoise

#include <stdio.h>

int main()
{
    int n;
    printf("Print odd numbers till: ");
    scanf("%d", &n);


    printf("All odd numbers from 1 to %d are: \n", n);


    
    for(int i=1; i<=n; i++)
    {
        
        if(i%2!=0)
        {
            printf("%d\n", i);
        }
    }


    return 0;
}


/* Start loop from 1 and increment it by 1 */
/* If 'i' is odd then print it */

```

```
Print odd numbers till: 100
All odd numbers from 1 to 100 are: 
1
3
5
7
9
11
13
15
17
19
21
23
25
27
29
31
33
35
37
39
41
43
45
47
49
51
53
55
57
59
61
63
65
67
69
71
73
75
77
79
81
83
85
87
89
91
93
95
97
99


```

OR,

```c
//kono akta Limit or, Range er modhhe jodi bair korte chai 
//Start --- End


#include <stdio.h>

int main()
{
    int start, end;
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);

    printf("All odd numbers from %d to %d are: \n", start, end);

    
    if(start%2==0)
    {
        start++;
    }

    
    for(int i=start; i<=end; i+=2)
    {
        printf("%d\n", i);
    }

    return 0;
}



/*
     * Initialize loop from start, increment it by 2.
     * For each repetition print the number.
     */
/* If start is not odd then make it odd */

```

```
Enter lower limit: 10
Enter upper limit: 20
All odd numbers from 10 to 20 are: 
11
13
15
17
19
```
---
# 6. Find sum of all natural numbers between 1 to n.

| ***Input:***          | ***Output:***                   |
| --------------------- | ------------------------------- |
| Input upper limit: 10 | Sum of natural numbers 1-10: 55 |

```c
#include <stdio.h>

int main()
{
    int n;
    printf("Enter upper limit: ");
    scanf("%d", &n);


	int sum=0 ;


    for(int i=1; i<=n; i++)
    {
        sum += i;
    }

    printf("Sum of first %d natural numbers = %d", n, sum);

    return 0;
}

```

```
Enter upper limit: 10
Sum of first 10 natural numbers = 55

```

OR,

```c
//kono akta Limit or, Range er modhhe jodi bair korte chai
//Lower limit --- Upper Limit


#include <stdio.h>

int main()
{
    int start, end;
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);


	int sum=0 ;


    for(int i=start; i<=end; i++)
    {
        sum += i;
    }

    printf("Sum of natural numbers from %d to %d = %d", start, end, sum);

    return 0;
}

```

```
Enter lower limit: 10
Enter upper limit: 15
Sum of natural numbers from 10 to 15 = 75

```
---
# 7. Find sum of all even numbers between 1 to n.

| ***Input:***                         | ***Output:***                           |
| ------------------------------------ | --------------------------------------- |
| Input upper limit of even number: 10 | Sum of even numbers between 1 to 10: 30 |

```c
#include <stdio.h>

int main()
{
    int n;
    printf("Enter upper limit: ");
    scanf("%d", &n);

	int sum=0
	

    for(int i=2; i<=n; i+=2)
    {
        sum += i;
    }


    printf("Sum of all even number between 1 to %d = %d", n, sum);

    return 0;
}


//sum er jaygay Multi kora jete pare

```

```
Enter upper limit: 10
Sum of all even number between 1 to 10 = 30

```

OR,

```c
//kono akta Limit or, Range er modhhe jodi bair korte chai
//Start --- End


#include <stdio.h>

int main()
{
    int start, end;
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);

	int sum=0 ;



    if(start%2 != 0) //odd k even bananor jonno ei process  
    {
        start++;
    }


    for(int i=start; i<=end; i+=2)
    {
        sum += i;
    }

    printf("Sum of all even number between %d to %d = %d", start, end, sum);

    return 0;
}

```

```
Enter lower limit: 6
Enter upper limit: 10
Sum of all even number between 6 to 10 = 24

```
---
# 8. Find sum of all odd numbers between 1 to n.

| ***Input:***          | ***Output:***                    |
| --------------------- | -------------------------------- |
| Input upper limit: 10 | Sum of odd numbers from 1-10: 25 |

```c
#include <stdio.h>

int main()
{
    int n;
    printf("Enter upper limit: ");
    scanf("%d", &n);


	int sum=0;


    for(int i=1; i<=n; i+=2)
    {
        sum += i;
    }

    printf("Sum of odd numbers = %d", sum);

    return 0;
}

```

OR,

```c
//kono akta Limit or, Range er modhhe jodi bair korte chai
//Start --- End


#include <stdio.h>

int main()
{
    int start, end;
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);


	int sum=0;


    if(start%2 == 0)  //even k odd bananor jonno ei process  
    {
        start++;  //jdi ami kono even o dei, tahole ta odd hoye jabe
    }
    
    
    for(int i=start; i<=end; i+=2)
    {
        sum += i;
    }

    printf("Sum of odd numbers between %d to %d = %d", start, end, sum);

    return 0;
}
```

```
Enter lower limit: 4
Enter upper limit: 11
Sum of odd numbers between 4 to 11 = 32

```
---
# 9. Print multiplication table of any number.

| ***Input:*** | ***Output:***                                                                                                                                     |
| ------------ | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| Input num: 5 | 5 * 1  = 5<br>5 * 2  = 10<br>5 * 3  = 15<br>5 * 4  = 20<br>5 * 5  = 25<br>5 * 6  = 30<br>5 * 7  = 35<br>5 * 8  = 40<br>5 * 9  = 45<br>5 * 10 = 50 |

```c
#include <stdio.h>

int main()
{
    int num;
    printf("Enter number to print table: ");
    scanf("%d", &num);


    for(int i=1; i<=10; i++)
    {
        printf("%d * %d = %d\n", num, i, (num*i));
    }

    return 0;
}

```

OR,

```c
#include <stdio.h>   // ???

int main()
{
    int num;
    printf("Enter number to print table: ");
    scanf("%d", &num);

	int prod=1;

    //for(int i=1; i<=10; i++)
    {
        //printf("%d * %d = %d\n", num, i, (num*i));
    }

    return 0;
}
```

```
Enter number to print table of: 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50

```
---
# 10. Count number of digits in a number.

| ***Input:***     | ***Output:***       |
| ---------------- | ------------------- |
| Input num: 35419 | Number of digits: 5 |

```c

#include <stdio.h>   //using While Loop

int main()
{
    int num;
    printf("Enter any number: ");
    scanf("%d", &num);

    int counter = 0;

	while(num!=0){
	
		num = num / 10;  //num/=10;
		counter++;
	
	}
	
    
    printf("Total digits: %d", counter);

    return 0;
}
```

OR,

```c
#include <stdio.h>

int main()
{
    int num;
    printf("Enter any number: ");
    scanf("%d", &num);

	int count = 0;
    
    do
    {
        count++;
        num = num / 10;  //num/=10;
        
    } while(num != 0);


    printf("Total digits: %d", count);

    return 0;
}

//last er digit tare vag dile C language a ta Chop off kore dey compiler
/* Run loop till num is greater than 0 */
/* Increment digit count */
/* Remove last digit of 'num' */


```

OR,

```c
/**
 * C program to count number of digits in an integer without loop
 */

#include <stdio.h>
#include <math.h> /* Used for log10() */

int main()
{
    long long num;
    int count = 0;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%lld", &num);

    /* Calculate total digits */
    count = (num == 0) ? 1  : (log10(num) + 1);

    printf("Total digits: %d", count);

    return 0;
}
```

```
Enter any number: 123456789
Total digits: 9

```
---
# 11. Find first and last digit of a number.

| ***Input:***       | ***Output:***                   |
| ------------------ | ------------------------------- |
| Input number: 1234 | First digit: 1<br>Last digit: 4 |

```c

#include <stdio.h>   //LAST Digit & FIRST Digit

int main()
{
    int n;
    printf("Enter any number: ");
    scanf("%d", &n);


	//Last 
    int lastdigit = n % 10;
    
    printf("Last digit = %d\n", lastdigit);


	//First
	int firstdigit = n;

    while(firstdigit >= 10)
    {
        firstdigit = firstdigit / 10;
    }

    printf("First digit = %d\n", firstdigit);




    return 0;
}

```

OR,

```c
#include <stdio.h>   //shortest way

int main()
{
    int n;
    printf("Enter any number: ");
    scanf("%d", &n);
	
	//LAST 
	printf("Last Digit is : %d\n", n%10);

	//FIRST
	while(n>10)
		n=n/10;
	printf("First Digit is : %d\n", n);

    

    return 0;
}
```

OR,

```c
#include <stdio.h>
#include <math.h>  //used for ??

int main()
{
    int n, firstDigit, lastDigit, digits;
    printf("Enter any number: ");
    scanf("%d", &n);

    
    lastDigit = n % 10;     /* Find last digit */

    
    digits = (int)log10(n);   /* Total number of digits - 1 */

    
    firstDigit = (int)(n / pow(10, digits));   /* Find first digit */

    printf("First digit = %d\n", firstDigit);
    printf("Last digit = %d\n", lastDigit);

    return 0;
}
//Hard
```

```
Enter any number: 1234
First digit = 1
Last digit = 4

```
---
# 12. Find sum of first and last digit of a number.

| ***Input:***        | ***Output:***                  |
| ------------------- | ------------------------------ |
| Input number: 12345 | Sum of first and last digit: 6 |

```c
#include <stdio.h>

int main()
{
    int num, firstDigit, lastDigit;
    printf("Enter any number to find sum of first and last digit: ");
    scanf("%d", &num);


	//Last
    lastDigit = num % 10;

	//First
    firstDigit = num;   //eikhane 1st digit = 1000 hoite pare

    while(num >= 10)
    {
        num = num / 10;
    }
    firstDigit = num;   //tobe eikhne 1st digit = 1 hobe tokhn


	//SUM
	int sum = firstDigit + lastDigit; 

    printf("Sum of first and last digit = %d", sum);

    return 0;
}

```

OR,

```c
#include <stdio.h>
#include <math.h>

int main()
{
    int num, sum, digits, firstDigit, lastDigit;

    sum = 0;
    printf("Enter any number to find sum of first and last digit: ");
    scanf("%d", &num);
    
    
    lastDigit  = num % 10;  /* Find last digit */


    
    digits    = (int) log10(num);   /* Find total number of digits - 1 */

    
    firstDigit = (int) (num / pow(10, digits));   /* Find first digit */

    
    sum = firstDigit + lastDigit;  /* Calculate the sum */

    printf("Sum of first and last digit = %d", sum);

    return 0;
}
//Hard
```

```
Enter any number to find sum of first and last digit: 12345
Sum of first and last digit = 6

```
---
# 13. Swap first and last digits of a number.

| ***Input:***            | ***Output:***                                     |
| ----------------------- | ------------------------------------------------- |
| Input any number: 12345 | Number after swapping first and last digit: 52341 |

```c
#include <stdio.h>   
#include <math.h>   //must be

int main()
{
    int num, digit, df, dl, swap, divide;
    printf("Enter any number: ");
    scanf("%d", &num);


	digit = log10(num);  //log10(12345) ===> 4
	divide = digit * 10000/digit;   // 4*10000/4 ===> 4



	df = num/divide;  // 12345 / 10000 ===> 1
	
	num = num % divide ;  //12345 % 10000 ===> 2345

	dl = num % 10;  //12345 % 10 ===> 5

	num = num / 10;  //2345 / 10 ===> 234


			//main formula :
	
	swap = dl*divide + num*10 + df;  
			
			//5*10000 = 50000
			//234*10 = 2340
			//1
			//after addition it is = 52341

    printf("Number after swapping first and last digit is : %d", swap);

    return 0;
}
```

OR,

```c
#include <stdio.h>    //doesnot work, why ???
#include <math.h>

int main()
{
    int num;
    printf("Enter any number: ");
    scanf("%d", &num);
	int first, last, swap, digit, divide;


	digit = log10(num);  //log10(12345) = 4
	divide = pow(10, digit);  //10000



	first = num/divide;  //1
	
	num = num % divide ;  //12345 % 10000 = 2345

	last = num % 10;  //2345  % 10 = 5

	num = num / 10;  //234


	//main formula :
	
	swap = last * divide + num * 10 + first;  //5*10000 + 234*10 + first;


	
		
    printf("Number after swapping first and last digit is : %d", swap);

    return 0;
}
```

OR,

```c
#include <stdio.h>
#include <math.h>

int main()
{
    int num, swappedNum;
    int firstDigit, lastDigit, digits;
    printf("Enter any number: ");
    scanf("%d", &num);

    //Last
    lastDigit  = num % 10;
    digits     = (int)log10(num);  //Find total number of digit - 1


    //First
    firstDigit = (int)(num / pow(10, digits)); 

    swappedNum  = lastDigit;
    swappedNum *= (int) pow(10, digits);
    swappedNum += num % ((int) pow(10, digits));
    swappedNum -= lastDigit;
    swappedNum += firstDigit;

    printf("Original number = %d", num);
    printf("Number after swapping first and last digit: %d", swappedNum);

    return 0;
}

```

OR,

```c
/**
 * C program to swap first and last digit of a number
 */

#include <stdio.h>
#include <math.h>

int main()
{
    int num, swappedNum;
    int firstDigit, lastDigit, digits;

    /* Input a number from user */
    printf("Enter any number: ");
    scanf("%d", &num);

    /* Find last digit */
    lastDigit  = num % 10; 

    /* Total number of digit - 1 */
    digits     = (int) log10(num); 

    /* Find first digit */
    firstDigit = (int) (num / pow(10, digits));

    swappedNum  = lastDigit;
    swappedNum *= (int) round(pow(10, digits));
    swappedNum += num % ((int)round(pow(10, digits)));
    swappedNum -= lastDigit;
    swappedNum += firstDigit;

    printf("Original number = %d", num);
    printf("Number after swapping first and last digit: %d", swappedNum);

    return 0;
}
```

```
Enter any number: 1234
Original number = 1234 
Number after swapping first and last digit: 4231

```
---
# 14. Calculate sum of digits of a number.

| ***Input:***           | ***Output:***     |
| ---------------------- | ----------------- |
| Input any number: 1234 | Sum of digits: 10 |

```c
#include <stdio.h>

int main()
{
    int num;
    printf("Enter any number to find sum of its digit: ");
    scanf("%d", &num);

			// 12345 ===> ans will be 15 (sum)

	int Sum=0; 
	while(num!=0)   
					//num = 0 hoye gele theme jabe loop ta
					//toktokhn porjonto cholte thakbe
    {
        Sum = Sum + (num % 10);   /* Find last digit of num and add to sum */
        num = num / 10;   /* Remove last digit from num */
    }


    printf("Sum of digits = %d", Sum);
    return 0;
}

```

```
Enter any number to find sum of its digit: 1234
Sum of digits = 10

```
---
# 15. Calculate product of digits of a number.

| ***Input:***       | ***Output:***         |
| ------------------ | --------------------- |
| Input number: 1234 | Product of digits: 24 |

```c
#include <stdio.h>

int main()
{
    int n, ld, prod=1;
    printf("Enter any number to calculate product of digit: ");
    scanf("%d", &n);

		// n=1234
		//which is not equal to 0 or n>0
		//so loop er vitore jabe
    
    while(n != 0)
    {   
	    ld = n % 10;  
        prod = prod * d; 
        n = n / 10;
			
			//last digit or ld = ? bar kora
			//oi last digit ager gunfol er shathe gun dewa lagbe
			//input number or n= er value ak digit komaite last a vag dewa 10 diye
    }

    printf("Product of all those digits are = %d", prod);

    return 0;
}


/* Repeat the steps till num becomes 0 */
/* Get the last digit from num and multiplies to product */
/* Remove the last digit from n */

```

OR,

```c
#include <stdio.h>

int main()
{
    int num;
    long long product = 1ll;
    printf("Enter any number to calculate product of digit: ");
    scanf("%d", &num);


    product = (num == 0 ? 0 : 1ll);

    
    while(num != 0)
    {   
        product = product * (num % 10); 
        num = num / 10;
    }

    printf("Product of digits = %lld", product);

    return 0;
}


/* Repeat the steps till num becomes 0 */
/* Get the last digit from num and multiplies to product */
/* Remove the last digit from n */

```

```
Enter any number to calculate product of digit: 1234
Product of digits = 24

```
---
# 16. Enter a number and print its reverse.

| ***Input:***        | ***Output:***            |
| ------------------- | ------------------------ |
| Input number: 12345 | Reverse of 12345 = 54321 |

```c
#include <stdio.h>

int main()
{
    int n, r = 0;
    printf("Enter any number to find reverse: ");
    scanf("%d", &n);

		    //n = input nilm
			//r = reverse
			//which is not equal to 0 or n>0
			//so loop er vitore jabe
			
    while(n != 0)
    {
        
        r = (r * 10) + (n % 10);  //eta mone rakha 
        n = n / 10;   //digit komanor jonno
						
			//upre n * 10 = korle last digit pabo / for ld
			//r er man j vabe ashbe
			// 0*10 + 5 = [5]
			// 5*10 + 8 = [58]
			// 58*10 + 9 = [589]
			// 589*10 + 3 = [5893]
			// erpore just r = [5893] printf koray dilm shesh
			 
    }


    printf("Reverse = %d", r);
    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    int n, r ;
    printf("Enter any number to find reverse: ");
    scanf("%d", &n);

		    //n = input nilm
		    //r = 0 ; dhorar dorkar nai ei case a
			//r = reverse digit mean kortese eikhane
			//which is not equal to 0 or n>0
			//so loop er vitore jabe
			
    while(n > 0)
    {
        
        r = n % 10;
        printf("%d", r);
        n = n / 10;
						
			//vitorei print er kaj koraya dilm baire na koraya
    }

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    int num, reverse = 0;
    printf("Enter any number to find reverse: ");
    scanf("%d", &num);

    /* Repeat the till 'num' becomes 0 */
    while(num != 0)
    {
        /* 
         * Increase place value of reverse and 
         * add last digit to reverse 
         */
        reverse = (reverse * 10) + (num % 10);

        /* Remove last digit from 'num' */
        num /= 10;
    }

    printf("Reverse = %d", reverse);

    return 0;
}

```

```
Enter any number to find reverse: 12345
Reverse = 54321

```
---
# 17. Check whether a number is palindrome or not.

| ***Input:***          | ***Output:***     |
| --------------------- | ----------------- |
| Input any number: 121 | 121 is palindrome |

```c
#include <stdio.h>

int main()
{
			//reverse kora full number ta k 
			
    int n, num, rev = 0;
    printf("Enter any number to check palindrome: ");
    scanf("%d", &n);

    num = n; 


    while(n != 0)
    {
        rev = (rev * 10) + (n % 10);
        n  /= 10;
    }


		    //Check if it is the same as before or not?
		    
    if(rev == num)
    {
        printf("%d is palindrome.", num);
    }
    else
    {
        printf("%d is not palindrome.", num);
    }

    return 0;
}

```

```
Enter any number to check palindrome: 121
121 is palindrome.

```
---
# 18. Find frequency of each digit in a given integer.

| ***Input:***                     | ***Output:***                                                                                                                                                                                                                                                             |
| -------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Input any number: 116540         | Frequency of 0 = 1 <br>Frequency of 1 = 2 <br>Frequency of 2 = 0 <br>Frequency of 3 = 0 <br>Frequency of 4 = 1 <br>Frequency of 5 = 1 <br>Frequency of 6 = 1 <br>Frequency of 7 = 0 <br>Frequency of 8 = 0 <br>Frequency of 9 = 0                                         |
| Enter any number: 11203458760011 | Frequency of each digit in 11203458760011 is:<br>Frequency of 0 = 3<br>Frequency of 1 = 4<br>Frequency of 2 = 1<br>Frequency of 3 = 1<br>Frequency of 4 = 1<br>Frequency of 5 = 1<br>Frequency of 6 = 1<br>Frequency of 7 = 1<br>Frequency of 8 = 1<br>Frequency of 9 = 0 |

```c
#include <stdio.h>
#define BASE 10 /* Constant */

int main()
{
    long long num, n;
    int i, lastDigit;
    int freq[BASE];

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%lld", &num);

    /* Initialize frequency array with 0 */
    for(i=0; i<BASE; i++)
    {
        freq[i] = 0;
    }

    /* Copy the value of 'num' to 'n' */
    n = num; 

    /* Run till 'n' is not equal to zero */
    while(n != 0)
    {
        /* Get last digit */
        lastDigit = n % 10;

        /* Remove last digit */
        n /= 10;

        /* Increment frequency array */
        freq[lastDigit]++;
    }

    /* Print frequency of each digit */
    printf("Frequency of each digit in %lld is: \n", num);
    for(i=0; i<BASE; i++)
    {
        printf("Frequency of %d = %d\n", i, freq[i]);
    }

    return 0;
}

```
---
# 19. Enter a number and print it in words.

| ***Input:***       | ***Output:***      |
| ------------------ | ------------------ |
| Input number: 1234 | One Two Three Four |

```c
#include <stdio.h>

int main()
{
		//step 01 - reverse of a number
		
    int n, rev = 0;
    printf("Enter any number to print in words: ");
    scanf("%d", &n);

    
    while(n != 0)
    {
        rev = (rev * 10) + (n % 10);
        n = n / 10;
    }


		//step 02 - Main works
    
    while(rev != 0)  //or, rev > 0
    {
        switch(rev % 10)
        {
            case 0: printf("Zero "); break;
            case 1: printf("One "); break;
            case 2: printf("Two "); break;
            case 3: printf("Three "); break;
            case 4: printf("Four "); break;
            case 5: printf("Five "); break;
            case 6: printf("Six "); break;
            case 7: printf("Seven "); break;
            case 8: printf("Eight "); break;
            case 9: printf("Nine "); break;
        }
        
        rev = rev / 10;  //when rev=0 then while loop will terminate
    }

    return 0;
}


//ashole last digit ta bar kora easy compare to first digit
//tai jokhn ami 12345 re ===> 54321 banailm
//akhn kono vabe jdi last digit gula print korai oder coressponding value tare taholei to holo, like 1, 2, 3, 4, 5 serially ashbe and tar equivalent value print hote thakbe.


```

OR,

```c
#include <stdio.h>
#include <math.h>

int main()
{
    int n, num = 0, digits;

    /* Input number from user */
    printf("Enter any number to print in words: ");
    scanf("%d", &n);
    
    /* Find total digits in n */
    digits = (int) log10(n); 

    /* Store reverse of n in num */
    while(n != 0)
    {
        num = (num * 10) + (n % 10);
        n /= 10;
    }
    
    /* Find total trailing zeros */
    digits =  digits - ((int) log10(num));  

    /* 
     * Extract last digit of number and print corresponding number in words 
     * till num becomes 0
     */
    while(num != 0)
    {
        switch(num % 10)
        {
            case 0: 
                printf("Zero ");
                break;
            case 1: 
                printf("One ");
                break;
            case 2: 
                printf("Two ");
                break;
            case 3: 
                printf("Three ");
                break;
            case 4: 
                printf("Four ");
                break;
            case 5: 
                printf("Five ");
                break;
            case 6: 
                printf("Six ");
                break;
            case 7: 
                printf("Seven ");
                break;
            case 8: 
                printf("Eight ");
                break;
            case 9: 
                printf("Nine ");
                break;
        }
        
        num /= 10;
    }
    
    /* Print all trailing zeros */
    while(digits)
    {
        printf("Zero ");
        digits--;
    }
    
    return 0;
}
```

```
Enter any number to print in words: 1007
One Zero Zero Seven

```
---
# 20. Print all ASCII character with their values.

| ***Input:*** | ***Output:***                                                                                                                                          |
| ------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| NA           | ASCII value of character   = 0<br>ASCII value of character ☺ = 1<br>...<br>...<br>ASCII value of character ■ = 254<br>ASCII value of character   = 255 |

```c
#include <stdio.h>

int main()
{
    int i;

			//Print ASCII values from 0 to 255
			//0 to 255 porjonto loop chalabo
			//0 theke shuru
			//255 er shoman and er aag porjonto
			//1 kore Gap thakbe
			//kahini hocce : i knitu integer value, so number gular value jdi %c & %d diye dekhi tahole bujhbo beparta.
			//%c ===> dile Character Value / Sign gula Ashbe
			//%d ===> dile tahole integer value e print korbe (normally)
			
    for(i=0; i<=255; i++) 
    {
        printf("ASCII value of character %c = %d\n", i, i);
    }

    return 0;
}

```
---
# 21. Find power of a any number using for loop.

| ***Input:***                       | ***Output:*** |
| ---------------------------------- | ------------- |
| Input base: 2<br>Input exponent: 5 | 2 ^ 5 = 32    |

```c
#include <stdio.h>

int main()
{
    int base, exponent;  
    printf("Enter base: ");
    scanf("%d", &base);
    printf("Enter exponent: ");
    scanf("%d", &exponent);

	
	long long int power = 1;
			
			//base & exp duitar e input nilm
			//for loop chalbo
			//1 theke shuru hobe, exp er shoman ba er aag porjonto jabe
			//protibar ak ak kore barbe
			//

    for(int i=1; i<=exponent; i++)
    {
        power = power * base;  

			//iteration=1, 2 = 1*2  
			//iteration=2, 4 = 2*2
			//iteration=3, 8 = 4*2
			//iteration=4, 16 = 8*2
			//iteration=5, 32 = 16*2
			//.....exponent er shoman obdhi jabe 
			//akhn new power tai jdi print kore dei taholei power pabo
			
    }

    printf("%d ^ %d = %lld", base, exponent, power);

    return 0;
}

```

OR,

```c
//USING POWER FORMULA


#include <stdio.h>
#include <math.h>  //must be dite hobe

int main() {
    double base, exponent;
    printf("Enter the base: ");
    scanf("%lf", &base);
    printf("Enter the exponent: ");
    scanf("%lf", &exponent);


    double result = pow(base, exponent);  //using pow func


    printf("%.2lf raised to the power %.2lf is %.2lf\n", base, exponent, result);
    
    return 0;
}

```

```
Enter base: 2
Enter exponent: 5
2 ^ 5 = 32

```
---
# 22. Find all factors of a number.

| ***Input:***     | ***Output:***                    |
| ---------------- | -------------------------------- |
| Input number: 12 | Factors of 12: 1, 2, 3, 4, 6, 12 |

```c
#include <stdio.h>

int main()
{
    int i, n;
    printf("Enter any number to find its factor: \n");
    scanf("%d", &n);

			//factors jei n nibo tar vitorei thakbe
			//tai to 1 theke oi n obdhi loop chalabo
			//1 theke shuru
			//n er shoman ba er aag porjonto 
			//n % i == 0 dewer karon hocce :
			//gunoniok hote hole nishshesh a vivajjo howa lage
			
			
    
    for(i=1; i<=n; i++)
    {
        if(n%i == 0)
        {
            printf("%d, ",i);
        }
    }

    return 0;
}

			//for loop er vitore dhuklo
			//vitore if e ase kebol matro
			//akhn if er vitore dhukte gele condition fullfill korte hbe
			//korle vitore dhukbe & print kore, if exit korbe
			//jehetu serially print hobe tai, %d comma gap, dewa lagbe.
			//tarpor for loop exit korbe
			//for er updation hobe
			//for er condition check hobe


```

```
Enter any number to find its factors:
100
1, 2, 4, 5, 10, 20, 25, 50, 100,

```
---
# 23. Calculate factorial of a number.

| ***Input:***    | ***Output:***  |
| --------------- | -------------- |
| Input number: 5 | Factorial: 120 |

```c

#include <stdio.h>

int main()
{
    int n;
    printf("Enter any number to calculate factorial: ");
    scanf("%d", &n);


    int fact = 1;  //just like product


    for(int i=1; i<=n; i++)
    {
        fact = fact * i;
    }

    printf("Factorial = %d", fact);

    return 0;
}

```

OR,

```c

#include <stdio.h>

int main()
{
    int n;
    printf("Enter any number to calculate factorial: ");
    scanf("%d", &n);


    unsigned long long fact = 1LL;


    for(int i=1; i<=n; i++)
    {
        fact = fact * i;
    }

    printf("Factorial of %d = %llu", n, fact);

    return 0;
}

```

```
Enter any number to calculate factorial: 5
Factorial of 5 = 120

```
---
# 24. Find HCF (GCD) of two numbers.

| ***Input:***                                      | ***Output:***       |
| ------------------------------------------------- | ------------------- |
| Input first number: 12<br>Input second number: 30 | HCF of 12 and 30: 6 |

```c
#include <stdio.h>

int main()
{
    int a, b;
    printf("Enter any two numbers to find HCF: \n");
    scanf("%d %d", &a, &b);

    int n1, n2;
	n1 = a;
	n2 = b;

	int remainder;

	while(n2!=0)
	{
		remainder = n1%n2;
		n1 = n2;
		n2 = remainder;
	}

	int GCD = n1;
	

    printf("HCF = %d\n", GCD);

    return 0;
}

```

OR,

```c
#include <stdio.h>

int main()
{
    int i, num1, num2, min, hcf=1;

    
    printf("Enter any two numbers to find HCF: \n");
    scanf("%d %d", &num1, &num2);

    
    min = (num1<num2) ? num1 : num2;  /* Find minimum between two numbers */

    for(i=1; i<=min; i++)
    {
        /* If i is factor of both number */
        if(num1%i ==0 && num2%i ==0)
        {
            hcf = i;
        }
    }

    printf("HCF of %d and %d = %d\n", num1, num2, hcf);

    return 0;
}

```

```
Enter any two numbers to find HCF:
12
30
HCF of 12 and 30 = 6

```
---
# 25. Find LCM of two numbers.

| ***Input:***                           | ***Output:*** |
| -------------------------------------- | ------------- |
| Input number1: 12<br>Input number2: 30 | LCM = 60      |

```c
#include <stdio.h>

int main()
{
    int a, b;
    printf("Enter any two numbers to find HCF: \n");
    scanf("%d %d", &a, &b);

    int n1, n2;
	n1 = a;
	n2 = b;

	int remainder;

	while(n2!=0)
	{
		remainder = n1%n2;
		n1 = n2;
		n2 = remainder;
	}

	int GCD = n1;


			//just extra ak line beshi GCD er theke
			
	int LCM = (a*b)/GCD;   //eta akta shutro GCD to LCM conversion er

    printf("LCM = %d\n", LCM);

    return 0;
}

```

OR,

```c
/**
 * C program to find LCM of any two numbers
 */

#include <stdio.h>

int main()
{
    int i, num1, num2, max, lcm=1;

    /* Input two numbers from user */
    printf("Enter any two numbers to find LCM: \n");
    scanf("%d%d", &num1, &num2);

    /* Find maximum between num1 and num2 */
    max = (num1 > num2) ? num1 : num2;

    /* First multiple to be checked */
    i = max;
    
    /* Run loop indefinitely till LCM is found */
    while(1)
    {
        if(i%num1==0 && i%num2==0)
        {
            /*
             * If 'i' divides both 'num1' and 'num2'
             * then 'i' is the LCM.
             */
            lcm = i;

            /* Terminate the loop after LCM is found */
            break;
        }

        /*
         * If LCM is not found then generate next 
         * multiple of max between both numbers
         */
        i += max;
    }

    printf("LCM of %d and %d = %d", num1, num2, lcm);

    return 0;
}

```

```
Enter any two numbers to find LCM:
12
30
LCM of 12 and 30 = 60

```
---
# 26. Check whether a number is Prime number or not.

| ***Input:***         | ***Output:***      |
| -------------------- | ------------------ |
| Input any number: 17 | 17 is prime number |

```c
#include <stdio.h>

int main()
{
    int n;
    printf("Enter any number to check prime: ");
    scanf("%d", &n);


	int count = 0; 



    for(int i=1;  i<=n;  i++)
    {
        
        if(n%i==0)
        {
            count++;  
            
	            //5%1 == 0 , so yes ===> count 1 hobe
	            //5%5 == 0 , so yes ===> count 2 hobe
	            //r count 2 hoilei Prime Number hobe amdr calculation a
        }
    }


			//checking
			 
    if(count == 2)   
    {
        printf("Prime number");
    }
    else
    {
        printf("Composite number");
    }

    return 0;
}

//the number which is only divisible by 1 & the number itself
//example : 2, 3, 5, 7 are the prime numbers
//tai 2 theke shuru kore n obdhi o loop chalano jay

```

OR,

```c
#include <stdio.h>

int main()
{
    int n;
    printf("Enter any number to check prime: ");
    scanf("%d", &n);


	int isPrime = 1; 



    for(int i=2; i<=n/2; i++)  
    {
        
        if(n%i==0)
        {
            isPrime = 0; 
            break;  
            
	            //Set isPrime to 0 indicating it as composite number
	            //Terminate from loop
	            
        }
    }

			//If isPrime contains 1 then it is prime
			 
    if(isPrime==1  &&  n>1)
    {
        printf("%d is prime number", n);
    }
    else
    {
        printf("%d is composite number", n);
    }

    return 0;
}


		/*
	     * isPrime is used as flag variable. 
	     * If isPrime = 0, then number is composite
	     * else if isPrime = 1, then number is prime.
	     * Initially I have assumed the number as prime.
	     */

```

```
Enter any number to check prime: 7
7 is prime number

```
---
# 27. Print all Prime numbers between 1 to n.

| ***Input:***                                  | ***Output:***                                      |
| --------------------------------------------- | -------------------------------------------------- |
| Input lower limit: 1<br>Input upper limit: 20 | Prime numbers between 1-20: 2, 3, 5, 7, 13, 17, 19 |

```c

#include <stdio.h>

int main()
{
    int n; 
    printf("Find prime numbers between 1 to : ");
    scanf("%d", &n);

    printf("All prime numbers between 1 to %d are: \n", n);


		    //1 to n obdhi loop jabe
		    //er modhhe j koyta number PRIME shegula mark kore print kora hobe
		    //akta shundir msg dekhailm, 1 to n er modhhokar prime number gula :
		    //akhn main Loop er kaj 

	
    for(int i=2; i<=n; i++)
    {
        
        isPrime = 1; 
        
        for(int j=2; j<=i/2; j++)
        {
            if(i%j==0)
            {
                isPrime = 0;
                break;
            }
        }

        
        if(isPrime==1) 
        {
            printf("%d, ", i);  //end
        }
    }



	     //for loop use korlm,
	     //jeikhane 2 theke end er shoman ba er aag obdhi loop cholbe
	     //1 kintu prime number na, tai 2 theke shuru
	     //
	     //Finally, If the number is prime then print

    return 0;
}

```

OR,

```c

#include <stdio.h>

int main()
{
    int i, j, end, isPrime; // isPrime is used as flag variable

    /* Input upper limit to print prime */
    printf("Find prime numbers between 1 to : ");
    scanf("%d", &end);

    printf("All prime numbers between 1 to %d are:\n", end);

    /* Find all Prime numbers between 1 to end */
    for(i=2; i<=end; i++)
    {
        /* Assume that the current number is Prime */
        isPrime = 1; 

        /* Check if the current number i is prime or not */
        for(j=2; j<=i/2; j++)
        {
            /*
             * If i is divisible by any number other than 1 and self
             * then it is not prime number
             */
            if(i%j==0)
            {
                isPrime = 0;
                break;
            }
        }

        /* If the number is prime then print */
        if(isPrime==1)
        {
            printf("%d, ", i);
        }
    }

    return 0;
}

```

OR,

```c
/**
 * C program to print all prime numbers between start to end
 */

#include <stdio.h>

int main()
{
    int i, j, start, end;
    int isPrime;

    /* Input upper and lower limit to print prime */
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);

    printf("All prime numbers between %d to %d are:\n", start, end);

    // Make sure that lowerlimit does not go below 2
    // Since 2 is first prime number
    if(start < 2) 
        start = 2;

    /* Find all Prime numbers between 1 to n */
    for(i=start; i<=end; i++)
    {
        /* Assume that the current number is Prime */
        isPrime = 1; 

        /* Check if the current number i is prime or not */
        for(j=2; j<=i/2; j++)
        {
            /*
             * If i is divisible by any number other than 1 and self
             * then it is not prime number
             */
            if(i%j==0)
            {
                isPrime = 0;
                break;
            }
        }

        /* If the number is prime then print */
        if(isPrime==1)
        {
            printf("%d, ", i);
        }
    }

    return 0;
}
```

```
Enter lower limit: 1
Enter upper limit : 100 
All prime numbers between 1 to 100 are: 
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,

```
---
# 28. Find sum of all prime numbers between 1 to n.

| ***Input:***          | ***Output:***                         |
| --------------------- | ------------------------------------- |
| Input upper limit: 10 | Sum of prime numbers between 1-10: 17 |
|                       |                                       |

```c

#include <stdio.h>

int main()
{
    int i, j, end, isPrime, sum=0;
    printf("Find sum of all prime between 1 to : ");
    scanf("%d", &end);

   
    for(i=2; i<=end; i++)
    {
        isPrime = 1;
        
        for(j=2; j<=i/2 ;j++)
        {
            if(i%j==0)
            {
                isPrime = 0;
                break;
            }
        }
        
        if(isPrime==1)
        {
            sum = sum + i;  //ei akta extra line khali
        }
    }

    printf("Sum of all prime numbers between 1 to %d = %d", end, sum);

    return 0;
}

```

OR,

```c
/**
 * C program to find sum of prime numbers in given range
 */

#include <stdio.h>

int main()
{
    int i, j, start, end;
    int isPrime, sum=0;

    /* Input lower and upper limit from user */
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);

    /* Find all prime numbers in given range */
    for(i=start; i<=end; i++)
    {

        /* Check if the current number i is Prime or not */
        isPrime = 1;
        for(j=2; j<=i/2 ;j++)
        {
            if(i%j==0)
            {
                /* 'i' is not prime */
                isPrime = 0;
                break;
            }
        }

        /*
         * If i is Prime then add to sum
         */
        if(isPrime==1)
        {
            sum += i;
        }
    }

    printf("Sum of all prime numbers between %d to %d = %d", start, end, sum);

    return 0;
}
```

```
Enter lower limit: 10
Enter upper limit: 20
Sum of all prime numbers between 10 to 20 = 60

```
---
# 29. Find all prime factors of a number.

| ***Input:***         | ***Output:***             |
| -------------------- | ------------------------- |
| Input any number: 10 | Prime factors of 10: 2, 5 |

```c
#include <stdio.h>

int main()
{
    int i, j, num, isPrime;
    printf("Enter any number to print Prime factors: ");
    scanf("%d", &num);

    printf("All Prime Factors of %d are: \n", num);



    for(i=2; i<=num; i++)              //step-1
    {
        if(num%i==0)                   //step-2
        {
            
            isPrime = 1;               //step-3
            
            for(j=2; j<=i/2; j++)      //step-4
            {
                if(i%j==0)
                {
                    isPrime = 0;
                    break;
                }
			}
	            
            if(isPrime==1)             //step-5
            {
                printf("%d, ", i);
            }
        }
    }

    return 0;
}


//step-1 : 
//step-2 : Check 'i' for Prime
//step-3 : isPrime=1 korar karon,
//step-4 : 
//step-5 : 



```

```
Enter any number to print Prime factors: 15
All Prime Factors of 15 are: 
3, 5,

```
---
# 30. Check whether a number is Armstrong number or not.

| ***Input:***      | ***Output:***           |
| ----------------- | ----------------------- |
| Input number: 371 | 371 is armstrong number |

```c
// input 153 --->  1*1*1 + 5*5*5 + 3*3*3 = 153 , then we can say that 153 is an armstrong number.


#include <stdio.h>

int main()
{
    int n, arm=0, r, c;
    printf("Enter any number to check Armstrong number: ");
    scanf("%d", &n);

	c=n;  

    while(n > 0)
    {
        r = n % 10;
        arm = (r*r*r) + arm;  //full operation ta chalano holo evabe
        n = n / 10;
    }



	//Check
    if(c == arm)
    {
        printf("ARMSTRONG NUMBER");
    }
    else
    {
        printf("NOT ARMSTRONG NUMBER");
    }

    return 0;
}

//while loop a n er man barbar change hoye jabe, tai last a compare korar jonno onno akta variable er modhhe assign kore nilm.

```

OR,

```c
#include <stdio.h>
#include <math.h>

int main()
{
    int num;
    printf("Enter any number to check Armstrong number: ");
    scanf("%d", &num);


	int originalNum,lastDigit, digits, sum;

    sum = 0;

    /* Copy the value of num for processing */
    originalNum = num;

    /* Find total digits in num */
    digits = (int) log10(num) + 1;

    /* Calculate sum of power of digits */
    while(num > 0)
    {
        /* Extract the last digit */
        lastDigit = num % 10;

        /* Compute sum of power of last digit */
        sum = sum + round(pow(lastDigit, digits));

        /* Remove the last digit */
        num = num / 10;
    }



	//Check
    if(originalNum == sum)
    {
        printf("%d is ARMSTRONG NUMBER", originalNum);
    }
    else
    {
        printf("%d is NOT ARMSTRONG NUMBER", originalNum);
    }

    return 0;
}

```

```
Enter any number to check Armstrong number: 371
371 is ARMSTRONG NUMBER

```
---
# 31. Print all Armstrong numbers between 1 to n.

| ***Input:***                                    | ***Output:***                                                                       |
| ----------------------------------------------- | ----------------------------------------------------------------------------------- |
| Enter lower limit: 1<br>Enter upper limit: 1000 | Armstrong number between 1 to 1000 are:<br>1, 2, 3, 4, 5, 6, 7, 8, 9, 370, 371, 407 |

```c
#include <stdio.h>
#include <math.h>  

int main()
{
    int num, lastDigit, digits, sum, i, end;
    printf("Enter upper limit: ");
    scanf("%d", &end);

    //printf("Armstrong number between 1 to %d are: \n", end);

    for(i=1; i<=end; i++)
    {
        sum = 0;
        num = i;

        
        digits = (int) log10(num) + 1;  //Find total digits in num 

        
        while(num > 0)  
        {
            
            lastDigit = num % 10; 
            sum = sum + ceil(pow(lastDigit, digits));

            
            num = num / 10;

			
			//Calculate sum of power of digits
			//Extract last digit 
			//Find sum of power of digits
            //Use ceil() function to overcome any rounding errors by pow()
            //Remove the last digit 
            
        }

		//print armstrong numbers only
        if(i == sum)
        {
            printf("%d, ", i);
        }
    
    }

    return 0;
}

```

OR,

```c
/**
 * C program to generate Armstrong numbers in a given range
 */
#include <stdio.h>
#include <math.h>

int main()
{
    int num, lastDigit, digits, sum, i;
    int start, end;

    /* Input lower and upper limit from user */
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);

    printf("Armstrong number between %d to %d are: \n", start, end);

    for(i=start; i<=end; i++)
    {
        sum = 0;

        /* Copy the value of num for processing */
        num = i;

        /* Find total digits in num */
        digits = (int) log10(num) + 1;

        /* Calculate sum of power of digits */
        while(num > 0)
        {
            /* Extract the last digit */
            lastDigit = num % 10;

            // Find sum of power of digits
            // Use ceil() function to overcome any rounding errors by pow()
            sum = sum + ceil(pow(lastDigit, digits));

            /* Remove the last digit */
            num = num / 10;
        }

        /* Check for Armstrong number */
        if(i == sum)
        {
            printf("%d, ", i);
        }
    }

    return 0;
}
```

```
Enter lower limit: 1
Enter upper limit: 10000
Armstrong number between 1 to 10000 are:
1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474,

```
---
# 32. Check whether a number is Perfect number or not.

| ***Input:***        | ***Output:***       |
| ------------------- | ------------------- |
| Input any number: 6 | 6 is PERFECT NUMBER |

```c
//A positive integer that is equal to the sum of its positive divisors (excluding the number itself) is described as a Perfect Number.
//Example : 6 is a perfect number since 1 + 2 + 3 equals 6.
//Some of the first perfect numbers are 6, 28, 496 and 8128


#include <stdio.h>

int main()
{
    int i, num, sum = 0;
    printf("Enter any number to check perfect number: ");
    scanf("%d", &num);

    
    for(i = 1; i <= num / 2; i++)
    {
        
        if(num%i == 0)
        {
            sum += i;
        }
    }


	//check perfect or not
    if(sum == num && num > 0)
    {
        printf("%d is PERFECT NUMBER", num);
    }
    else
    {
        printf("%d is NOT PERFECT NUMBER", num);
    }

    return 0;
}

/* Calculate sum of all proper divisors */
/* If i is a divisor of num */
/* Check whether the sum of proper divisors is equal to num */
 

```

```
Enter any number to check perfect number: 6
6 is PERFECT NUMBER

```
---
# 33. Print all Perfect numbers between 1 to n.

| ***Input:***           | ***Output:***                           |
| ---------------------- | --------------------------------------- |
| Input upper limit: 100 | Perfect numbers between 1 to 100: 6, 28 |

```c
#include <stdio.h>

int main()
{
    int i, j, end, sum;
    printf("Enter upper limit: ");
    scanf("%d", &end);

    printf("All Perfect numbers between 1 to %d:\n", end);
    
    
    for(i=1; i<=end; i++)
    {
        sum = 0;

        
        for(j=1; j<i; j++)
        {
            if(i % j == 0)
            {
                sum += j;
            }
        }
 
        
        if(sum == i)
        {
            printf("%d, ", i);
        }
    }

    return 0;
}


/* Iterate from 1 to end */
/* Check whether the current number i is Perfect number or not */
/* If the current number i is Perfect number */

```

OR,

```c
/**
 * C program to print all Perfect numbers between 1 to n 
 */

#include <stdio.h>

int main()
{
    int i, j, start, end, sum;

    /* Input lower and upper limit from user */
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);

    printf("All Perfect numbers between %d to %d:\n", start, end);
    
    /* Iterate from start to end */
    for(i=start; i<=end; i++)
    {
        sum = 0;

        /* Check whether the current number i is Perfect number or not */
        for(j=1; j<i; j++)
        {
            if(i % j == 0)
            {
                sum += j;
            }
        }
 
        /* If the current number i is Perfect number */
        if(sum == i)
        {
            printf("%d, ", i);
        }
    }

    return 0;
}
```

```
Enter lower limit: 1
Enter upper limit: 1000
All Perfect numbers between 1 to 1000:
6, 28, 496,

```
---
# 34. Check whether a number is Strong number or not.

| ***Input:***      | ***Output:***        |
| ----------------- | -------------------- |
| Input number: 145 | 145 is STRONG NUMBER |

```c
//Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number.
//Given a number, check if it is a Strong Number or not.




#include <stdio.h>

int main()
{
    int i, originalNum, num, lastDigit, sum;
    long fact;

    /* Input a number from user */
    printf("Enter any number to check Strong number: ");
    scanf("%d", &num);

    /* Copy the value of num to a temporary variable */
    originalNum = num;

    sum = 0;

    /* Find sum of factorial of digits */
    while(num > 0)
    {

        /* Get last digit of num */
        lastDigit = num % 10;

        /* Find factorial of last digit */
        fact = 1;
        for(i=1; i<=lastDigit; i++)
        {
            fact = fact * i;
        }

        /* Add factorial to sum */
        sum = sum + fact;

        num = num / 10;
    }

    /* Check Strong number condition */
    if(sum == originalNum)
    {
        printf("%d is STRONG NUMBER", originalNum);
    }
    else
    {
        printf("%d is NOT STRONG NUMBER", originalNum);
    }

    return 0;
}

```

```
Enter any number to check Strong number: 145
145 is STRONG NUMBER

```
---
# 35. Print all Strong numbers between 1 to n.

| ***Input:***            | ***Output:***                                |
| ----------------------- | -------------------------------------------- |
| Input upper limit: 1000 | Strong numbers between 1-1000: <br>1, 2, 145 |

```c
/**
 * C program to print all Strong Numbers between 1 to n
 */

#include <stdio.h>

int main()
{
    int i, j, cur, lastDigit, end;
    long long fact, sum;

    /* Input upper limit from user */
    printf("Enter upper limit: ");
    scanf("%d", &end);

    printf("All Strong numbers between 1 to %d are:\n", end);
    
    /* Iterate from 1 to end */
    for(i=1; i<=end; i++)
    {
        /* Number to check for strong number */
        cur = i;

        sum = 0;

        /* Find the sum of factorial of digits */ 
        while(cur > 0)
        {
            fact = 1ll;
            lastDigit = cur % 10;

            /* Find factorial of last digit of current num. */
            for( j=1; j<=lastDigit; j++)
            {
                fact = fact * j;
            }

            sum += fact; 

            cur /= 10;
        }
        
        /* Print 'i' if it is strong number */  
        if(sum == i)
        {
            printf("%d, ", i);
        }
    }

    return 0;
}

```

OR,

```c
/**
 * C program to print Strong numbers in given range
 */

#include <stdio.h>

int main()
{
    int i, j, cur, lastDigit, start, end;
    long long fact, sum;

    /* Input lower and upper limit from user */
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);

    printf("All Strong numbers between %d to %d are:\n", start, end);
    
    /* Iterate from 1 to end */
    for(i=start; i<=end; i++)
    {
        /* Number to check for strong number */
        cur = i;

        sum = 0;

        /* Find the sum of factorial of digits */ 
        while(cur > 0)
        {
            fact = 1ll;
            lastDigit = cur % 10;

            /* Find factorial of last digit of current num. */
            for( j=1; j<=lastDigit; j++)
            {
                fact = fact * j;
            }

            sum += fact; 

            cur /= 10;
        }
        
        /* Print 'i' if it is strong number */  
        if(sum == i)
        {
            printf("%d, ", i);
        }
    }

    return 0;
}
```

```
Enter lower limit: 1
Enter upper limit: 100000
1, 2, 145, 40585,

```
---
# 36. Print Fibonacci series up to n terms.

| ***Input:***              | ***Output:***                                         |
| ------------------------- | ----------------------------------------------------- |
| Input number of terms: 10 | Fibonacci series: <br>0, 1, 1, 2, 3, 5, 8, 13, 21, 34 |

```c
/**
 * C program to print Fibonacci series up to n terms
 */

#include <stdio.h>

int main()
{
    int a, b, c, i, terms;

    /* Input number from user */
    printf("Enter number of terms: ");
    scanf("%d", &terms);

    /* Fibonacci magic initialization */
    a = 0;
    b = 1;
    c = 0;

    printf("Fibonacci terms: \n");

    /* Iterate through n terms */
    for(i=1; i<=terms; i++)
    {
        printf("%d, ", c);

        a = b;     // Copy n-1 to n-2
        b = c;     // Copy current to n-1
        c = a + b; // New term
    }

    return 0;
}

```

```
Enter number of terms: 10
Fibonacci terms: 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

```

OR,

```c
/**
 * C program to print Fibonacci series in given range
 */

#include <stdio.h>

int main()
{
    int a, b, c, start, end;

    /* Input a number from user */
    printf("Enter starting term: ");
    scanf("%d", &start);
    printf("Enter end term: ");
    scanf("%d", &end);

    /* Fibonacci magic initialization */
    a = 0;
    b = 1;
    c = 0;

    printf("Fibonacci terms: \n");

    /* Iterate through terms */
    while(c <= end)
    {

        /* If current term is greater than start term */
        if(c >= start) 
        {
            printf("%d, ", c);
        }

        a = b;     // Copy n-1 to n-2
        b = c;     // Copy current to n-1
        c = a + b; // New term
    }

    return 0;
}
```

```
Enter starting term: 4
Enter end term: 30
Fibonacci terms:
5, 8, 13, 21,
```
---
# 37. Find one's complement of a binary number.

| ***Input:***                  | ***Output:***             |
| ----------------------------- | ------------------------- |
| Input binary number: 01000011 | Ones complement: 10111100 |

```c
/**
 * C program to find 1s complement of a binary number
 */

#include <stdio.h>

#define SIZE 8

int main()
{
    char binary[SIZE + 1], onesComp[SIZE + 1];
    int i, error=0;

    printf("Enter %d bit binary value: ", SIZE);
    
    /* Input binary string from user */
    gets(binary);

    /* Store all inverted bits of binary value to onesComp */
    for(i=0; i<SIZE; i++)
    {
        if(binary[i] == '1')
        {
            onesComp[i] = '0';
        }
        else if(binary[i] == '0')
        {
            onesComp[i] = '1';
        }
        else
        {
            printf("Invalid Input");
            error = 1;

            /* Exits from loop */
            break;
        }
    }

    /* Marks the end of onesComp string */
    onesComp[SIZE] = '\0';

    /* Check if there are binary string contains no error */
    if(error == 0)
    {
        printf("Original binary = %s\n", binary);
        printf("Ones complement = %s", onesComp);
    }

    return 0;
}

```

```
Enter any 8 bit binary value: 00001111
Original binary = 00001111
Ones complement = 11110000

```
---
# 38. Find two's complement of a binary number.

| ***Input:***                  | ***Output:***             |
| ----------------------------- | ------------------------- |
| Input binary number: 01101110 | Twos complement: 10010010 |

```c
/**
 * C program to find twos complement of a binary number
 */

#include <stdio.h>

#define SIZE 8

int main()
{
    char binary[SIZE + 1], onesComp[SIZE + 1], twosComp[SIZE + 1];
    int i, carry=1;

    printf("Enter %d bit binary value: ", SIZE);
    
    /* Input 8-bit binary string */
    gets(binary);

    /* Find ones complement of the binary number */
    for(i=0; i<SIZE; i++)
    {
        if(binary[i] == '1')
        {
            onesComp[i] = '0';
        }
        else if(binary[i] == '0')
        {
            onesComp[i] = '1';
        }
    }
    onesComp[SIZE] = '\0';

    /*
     * Add 1 to the ones complement
     */
    for(i=SIZE-1; i>=0; i--)
    {
        if(onesComp[i] == '1' && carry == 1)
        {
            twosComp[i] = '0';
        }
        else if(onesComp[i] == '0' && carry == 1)
        {
            twosComp[i] = '1';
            carry = 0;
        }
        else
        {
            twosComp[i] = onesComp[i];
        }
    }
    twosComp[SIZE] = '\0';

    printf("Original binary = %s\n", binary);
    printf("Ones complement = %s\n", onesComp);
    printf("Twos complement = %s\n", twosComp);

    return 0;
}

```

```
Enter 8 bit binary value: 01101100
Original binary = 01101100
Ones complement = 10010011
Twos complement = 10010100

```
---
# 39. Convert Binary to Octal number system.

| ***Input:***                  | ***Output:***    |
| ----------------------------- | ---------------- |
| Input binary number: 00110111 | Octal number: 67 |

```c
/**
 * C program to convert binary to octal number system
 */

#include <stdio.h>

int main()
{
    int octalConstant[] = {0, 1, 10, 11, 100, 101, 110, 111};

    long long binary, octal, tempBinary;
    int digit, place, i;

    octal = 0;
    place= 1;
    
    /* Input binary number from user */
    printf("Enter any binary number: ");
    scanf("%lld", &binary);

    /* Copy original binary value to temp variable */
    tempBinary = binary;
    

    while(tempBinary != 0)
    {
        /* Extract last three digit of binary */
        digit = tempBinary % 1000;

        /* Find octal equivalent of 3 digit binary */
        for(i=0; i<8; i++)
        {
            if(octalConstant[i] == digit)
            {
                /*
                 * Increase the place value of octal
                 * and add the previous octal value
                 */
                octal = (i * place) + octal;
                break;
            }
        }

        /* Remove the last three digit of binary */
        tempBinary /= 1000;

        /* Increase the place value */
        place *= 10; 
    }

    printf("Original binary number = %lld\n", binary);
    printf("Octal number = %lld", octal);

    return 0;
}

```

```
Enter any binary number: 11001111
Original binary number = 11001111
Octal number = 317

```
---
# 40. Convert Binary to Decimal number system.

| ***Input:***       | ***Output:*** |
| ------------------ | ------------- |
| Input number: 0011 | Decimal: 3    |

```c
/**
 * C program to convert binary number system to decimal number system
 */

#include <stdio.h>
#include <math.h>

#define BASE 2

int main()
{
    long long binary, decimal=0, tempBinary;
    int N=0;

    printf("Enter any binary number: ");
    scanf("%lld", &binary);

    tempBinary = binary;

    while(tempBinary!=0)
    {
        /* If current binary digit is 1 */
        if(tempBinary % 10 == 1)
        {
            decimal += pow(BASE, N);
        }

        N++;
        tempBinary /= 10;
    }

    printf("Binary number = %lld\n", binary);
    printf("Decimal number= %lld", decimal);

    return 0;
}

```

OR,

```c
/**
 * C program to convert binary to decimal number system
 */

#include <stdio.h>
#include <math.h>
#include <string.h>

#define SIZE 16 /* N-bit binary number */

void getTwosComplement(char *twosComp, const char *);

int main()
{
    char binary[SIZE + 1], tempBinary[SIZE + 1];
    int i, j, signBit = 0;
    long long decimal = 0;

    printf("Enter any %d bit binary value: ", SIZE);
    gets(binary);

    strcpy(tempBinary, binary);

    /*
     * If sign bit is on find two's complement of the binary number
     */
    if(binary[0] == '1')
    {
        signBit = 1;
        getTwosComplement(tempBinary, binary);
    }

    /*
     * Convert decimal to binary number
     */
    for(i=0; i<SIZE; i++)
    {
        if(tempBinary[i] == '1')
        {
            decimal += pow(2, (SIZE - (i+1)));
        }
    }

    if(signBit==1)
    {
        decimal *= -1;
    }

    printf("Binary value = %s\n", binary);
    printf("Decimal value = %lld", decimal);

    return 0;
}

/*
 * Gets the 2's complement of the binary value.
 */
void getTwosComplement(char * twosComp, const char * binary)
{
    char onesComp[SIZE + 1];
    int i, carry=1;

    /*
     * Finds 1's complement of the binary number
     */
    for(i=0; i<SIZE; i++)
    {
        if(binary[i]=='1')
        {
            onesComp[i] = '0';
        }
        else if(binary[i]=='0')
        {
            onesComp[i] = '1';
        }
    }
    onesComp[SIZE] = '\0';

    /*
     * Adds 1 to 1's complement of the binary number to get 2's complement
     */
    for(i=SIZE-1; i>=0; i--)
    {
        if(onesComp[i]=='1' && carry==1)
        {
            twosComp[i] = '0';
        }
        else if(onesComp[i]=='0' && carry==1)
        {
            twosComp[i] = '1';
            carry = 0;
        }
        else
        {
            twosComp[i] = onesComp[i];
        }
    }
    twosComp[SIZE] = '\0';
}
```

```
Enter any 16 bit binary value: 0100000010001100
Binary value = 0100000010001100
Decimal value = 16524

```
---
# 41. Convert Binary to Hexadecimal number system.

| ***Input:***                  | ***Output:***   |
| ----------------------------- | --------------- |
| Enter binary number: 11000010 | Hexadecimal: C2 |

```c
/**
 * C program to convert binary to hexadecimal number system
 */

#include <stdio.h>
#include <string.h>

int main()
{
    int hexConstant[] = {0, 1, 10, 11, 100, 101, 110, 111, 1000, 
                         1001, 1010, 1011, 1100, 1101, 1110, 1111};

    long long binary, tempBinary;
    char hex[20];
    int index, i, digit;
    
    /* Input binary number from user */
    printf("Enter binary number: ");
    scanf("%lld", &binary);
    
    /* Copy binary number to temp variable */
    tempBinary = binary;
    index = 0;
    
    /* Find hexadecimal of binary number */
    while(tempBinary!=0)
    {
        /* Group binary to last four digits */
        digit = tempBinary % 10000;

        /* Find hexadecimal equivalent of last four digit */
        for(i=0; i<16; i++)
        {
            if(hexConstant[i] == digit)
            {
                if(i<10)
                {
                    /* 0-9 integer constant */
                    hex[index] = (char)(i + 48);
                }
                else
                {
                    /* A-F character constant */
                    hex[index] = (char)((i-10) + 65);
                }

                index++;
                break;
            }
        }

        /* Remove the last 4 digits as it is processed */
        tempBinary /= 10000;
    }
    hex[index] = '\0';

    /* Reverse the hex digits */
    strrev(hex);

    printf("Binary number = %lld\n", binary);
    printf("Hexadecimal number = %s", hex);

    return 0;
}

```

```
Enter binary number: 01101110
Binary number = 1101110
Hexadecimal number = 6E

```
---
# 42. Convert Octal to Binary number system.

| ***Input:***            | ***Output:***           |
| ----------------------- | ----------------------- |
| Input octal number: 172 | Binary of 172: 01111010 |

```c
/**
 * C program to convert Octal number system to Binary number system
 */

#include <stdio.h>

int main()
{
    int OCTALVALUES[] = {0, 1, 10, 11, 100, 101, 110, 111};
    long long octal, tempOctal, binary, place;
    int rem;
    
    /* Input Octal number from user */
    printf("Enter any Octal number: ");
    scanf("%lld", &octal);
    tempOctal = octal;

    binary = 0;
    place  = 1;
    
    /* Convert octal to binary */
    while(tempOctal > 0)
    {
        /* Extract the last digit of octal */
        rem = tempOctal % 10;

        /*
         * Get the binary equivalent of octal digit
         * add it to the binary variable
         */
        binary = (OCTALVALUES[rem] * place) + binary;

        /* Remove the last octal digit */
        tempOctal /= 10;

        /* Increase the place value */
        place *= 1000;
    }

    printf("Octal number = %lld\n", octal);
    printf("Binary number = %lld", binary);

    return 0;
}

```

```
Enter any Octal number: 1720
Octal number = 1720
Binary number = 1111010000

```
---
# 43. Convert Octal to Decimal number system.

| ***Input:***            | ***Output:***       |
| ----------------------- | ------------------- |
| Input octal number: 172 | Decimal number: 122 |

```c
/**
 * C program to convert Octal number system to Decimal number system
 */

#include <stdio.h>
#include <math.h>

int main()
{
    long long octal, tempOctal, decimal;
    int rem, place;
    
    /* Input octal number from user */
    printf("Enter any octal number: ");
    scanf("%lld", &octal);
    tempOctal = octal;

    decimal = 0;
    place = 0;
    
    /*
     * Convert octal to decimal
     */
    while(tempOctal > 0)
    {
         /* Extract the last digit of octal */
        rem = tempOctal % 10;

        /* Convert last octal digit to decimal */
        decimal += pow(8, place) * rem;

        /* Remove the last octal digit */
        tempOctal /= 10;

        place++;
    }

    printf("Octal number = %lld\n", octal);
    printf("Decimal number = %lld", decimal);

    return 0;
}

```

```
Enter any octal number: 172
Octal number = 172
Decimal number = 122

```
---
# 44. Convert Octal to Hexadecimal number system.

| ***Input:***            | ***Output:***          |
| ----------------------- | ---------------------- |
| Input octal number: 175 | Hexadecimal number: 7D |

```c

/**
 * C program to convert Octal to Hexadecimal number system
 */

#include <stdio.h>

int main()
{
    int OCTALVALUES[] = {0, 1, 10, 11, 100, 101, 110, 111};

    long long octal, tempOctal, binary, place;
    char hex[65] = "";
    int rem;

    place = 1;
    binary = 0;
    
    /* Input octal number from user */
    printf("Enter any octal number: ");
    scanf("%lld", &octal);
    tempOctal = octal;

    /*
     * Octal to binary conversion
     */
    while(tempOctal > 0)
    {
        rem = tempOctal % 10;
        binary = (OCTALVALUES[rem] * place) + binary;
        tempOctal /= 10;

        place *= 1000;
    }
    
    /* 
     * Binary to hexadecimal conversion
     */
    while(binary > 0)
    {
        rem = binary % 10000;
        switch(rem)
        {
            case 0:
                strcat(hex, "0");
                break;
            case 1:
                strcat(hex, "1");
                break;
            case 10:
                strcat(hex, "2");
                break;
            case 11:
                strcat(hex, "3");
                break;
            case 100:
                strcat(hex, "4");
                break;
            case 101:
                strcat(hex, "5");
                break;
            case 110:
                strcat(hex, "6");
                break;
            case 111:
                strcat(hex, "7");
                break;
            case 1000:
                strcat(hex, "8");
                break;
            case 1001:
                strcat(hex, "9");
                break;
            case 1010:
                strcat(hex, "A");
                break;
            case 1011:
                strcat(hex, "B");
                break;
            case 1100:
                strcat(hex, "C");
                break;
            case 1101:
                strcat(hex, "D");
                break;
            case 1110:
                strcat(hex, "E");
                break;
            case 1111:
                strcat(hex, "F");
            break;
        }

        binary /= 10000;
    }

    strrev(hex);

    printf("Octal number: %lld\n", octal);
    printf("Hexadecimal number: %s", hex);

    return 0;
}
```

```
Enter any octal number: 125715
Octal number: 125715
Hexadecimal number: ABCD

```
---
# 45. Convert Decimal to Binary number system.

| ***Input:***              | ***Output:***          |
| ------------------------- | ---------------------- |
| Input decimal number: 112 | Binary number: 0111000 |

```c
/**
 * C program to convert from Decimal to Binary number system
 */

#include <stdio.h>

int main()
{
    long long decimal, tempDecimal, binary;
    int rem, place = 1;

    binary = 0;

    /* Input decimal number from user */
    printf("Enter any decimal number: ");
    scanf("%lld", &decimal);
    tempDecimal = decimal;

    /* Decimal to binary conversion */
    while(tempDecimal > 0)
    {
        rem = tempDecimal % 2;

        binary = (rem * place) + binary;

        tempDecimal /= 2;

        place *= 10;
    }

    printf("Decimal number = %lld\n", decimal);
    printf("Binary number = %lld", binary);

    return 0;
}

```

OR,

```c
/**
 * C program to convert from Decimal to Binary number system
 */

#include <stdio.h>
#include <string.h>

int main()
{
    long decimal, tempDecimal;
    char binary[65];
    int index = 0;
    
    /* Input decimal number from user */
    printf("Enter any decimal value : ");
    scanf("%ld", &decimal);
    
    /* Copy decimal value to temp variable */
    tempDecimal = decimal;
    
    while(tempDecimal > 0)
    {
        binary[index] = (tempDecimal % 2) + '0';
        
        tempDecimal /= 2;

        index++;
    }
    binary[index] = '\0';
    
    /* Reverse the converted binary to get final binary result */
    strrev(binary);

    printf("Decimal value = %ld\n", decimal);
    printf("Binary value of decimal = %s", binary);

    return 0;
}
```

```
Enter any decimal value : 112
Decimal value = 112
Binary value of decimal = 01110000

```
---
# 46. Convert Decimal to Octal number system.

| ***Input:***      | ***Output:***    |
| ----------------- | ---------------- |
| Input decimal: 22 | Octal number: 26 |

```c
/**
 * C program to convert from Decimal to Octal number system
 */

#include <stdio.h>

int main()
{
    long long decimal, tempDecimal, octal;
    int i, rem, place = 1;

    octal = 0;

    /* Input decimal number from user */
    printf("Enter any decimal number: ");
    scanf("%lld", &decimal);

    tempDecimal = decimal;

    /* Decimal to octal conversion */
    while(tempDecimal > 0)
    {
        rem = tempDecimal % 8;

        octal = (rem * place) + octal;

        tempDecimal /= 8;

        place *= 10;
    }

    printf("\nDecimal number = %lld\n", decimal);
    printf("Octal number = %lld", octal);

    return 0;
}

```

```
Enter any decimal number: 20
Decimal number = 20
Octal number = 24

```
---
# 47. Convert Decimal to Hexadecimal number system.

| ***Input:***             | ***Output:***          |
| ------------------------ | ---------------------- |
| Input decimal number: 26 | Hexadecimal number: 1A |

```c
/**
 * C program to convert from Decimal number system to hexadecimal number system
 */

#include <stdio.h>
#include <string.h>

int main()
{
    char HEXVALUE[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    long long decimal, tempDecimal;
    char hex[65];
    int index, rem;
    
    /* Input decimal number from user */
    printf("Enter any decimal number: ");
    scanf("%lld", &decimal);
    tempDecimal = decimal;

    index = 0;
    
    /* Decimal to hexadecimal conversion */
    while(tempDecimal !=0)
    {
        rem = tempDecimal % 16;

        hex[index] = HEXVALUE[rem];

        tempDecimal /= 16;

        index++;
    }
    hex[index] = '\0';

    strrev(hex);

    printf("\nDecimal number = %lld\n", decimal);
    printf("Hexadecimal number = %s", hex);

    return 0;
}

```

```
Enter any decimal number: 427
Decimal number = 427
Hexadecimal number = 1AB

```
---
# 48. Convert Hexadecimal to Binary number system.

| ***Input:***          | ***Output:***      |
| --------------------- | ------------------ |
| Input hexadecimal: 1A | Decimal number: 26 |

```c
/**
 * C program to convert Hexadecimal to binary number system
 */

#include <stdio.h>
#include <string.h>

int main()
{
    char hex[17], bin[65] = "";
    int i = 0;

    /* Input hexadecimal number from user */
    printf("Enter any hexadecimal number: ");
    gets(hex);

    /* Extract first digit and find binary of each hex digit */
    for(i=0; hex[i]!='\0'; i++)
    {
        switch(hex[i])
        {
            case '0':
                strcat(bin, "0000");
                break;
            case '1':
                strcat(bin, "0001");
                break;
            case '2':
                strcat(bin, "0010");
                break;
            case '3':
                strcat(bin, "0011");
                break;
            case '4':
                strcat(bin, "0100");
                break;
            case '5':
                strcat(bin, "0101");
                break;
            case '6':
                strcat(bin, "0110");
                break;
            case '7':
                strcat(bin, "0111");
                break;
            case '8':
                strcat(bin, "1000");
                break;
            case '9':
                strcat(bin, "1001");
                break;
            case 'a':
            case 'A':
                strcat(bin, "1010");
                break;
            case 'b':
            case 'B':
                strcat(bin, "1011");
                break;
            case 'c':
            case 'C':
                strcat(bin, "1100");
                break;
            case 'd':
            case 'D':
                strcat(bin, "1101");
                break;
            case 'e':
            case 'E':
                strcat(bin, "1110");
                break;
            case 'f':
            case 'F':
                strcat(bin, "1111");
                break;
            default:
                printf("Invalid hexadecimal input.");
        }
    }

    printf("Hexademial number = %s\n", hex);
    printf("Binary number = %s", bin);

    return 0;
}

```

```
Enter any hexadecimal number: 1a
Hexademial number = 1a
Binary number = 00011010

```
---
# 49. Convert Hexadecimal to Octal number system.

| ***Input:***          | ***Output:***    |
| --------------------- | ---------------- |
| Input hexadecimal: 1A | Octal number: 32 |

```c
/**
 * C program to convert Hexadecimal to Octal number system
 */

#include <stdio.h>

int main()
{
    char hex[17];
    long long octal, bin, place;
    int i = 0, rem, val;

    /* Input hexadecimal number from user */
    printf("Enter any hexadecimal number: ");
    gets(hex);

    octal = 0ll;
    bin = 0ll;
    place = 0ll;

    /* Hexadecimal to binary conversion */
    for(i=0; hex[i]!='\0'; i++)
    {
        bin = bin * place;

        switch(hex[i])
        {
            case '0':
                bin += 0;
                break;
            case '1':
                bin += 1;
                break;
            case '2':
                bin += 10;
                break;
            case '3':
                bin += 11;
                break;
            case '4':
                bin += 100;
                break;
            case '5':
                bin += 101;
                break;
            case '6':
                bin += 110;
                break;
            case '7':
                bin += 111;
                break;
            case '8':
                bin += 1000;
                break;
            case '9':
                bin += 1001;
                break;
            case 'a':
            case 'A':
                bin += 1010;
                break;
            case 'b':
            case 'B':
                bin += 1011;
                break;
            case 'c':
            case 'C':
                bin += 1100;
                break;
            case 'd':
            case 'D':
                bin += 1101;
                break;
            case 'e':
            case 'E':
                bin += 1110;
                break;
            case 'f':
            case 'F':
                bin += 1111;
                break;
            default:
                printf("Invalid hexadecimal input.");
        }

        place = 10000;
    }

    place = 1;

    /* Binary to octal conversion */
    while(bin > 0)
    {
        rem = bin % 1000;

        switch(rem)
        {
            case 0:
                val = 0;
                break;
            case 1:
                val = 1;
                break;
            case 10:
                val = 2;
                break;
            case 11:
                val = 3;
                break;
            case 100:
                val = 4;
                break;
            case 101:
                val = 5;
                break;
            case 110:
                val = 6;
                break;
            case 111:
                val = 7;
                break;
        }

        octal = (val * place) + octal;
        bin /= 1000;

        place *= 10;
    }

    printf("Hexadecimal number = %s\n", hex);
    printf("Octal number = %lld", octal);

    return 0;
}

```

```
Enter any hexadecimal number: fff
Hexadecimal number = fff
Octal number = 7777

```
---
# 50. Convert Hexadecimal to Decimal number system.

| ***Input:***          | ***Output:***      |
| --------------------- | ------------------ |
| Input hexadecimal: 1A | Decimal number: 26 |

```c
/**
 * C program to convert Hexadecimal to Decimal number system
 */
#include <stdio.h>
#include <math.h>
#include <string.h>

int main()
{
    char hex[17];
    long long decimal, place;
    int i = 0, val, len;

    decimal = 0;
    place = 1;

    /* Input hexadecimal number from user */
    printf("Enter any hexadecimal number: ");
    gets(hex);

    /* Find the length of total number of hex digit */
    len = strlen(hex);
    len--;

    /*
     * Iterate over each hex digit
     */
    for(i=0; hex[i]!='\0'; i++)
    {
 
        /* Find the decimal representation of hex[i] */
        if(hex[i]>='0' && hex[i]<='9')
        {
            val = hex[i] - 48;
        }
        else if(hex[i]>='a' && hex[i]<='f')
        {
            val = hex[i] - 97 + 10;
        }
        else if(hex[i]>='A' && hex[i]<='F')
        {
            val = hex[i] - 65 + 10;
        }

        decimal += val * pow(16, len);
        len--;
    }

    printf("Hexadecimal number = %s\n", hex);
    printf("Decimal number = %lld", decimal);

    return 0;
}

```

```
Enter any hexadecimal number: 1a
Hexadecimal number = 1a
Decimal number = 26

```
---
# 51. Print Pascal triangle upto n rows.

| ***Input:***   | ***Output:***                                                                                                                                                                                                                                                                                                                                                                                      |
| -------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Input rows: 5  | <br>    1<br>   1 1<br>  1 2 1<br> 1 3 3 1<br>1 4 6 4 1                                                                                                                                                                                                                                                                                                                                            |
| Input rows: 10 | <br>                         1<br>                       1   1<br>                     1   2   1<br>                   1   3   3   1<br>                 1   4   6   4   1<br>               1   5  10  10   5   1<br>             1   6  15  20  15   6   1<br>           1   7  21  35  35  21   7   1<br>         1   8  28  56  70  56  28  8   1<br>       1   9  36  84 126 126  84  36  9 1 |

```c
#include <stdio.h>

long long fact(int n);
int main()
{
    int n, k, num, i;
    long long term;

    /* Input number of rows */
    printf("Enter number of rows : ");
    scanf("%d", &num);

    for(n=0; n<num; n++)
    {
        /* Prints 3 spaces */
        for(i=n; i<=num; i++)
            printf("%3c", ' ');

        /* Generate term for current row */
        for(k=0; k<=n; k++)
        {
            term = fact(n) / (fact(k) * fact(n-k));

            printf("%6lld", term);
        }

        printf("\n");
    }

    return 0;
}


long long fact(int n)
{
    long long factorial = 1ll;
    while(n>=1)
    {
        factorial *= n;
        n--;
    }

    return factorial;
}
```
---
# 🟢 PRINTING PATTERNS :  STAR PATTERNS

---







---
# 🟢 PRINTING PATTERNS :  NUMBER PATTERNS

---







---
# 🟢 FUNCTIONS

---
# 1. Find cube of any number using function.

| ***Input:***        | ***Output:***   |
| ------------------- | --------------- |
| Input any number: 5 | Cube of 5 = 125 |

```c
#include <stdio.h>

int cube(int n1)
{  
    int p = (n1 * n1 * n1);
    return p;
}


int main()
{
    int n;
    printf("Input any number: ");
    scanf("%d", &n);


    int c = cube(n);

    printf("Cube of %d = %.2d", n, c); 
    
    return 0;
}
```
---
# 2. Find diameter, circumference and area of circle using functions.

| ***Input:***               | ***Output:***                                                                    |
| -------------------------- | -------------------------------------------------------------------------------- |
| Enter radius of circle: 10 | Diameter = 20.00 units<br>Circumference = 62.83 units<br>Area = 314.16 sq. units |

```c
#include <stdio.h>

double funDia(double r1);
double funCir(double r1);
double funArea(double r1);

int main() 
{
    double r;
    printf("Enter radius of circle: ");
    scanf("%lf", &r);


    double dia  = funDia(r);
    double cir = funCir(r);
    double area = funArea(r);


    printf("Diameter = %.2lf units\n", dia);
    printf("Circumference = %.2lf units\n", cir);
    printf("Area = %.2lf sq. units", area);
    
    return 0;
}

double funDia(double r1) 
{
    return (2 * r1);
}

double funCir(double r1) 
{
    return (2 * 3.14 * r1);  
}

double funArea(double r1)
{
    return (3.14 * r1 * r1); 
}
```
---
# 3. Find maximum and minimum between two numbers using functions.

| ***Input:***                   | ***Output:***                |
| ------------------------------ | ---------------------------- |
| Input two numbers:<br>10<br>20 | Maximum = 20<br>Minimum = 10 |

```c
#include <stdio.h>

int funMax(int num1, int num2);
int funMin(int num1, int num2) ;
int main() 
{
    int a, b;
    printf("Enter any two numbers: \n");
    scanf("%d %d", &a, &b);


    int var1 = funMax(a, b);
    int var2 = funMin(a, b);


    printf("Maximum = %d \n", var1);
    printf("Minimum = %d \n", var2);
    
    return 0;
}



int funMax(int num1, int num2)
{
    int max;
    if(num1>num2)
    {
	    max = num1;
    }
    else
    {
	    max = num2;
    }
    
    return max;  // maximum
}


int funMin(int num1, int num2) 
{
    int min;
    if(num1>num2)
    {
	    min = num2;
    }
    else
    {
	    min = num1;
    }
    
    return min;  // minimum
}
```

OR,

```c
int funmax(int num1, int num2)
{    
    return (num1 > num2 ) ? num1 : num2;  // maximum
}


int funmin(int num1, int num2) 
{
    return (num1 > num2 ) ? num2 : num1;  // minimum
}

```

OR,

```c
#include <stdio.h>
#include <limits.h>
#include <stdarg.h>   // what is this??

int max(int args, ...);
int min(int args, ...);

int main() 
{   
    /*
     * Demonstrate the use of variable argument list
     */
    printf("Maximum of three numbers: (10, 30, 20) = %d\n", max(3, 10, 30, 20));
    printf("Maximum of five numbers: (5, -45, 4, 60, 100) = %d\n", max(5, -45, 4, 60, 100));
    
    printf("Minimum of four numbers: (-5, 0, 10, 50) = %d\n", min(4, -5, 0, 10, 50));
    printf("Minimum of two numbers: (10, 20) = %d", min(2, 10, 20));
    
    return 0;
}


/**
 * Find maximum between two or more integer variables
 * @param args Total number of integers
 * @param ... List of integer variables to find maximum
 * @return Maximum among all integers passed
 */
int max(int args, ...)
{
    int i, max, cur;
    va_list valist;
    va_start(valist, args);
    
    max = INT_MIN;
    
    for(i=0; i<args; i++)
    {
        cur = va_arg(valist, int); // Get next elements in the list
        if(max < cur)
            max = cur;
    }
    
    va_end(valist); // Clean memory assigned by valist
    
    return max;
}

/**
 * Find minimum between two or more integer variables
 * @param args Total number of integers
 * @param ... List of integer variables to find minimum
 * @return Minimum among all integers passed
 */
int min(int args, ...) 
{
    int i, min, cur;
    va_list valist;
    va_start(valist, args);
    
    min = INT_MAX;
    
    for(i=0; i<args; i++)
    {
        cur = va_arg(valist, int);
        if(min > cur)
            min = cur;
    }
    
    va_end(valist);
    
    return min;
}
```

```
Maximum of three numbers: (10, 30, 20) = 30
Maximum of five numbers: (5, -45, 4, 60, 100) = 100
Minimum of four numbers: (-5, 0, 10, 50) = -5
Minimum of two numbers: (10, 20) = 10
```
---
# 4. Check whether a number is even or odd using functions.

| ***Input:***         | ***Output:*** |
| -------------------- | ------------- |
| Input any number: 10 | 10 is even    |

```c
#include <stdio.h>

int checkEvenOdd(int n1);
int main()
{
    int n;
    printf("Enter any number: ");
    scanf("%d", &n);


    if(checkEvenOdd(n))
    {
        printf("The number is even.");
    }
    else
    {
        printf("The number is odd.");
    }
    
    return 0;
}


int checkEvenOdd(int n1)
{
    if(n1 % 2 == 0)
    { 
	    return 1;   // condition is true that means The num is even. Main function er argument jeno True return shorup pay tai 1 return kora hocce eikhane.
	}    
    else
	{
		return 0;   // If this one hits that means the condition was False which mean the number is Odd.
	}    
}
```

```c
int checkEvenOdd(int n1)
{
    return !(n1 & 1);
}
```
---
# 5. Check whether a number is prime, Armstrong or perfect number using functions.

| ***Input:***         | ***Output:***                                                                    |
| -------------------- | -------------------------------------------------------------------------------- |
| Input any number: 11 | 11 is prime number<br>11 is not a armstrong number<br>11 is not a perfect number |

```c
#include <stdio.h>
#include <math.h>


int isPrime(int num);
int isArmstrong(int num);
int isPerfect(int num);
int main()
{
    int num;
    printf("Enter any number: ");
    scanf("%d", &num);
    
    // Call isPrime() functions
    if(isPrime(num))
    {
        printf("%d is Prime number.\n", num);
    }
    else
    {
        printf("%d is not Prime number.\n", num);
    }
    
    // Call isArmstrong() function
    if(isArmstrong(num))
    {
        printf("%d is Armstrong number.\n", num);
    }
    else
    {
        printf("%d is not Armstrong number.\n", num);
    }
    
    // Call isPerfect() function
    if(isPerfect(num))
    {
        printf("%d is Perfect number.\n", num);
    }
    else
    {
        printf("%d is not Perfect number.\n", num);
    }
    
    return 0;
}



/**
 * Check whether a number is prime or not. 
 * Returns 1 if the number is prime otherwise 0.
 */
int isPrime(int num) 
{
    int i;
    
    for(i=2; i<=num/2; i++)  
    {  
        /*  
         * If the number is divisible by any number  
         * other than 1 and self then it is not prime 
         */  
        if(num%i == 0)  
        {
            return 0;
        }  
    } 
    
    return 1; 
}

/**
 * Check whether a number is Armstrong number or not. 
 * Returns 1 if the number is Armstrong number otherwise 0.
 */
int isArmstrong(int num) 
{
    int lastDigit, sum, originalNum, digits;
    sum = 0;
    
    originalNum = num;

    /* Find total digits in num */
    digits = (int) log10(num) + 1;

    /*
     * Calculate sum of power of digits
     */
    while(num > 0)
    {
        // Extract the last digit
        lastDigit = num % 10;

        // Compute sum of power of last digit
        sum = sum + round(pow(lastDigit, digits));

        // Remove the last digit
        num = num / 10;
    }
    
    return (originalNum == sum);
}



/**
 * Check whether the number is perfect number or not. 
 * Returns 1 if the number is perfect otherwise 0.
 */
int isPerfect(int num) 
{
    int i, sum, n;
    sum = 0;
    n = num;
    
    for(i=1; i<n; i++)  
    {  
        /* If i is a divisor of num */  
        if(n%i == 0)  
        {  
            sum += i;  
        }  
    }
    
    return (num == sum);
}
```

```
Enter any number: 11
11 is Prime number.
11 is not Armstrong number.
11 is not Perfect number.
```
---
# 6. Find all prime numbers between given interval using functions.

| ***Input:***                                   | ***Output:***                                                               |
| ---------------------------------------------- | --------------------------------------------------------------------------- |
| Input lower limit: 10<br>Input upper limit: 50 | Prime numbers between 10-50 are: 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 |

```c

#include <stdio.h>


int isPrime(int num);
void printPrimes(int lowerLimit, int upperLimit);



int main()
{
    int lowerLimit, upperLimit;
    
    printf("Enter the lower and upper limit to list primes: ");
    scanf("%d%d", &lowerLimit, &upperLimit);
    
    // Call function to print all primes between the given range.
    printPrimes(lowerLimit, upperLimit);
    
    return 0;
}



/**
 * Print all prime numbers between lower limit and upper limit. 
 */
void printPrimes(int lowerLimit, int upperLimit)
{
    printf("All prime number between %d to %d are: ", lowerLimit, upperLimit);
    
    while(lowerLimit <= upperLimit)
    {
        // Print if current number is prime.
        if(isPrime(lowerLimit))
        {
            printf("%d, ", lowerLimit);
        }
        
        lowerLimit++;
    }
}



/** 
 * Check whether a number is prime or not. 
 * Returns 1 if the number is prime otherwise 0. 
 */  
int isPrime(int num)   
{  
    int i;  
      
    for(i=2; i<=num/2; i++)    
    {    
        /*   
         * If the number is divisible by any number   
         * other than 1 and self then it is not prime  
         */    
        if(num % i == 0)    
        {  
            return 0;  
        }    
    }   
      
    return 1;   
}
```

```
Enter the lower and upper limit to list primes: 10 50
All prime number between 10 to 50 are: 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
```
---
# 7. Print all strong numbers between given interval using functions.

| ***Input:***                                    | ***Output:***                              |
| ----------------------------------------------- | ------------------------------------------ |
| Input lower limit: 1<br>Input upper limit: 1000 | Strong numbers between 1 to 100: 1, 2, 145 |

```c
/**
 * C program to print strong numbers in a given interval using functions
 */
 
#include <stdio.h>

/* Function declaration */
long long fact(int num);
void printStrongNumbers(int start, int end);


int main()
{
    int start, end;
    
    /* Input start and end range */
    printf("Enter the lower limit to find strong number: ");
    scanf("%d", &start);
    printf("Enter the upper limit to find strong number: ");
    scanf("%d", &end);
    
    printf("All strong numbers between %d to %d are: \n", start, end);
    printStrongNumbers(start, end);
    
    return 0;
}


/**
 * Print all strong numbers in a given range
 */
void printStrongNumbers(int start, int end)
{
    long long sum;
    int num;
    
    // Iterates from start to end
    while(start != end)
    {
        sum = 0;
        num = start;
        
        // Calculate sum of factorial of digits
        while(num != 0)
        {
            sum += fact(num % 10);
            num /= 10; 
        }
        
        // If sum of factorial of digits equal to current number
        if(start == sum)
        {
            printf("%d, ", start);
        }
        
        start++;
    }
}



/**
 * Recursively find factorial of any number
 */
long long fact(int num)
{
    if(num == 0)
        return 1;
    else
        return (num * fact(num-1));
}
```

```
Enter the lower limit to find strong number: 1
Enter the upper limit to find strong number: 100000
All strong numbers between 1 to 100000 are:
1, 2, 145, 40585,
```
---
# 8. Print all Armstrong numbers between given interval using functions.

| ***Input:***                                    | ***Output:***                                                   |
| ----------------------------------------------- | --------------------------------------------------------------- |
| Input lower limit: 1<br>Input upper limit: 1000 | Armstrong numbers between 1 to 1000 are: 1, 153, 370, 371, 407, |

```c
/**
 * C program to print all Armstrong numbers between a given range
 */
 
#include <stdio.h>

/* Function declarations */ 
int isArmstrong(int num);
void printArmstrong(int start, int end);



int main()
{
    int start, end;
    
    /* Input lower and upper limit to of armstrong numbers */
    printf("Enter lower limit to print armstrong numbers: ");
    scanf("%d", &start);
    printf("Enter upper limit to print armstrong numbers: ");
    scanf("%d", &end);
    
    printf("All armstrong numbers between %d to %d are: \n", start, end);
    printArmstrong(start, end);
    
    return 0;
}


/**
 * Check whether the given number is armstrong number or not.
 * Returns 1 if the number is armstrong otherwise 0.
 */
int isArmstrong(int num)
{
    int temp, lastDigit, sum;
    
    temp = num;
    sum = 0;
    
    /* Calculate sum of cube of digits */
    while(temp != 0)
    {
        lastDigit = temp % 10;
        sum += lastDigit * lastDigit * lastDigit;
        temp /= 10;
    }
    
    /* 
     * Check if sum of cube of digits equals
     * to original number.
     */
    if(num == sum)
        return 1;
    else 
        return 0;
}


/**
 * Print all armstrong numbers between start and end. 
 */
void printArmstrong(int start, int end)
{
    /* 
     * Iterates from start to end and print the current number 
     * if it is armstrong
     */
    while(start <= end)
    {
        if(isArmstrong(start)) 
        {
            printf("%d, ", start);
        }
        
        start++;
    }
}
```

```
Enter lower limit to print armstrong numbers: 1
Enter upper limit to print armstrong numbers: 1000
All armstrong numbers between 1 to 1000 are:
1, 153, 370, 371, 407,
```
---
# 9. Print all perfect numbers between given interval using functions.

| ***Input:***                                   | ***Output:***          |
| ---------------------------------------------- | ---------------------- |
| Input lower limit: 1<br>Input upper limit: 100 | Perfect numbers: 6, 28 |

```c
/**
 * C program to print all perfect numbers in given range using function
 */
 
#include <stdio.h>


/* Function declarations */
int isPerfect(int num);
void printPerfect(int start, int end);



int main()
{
    int start, end;
    
    /* Input lower and upper limit to print perfect numbers */
    printf("Enter lower limit to print perfect numbers: ");
    scanf("%d", &start);
    printf("Enter upper limit to print perfect numbers: ");
    scanf("%d", &end);
    
    printf("All perfect numbers between %d to %d are: \n", start, end);
    printPerfect(start, end);
    
    return 0;
}



/**
 * Check whether the given number is perfect or not.
 * Returns 1 if the number is perfect otherwise 0.
 */
int isPerfect(int num)
{
    int i, sum;
    
    /* Finds sum of all proper divisors */
    sum = 0;
    for(i=1; i<num; i++)
    {
        if(num % i == 0)
        {
            sum += i;
        }
    }

    /* 
     * If sum of proper positive divisors equals to given number 
     * then the number is perfect number
     */
    if(sum == num)
        return 1;
    else
        return 0;
}



/**
 * Print all perfect numbers between given range start and end.
 */
void printPerfect(int start, int end)
{
    /* Iterates from start to end */
    while(start <= end)
    {
        if(isPerfect(start))
        {
            printf("%d, ", start);
        }
        
        start++;
    }   
}
```

```
Enter lower limit to print perfect numbers: 1
Enter upper limit to print perfect numbers: 10000
All perfect numbers between 1 to 10000 are:
6, 28, 496, 8128,

```
---
# 10. Find power of any number using recursion.

| ***Input:***                           | ***Output:*** |
| -------------------------------------- | ------------- |
| Input base number: 5<br>Input power: 2 | 2 ^ 5 = 25    |

```c
/**
 * C program to find power of a number using recursion
 */

#include <stdio.h>


/* Power function declaration */
double pow(double base, int expo);


int main()
{
    double base, power;
    int expo;
    
    /* Input base and exponent from user */
    printf("Enter base: ");
    scanf("%lf", &base);
    printf("Enter exponent: ");
    scanf("%d", &expo);
    
    // Call pow function
    power = pow(base, expo); 
    
    printf("%.2lf ^ %d = %f", base, expo, power);
    
    return 0;
}


/**
 * Calculate power of any number.
 * Returns base ^ expo
 */
double pow(double base, int expo)
{
    /* Base condition */
    if(expo == 0)
        return 1;
    else if(expo > 0)
        return base * pow(base, expo - 1);
    else
        return 1 / pow(base, -expo);
}
```

```
Enter base: 2
Enter exponent: 5
2.00 ^ 5 = 32.000000
```
---
# 11. Print all natural numbers between 1 to n using recursion.

| ***Input:***                                  | ***Output:***                                                  |
| --------------------------------------------- | -------------------------------------------------------------- |
| Input lower limit: 1<br>Input upper limit: 10 | Natural numbers between 1 to 10: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 |

```c
/**
 * C program to print all natural numbers from 1 to n using recursion
 */

#include <stdio.h>


/* Function declaration */
void printNaturalNumbers(int lowerLimit, int upperLimit);



int main()
{
    int lowerLimit, upperLimit;

    /* Input lower and upper limit from user */    
    printf("Enter lower limit: ");
    scanf("%d", &lowerLimit);
    printf("Enter upper limit: ");
    scanf("%d", &upperLimit);

    printf("All natural numbers from %d to %d are: ", lowerLimit, upperLimit);
    printNaturalNumbers(lowerLimit, upperLimit);
    
    return 0;
}


/**
 * Recursively prints all natural number between the given range.
 */
void printNaturalNumbers(int lowerLimit, int upperLimit)
{
    if(lowerLimit > upperLimit)
        return;
    
    printf("%d, ", lowerLimit);

    // Recursively call the function to print next number
    printNaturalNumbers(lowerLimit + 1, upperLimit);
}
```

```
Enter lower limit: 1
Enter upper limit: 100
All natural numbers from 1 to 100 are: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100

```
---
# 12. Print all even or odd numbers in given range using recursion.

| ***Input:***                                  | ***Output:***                                                                              |
| --------------------------------------------- | ------------------------------------------------------------------------------------------ |
| Input lower limit: 1<br>Input upper limit: 10 | Even numbers between 1 to 10: 2, 4, 6, 8, 10<br>Odd numbers between 1 to 10: 1, 3, 5, 7, 9 |

```c
/** 
 * C program to print even or odd numbers in given range using recursion
 */

#include <stdio.h>


/* Function declaration */
void printEvenOdd(int cur, int limit);



int main()
{
    int lowerLimit, upperLimit;
    
    // Input lower and upper limit from user
    printf("Enter lower limit: ");
    scanf("%d", &lowerLimit);
    printf("Enter upper limit: ");
    scanf("%d", &upperLimit);
    
    printf("Even/odd Numbers from %d to %d are: ", lowerLimit, upperLimit);
    printEvenOdd(lowerLimit, upperLimit); 
    
    return 0;
}


/**
 * Recursive function to print even or odd numbers in a given range. 
 */
void printEvenOdd(int cur, int limit)
{
    if(cur > limit)
        return;
    
    printf("%d, ", cur);
    
    // Recursively call to printEvenOdd to get next value
    printEvenOdd(cur + 2, limit);
}
```

```
Enter lower limit: 1
Enter upper limit: 100
Even/odd Numbers from 1 to 100 are: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99

```
---
# 13. Find sum of all natural numbers between 1 to n using recursion.

| ***Input:***                                  | ***Output:***                            |
| --------------------------------------------- | ---------------------------------------- |
| Input lower limit: 1<br>Input upper limit: 10 | Sum of natural numbers from 1 to 10 = 55 |

```c
/**
 * C program to find sum of natural numbers from 1 to n using recursion
 */

#include <stdio.h>


/* Function declaration */
int sumOfNaturalNumbers(int start, int end);


int main()
{
    int start, end, sum;
    
    /* Input lower and upper limit from user */
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);
    
    sum = sumOfNaturalNumbers(start, end);
    
    printf("Sum of natural numbers from %d to %d = %d", start, end, sum);
    
    return 0;
}


/**
 * Recursively find the sum of natural number
 */
int sumOfNaturalNumbers(int start, int end)
{
    if(start == end)
        return start;
    else
        return start + sumOfNaturalNumbers(start + 1, end); 
}
```

```
Enter lower limit: 1
Enter upper limit: 100
Sum of natural numbers from 1 to 100 = 5050
```
---
# 14. Find sum of all even or odd numbers in given range using recursion.

| ***Input:***                                   | ***Output:***                               |
| ---------------------------------------------- | ------------------------------------------- |
| Input lower limit: 1<br>Input upper limit: 100 | Sum of even numbers between 1 to 100 = 2550 |

```c
/** 
 * C program to find sum of all even or odd numbers in given range using recursion
 */

#include <stdio.h>


int sumOfEvenOdd(int start, int end);


int main()
{
    int start, end, sum;

    /* Input lower and upper limit from user */
    printf("Enter lower limit: ");
    scanf("%d", &start);
    printf("Enter upper limit: ");
    scanf("%d", &end);
    
    printf("Sum of even/odd numbers between %d to %d = %d\n", start, end, sumOfEvenOdd(start, end));
    
    return 0;
}



/**
 * Find sum of all even or odd numbers recursively.
 */
int sumOfEvenOdd(int start, int end) 
{
    /* Base condition */
    if(start > end)
        return 0;
    else
        return (start + sumOfEvenOdd(start + 2, end));
}
```

```
Enter lower limit: 2
Enter upper limit: 100
Sum of even/odd numbers between 2 to 100 = 2550
```
---
# 15. Find reverse of any number using recursion.

| ***Input:***        | ***Output:***  |
| ------------------- | -------------- |
| Input number: 12345 | Reverse: 54321 |

```c
/**
 * C program to find reverse of any number using recursion
 */
 
#include <stdio.h>
#include <math.h>


/* Fuction declaration */
int reverse(int num);


int main()
{
    int num, rev;

    /* Input number from user */    
    printf("Enter any number: ");
    scanf("%d", &num);
    
    /* Call the function to reverse number */
    rev = reverse(num); 
    
    printf("Reverse of %d = %d", num, rev);
    
    return 0;
}


/**
 * Recursive function to find reverse of any number
 */
int reverse(int num)
{
    // Find total digits in num
    int digit = (int) log10(num);
    
    // Base condition
    if(num == 0)
        return 0;
    
    return ((num%10 * pow(10, digit)) + reverse(num/10));
}
```

OR,

```c
/**
 * C program to find reverse of any number using recursion
 */
 
#include <stdio.h>
#include <math.h>


/* Fuction declaration */
int reverse(int num);


int main()
{
    int num, rev, numIsNegative;

    /* Input number from user */    
    printf("Enter any number: ");
    scanf("%d", &num);
    
	/* Assign 1 if(num < 0) otherwise 0 */
	numIsNegative = (num < 0);
	
	/* If num is negative, then convert it to positive */
	if(numIsNegative)
		num *= -1;
	
    /* Call the function to reverse number */	
    rev = reverse(num); 
	
	/* If num was negative, then convert the reverse to negative */
	if(numIsNegative)
		rev *= -1;
    
    printf("Reverse of %d = %d", num, rev);
    
    return 0;
}


/**
 * Recursive function to find reverse of any number
 */
int reverse(int num)
{
    // Find total number of digits in num
    int digit = (int) log10(num);
    
    // Base condition
    if(num == 0)
        return 0;
    
    return ((num%10 * pow(10, digit)) + reverse(num/10));
}
```

```
Enter any number: 12345
Reverse of 12345 = 54321
```
---
# 16. Check whether a number is palindrome or not using recursion.

| ***Input:***      | ***Output:***     |
| ----------------- | ----------------- |
| Input number: 121 | 121 is palindrome |

```c
/**
 * C program to check palindrome number using recursion
 */
 
#include <stdio.h>
#include <math.h>


/* Function declarations */ 
int reverse(int num);
int isPalindrome(int num);



int main()
{
    int num;
    
    /* Input any number from user */
    printf("Enter any number: ");
    scanf("%d", &num);
    
    if(isPalindrome(num) == 1)
    {
        printf("%d is palindrome number.\n", num);
    }
    else
    {
        printf("%d is NOT palindrome number.\n", num);
    }
    
    return 0;
}



/**
 * Function to check whether a number is palindrome or not.
 * This function returns 1 if the number is palindrome otherwise 0.
 */
int isPalindrome(int num)
{
    /* 
     * Check if the given number is equal to 
     * its reverse.
     */
    if(num == reverse(num))
    {
        return 1;
    }
    
    return 0;
}


/**
 * Recursive function to find reverse of any number
 */
int reverse(int num)
{
    /* Find number of digits in num */
    int digit = (int)log10(num);
    
    /* Recursion base condition */
    if(num == 0)
        return 0;

    return ((num%10 * pow(10, digit)) + reverse(num/10));
}
```

```
Enter any number: 1221
1221 is palindrome number.
```
---
# 17. Find sum of digits of a given number using recursion.

| ***Input:***       | ***Output:***     |
| ------------------ | ----------------- |
| Input number: 1234 | Sum of digits: 10 |

```c
/**
 * C program to calculate sum of digits using recursion
 */
 
#include <stdio.h>

/* Function declaration */
int sumOfDigits(int num);


int main()
{
    int num, sum;
    
    printf("Enter any number to find sum of digits: ");
    scanf("%d", &num);
    
    sum = sumOfDigits(num);
    
    printf("Sum of digits of %d = %d", num, sum);
    
    return 0;
}


/**
 * Recursive function to find sum of digits of a number
 */
int sumOfDigits(int num)
{
    // Base condition
    if(num == 0)
        return 0;
        
    return ((num % 10) + sumOfDigits(num / 10));
}
```

```
Enter any number to find sum of digits: 1234
Sum of digits of 1234 = 10
```
---
# 18. Find factorial of any number using recursion.

| ***Input:***        | ***Output:***        |
| ------------------- | -------------------- |
| Input any number: 5 | Factorial of 5 = 120 |
|                     |                      |

```c
/**
 * C program to find factorial of any number using recursion
 */

#include <stdio.h>

/* Function declaration */
unsigned long long fact(int num);


int main()
{
    int num;
    unsigned long long factorial;
    
    /* Input an integer from user */
    printf("Enter any number: ");
    scanf("%d", &num);
    
    factorial = fact(num); // Call factorial function
    
    printf("Factorial of %d is %llu", num, factorial);
    
    return 0;
}


/**
 * Function to compute and return factorial of any number recursively. 
 */
unsigned long long fact(int num)
{
    // Base condition
    if(num == 0) 
        return 1;
    else
        return num * fact(num - 1);
}
```

```
Enter any number: 10
Factorial of 10 is 3628800
```
---
# 19. Calculate nth Fibonacci term using recursion.

| ***Input:***         | ***Output:***           |
| -------------------- | ----------------------- |
| Input any number: 10 | 10th Fibonacci term: 55 |

```c
/**
 * C program to find nth Fibonacci term using recursion
 */

#include <stdio.h>


/* Function declaration */
unsigned long long fibo(int num);


int main()
{
    int num;
    unsigned long long fibonacci;
    
    /* Input a number from user */
    printf("Enter any number to find nth fiboacci term: ");
    scanf("%d", &num);
    
    fibonacci = fibo(num); 
    
    printf("%d fibonacci term is %llu", num, fibonacci);
    
    return 0;
}


/**
 * Recursive function to find nth Fibonacci term
 */
unsigned long long fibo(int num) 
{
    if(num == 0)      //Base condition
        return 0;
    else if(num == 1) //Base condition
        return 1;
    else 
        return fibo(num-1) + fibo(num-2); 
}
```

```
Enter any number to find nth fiboacci term: 10
10 fibonacci term is 55
```
---
# 20. Find GCD (HCF) of two numbers using recursion.

| ***Input:***                                      | ***Output:***        |
| ------------------------------------------------- | -------------------- |
| Input first number: 10<br>Input second number: 15 | HCF of 10 and 15 = 5 |

```c
/**
 * C program to find GCD (HCF) of two numbers using recursion
 */
 
#include <stdio.h>

/* Function declaration */
int gcd(int a, int b);


int main()
{
    int num1, num2, hcf;
    
    /* Input two numbers from user */
    printf("Enter any two numbers to find GCD: ");
    scanf("%d%d", &num1, &num2);
    
    hcf = gcd(num1, num2);
    
    printf("GCD of %d and %d = %d", num1, num2, hcf);
    
    return 0;
}


/**
 * Recursive approach of euclidean algorithm to find GCD of two numbers
 */
int gcd(int a, int b)
{
    if(b == 0)
        return a;
    else
        return gcd(b, a%b); 
}
```

```
Enter any two numbers to find GCD: 12
30
GCD of 12 and 30 = 6
```
---
# 21. Find LCM of two numbers using recursion.

| ***Input:***                                      | ***Output:***         |
| ------------------------------------------------- | --------------------- |
| Input first number: 12<br>Input second number: 30 | LCM of 12 and 30 = 60 |

```c
/**
 * C program to find LCM of two numbers using recursion
 */
 
#include <stdio.h>


/* Function declaration */
int lcm(int a, int b);


int main()
{
    int num1, num2, LCM;

    /* Input two numbers from user */
    printf("Enter any two numbers to find lcm: ");
    scanf("%d%d", &num1, &num2);
    
    /*
     * Ensures that first parameter of LCM function 
     * is always less than second 
     */
    if(num1 > num2)
        LCM = lcm(num2, num1);
    else
        LCM = lcm(num1, num2);
        
    printf("LCM of %d and %d = %d", num1, num2, LCM);
    
    return 0;
}


/**
 * Recursive function to find lcm of two numbers 'a' and 'b'.
 * Here 'a' needs to be always less than 'b'.
 */
int lcm(int a, int b)
{
    static int multiple = 0;
    
    /* Increments multiple by adding max value to it */
    multiple += b;
    
    /*
     * Base condition of recursion
     * If found a common multiple then return the multiple.
     */
    if((multiple % a == 0) && (multiple % b == 0))
    {
        return multiple;
    }
    else 
    {
        return lcm(a, b);
    }
}
```

```
Enter any two numbers to find lcm: 12
30
LCM of 12 and 30 = 60
```
---
# 22. Display all array elements using recursion.

| ***Input:***                                                    | ***Output:***                                 |
| --------------------------------------------------------------- | --------------------------------------------- |
| Input size: 10<br>Input elements: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 | Array elements: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 |

```c
#include <stdio.h>
#define MAX_SIZE 100


void printArray(int arr[], int start, int len);


int main()
{
    int arr[MAX_SIZE];
    int N, i;
    
    /* Input size and elements in array */
    printf("Enter size of the array: ");
    scanf("%d", &N);
    printf("Enter elements in the array: ");
    for(i=0; i<N; i++) 
    {
        scanf("%d", &arr[i]);
    }
        
    /* Prints array recursively */
    printf("Elements in the array: ");
    printArray(arr, 0, N);
    
    return 0;
}


/**
 * Prints an array recursively within a given range.
 */
void printArray(int arr[], int start, int len)
{
    /* Recursion base condition */
    if(start >= len)
        return;
        
    /* Prints the current array element */
    printf("%d, ", arr[start]);
    
    /* Recursively call printArray to print next element in the array */
    printArray(arr, start + 1, len); 
}
```

```
Enter size of the array: 10
Enter elements in the array: 1 2 3 4 5 6 7 8 9 10
Elements in the array: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,

```
---
# 23. Find sum of elements of array using recursion.

| ***Input:***                                                                   | ***Output:***    |
| ------------------------------------------------------------------------------ | ---------------- |
| Input size of array: 10<br>Input array elements: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 | Sum of array: 55 |

```c
/**
 * C program to find sum of array elements using recursion
 */

#include <stdio.h>
#define MAX_SIZE 100

/* Function declaration to find sum of array */
int sum(int arr[], int start, int len);


int main()
{
    int arr[MAX_SIZE];
    int N, i, sumofarray;
    
    
    /* Input size and elements in array  */
    printf("Enter size of the array: ");
    scanf("%d", &N);
    printf("Enter elements in the array: ");
    for(i=0; i<N; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    
    sumofarray = sum(arr, 0, N);
    printf("Sum of array elements: %d", sumofarray);
    
    return 0;
}


/**
 * Recursively find the sum of elements in an array.
 */
int sum(int arr[], int start, int len) 
{
    /* Recursion base condition */
    if(start >= len)
        return 0;
        
    return (arr[start] + sum(arr, start + 1, len));
}
```

```
Enter size of the array: 10
Enter elements in the array: 1 2 3 4 5 6 7 8 9 10
Sum of array elements: 55
```
---
# 24. Find maximum and minimum elements in array using recursion.

| ***Input:***                                                            | ***Output:***                                |
| ----------------------------------------------------------------------- | -------------------------------------------- |
| Size of array: 10<br>Elements in array: 5, 1, 6, 10, 2, 3, 6, 50, -7, 4 | Maximum element = 50<br>Minimum element = -7 |

```c
#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the array


int maximum(int array[], int index, int len);
int minimum(int array[], int index, int len);


int main()
{
    int array[MAX_SIZE], N, max, min;
    int i;

    /* Input size and elements of array */
    printf("Enter size of the array: ");
    scanf("%d", &N);
    printf("Enter %d elements in array: ", N);
    for(i=0; i<N; i++)
    {
        scanf("%d", &array[i]);
    }

    max = maximum(array, 0, N);
    min = minimum(array, 0, N);

    printf("Minimum element in array = %d\n", min);
    printf("Maximum element in array = %d\n", max);

    return 0;
}


/**
 * Recursive function to find maximum element in the given array.
 */
int maximum(int array[], int index, int len)
{
    int max;

    /*
     * Only last and second last element are left
     */
    if(index >= len-2)
    {
        if(array[index] > array[index + 1])
            return array[index];
        else
            return array[index + 1];
    }


    /*
     * Recursively call maximum to find maximum element in
     * right side of the array from current index.
     */
    max = maximum(array, index + 1, len);

    /*
     * Compare the current array element with maximum 
     * element on its right side
     */
    if(array[index] > max)
        return array[index];
    else
        return max;
}


/**
 * Recursive function to find minimum element in the array.
 */
int minimum(int array[], int index, int len)
{
    int min;

    if(index >= len-2)
    {
        if(array[index] < array[index + 1])
            return array[index];
        else
            return array[index + 1];
    }

    min = minimum(array, index + 1, len);

    if(array[index] < min)
        return array[index];
    else
        return min;
}
```

OR,

```c
/**
 * C program to find maximum and minimum elements in array using recursion
 */

#include <stdio.h>
#define MAX_SIZE 100 //Maximum size of the array

/* Function declarations */
int maximum(int array[], int index, int len);
int minimum(int array[], int index, int len);


int main()
{
    int array[MAX_SIZE], N, max, min;
    int i;

    /* Input size and elements of array */
    printf("Enter size of the array: ");
    scanf("%d", &N);
    printf("Enter %d elements in array: ", N);
    for(i=0; i<N; i++)
    {
        scanf("%d", &array[i]);
    }

    max = maximum(array, 0, N);
    min = minimum(array, 0, N);

    printf("Minimum element in array = %d\n", min);
    printf("Maximum element in array = %d\n", max);

    return 0;
}


/**
 * Recursive function to find maximum element in the given array.
 */
int maximum(int array[], int index, int len)
{
    int max;

    if(index >= len-2)
        return (array[index] > array[index + 1])
                    ? array[index]
                    : array[index + 1];

    max = maximum(array, index + 1, len);

    return (array[index] > max)
                ? array[index]
                : max;
}


/**
 * Recursive function to find minimum element in the array.
 */
int minimum(int array[], int index, int len)
{
    int min;

    if(index >= len-2)
    {
        return (array[index] < array[index + 1])
                    ? array[index]
                    : array[index + 1];
    }

    min = minimum(array, index + 1, len);

    return (array[index] < min)
                ? array[index]
                : min;
}
```

```
Enter size of the array: 10
Enter 10 elements in array: -1 0 5 4 3 10 999 -1 100 -100
Minimum element in array = -100
Maximum element in array = 999
```
---
# 🟢 ARRAYS :  1D

---
# 1. Read and print elements of array.

| ***Input:***                                                                                                             | ***Output:***                                                       |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------- |
| Input size: 10<br>Input elements:<br>1<br>2<br>3<br>4<br>5<br>6<br>7<br>8<br>9<br>10                                     | Output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10                               |
| Enter size of array: 10<br>Enter 10 elements in the array :<br>10<br>20<br>30<br>40<br>50<br>60<br>70<br>80<br>90<br>100 | Elements in array are : <br>10, 20, 30, 40, 50, 60, 70, 80, 90, 100 |

```c
#include <stdio.h>
int main()
{
    int arr[100], N;   //Declare
    printf("Enter size of array: ");   //msg
    scanf("%d", &N);   //size input

    
    printf("Enter %d elements in the array : \n", N);  //msg
    for(int i=0; i<N; i++)   //elements input
    {
        scanf("%d", &arr[i]);
    }


    printf("\nElements in array are: \n");   //msg	
    for(int i=0; i<N; i++)   //elements print 
    {
        printf("%d, ", arr[i]);
    }

    return 0;
}

//Declare an array's Size = 100 (amra nije theke thik kore disi)
//array er time a must be i er value 0 e dite hobe.
//input nilam N shongkhok
//akta msg show korailam
//print korlam oi number gulai jeigula input nisilam

```
---
# 2. Print all negative elements in an array.

| ***Input:***                                                               | ***Output:***                 |
| -------------------------------------------------------------------------- | ----------------------------- |
| Input array:<br>-1<br>-10<br>100<br>5<br>61<br>-2<br>-23<br>8<br>-90<br>51 | Output: -1, -10, -2, -23, -90 |

```c
#include <stdio.h>

int main()
{
    int arr[100], N; //Declare
    printf("Enter size of the array : ");  //msg
    scanf("%d", &N);   //size input


    printf("Enter elements in array : ");  //msg
    for(int i=0; i<N; i++)    //elements input
    {
        scanf("%d", &arr[i]);
    }


    printf("\nAll negative elements in array are : ");  //msg

    for(int i=0; i<N; i++)   //3. tai loop a felano 
    {
        if(arr[i] < 0)   //2. checking = neg kina? hoile entry
        {
            printf("%d\t", arr[i]);  //1. neg hoilei print
        }
    }

    return 0;
}
```

```
Enter size of the array : 10
Enter elements in array : -1 -10 100 5 61 -2 -23 8 -90 51

All negative elements in array are : -1      -10      -2      -23      -90

```
---
# 3. Find sum of all array elements. 

| ***Input:***                       | ***Output:***             |
| ---------------------------------- | ------------------------- |
| Input elements: 10, 20, 30, 40, 50 | Sum of all elements = 150 |

```c
#include <stdio.h>   //BEGINNER
int main()
{
    int i, n, sum=0;
    printf("Enter size of the array: ");   //msg
    scanf("%d", &n);    //size input

	int arr[n];  //jei size input nisi oita array_size a boshano


    printf("Enter %d elements in the array: ", n);  //msg
    
    for(int i=0; i<n; i++) 
    {
        scanf("%d", &arr[i]);  //elements input
    }

    
    for(int i=0; i<n; i++)
    {
        sum = sum + arr[i];   //sum counting
    }


    printf("Sum of all elements of array = %d", sum);   //output

    return 0;
}
```

OR,

```c
#include <stdio.h>   //PRO
int main()
{
    int i, n, sum=0;
    printf("Enter size of the array: ");
    scanf("%d", &n);

	int arr[n];

    printf("Enter %d elements in the array: ", n);
    
    for(i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);   //elements input
         
        sum += arr[i];   //old sum er shathe new element jog kora
    }

    printf("Sum of all elements of array = %d", sum);

    return 0;
}
```

```
Enter size of the array: 10
Enter 10 elements in the array : 10 20 30 40 50 60 70 80 90 100
Sum of all elements of array = 550

```
---
# 4. Find maximum and minimum element in an array.

| ***Input:***                            | ***Output:***               |
| --------------------------------------- | --------------------------- |
| Input array elements: 10, 50, 12, 16, 2 | Maximum = 50<br>Minimum = 2 |

```c
#include <stdio.h>
#define MAX_SIZE 100   // Maximum array size

int main()
{
    int arr[MAX_SIZE];
    int i, max, min, size;

    printf("Enter size of the array: ");   //size input
    scanf("%d", &size);

    
    printf("Enter elements in the array: ");   //Element input
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }


    /* Assume first element as maximum and minimum */
    max = arr[0];
    min = arr[0];



    //Find maximum and minimum in all array elements.
    for(i=1; i<size; i++)
    {
        /* If current element is greater than max */
        if(arr[i] > max)
        {
            max = arr[i];
        }

        /* If current element is smaller than min */
        if(arr[i] < min)
        {
            min = arr[i];
        }
    }

    /* Print maximum and minimum element */
    printf("Maximum element = %d\n", max);
    printf("Minimum element = %d", min);

    return 0;
}
```

```
Enter size of the array: 10
Enter elements in the array: -10 10 0 20 -2 50 100 20 -1 10
Maximum element = 100
Minimum element = -10
```
---
# 5. Find second largest element in an array.

| ***Input:***                                 | ***Output:***       |
| -------------------------------------------- | ------------------- |
| Input array elements: -7 2 3 8 6 6 75 38 3 2 | Second largest = 38 |

```c
/**
 * C program to find second largest number in an array
 */

#include <stdio.h>
#include <limits.h> // For INT_MIN

#define MAX_SIZE 1000     // Maximum array size 

int main()
{
    int arr[MAX_SIZE], size, i;
    int max1, max2;

    /* Input size of the array */
    printf("Enter size of the array (1-1000): ");
    scanf("%d", &size);

    /* Input array elements */ 
    printf("Enter elements in the array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    max1 = max2 = INT_MIN;


    /*
     * Check for first largest and second
     */
    for(i=0; i<size; i++)
    {
        if(arr[i] > max1)
        {
            /*
             * If current element of the array is first largest
             * then make current max as second max
             * and then max as current array element
             */
            max2 = max1;
            max1 = arr[i];
        }
        else if(arr[i] > max2 && arr[i] < max1)
        {
            /*
             * If current array element is less than first largest
             * but is greater than second largest then make it
             * second largest
             */
            max2 = arr[i];
        }
    }

    printf("First largest = %d\n", max1);
    printf("Second largest = %d", max2);

    return 0;
}
```

```
Enter size of the array (1-1000): 10
Enter elements in the array: -7 2 3 8 6 6 75 38 3 2
First largest = 75
Second largest = 38
```
---
# 6. Count total number of even and odd elements in an array.

| ***Input:***                   | ***Output:***                                   |
| ------------------------------ | ----------------------------------------------- |
| Input array: 1 2 3 4 5 6 7 8 9 | Total even elements: 4<br>Total odd elements: 5 |

```c
/**
 * C program to count total number of even and odd elements in an array
 */

#include <stdio.h>

#define MAX_SIZE 100 //Maximum size of the array

int main()
{
    int arr[MAX_SIZE];
    int i, size, even, odd;

    /* Input size of the array */
    printf("Enter size of the array: ");
    scanf("%d", &size);

    /* Input array elements */
    printf("Enter %d elements in array: ", size);
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    /* Assuming that there are 0 even and odd elements */
    even = 0;
    odd  = 0;

    for(i=0; i<size; i++)
    {
        /* If the current element of array is even then increment even count */
        if(arr[i]%2 == 0)
        {
            even++;
        }
        else
        {
            odd++;
        }
    }

    printf("Total even elements: %d\n", even);
    printf("Total odd elements: %d", odd);

    return 0;
}
```

```
Enter size of the array: 10
Enter 10 elements in array: 5 6 4 12 19 121 1 7 9 63
Total even elements: 3
Total odd elements: 7
```
---
# 7. Count total number of negative elements in an array.

| ***Input:***                                                   | ***Output:***                        |
| -------------------------------------------------------------- | ------------------------------------ |
| Input array elements : 10, -2, 5, -20, 1, 50, 60, -50, -12, -9 | Total number of negative elements: 5 |

```c
/**
 * C program to count total number of negative elements in array
 */

#include <stdio.h>

#define MAX_SIZE 100    // Maximum array size


int main()
{
    int arr[MAX_SIZE];  // Declares array of size 100
    int i, size, count = 0;

    /* Input size of array */
    printf("Enter size of the array : ");
    scanf("%d", &size);


    /* Input array elements */
    printf("Enter elements in array : ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    /*
     * Count total negative elements in array
     */
    for(i=0; i<size; i++)
    {
        /* Increment count if current array element is negative */
        if(arr[i] < 0)
        {
            count++;
        }
    }

    printf("\nTotal negative elements in array = %d", count);

    return 0;
}
```

```
Enter size of the array : 10
Enter elements in array : 10 -2 5 -20 1 50 60 -50 -12 -9

Total negative elements in array = 5
```
---
# 8. Copy all elements from an array to another array.

| ***Input:***                                        | ***Output:***                                                                |
| --------------------------------------------------- | ---------------------------------------------------------------------------- |
| Input array1 elements: 10 1 95 30 45 12 60 89 40 -4 | Array1: 10 1 95 30 45 12 60 89 40 -4<br>Array2: 10 1 95 30 45 12 60 89 40 -4 |

```c
/**
 * C program to copy one array to another array
 */

#include <stdio.h>
#define MAX_SIZE 100

int main()
{
    int source[MAX_SIZE], dest[MAX_SIZE];
    int i, size;

    /* Input size of the array */
    printf("Enter the size of the array : ");
    scanf("%d", &size);
    
    /* Input array elements */
    printf("Enter elements of source array : ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &source[i]);
    }

    /*
     * Copy all elements from source array to dest array
     */
    for(i=0; i<size; i++)
    {
        dest[i] = source[i];
    }

    /* 
     * Print all elements of source array
     */
    printf("\nElements of source array are : ");
    for(i=0; i<size; i++)
    {
        printf("%d\t", source[i]);
    }

    /*
     * Print all elements of dest array
     */
    printf("\nElements of dest array are : ");
    for(i=0; i<size; i++)
    {
        printf("%d\t", dest[i]);
    }

    return 0;
}
```

```
Enter the size of the array : 10
Enter elements of source array : 10 20 30 40 50 60 70 80 90 100

Elements of source array are : 10        20        30        40        50        60        70        80        90        100
Elements of dest array are : 10        20        30        40        50        60        70        80        90        100


```
---
# 9. Insert an element in an array.

| ***Input:***                                                                                                 | ***Output:***                                 |
| ------------------------------------------------------------------------------------------------------------ | --------------------------------------------- |
| Input array elements: 10, 20, 30, 40, 50<br>Input element to insert: 25<br>Input position where to insert: 3 | Elements of array are: 10, 20, 25, 30, 40, 50 |

```c
/**
 * C program to insert an element in array at specified position
 */

#include <stdio.h>
#define MAX_SIZE 100

int main()
{
    int arr[MAX_SIZE];
    int i, size, num, pos;

    /* Input size of the array */
    printf("Enter size of the array : ");
    scanf("%d", &size);

    /* Input elements in array */
    printf("Enter elements in array : ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    /* Input new element and position to insert */
    printf("Enter element to insert : ");
    scanf("%d", &num);
    printf("Enter the element position : ");
    scanf("%d", &pos);

    /* If position of element is not valid */
    if(pos > size+1 || pos <= 0)
    {
        printf("Invalid position! Please enter position between 1 to %d", size);
    }
    else
    {
        /* Make room for new array element by shifting to right */
        for(i=size; i>=pos; i--)
        {
            arr[i] = arr[i-1];
        }
        
        /* Insert new element at given position and increment size */
        arr[pos-1] = num;
        size++; 

        /* Print array after insert operation */
        printf("Array elements after insertion : ");
        for(i=0; i<size; i++)
        {
            printf("%d\t", arr[i]);
        }
    }

    return 0;
}
```

```
Enter size of the array : 5
Enter elements in array : 10 20 30 40 50
Enter element to insert : 25
Enter the element position : 3
Array elements after insertion : 10      20      25      30      40      50


```
---
# 10. Delete an element from an array at specified position.

| ***Input:***                                                        | ***Output:***                  |
| ------------------------------------------------------------------- | ------------------------------ |
| Input array elements: 10 20 30 40 50<br>Input position to delete: 2 | Array elements: 10, 30, 40, 50 |

```c
/*
 * C program to delete an element from array at specified position
 */

#include <stdio.h>
#define MAX_SIZE 100

int main()
{
    int arr[MAX_SIZE];
    int i, size, pos;

    /* Input size and element in array */
    printf("Enter size of the array : ");
    scanf("%d", &size);
    printf("Enter elements in array : ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    /* Input element position to delete */
    printf("Enter the element position to delete : ");
    scanf("%d", &pos);


    /* Invalid delete position */
    if(pos < 0 || pos > size)
    {
        printf("Invalid position! Please enter position between 1 to %d", size);
    }
    else
    {
        /* Copy next element value to current element */
        for(i=pos-1; i<size-1; i++)
        {
            arr[i] = arr[i + 1];
        }

        /* Decrement array size by 1 */
        size--;

        /* Print array after deletion */
        printf("\nElements of array after delete are : ");
        for(i=0; i<size; i++)
        {
            printf("%d\t", arr[i]);
        }
    }

    return 0;
}
```

```
Enter size of the array : 5
Enter elements in array : 10 20 30 40 50
Enter the element position to delete : 2

Elements of array after delete are : 10      30      40      50


```
---
# 11. Count frequency of each element in an array.

| ***Input:***                                          | ***Output:***                                                                                                |
| ----------------------------------------------------- | ------------------------------------------------------------------------------------------------------------ |
| Input array elements: 5, 10, 2, 5, 50, 5, 10, 1, 2, 2 | Frequency of 5 = 3<br>Frequency of 10 = 2<br>Frequency of 2 = 3<br>Frequency of 50 = 1<br>Frequency of 1 = 1 |

```c
/**
 * C program to count frequency of each element of array
 */

#include <stdio.h>

int main()
{
    int arr[100], freq[100];
    int size, i, j, count;

    /* Input size of array */
    printf("Enter size of array: ");
    scanf("%d", &size);

    /* Input elements in array */
    printf("Enter elements in array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);

        /* Initially initialize frequencies to -1 */
        freq[i] = -1;
    }


    for(i=0; i<size; i++)
    {
        count = 1;
        for(j=i+1; j<size; j++)
        {
            /* If duplicate element is found */
            if(arr[i]==arr[j])
            {
                count++;

                /* Make sure not to count frequency of same element again */
                freq[j] = 0;
            }
        }

        /* If frequency of current element is not counted */
        if(freq[i] != 0)
        {
            freq[i] = count;
        }
    }

    /*
     * Print frequency of each element
     */
    printf("\nFrequency of all elements of array : \n");
    for(i=0; i<size; i++)
    {
        if(freq[i] != 0)
        {
            printf("%d occurs %d times\n", arr[i], freq[i]);
        }
    }

    return 0;
}
```

```
Enter size of array: 10
Enter elements in array: 5 10 2 5 50 5 10 1 2 2

Frequency of all elements of array :
5 occurs 3 times
10 occurs 2 times
2 occurs 3 times
50 occurs 1 times
1 occurs 1 times

```
---
# 12. Print all unique elements in the array.

| ***Input:***                                          | ***Output:***                                       |
| ----------------------------------------------------- | --------------------------------------------------- |
| Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 | All unique elements in the array are: 3, 20, 12, 10 |

```c
/**
 * C program to print all unique elements in array
 */

#include <stdio.h>
#define MAX_SIZE 100

int main()
{
    int arr[MAX_SIZE], freq[MAX_SIZE];
    int size, i, j, count;
 
    /* Input size of array and elements in array */
    printf("Enter size of array: ");
    scanf("%d", &size);
    printf("Enter elements in array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
        freq[i] = -1;
    }
 
    /* Find frequency of each element */
    for(i=0; i<size; i++)
    {
        count = 1;
        for(j=i+1; j<size; j++)
        {
            if(arr[i] == arr[j])
            {
                count++;
                freq[j] = 0;
            }
        }
 
        if(freq[i] != 0)
        {
            freq[i] = count;
        }
    }
 
    /* Print all unique elements of array */
    printf("\nUnique elements in the array are: ");
    for(i=0; i<size; i++)
    {
        if(freq[i] == 1)
        {
            printf("%d ", arr[i]);
        }
    }

    return 0;
}
```

```
Enter size of array: 10
Enter elements in array: 1 2 3 5 1 5 20 2 12 10

Unique elements in the array are: 3 20 12 10
```
---
# 13. Count total number of duplicate elements in an array.

| ***Input:***                                             | ***Output:***                          |
| -------------------------------------------------------- | -------------------------------------- |
| Input array elements: 1, 10, 20, 1, 25, 1, 10, 30, 25, 1 | Total number of duplicate elements = 5 |

```c
/**
 * C program to count total number of duplicate elements in an array
 */

#include <stdio.h>

#define MAX_SIZE 100  // Maximum array size

int main()
{
    int arr[MAX_SIZE];
    int i, j, size, count = 0;

    /* Input size of array */
    printf("Enter size of the array : ");
    scanf("%d", &size);

    /* Input elements in array */
    printf("Enter elements in array : ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    /*
     * Find all duplicate elements in array
     */
    for(i=0; i<size; i++)
    {
        for(j=i+1; j<size; j++)
        {
            /* If duplicate found then increment count by 1 */
            if(arr[i] == arr[j])
            {
                count++;
                break;
            }
        }
    }

    printf("\nTotal number of duplicate elements found in array = %d", count);

    return 0;
}
```

```
Enter size of the array : 10
Enter elements in array : 1 10 20 1 25 1 10 30 25 1

Total number of duplicate elements found in array = 5

```
---
# 14. Delete all duplicate elements from an array.

| ***Input:***                                              | ***Output:***                                                                        |
| --------------------------------------------------------- | ------------------------------------------------------------------------------------ |
| Input array elements: 10, 20, 10, 1, 100, 10, 2, 1, 5, 10 | After removing all duplicate elements<br>Elements of array are: 10, 20, 1, 100, 2, 5 |

```c
/**
 * C program to delete all duplicate elements from array
 */

#include <stdio.h>

#define MAX_SIZE 100 // Maximum size of the array

int main()
{
    int arr[MAX_SIZE]; // Declares an array of size 100
    int size;          // Total number of elements in array
    int i, j, k;       // Loop control variables

    /* Input size of the array */
    printf("Enter size of the array : ");
    scanf("%d", &size);

    /* Input elements in the array */
    printf("Enter elements in array : ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }


    /*
     * Find duplicate elements in array
     */
    for(i=0; i<size; i++)
    {
        for(j=i+1; j<size; j++)
        {
            /* If any duplicate found */
            if(arr[i] == arr[j])
            {
                /* Delete the current duplicate element */
                for(k=j; k < size - 1; k++)
                {
                    arr[k] = arr[k + 1];
                }

                /* Decrement size after removing duplicate element */
                size--;

                /* If shifting of elements occur then don't increment j */
                j--;
            }
        }
    }


    /*
     * Print array after deleting duplicate elements
     */
    printf("\nArray elements after deleting duplicates : ");
    for(i=0; i<size; i++)
    {
        printf("%d\t", arr[i]);
    }

    return 0;
}
```

```
Enter size of the array : 10
Enter elements in array : 10 20 10 1 100 10 2 1 5 10

Array elements after deleting duplicates : 10    20    1    100    2    5


```
---
# 15. Merge two array to third array.

| ***Input:***                                                                           | ***Output:***                                                 |
| -------------------------------------------------------------------------------------- | ------------------------------------------------------------- |
| Input first array elements: 1, 4, 6, 9, 15<br>Input second array elements: 2, 5, 8, 10 | Merged array in ascending order = 1, 2, 4, 5, 6, 8, 9, 10, 15 |

```c
/**
 * C program to merge two sorted array in ascending order
 */

#include <stdio.h>
#define MAX_SIZE 100      // Maximum size of the array

int main()
{
    int arr1[MAX_SIZE], arr2[MAX_SIZE], mergeArray[MAX_SIZE * 2];
    int size1, size2, mergeSize;
    int index1, index2, mergeIndex;
    int i;
     
    /* Input size of first array */
    printf("Enter the size of first array : ");
    scanf("%d", &size1);

    /* Input elements in first array */
    printf("Enter elements in first array : ");
    for(i=0; i<size1; i++)
    {
        scanf("%d", &arr1[i]);
    }

    /* Input size of second array */
    printf("\nEnter the size of second array : ");
    scanf("%d", &size2);

    /* Input elements in second array */
    printf("Enter elements in second array : ");
    for(i=0; i<size2; i++)
    {
        scanf("%d", &arr2[i]);
    }


    mergeSize = size1 + size2;


    /*
     * Merge two array in ascending order 
     */
    index1 = 0;
    index2 = 0;
    for(mergeIndex=0; mergeIndex < mergeSize; mergeIndex++)
    {
        /* 
         * If all elements of one array 
         * is merged to final array
         */
        if(index1 >= size1 || index2 >= size2)
        {
            break;
        }


        if(arr1[index1] < arr2[index2])
        {
            mergeArray[mergeIndex] = arr1[index1];
            index1++;
        }
        else
        {
            mergeArray[mergeIndex] = arr2[index2];
            index2++;
        }
    }

    /*
     * Merge remaining array elements
     */
    while(index1 < size1)
    {
        mergeArray[mergeIndex] = arr1[index1];
        mergeIndex++;
        index1++;
    }
    while(index2 < size2)
    {
        mergeArray[mergeIndex] = arr2[index2];
        mergeIndex++;
        index2++;
    }


    /* 
     * Print merged array
     */
    printf("\nArray merged in ascending order : ");
    for(i=0; i<mergeSize; i++)
    {
        printf("%d\t", mergeArray[i]);
    }

    return 0;
}
```

```
Enter the size of first array : 5
Enter elements in first array : 1 4 6 9 15

Enter the size of second array : 4
Enter elements in second array : 2 5 8 10

Array merged in ascending order : 1      2      4      5      6      8      9      10      15


```
---
# 16. Find reverse of an array.

| ***Input:***                             | ***Output:***                                    |
| ---------------------------------------- | ------------------------------------------------ |
| Input array elements: 10, 5, 16, 35, 500 | Array elements after reverse: 500, 35, 16, 5, 10 |

```c
/**
 * C program to print array in reverse order
 */

#include <stdio.h>
#define MAX_SIZE 100      // Defines maximum size of array

int main()
{
    int arr[MAX_SIZE];
    int size, i;

    /* Input size of array */
    printf("Enter size of the array: ");
    scanf("%d", &size);

    /* Input array elements */
    printf("Enter elements in array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    /*
     * Print array in reversed order
     */
    printf("\nArray in reverse order: ");
    for(i = size-1; i>=0; i--)
    {
        printf("%d\t", arr[i]);
    }

    return 0;
}
```

OR,

```c
/**
 * C program to find reverse of array
 */

#include <stdio.h>
#define MAX_SIZE 100       // Maximum array size

int main()
{
    int arr[MAX_SIZE], reverse[MAX_SIZE];
    int size, i, arrIndex, revIndex;

    /* Input size of the array */
    printf("Enter size of the array: ");
    scanf("%d", &size);

    /* Input array elements */
    printf("Enter elements in array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    revIndex = 0;
    arrIndex = size - 1;
    while(arrIndex >= 0)
    {
        /* Copy value from original array to reverse array */
        reverse[revIndex] = arr[arrIndex];
        
        revIndex++;
        arrIndex--;
    }

    /*
     * Print the reversed array
     */
    printf("\nReversed array : ");
    for(i=0; i<size; i++)
    {
        printf("%d\t", reverse[i]);
    }

    return 0;
}
```

OR,

```c
/**
 * C program to reverse an array without using second array
 */

#include <stdio.h>
#define MAX_SIZE 100      // Maximum array size

int main()
{
    int arr[MAX_SIZE];
    int size, i, arrIndex, revIndex;
    int temp; // Used for swapping 

    /* Input size of the array */
    printf("Enter size of the array: ");
    scanf("%d", &size);

    /* Input array elements */
    printf("Enter elements in array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    revIndex = 0;
    arrIndex = size - 1;
    while(revIndex < arrIndex)
    {
        /* Copy value from original array to reverse array */
        temp = arr[revIndex];
        arr[revIndex] = arr[arrIndex];
        arr[arrIndex] = temp;
        
        revIndex++;
        arrIndex--;
    }

    /*
     * Print reversed array
     */
    printf("\nReversed array : ");
    for(i=0; i<size; i++)
    {
        printf("%d\t", arr[i]);
    }

    return 0;
}
```

```
Enter size of the array: 5
Enter elements in array: 10 5 16 35 500

Reversed array : 500      35      16      5      10


```
---
# 17. Put even and odd elements of array in two separate array.

| ***Input:***                                                                | ***Output:***                                                                       |
| --------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| Input size of the array: 10<br>Input elements in array: 0 1 2 3 4 5 6 7 8 9 | Output even elements in array: 0 2 4 6 8<br>Output odd elements in array: 1 3 5 7 9 |

```c
/**
 * C program to separate even and odd array elements in two separate array
 */

#include <stdio.h>

#define MAX_SIZE 1000  // Maximum size of the array

/* Function to print array */
void printArray(int arr[], int len);



int main()
{
    int arr[MAX_SIZE];
    int even[MAX_SIZE], odd[MAX_SIZE];
    
    int evenCount, oddCount;
    int i, size;

    /* Input size of the array */
    printf("Enter size of the array: ");
    scanf("%d", &size);

    /* Input elements in array */
    printf("Enter elements in the array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    evenCount = 0;
    oddCount = 0;

    for(i=0; i<size; i++)
    {
        // If arr[i] is odd
        if(arr[i] & 1)
        {
            odd[oddCount] = arr[i];
            oddCount++;
        }
        else
        {
            even[evenCount] = arr[i];
            evenCount++;
        }
    }

    printf("\nElements of even array: \n");
    printArray(even, evenCount);

    printf("\nElements of odd array: \n");
    printArray(odd, oddCount);

    return 0;
}



/**
 * Print the entire integer array
 * @arr Integer array to be displayed or printed on screen
 * @len Length of the array
 */
void printArray(int arr[], int len)
{
    int i;
    printf("Elements in the array: ");
    for(i=0; i<len; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
```

```
Enter size of the array: 10
Enter elements in the array: 0 1 2 3 4 5 6 7 8 9

Elements of even array:
Elements in the array: 0 2 4 6 8

Elements of odd array:
Elements in the array: 1 3 5 7 9
```
---
# 18. Search an element in an array.

| ***Input:***                                                                             | ***Output:***                                        |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------- |
| Input size of array: 10<br>Input elements in array: 10, 12, 20, 25, 13, 10, 9, 40, 60, 5 | Element to search is: 25<br>Element found at index 3 |

```c
/**
 * C program to search element in array
 */

#include <stdio.h>

#define MAX_SIZE 100  // Maximum array size

int main()
{
    int arr[MAX_SIZE];
    int size, i, toSearch, found;

    /* Input size of array */
    printf("Enter size of array: ");
    scanf("%d", &size);

    /* Input elements of array */
    printf("Enter elements in array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\nEnter element to search: ");
    scanf("%d", &toSearch);

    /* Assume that element does not exists in array */
    found = 0; 
    
    for(i=0; i<size; i++)
    {
        /* 
         * If element is found in array then raise found flag
         * and terminate from loop.
         */
        if(arr[i] == toSearch)
        {
            found = 1;
            break;
        }
    }

    /*
     * If element is not found in array
     */
    if(found == 1)
    {
        printf("\n%d is found at position %d", toSearch, i + 1);
    }
    else
    {
        printf("\n%d is not found in the array", toSearch);
    }

    return 0;
}
```

```
Enter size of array: 10
Enter elements in array: 10 12 20 25 13 10 9 40 60 5

Enter element to search: 25

25 is found at position 4
```
---
# 19. Sort array elements in ascending or descending order.

| ***Input:***                                                                             | ***Output:***                                                            |
| ---------------------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| Input size of array: 10<br>Input array elements: <br>20, 2, 10, 6, 52, 31, 0, 45, 79, 40 | Array sorted in ascending order: <br>0, 2, 6, 10, 20, 31, 40, 45, 52, 79 |

```c
/**
 * C program to sort elements of array in ascending order
 */

#include <stdio.h>
#define MAX_SIZE 100    // Maximum array size

int main()
{
    int arr[MAX_SIZE];
    int size;
    int i, j, temp;

    /* Input size of array */
    printf("Enter size of array: ");
    scanf("%d", &size);

    /* Input elements in array */
    printf("Enter elements in array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    for(i=0; i<size; i++)
    {
        /* 
         * Place currently selected element array[i]
         * to its correct place.
         */
        for(j=i+1; j<size; j++)
        {
            /* 
             * Swap if currently selected array element
             * is not at its correct position.
             */
            if(arr[i] > arr[j])
            {
                temp     = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    /* Print the sorted array */
    printf("\nElements of array in ascending order: ");
    for(i=0; i<size; i++)
    {
        printf("%d\t", arr[i]);
    }

    return 0;
}
```

```
Enter size of array: 10
Enter elements in array: 20 2 10 6 52 31 0 45 79 40

Elements of array in ascending order: 0      2      6      10      20      31      40      45      52      79


```
---
# 20. Sort even and odd elements of array separately.

| ***Input:***                                                              | ***Output:***                                 |
| ------------------------------------------------------------------------- | --------------------------------------------- |
| Input size of array: 10<br>Input elements of array: 0 5 1 2 3 4 6 12 10 9 | Output in sorted order: 0 2 4 6 10 12 1 3 5 9 |

```c
/**
 * C program to sort even and odd elements of an array separately
 */
  
#include <stdio.h>
#include <limits.h> //Used for INT_MAX
  
#define MAX_SIZE 1000 //Maximum size of the array
  
  
/*
 * Functions used in this program
 */
void arrange(int arr[], int len, int pivot);
void sort(int arr[], int start, int end);
void print(int arr[], int len);
  
  
  
int main()
{
    int arr[MAX_SIZE], i, n;
    int pivot, evenCount, oddCount;
  
    pivot = 0;
    evenCount = oddCount = 0;
  
    /*
     * Reads size and elements in the array
     */
    printf("Enter size of the array: ");
    scanf("%d", &n);
    printf("Enter elements in the array: ");
    for(i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
  
        // If current element is odd then increase pivot
        if(arr[i] & 1)
            oddCount++;
        else
            evenCount++;
    } 
     
    /*
     * Pivot is position that separates even and odd elements
     */
    pivot = (evenCount > oddCount) ? evenCount : oddCount;
  
    print(arr, n);
  
    // Arranges all even and odd elements sequentially
    arrange(arr, n, pivot);
     
    // Print elements after arranging even and odd elements
    printf("\nElements after arranging even and odd elements separately\n");
    print(arr, n);
  
    //Sorts even part of the array
    sort(arr, pivot, n);
  
    //Sorts odd part of the array
    sort(arr, 0, pivot);
  
    //Prints the final sorted array
    printf("\nFinal array after sorting even and odd elements separately\n");
    print(arr, n);
  
    return 0;
}
  
  
  
/**
 * Arranges all even and odd elements of the array separately. Puts
 * all even elements first then all odd elements.
 */
void arrange(int arr[], int len, int pivot)
{
    int i, j, temp;
  
    for(i=0; i<pivot; i++)
    {
        /*
         * If current element of array is odd put it into
         * odd element place
         */
        if(arr[i] & 1)
        {
            for(j=pivot; j<len; j++)
            {
                //Look for an even element then swap with odd element
                if(!(arr[j] & 1))
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
    }
}
  
  
  
/**
 * Sorts the elements of array within a range 
 */
void sort(int arr[], int start, int end)
{
    int i, j, temp;
    int len = start + end;
  
    for(i=start; i<len; i++)
    {
        for(j=i+1; j<len; j++)
        {
            if(arr[j] < arr[i])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
  
  
  
/**
 * Prints the entire integer array 
 */
void print(int arr[], int len)
{
    int i;
    printf("Elements in the array: ");
    for(i=0; i<len; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
```

```
Enter size of the array: 10
Enter elements in the array: 0 1 2 3 4 5 6 7 8 9
Elements in the array: 0 1 2 3 4 5 6 7 8 9

Elements after arranging even and odd elements separately
Elements in the array: 0 6 2 8 4 5 1 7 3 9

Final array after sorting even and odd elements separately
Elements in the array: 0 2 4 6 8 1 3 5 7 9
```
---
# 21. Left rotate an array.

| ***Input:***                                                                               | ***Output:***                                           |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------- |
| Input 10 elements in array: 1 2 3 4 5 6 7 8 9 10<br>Input number of times to rotate: 3<br> | Array after left rotation 3 times: 4 5 6 7 8 9 10 1 2 3 |

```c
/**
 * C program to left rotate an array
 */

#include <stdio.h>
#define SIZE 10 /* Size of the array */

void printArray(int arr[]);
void rotateByOne(int arr[]);


int main()
{
    int i, N;
    int arr[SIZE];

    printf("Enter 10 elements array: ");
    for(i=0; i<SIZE; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Enter number of times to left rotate: ");
    scanf("%d", &N);

    /* Actual rotation */
    N = N % SIZE;

    /* Print array before rotation */
    printf("Array before rotationn");
    printArray(arr);

    /* Rotate array n times */
    for(i=1; i<=N; i++)
    {
        rotateByOne(arr);
    }

    /* Print array after rotation */
    printf("\n\nArray after rotation\n");
    printArray(arr);

    return 0;
}


void rotateByOne(int arr[])
{
    int i, first;

    /* Store first element of array */
    first = arr[0];

    for(i=0; i<SIZE-1; i++)
    {
        /* Move each array element to its left */
        arr[i] = arr[i + 1];
    }

    /* Copies the first element of array to last */
    arr[SIZE-1] = first;
}


/**
 * Print the given array
 */
void printArray(int arr[])
{
    int i;

    for(i=0; i<SIZE; i++)
    {
        printf("%d ", arr[i]);
    }
}
```

```
Enter 10 elements array: 1 2 3 4 5 6 7 8 9 10
Enter number of times to left rotate: 3
Array before rotation
1 2 3 4 5 6 7 8 9 10

Array after rotation
4 5 6 7 8 9 10 1 2 3

```
---
# 22. Right rotate an array.

| ***Input:***                                                                           | ***Output:***                                    |
| -------------------------------------------------------------------------------------- | ------------------------------------------------ |
| Input 10 elements in array: 1 2 3 4 5 6 7 8 9 10<br>Input number of times to rotate: 3 | Array after right rotation: 8 9 10 1 2 3 4 5 6 7 |

```c
/**
 * C program to right rotate an array
 */

#include <stdio.h>
#define SIZE 10 /* Size of the array */

void printArray(int arr[]);
void rotateByOne(int arr[]);


int main()
{
    int i, N;
    int arr[SIZE];

    printf("Enter 10 elements array: ");
    for(i=0; i<SIZE; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Enter number of times to right rotate: ");
    scanf("%d", &N);

    /* Actual rotation */
    N = N % SIZE;

    /* Print array before rotation */
    printf("Array before rotationn");
    printArray(arr);

    /* Rotate array n times */
    for(i=1; i<=N; i++)
    {
        rotateByOne(arr);
    }

    /* Print array after rotation */
    printf("\n\nArray after rotation\n");
    printArray(arr);

    return 0;
}


void rotateByOne(int arr[])
{
    int i, last;

    /* Store last element of array */
    last = arr[SIZE - 1];

    for(i=SIZE-1; i>0; i--)
    {
        /* Move each array element to its right */
        arr[i] = arr[i - 1];
    }

    /* Copy last element of array to first */
    arr[0] = last;
}


/**
 * Print the given array
 */
void printArray(int arr[])
{
    int i;

    for(i=0; i<SIZE; i++)
    {
        printf("%d ", arr[i]);
    }
}
```

```
Enter 10 elements array: 1 2 3 4 5 6 7 8 9 10
Enter number of times to right rotate: 3
Array before rotation
1 2 3 4 5 6 7 8 9 10

Array after rotation
8 9 10 1 2 3 4 5 6 7

```
---
# 🟢 ARRAYS :  2D

---
# 23. Add two matrices.

| ***Input:***                                                                                                            | ***Output:***                                            |
| ----------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------- |
| Input elements in 3x3 matrix1: <br>1 2 3<br>4 5 6<br>7 8 9<br>Input elements in 3x3 matrix2:<br>9 8 7<br>6 5 4<br>3 2 1 | Sum of both matrix =<br>10 10 10<br>10 10 10<br>10 10 10 |

```c
/**
 * C program to find sum of two matrices of size 3x3
 */

#include <stdio.h>

#define SIZE 3 // Size of the matrix

int main()
{
    int A[SIZE][SIZE]; // Matrix 1
    int B[SIZE][SIZE]; // Matrix 2
    int C[SIZE][SIZE]; // Resultant matrix

    int row, col;

    /* Input elements in first matrix*/
    printf("Enter elements in matrix A of size 3x3: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Input elements in second matrix */
    printf("\nEnter elements in matrix B of size 3x3: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &B[row][col]);
        }
    }

    /*
     * Add both matrices A and B entry wise or element wise
     * and stores result in matrix C
     */
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            /* Cij = Aij + Bij */
            C[row][col] = A[row][col] + B[row][col];
        }
    }


    /* Print the value of resultant matrix C */
    printf("\nSum of matrices A+B = \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            printf("%d ", C[row][col]);
        }
        printf("\n");
    }

    return 0;
}
```

```
Enter elements in matrix A of size 3x3:
1 2 3
4 5 6
7 8 9

Enter elements in matrix B of size 3x3:
9 8 7
6 5 4
3 2 1

Sum of matrices A+B =
10 10 10
10 10 10
10 10 10

```
---
# 24. Subtract two matrices.

| ***Input:***                                                                                                                   | ***Output:***                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ---------------------------------------------------------------- |
| Input elements in 3x3 matrix1:<br>1 2 3<br>4 5 6<br>7 8 9<br><br>Input elements in 3x3 matrix2:<br>9 8 7<br>6 5 4<br>3 2 1<br> | Difference of both matrices =<br>-8 -6 -4<br>-2  0  2<br>4  6  8 |

```c
/**
 * C program to find difference of two matrices of size 3x3
 */

#include <stdio.h>

#define SIZE 3 // Size of the matrix

int main()
{
    int A[SIZE][SIZE];  // Matrix 1
    int B[SIZE][SIZE];  // Matrix 2
    int C[SIZE][SIZE];  // Resultant matrix

    int row, col;

    /* Input elements in first matrix */
    printf("Enter elements in matrix A of size 3x3: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Input elements in second matrix */
    printf("\nEnter elements in matrix B of size 3x3: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &B[row][col]);
        }
    }

    /*
     * Subtract both matrices and store the result in matrix C
     */
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            /* Cij = Aij - Bij */
            C[row][col] = A[row][col] - B[row][col];
        }
    }

    /* Print difference of both matrices A and B */
    printf("\nDifference of two matrices A-B = \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            printf("%d ", C[row][col]);
        }
        printf("\n");
    }

    return 0;
}
```

```
Enter elements in matrix A of size 3x3:
1 2 3
4 5 6
7 8 9

Enter elements in matrix B of size 3x3:
9 8 7
6 5 4
3 2 1

Difference of both matrices A-B =
-8 -6 -4
-2  0  2
4  6  8

```
---
# 25. Perform Scalar matrix multiplication.

| ***Input:***                                                                  | ***Output:***                      |
| ----------------------------------------------------------------------------- | ---------------------------------- |
| Input elements of matrix A:<br>1 2 3<br>4 5 6<br>7 8 9<br>Input multiplier: 2 | <br>2  4  6<br>8 10 12<br>14 16 18 |

```c
/**
 * C program to perform scalar matrix multiplication
 */
 
#include <stdio.h>

#define SIZE 3 // Maximum size of the array

int main()
{
    int A[SIZE][SIZE]; 
    int num, row, col;

    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size %dx%d: \n", SIZE, SIZE);
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Input multiplier from user */
    printf("Enter any number to multiply with matrix A: ");
    scanf("%d", &num);

    /* Perform scalar multiplication of matrix */
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            /* (cAij) = c . Aij */
            A[row][col] = num * A[row][col];
        }
    }

    /* Print result of scalar multiplication of matrix */
    printf("\nResultant matrix c.A = \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            printf("%d ", A[row][col]);
        }
        printf("\n");
    }

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 2 3
4 5 6
7 8 9
Enter any number to multiply with matrix A: 2

Resultant matrix c.A =
2  4  6
8 10 12
14 16 18
```
---
# 26. Multiply two matrices.

| ***Input:***                                                                                                   | ***Output:***                                                   |
| -------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------- |
| Input elements of matrix1:<br>1 2 3<br>4 5 6<br>7 8 9<br>Input elements of matrix2:<br>9 8 7<br>6 5 4<br>3 2 1 | <br>Product of matrices =<br>30 24 18<br>84 69 54<br>138 114 90 |

```c
/**
 * C program to multiply two matrices
 */

#include <stdio.h>

#define SIZE 3 // Size of the matrix

int main()
{
    int A[SIZE][SIZE]; // Matrix 1 
    int B[SIZE][SIZE]; // Matrix 2
    int C[SIZE][SIZE]; // Resultant matrix
    
    int row, col, i, sum;


    /* Input elements in first matrix from user */
    printf("Enter elements in matrix A of size %dx%d: \n", SIZE, SIZE);
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Input elements in second matrix from user */
    printf("\nEnter elements in matrix B of size %dx%d: \n", SIZE, SIZE);
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &B[row][col]);
        }
    }

    /*
     * Multiply both matrices A*B
     */
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            sum = 0;
            /*
             * Multiply row of first matrix to column of second matrix
             * and store sum of product of elements in sum.
             */
            for(i=0; i<SIZE; i++)
            {
                sum += A[row][i] * B[i][col];
            }

            C[row][col] = sum;
        }
    }

    /* Print product of the matrices */
    printf("\nProduct of matrix A * B = \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            printf("%d ", C[row][col]);
        }
        printf("\n");
    }

    return 0;
}
```

```
Enter elements in matrix A of size 3x3:
1 2 3
4 5 6
7 8 9

Enter elements in matrix B of size 3x3:
9 8 7
6 5 4
3 2 1

Product of matrix A * B =
30 24 18
84 69 54
138 114 90

```
---
# 27. Check whether two matrices are equal or not.

| ***Input:***                                                                                                       | ***Output:***           |
| ------------------------------------------------------------------------------------------------------------------ | ----------------------- |
| Input elements of matrix1:<br>1 2 3<br>4 5 6<br>7 8 9<br><br>Input elements of matrix2:<br>1 2 3<br>4 5 6<br>7 8 9 | Both matrices are equal |

```c
/**
 * C program to check whether two matrices are equal or not
 */

#include <stdio.h>

#define SIZE 3 // Matrix size

int main()
{
    int A[SIZE][SIZE]; 
    int B[SIZE][SIZE];

    int row, col, isEqual;

    /* Input elements in first matrix from user */
    printf("Enter elements in matrix A of size %dx%d: \n", SIZE, SIZE);
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Input elements in second matrix from user */
    printf("\nEnter elements in matrix B of size %dx%d: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &B[row][col]);
        }
    }

    /* Assumes that the matrices are equal */
    isEqual = 1;

    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            /*
             * If the corresponding entries of matrices are not equal
             */
            if(A[row][col] != B[row][col])
            {
                isEqual = 0;
                break;
            }
        }
    }

    /*
     * Checks the value of isEqual
     * As per our assumption if isEqual contains 1 means both are equal
     * If it contains 0 means both are not equal
     */
    if(isEqual == 1)
    {
        printf("\nMatrix A is equal to Matrix B");
    }
    else
    {
        printf("\nMatrix A is not equal to Matrix B");
    }

    return 0;
}
```

```
Enter elements in matrix A of size 3x3:
1 2 3
4 5 6
7 8 9

Enter elements in matrix B of size 3x3:
1 2 3
4 -5 6
7 8 9

Matrix A is not equal to Matrix B

```
---
# 28. Find sum of main diagonal elements of a matrix.

| ***Input:***                                      | ***Output:***                      |
| ------------------------------------------------- | ---------------------------------- |
| Input array elements: <br>1 2 3<br>4 5 6<br>7 8 9 | Sum of main diagonal elements = 15 |

```c
/**
 * C program to find sum of main diagonal elements of a matrix
 */

#include <stdio.h>

#define SIZE 3 // Matrix size

int main()
{
    int A[SIZE][SIZE];
    int row, col, sum = 0;

    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size %dx%d: \n", SIZE, SIZE);
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Find sum of main diagonal elements */
    for(row=0; row<SIZE; row++)
    {
        sum = sum + A[row][row];
    }

    printf("\nSum of main diagonal elements = %d", sum);

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 2 3
4 5 6
7 8 9

Sum of main diagonal elements = 15

```
---
# 29. Find sum of minor diagonal elements of a matrix.

| ***Input:***                                        | ***Output:***                       |
| --------------------------------------------------- | ----------------------------------- |
| Input elements in array:<br>1 2 3<br>4 5 6<br>7 8 9 | Sum of minor diagonal elements = 15 |

```c
/**
 * C program to find sum of opposite diagonal elements of a matrix
 */

#include <stdio.h>

#define SIZE 3 // Matrix size

int main()
{
    int A[SIZE][SIZE];
    int row, col, sum = 0;

    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size %dx%d: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Find sum of minor diagonal elements */
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            /*
             * If it is minor diagonal of matrix
             * Minor diagonal: i+j == N + 1
             * Since array elements starts from 0 hence i+j == (N + 1)-2
             */
            if(row+col == ((SIZE+1)-2))
            {
                sum += A[row][col];
            }
        }
    }

    printf("\nSum of minor diagonal elements = %d", sum);

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 2 3
4 5 6
7 8 9

Sum of minor elements = 15

```
---
# 30. Find sum of each row and column of a matrix.

| ***Input:***                                         | ***Output:***                                                               |
| ---------------------------------------------------- | --------------------------------------------------------------------------- |
| Input elements in array: <br>1 2 3<br>4 5 6<br>7 8 9 | Sum of row 1 = 6<br>Sum of row 2 = 15<br>...<br>...<br>Sum of column 3 = 18 |

```c
/**
 * C program to find sum of elements of rows and columns of matrix
 */

#include <stdio.h>

#define SIZE 3 // Matrix size

int main()
{
    int A[SIZE][SIZE];
    int row, col, sum = 0;

    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size %dx%d: \n", SIZE, SIZE);
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Calculate sum of elements of each row of matrix */
    for(row=0; row<SIZE; row++)
    {
        sum = 0;
        for(col=0; col<SIZE; col++)
        {
            sum += A[row][col];
        }

        printf("Sum of elements of Row %d = %d\n", row+1, sum);
    }
    
    /* Find sum of elements of each columns of matrix */ 
    for(row=0; row<SIZE; row++)
    {
        sum = 0;
        for(col=0; col<SIZE; col++)
        {
            sum += A[col][row];
        }

        printf("Sum of elements of Column %d = %d\n", row+1, sum);
    }

    return 0;
}
```

```
Enter elements in matrix of size 3x3:  
 1 2 3  
 4 5 6  
 7 8 9  
 Sum of elements of Row 1 = 6  
 Sum of elements of Row 2 = 15  
 Sum of elements of Row 3 = 24  
 Sum of elements of Column 1 = 12  
 Sum of elements of Column 2 = 15  
 Sum of elements of Column 3 = 18
 
```
---
# 31. Interchange diagonals of a matrix.

| ***Input:***                                       | ***Output:***                                                           |
| -------------------------------------------------- | ----------------------------------------------------------------------- |
| Input matrix elements: <br>1 2 3<br>4 5 6<br>7 8 9 | <br>Matrix after interchanging its diagonal:<br>3 2 1<br>4 5 6<br>9 8 7 |

```c
/**
 * C program to interchange diagonals of a matrix
 */
 
#include <stdio.h>
#define MAX_ROWS 3
#define MAX_COLS 3

int main()
{
    int A[MAX_ROWS][MAX_COLS];
    int row, col, size, temp;
 
    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size %dx%d: \n", MAX_ROWS, MAX_COLS);
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    size = (MAX_ROWS < MAX_COLS) ? MAX_ROWS : MAX_COLS;
 
    /*
     * Interchange diagonal of the matrix
     */
    for(row=0; row<size; row++)
    {
        col = row;
 
        temp = A[row][col];
        A[row][col] = A[row][(size-col) - 1];
        A[row][(size-col) - 1] = temp;
    }
 
    /*
     * Print the interchanged diagonals matrix
     */
    printf("\nMatrix after diagonals interchanged: \n");
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            printf("%d ", A[row][col]);
        }
 
        printf("\n");
    }
 
    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 2 3
4 5 6
7 8 9

Matrix after diagonals interchanged:
3 2 1
4 5 6
9 8 7

```
---
# 32. Find upper triangular matrix.

| ***Input:***                                         | ***Output:***              |
| ---------------------------------------------------- | -------------------------- |
| Input elements of matrix:<br>1 2 3<br>0 5 6<br>0 0 9 | Matrix is upper triangular |

```c
/**
 * C program to find upper triangular matrix
 */

#include <stdio.h>
#define MAX_ROWS 3
#define MAX_COLS 3

int main()
{
    int array[MAX_ROWS][MAX_COLS];
    int row, col, isUpper;

    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size %dx%d: \n", MAX_ROWS, MAX_COLS);
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            scanf("%d", &array[row][col]);
        }
    }
    
    /* Check Upper triangular matrix condition */
    isUpper = 1;
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            /*
             * If elements below the main diagonal (col<row)
             * is not equal to zero then it is not upper triangular matrix
             */
            if(col<row && array[row][col]!=0)
            {
                isUpper = 0;
            }
        }
    }
    
    /* Print elements of upper triangular matrix  */
    if(isUpper == 1)
    {
        printf("\nThe matrix is Upper triangular matrix.\n");

        for(row=0; row<MAX_ROWS; row++)
        {
            for(col=0; col<MAX_COLS; col++)
            {
                printf("%d ", array[row][col]);
            }

            printf("\n");
        }
    }
    else
    {
        printf("\nThe matrix is not Upper triangular matrix.");
    }

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 2 3
0 5 6
0 0 9

The matrix is Upper triangular matrix.
1 2 3
0 5 6
0 0 9

```
---
# 33. Find lower triangular matrix.

| ***Input:***                                         | ***Output:***              |
| ---------------------------------------------------- | -------------------------- |
| Input elements in matrix:<br>1 0 0<br>4 5 0<br>7 8 9 | Matrix is lower triangular |

```c
/**
 * C program to find lower triangular matrix
 */

#include <stdio.h>
#define MAX_ROWS 3
#define MAX_COLS 3

int main()
{
    int array[MAX_ROWS][MAX_COLS];
    int row, col, isLower;

    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size %dx%d: \n", MAX_ROWS, MAX_COLS);
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            scanf("%d", &array[row][col]);
        }
    }

    /* Check whether the matrix is lower triangular matrix */
    isLower = 1;
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            /*
             * If elements above main diagonal(col>row)
             * is not equal to zero(array[row][col]!=0)
             */
            if(col>row && array[row][col]!=0)
            {
                isLower = 0;
            }
        }
    }

    /*
     * If matrix is lower triangular matrix
     */
    if(isLower == 1)
    {
        printf("\nMatrix is Lower triangular matrix: \n");

        /* Print elements of lower triangular matrix */
        for(row=0; row<MAX_ROWS; row++)
        {
            for(col=0; col<MAX_COLS; col++)
            {
                printf("%d ", array[row][col]);
            }

            printf("\n");
        }
    }
    else
    {
        printf("\nMatrix is not a Lower triangular matrix");
    }

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 0 0
4 5 0
7 8 9

Matrix is Lower triangular matrix:
1 0 0
4 5 0
7 8 9

```
---
# 34. Find sum of upper triangular matrix.

| ***Input:***                                       | ***Output:***                       |
| -------------------------------------------------- | ----------------------------------- |
| Input matrix elements: <br>1 2 3<br>0 5 6<br>0 0 9 | Sum of upper triangular matrix = 11 |

```c
/**
 * C program to find sum of upper triangular matrix
 */

#include <stdio.h>
#define MAX_ROWS 3
#define MAX_COLS 3

int main()
{
    int A[MAX_ROWS][MAX_ROWS];
    int row, col, sum = 0;
    
    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size %dx%d: \n", MAX_ROWS, MAX_COLS);
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }
    
    /* Find sum of upper triangular matrix */
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            if(col>row)
            {
                sum += A[row][col];
            }
        }
    }

    printf("Sum of upper triangular matrix = %d", sum);

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 2 3
0 5 6
0 0 9
Sum of upper triangular matrix = 11

```
---
# 35. Find sum of lower triangular matrix.

| ***Input:***                                         | ***Output:***                       |
| ---------------------------------------------------- | ----------------------------------- |
| Input elements in matrix:<br>1 0 0<br>4 5 0<br>7 8 9 | Sum of lower triangular matrix = 19 |

```c
/**
 * C program to find sum of lower triangular matrix
 */

#include <stdio.h>
#define MAX_ROWS 3
#define MAX_COLS 3

int main()
{
    int A[MAX_ROWS][MAX_COLS];
    int row, col, sum = 0;

    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size %dx%d: \n", MAX_ROWS, MAX_COLS);
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Find sum of lower triangular matrix */
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            if(col<row)
            {
                sum += A[row][col];
            }
        }
    }

    printf("Sum of lower triangular matrix = %d", sum);

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 0 0
4 5 0
7 8 9
Sum of lower triangular matrix = 19

```
---
# 36. Find transpose of a matrix.

| ***Input:***                                          | ***Output:***                          |
| ----------------------------------------------------- | -------------------------------------- |
| Input elements in matrix: <br>1 2 3<br>4 5 6<br>7 8 9 | Transpose: <br>1 4 7<br>2 5 8<br>3 6 9 |

```c
/**
 * C program to find transpose of a matrix
 */

#include <stdio.h>
#define MAX_ROWS 3
#define MAX_COLS 3

int main()
{
    int A[MAX_ROWS][MAX_COLS];  // Original matrix
    int B[MAX_COLS][MAX_ROWS];  // Transpose matrix

    int row, col;

    /* Input elements in matrix A from user */
    printf("Enter elements in matrix of size %dx%d: \n", MAX_ROWS, MAX_COLS);
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /*
     * Find transpose of matrix A
     */
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            /* Store each row of matrix A to each column of matrix B */
            B[col][row] = A[row][col];
        }
    }
    
    /* Print the original matrix A */ 
    printf("\nOriginal matrix: \n");
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            printf("%d ", A[row][col]);
        }

        printf("\n");
    }
    
    /* Print the transpose of matrix A */
    printf("Transpose of matrix A: \n");
    for(row=0; row<MAX_COLS; row++)
    {
        for(col=0; col<MAX_ROWS; col++)
        {
            printf("%d ", B[row][col]);
        }

        printf("\n");
    }

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 2 3
4 5 6
7 8 9

Original matrix:
1 2 3
4 5 6
7 8 9
Transpose of matrix A:
1 4 7
2 5 8
3 6 9

```
---
# 37. Find determinant of a matrix.

| ***Input:***                                 | ***Output:***                  |
| -------------------------------------------- | ------------------------------ |
| Input elements in 2x2 matrix: <br>1 2<br>3 4 | Determinant of the matrix = -2 |

```c
/**
 * C program to find determinant of 2x2 matrix
 */

#include <stdio.h>
#define SIZE 2 // Matrix size

int main()
{
    int A[SIZE][SIZE];
    int row, col;
    long det;

    /* Input elements in matrix A from user */
    printf("Enter elements in matrix of size 2x2: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /*
     * det(A) = ad - bc
     * a = A[0][0], b = A[0][1], c = A[1][0], d = A[1][1]
     */
    det = (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);

    printf("Determinant of matrix A = %ld", det);

    return 0;
}
```

```
Enter elements in matrix of size 2x2:
1 2
3 4
Determinant of matrix A = -2

```

OR,

```c
/**
 * C program to find determinant of 3x3 matrix
 */

#include <stdio.h>
#define SIZE 3 // Matrix size

int main()
{
    int A[SIZE][SIZE];
    int row, col;
    int a, b, c, d, e, f, g, h, i;
    long det;

    /* Input elements in matrix A from user */
    printf("Enter elements in matrix of size 3x3: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /*
     * Used as a temporary variables to make calculation easy
     * |         |
     * | a  b  c |
     * | d  e  f |
     * | g  h  i |
     * |         |
     */
    a = A[0][0];
    b = A[0][1];
    c = A[0][2];
    d = A[1][0];
    e = A[1][1];
    f = A[1][2];
    g = A[2][0];
    h = A[2][1];
    i = A[2][2];

    /*
     * det(A) = a(ei - fh) - b(di - fg) + c(dh - eg)
     */
    det = (a*(e*i - f*h)) - (b*(d*i - f*g)) + (c*(d*h - e*g));

    printf("Determinant of matrix A = %ld", det);

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
6 1 1
4 -2 5
2 8 7
Determinant of matrix A = -306

```
---
# 38. Check Identity matrix.

| ***Input:***                                          | ***Output:***            |
| ----------------------------------------------------- | ------------------------ |
| Input elements in matrix: <br>1 0 0<br>0 1 0<br>0 0 1 | It is an Identity matrix |

```c
/**
 * C program to check whether a matrix is Identity matrix or not
 */

#include <stdio.h>
#define SIZE 3 // Matrix size

int main()
{
    int A[SIZE][SIZE];
    int row, col, isIdentity;

    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size 3x3: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Check whether it is Identity matrix or not */
    isIdentity = 1;
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {

            if(row==col && A[row][col]!=1)
            {
                /* If elements of main diagonal is not equal to 1 */
                isIdentity = 0;
            }
            else if(row!=col && A[row][col]!=0)
            {
                /* If other elements than main diagonal is not equal to 0 */
                isIdentity = 0;
            }
        }
    }

    /* If it is an Identity matrix */
    if(isIdentity == 1)
    {
        printf("\nThe given matrix is an Identity Matrix.\n");

        /*
         * Print the Identity matrix
         */
        for(row=0; row<SIZE; row++)
        {
            for(col=0; col<SIZE; col++)
            {
                printf("%d ", A[row][col]);
            }

            printf("\n");
        }
    }
    else
    {
        printf("The given matrix is not Identity Matrix");
    }

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 0 0
0 1 0
0 0 1

The given matrix is an Identity Matrix.
1 0 0
0 1 0
0 0 1

```
---
# 39. Check Sparse matrix.

| ***Input:***                                          | ***Output:***                     |
| ----------------------------------------------------- | --------------------------------- |
| Input elements in matrix: <br>1 0 3<br>0 0 4<br>6 0 0 | The given matrix is Sparse matrix |

```c
/**
 * C program to check sparse matrix
 */

#include <stdio.h>
#define SIZE 3

int main()
{
    int A[SIZE][SIZE];
    int row, col, total=0;

    /* Input elements in matrix from user */
    printf("Enter elements in matrix of size 3x3: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /* Count total number of zero elements in the matrix */
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            /* If the current element is zero */
            if(A[row][col] == 0)
            {
                total++;
            }
        }
    }

    if(total >= (row * col)/2)
    {
        printf("\nThe given matrix is a Sparse matrix.");
    }
    else
    {
        printf("\nThe given matrix is not Sparse matrix.");
    }

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 0 0
4 5 0
0 0 0

The given matrix is a Sparse matrix.

```
---
# 40. Check Symmetric matrix.

| ***Input:***                                       | ***Output:***                     |
| -------------------------------------------------- | --------------------------------- |
| Input matrix elements: <br>1 2 3<br>2 4 5<br>3 5 8 | Given matrix is symmetric matrix. |

```c
/**
 * C program to check whether a matrix is symmetric matrix or not
 */

#include <stdio.h>
#define SIZE 3

int main()
{
    int A[SIZE][SIZE];  // Original matrix
    int B[SIZE][SIZE];  // Transpose matrix

    int row, col, isSymmetric;

    /* Input elements in matrix A from user */
    printf("Enter elements in matrix of size 3x3: \n");
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    /*
     * Find transpose of matrix A
     */
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            /* Store each row of matrix A to each column of matrix B */
            B[row][col] = A[col][row];
        }
    }


    /*
     * Check whether matrix A is equal to its transpose or not
     */
    isSymmetric = 1;
    for(row=0; row<SIZE && isSymmetric; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            /* If matrix A is not equal to its transpose */
            if(A[row][col] != B[row][col])
            {
                isSymmetric = 0;
                break;
            }
        }
    }

    /*
     * If the given matrix is symmetric.
     */
    if(isSymmetric == 1)
    {
        printf("\nThe given matrix is Symmetric matrix: \n");

        for(row=0; row<SIZE; row++)
        {
            for(col=0; col<SIZE; col++)
            {
                printf("%d ", A[row][col]);
            }

            printf("\n");
        }
    }
    else
    {
        printf("\nThe given matrix is not Symmetric matrix.");
    }

    return 0;
}
```

```
Enter elements in matrix of size 3x3:
1 2 3
2 4 5
3 5 8

The given matrix is Symmetric matrix:
1 2 3
2 4 5
3 5 8

```
---
# 🟢 ARRAYS :  3D

---












---
# 🟢 STRING

---
# 1. Find length of a string.

| ***Input:***                                         | ***Output:***        |
| ---------------------------------------------------- | -------------------- |
| Input string: I love programming. I love Codeforwin. | Length of string: 38 |

```c
/**
 * C program to find length of a string using for loop
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text[MAX_SIZE]; /* Declares a string of size 100 */
    int i;
    int count= 0;

    /* Input a string from user */
    printf("Enter any string: ");
    gets(text);

    /* Iterate till the last character of string */
    for(i=0; text[i]!='\0'; i++)
    {
        count++;
    }

    printf("Length of '%s' = %d", text, count);

    return 0;
}
```

OR,

```c
/**
 * C program to find length of a string using while loop
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text[MAX_SIZE]; /* Declares a string of size 100 */
    int index= 0;

    /* Input string from user */
    printf("Enter any string: ");
    gets(text);

    /* Iterate though last element of the string */
    while(text[index] != '\0')
    {
        index++;
    }

    printf("Length of '%s' = %d", text, index);

    return 0;
}
```

OR,

```c
/**
 * C program to find length of a string using pointer
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text[MAX_SIZE]; /* Declares a string of size 100 */
    char * str = text; /* Declare pointer that points to text */
    int count = 0;

    /* Input string from user */
    printf("Enter any string: ");
    gets(text);

    /* Iterate though last element of the string */
    while(*(str++) != '\0') count++;

    printf("Length of '%s' = %d", text, count);

    return 0;
}
```

OR,

```c
/**
 * C program to find length of a string using pointer
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text[MAX_SIZE]; /* Declares a string of size 100 */
    char * str = text; /* Declare pointer that points to text */
    int count = 0;

    /* Input string from user */
    printf("Enter any string: ");
    gets(text);

    /* Iterate though last element of the string */
    while(*(str++)) count++;

    printf("Length of '%s' = %d", text, count);

    return 0;
}
```

OR,

```c
/**
 * C program to find length of a string using strlen() function
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum size of string

int main()
{
    char text[MAX_SIZE]; /* Declares a string of size 100 */
    int length;

    printf("Enter any string: ");
    gets(text);

    /* Call strlen() function to count length of string */
    length = strlen(text);

    printf("Length of '%s' = %d", text, length);

    return 0;
}
```

```
Enter any string: I love programming. I love Codeforwin.
Length of 'I love programming. I love Codeforwin.' = 38

```
---
# 2. Copy one string to another string.

| ***Input:***                     | ***Output:***                                                            |
| -------------------------------- | ------------------------------------------------------------------------ |
| Input string: I love Codeforwin! | Original string: I love Codeforwin!<br>Copied string: I love Codeforwin! |

```c
/**
 * C program to copy one string to another string without using strcpy()
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text1[MAX_SIZE];
    char text2[MAX_SIZE];
    int i;
    
    /* Input string from user */
    printf("Enter any string: ");
    gets(text1);
    
    /* Copy text1 to text2 character by character */
    for(i=0; text1[i]!='\0'; i++)
    {
        text2[i] = text1[i];
    }

    //Makes sure that the string is NULL terminated
    text2[i] = '\0';

    printf("First string = %s\n", text1);
    printf("Second string = %s\n", text2);
    printf("Total characters copied = %d\n", i);

    return 0;
}
```

OR,

```c
-/**
 * C program to copy one string to another string using while loop
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text1[MAX_SIZE];
    char text2[MAX_SIZE];
    int i;
    
    /* Input string from user */
    printf("Enter any string: ");
    gets(text1);
    
    /* Copy text1 to text2 character by character */
    i=0;
    while(text1[i] != '\0')
    {
        text2[i] = text1[i];
        i++;
    }

    //Makes sure that the string is NULL terminated
    text2[i] = '\0';

    printf("First string = %s\n", text1);
    printf("Second string = %s\n", text2);
    printf("Total characters copied = %d\n", i);

    return 0;
}
```

OR,

```c
/**
 * C program to copy one string to another string using pointer
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text1[MAX_SIZE], text2[MAX_SIZE];
    char * str1 = text1;
    char * str2 = text2; 
    
    /* Input string from user */
    printf("Enter any string: ");
    gets(text1);
    
    /* Copy text1 to text2 character by character */
    while(*(str2++) = *(str1++));

    printf("First string = %s\n", text1);
    printf("Second string = %s\n", text2);

    return 0;
}
```

OR,

```c
/**
 * C program to copy one string to another string using strcpy()
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum size of string

int main()
{
    char text1[MAX_SIZE], text2[MAX_SIZE];

    /* Input original string from user */
    printf("Enter any string: ");
    gets(text1);

    /* Copy text1 to text2 using strcpy() */
    strcpy(text2, text1);

    printf("First string = %s\n", text1);
    printf("Second string = %s\n", text2);

    return 0;
}
```

```
Enter any string: I love Codeforwin!
First string = I love Codeforwin!
Second string = I love Codeforwin!
Total characters copied = 10

```
---
# 3. Concatenate two strings.

| ***Input:***                                       | ***Output:***                          |
| -------------------------------------------------- | -------------------------------------- |
| Input string1: I love<br>Input string2: Codeforwin | Concatenated string: I love Codeforwin |

```c
/**
 * C program to concatenate two strings 
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    int i, j;


    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);


    /* Move till the end of str1 */
    i=0;
    while(str1[i] != '\0')
    {
        i++;
    }

    /* Copy str2 to str1 */
    j = 0;
    while(str2[j] != '\0')
    {
        str1[i] = str2[j];
        i++;
        j++;
    }

    // Make sure that str1 is NULL terminated
    str1[i] = '\0';

    printf("Concatenated string = %s", str1);

    return 0;
}
```

OR,

```c
/**
 * C program to concatenate two strings 
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    int i, j;

    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);

    /* Move till the end of str1 */
    i=-1;
    while(str1[++i]);

    /* Copy str2 to str1 */
    j = 0;
    while(str1[i++] = str2[j++]);

    printf("Concatenated string = %s", str1);

    return 0;
}
```

OR,

```c
/**
 * C program to concatenate two strings using pointer
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    char * s1 = str1;
    char * s2 = str2;

    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);

    /* Move till the end of str1 */
    while(*(++s1));

    /* Copy str2 to str1 */
    while(*(s1++) = *(s2++));

    printf("Concatenated string = %s", str1);

    return 0;
}
```

OR,

```c
/**
 * C program to concatenate two strings using strcat()
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];

    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);

    /* Concatenate str1 with str2 */
    strcat(str1, str2);

    printf("Concatenated string = %s", str1);

    return 0;
}
```

```
Enter first string: I love 
Enter second string: Codeforwin
Concatenated string = I love Codeforwin

```
---
# 4. Compare two strings.

| ***Input:***                                                               | ***Output:***                           |
| -------------------------------------------------------------------------- | --------------------------------------- |
| Input string1: Learn at Codeforwin.<br>Input string2: Learn at Codeforwin. | Both strings are lexographically equal. |

```c
/**
 * C program to compare two string without using string library functions
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Compare function declaration */
int compare(char * str1, char * str2);


int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    int res;

    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);


    /* Call the compare function to compare strings */
    res = compare(str1, str2);

    if(res == 0)
    {
        printf("Both strings are equal.");
    }
    else if(res < 0)
    {
        printf("First string is lexicographically smaller than second.");
    }
    else
    {
        printf("First string is lexicographically greater than second.");
    }

    return 0;
}


/**
 * Compares two strings lexicographically. 
 * Returns 0 if both strings are equal, 
 *         negative if first string is smaller
 *         otherwise returns a positive value
 */
int compare(char * str1, char * str2)
{
    int i = 0;

    /* Iterate till both strings are equal */
    while(str1[i] == str2[i])
    {
        if(str1[i] == '\0' && str2[i] == '\0')
            break;

        i++;
    }

    // Return the difference of current characters.
    return str1[i] - str2[i];
}
```

OR,

```c
/**
 * C program to compare two string without using string library functions
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Compare function declaration */
int compare(char * str1, char * str2);


int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    int res;

    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);


    /* Call the compare function to compare strings */
    res = compare(str1, str2);

    if(res == 0)
    {
        printf("Both strings are equal.");
    }
    else if(res < 0)
    {
        printf("First string is lexicographically smaller than second.");
    }
    else
    {
        printf("First string is lexicographically greater than second.");
    }

    return 0;
}


/**
 * Compares two strings lexicographically. 
 */
int compare(char * str1, char * str2)
{
    while((*str1 && *str2) && (*str1 == *str2)) { str1++; str2++; }

    return *str1 - *str2;
}
```

OR,

```c
/**
 * C program to compare two string using strcmp() function
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    int res;

    /* Reads two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);


    /* Call strcmp() to compare both strings and stores result in res */
    res = strcmp(str1, str2);

    if(res == 0)
    {
        printf("Both strings are equal.");
    }
    else if(res == -1)
    {
        printf("First string is lexicographically smaller than second.");
    }
    else
    {
        printf("First string is lexicographically greater than second.");
    }

    return 0;
}
```

```
Enter first string: Learn at CODEFORWIN.
Enter second string: Learn at Codeforwin.
First string is lexicographically smaller than second.

```
---
# 5. Convert lowercase string to uppercase.

| ***Input:***                     | ***Output:***      |
| -------------------------------- | ------------------ |
| Input string: I love Codeforwin. | I LOVE CODEFORWIN. |

```c
/** 
 * C program to convert string to uppercase
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size


int main()
{
    char str[MAX_SIZE];
    int i;

    /* Input string from user */
    printf("Enter your text : ");
    gets(str);

    for(i=0; str[i]!='\0'; i++)
    {
        /*
         * If current character is lowercase alphabet then
         * convert it to uppercase.
         */
        if(str[i]>='a' && str[i]<='z')
        {
            str[i] = str[i] - 32;
        }
    }

    printf("Uppercase string : %s",str);
    return 0;
}
```

OR,

```c
/** 
 * C program to convert string to uppercase using pointers
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size


int main()
{
    char str[MAX_SIZE];
    char * s = str;

    /* Input string from user */
    printf("Enter your text : ");
    gets(str);

    while(*s) 
    {
        *s = (*s > 'a' && *s <= 'z') ? *s-32 : *s;
        s++;
    }

    printf("Uppercase string : %s",str);
    return 0;
}
```

OR,

```c
/** 
 * C program to convert lowercase to uppercase string using strupr()
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size 


int main()
{
    char str[MAX_SIZE];

    /* Input string from user */
    printf("Enter your text : ");
    gets(str);

    strupr(str); // Convert to uppercase

    printf("Uppercase string : %s", str);

    return 0;
}
```

```
Enter your text: I love Codeforwin.
Uppercase string : I LOVE CODEFORWIN.

```
---
# 6. Convert uppercase string to lowercase.

| ***Input:***                     | ***Output:***                        |
| -------------------------------- | ------------------------------------ |
| Input string: I love CODEFORWIN. | Lowercase string: i love codeforwin. |

```c
/**
 * C program to convert string to lowercase
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    int i;
 
    /* Input string from user */
    printf("Enter any string: ");
    gets(str);


    // Iterate loop till last character of string
    for(i=0; str[i]!='\0'; i++)
    {
        if(str[i]>='A' && str[i]<='Z')
        {
            str[i] = str[i] + 32;
        }
    }

    printf("Lower case string: %s", str);

    return 0;
}
```

OR,

```c
/**
 * C program to convert string to lowercase using strlwr() string function
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    strlwr(str); // Convert to lowercase

    printf("Lowercase string: %s", str);

    return 0;
}
```

```
Enter any string: I love CODEFORWIN.
Lowercase string : i love codeforwin.

```
---
# 7. Toggle case of each character of a string.

| ***Input:***                       | ***Output:***                             |
| ---------------------------------- | ----------------------------------------- |
| Input string: Learn at Codeforwin. | Toggled case string: lEARN AT cODEFORWIN. |

```c
/**
 * C program to toggle case of each character in a string
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Toggle case function declaration */
void toggleCase(char * str);


int main()
{
    char str[MAX_SIZE];

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    printf("String before toggling case: %s", str);

    toggleCase(str);

    printf("String after toggling case: %s", str);

    return 0;
}


/**
 * Toggle case of each character in given string
 */
void toggleCase(char * str)
{
    int i = 0;

    while(str[i] != '\0')
    {
        if(str[i]>='a' && str[i]<='z')
        {
            str[i] = str[i] - 32;
        }
        else if(str[i]>='A' && str[i]<='Z')
        {
            str[i] = str[i] + 32;
        }

        i++;
    }
}
```

OR,

```c
void toggleCase(char * str)
{
    while(*str)
    {
        if(*str >= 'a' && *str <= 'z')
            *str = *str - 32;
        else if(*str >= 'A' && *str <= 'Z')
            *str = *str + 32;

        str++;
    }
}
```

```
Enter any string: Learn at Codeforwin.
String before toggling case: Learn at Codeforwin.
String after toggling case: lEARN AT cODEFORWIN.

```
---
# 8. Find total number of alphabets, digits or special character in a string.

| ***Input:***                     | ***Output:***                                          |
| -------------------------------- | ------------------------------------------------------ |
| Input string: I love Codeforwin. | Alphabets = 15<br>Digits = 0<br>Special characters = 3 |

```c
/**
 * C program to count total number of alphabets, digits 
 * and special characters in a string
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size


int main()
{
    char str[MAX_SIZE];
    int alphabets, digits, others, i;

    alphabets = digits = others = i = 0;


    /* Input string from user */
    printf("Enter any string : ");
    gets(str);

    /*
     * Check each character of string for alphabet, digit or special character
     */
    while(str[i]!='\0')
    {
        if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
        {
            alphabets++;
        }
        else if(str[i]>='0' && str[i]<='9')
        {
            digits++;
        }
        else
        {
            others++;
        }

        i++;
    }

    printf("Alphabets = %d\n", alphabets);
    printf("Digits = %d\n", digits);
    printf("Special characters = %d", others);

    return 0;
}
```

OR,

```c
/**
 * C program to count total number of alphabets, digits 
 * and special characters in a string using pointers
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size


int main()
{
    char str[MAX_SIZE];
    char * s = str;
    int alphabets, digits, others;

    alphabets = digits = others = 0;


    /* Input string from user */
    printf("Enter any string : ");
    gets(str);

    while(*s)
    {
        if((*s >= 'a' && *s <= 'z') || (*s >= 'A' && *s <= 'Z'))
            alphabets++;
        else if(*s>='0' && *s<='9')
            digits++;
        else
            others++;

        s++;
    }

    printf("Alphabets = %d\n", alphabets);
    printf("Digits = %d\n", digits);
    printf("Special characters = %d", others);

    return 0;
}
```

```
Enter any string : Today is 12 November.
Alphabets = 15
Digits = 2
Special characters = 4

```
---
# 9. Count total number of vowels and consonants in a string.

| ***Input:***                     | ***Output:***                            |
| -------------------------------- | ---------------------------------------- |
| Input string: I love Codeforwin. | Total Vowels = 7<br>Total Consonants = 8 |

```c
/**
 * C program to count total number of vowel or consonant in a string
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    int i, len, vowel, consonant;

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    vowel = 0;
    consonant = 0;
    len = strlen(str);

    for(i=0; i<len; i++)
    {
        if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
        {
            /*
             * If the current character(str[i]) is a vowel
             */
            if(str[i] =='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || 
               str[i] =='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U'  )
                vowel++;
            else
                consonant++;
        }
    }

    printf("Total number of vowel = %d\n", vowel);
    printf("Total number of consonant = %d\n", consonant);

    return 0;
}
```

OR,

```c
/**
 * C program to count total number of vowel or consonant in a string using switch case
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE]; 
    int i, len, vowel, consonant;

    /* Input strings from user */
    printf("Enter any string: ");
    gets(str);


    vowel = 0;
    consonant = 0;
    len = strlen(str);

    for(i=0; i<len; i++)
    {
        if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
        {
            switch(str[i])
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowel++;
                    break;
                default:
                    consonant++;
            }
        }
    }

    printf("Total number of vowel = %d\n", vowel);
    printf("Total number of consonant = %d\n", consonant);

    return 0;
}
```

OR,

```c
/**
 * C program to count total number of vowel or consonant in a string using pointers
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE]; 
    char * s = str;
    int vowel, consonant;

    /* Input strings from user */
    printf("Enter any string: ");
    gets(str);

    vowel = 0;
    consonant = 0;

    while(*s)
    {
        if((*s >= 'a' && *s <= 'z') || (*s >= 'A' && *s <='Z'))
        {
            switch(*s)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowel++;
                    break;
                default:
                    consonant++;
            }
        }
        s++;
    }

    printf("Total number of vowel = %d\n", vowel);
    printf("Total number of consonant = %d\n", consonant);

    return 0;
}
```

```
Enter any string: I love Codeforwin!
Total number of vowel = 7
Total number of consonant = 8

```
---
# 10. Count total number of words in a string.

| ***Input:***                     | ***Output:***            |
| -------------------------------- | ------------------------ |
| Input string: I love Codeforwin. | Total number of words: 4 |

```c
/**
 * C program to count total number of words in a string
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    int i, words;

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    i = 0;
    words = 1;

    /* Runs a loop till end of string */
    while(str[i] != '\0')
    {
        /* If the current character(str[i]) is white space */
        if(str[i]==' ' || str[i]=='\n' || str[i]=='\t')
        {
            words++;
        }

        i++;
    }

    printf("Total number of words = %d", words);

    return 0;
}
```

OR,

```c
/**
 * C program to count total number of words in a string
 */

#include <stdio.h>

#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    char prevChar;
    int i, words;

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    i = 0;
    words = 0;
    prevChar = '\0'; // The previous character of str[0] is null

    /* Runs loop infinite times */
    while(1)
    {
        if(str[i]==' ' || str[i]=='\n' || str[i]=='\t' || str[i]=='\0')
        {
            /**
             * It is a word if current character is whitespace and
             * previous character is non-white space.
             */
            if(prevChar != ' ' && prevChar != '\n' && prevChar != '\t' && prevChar != '\0')
            {
                words++;
            }
        }

        /* Make the current character as previous character */
        prevChar = str[i];

        if(str[i] == '\0')
             break;
        else
             i++;
    }

    printf("Total number of words = %d", words);

    return 0;
}
```

```
Enter any string: I love C    programming and Codeforwin!
Total number of words = 6

```
---
# 11. Find reverse of a string.

| ***Input:***            | ***Output:***         |
| ----------------------- | --------------------- |
| Enter any string: Hello | Reverse string: olleH |

```c
/**
 * C program to find reverse of a string
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE], reverse[MAX_SIZE];
    int i, strIndex, revIndex, len;

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    /* Find length of string */
    i = 0;
    while(str[i] != '\0') i++;

    len = i;

    /* 
     * Store each character from end of original string 
     * to reverse string
     */
    revIndex = 0;
    strIndex = len - 1;
    while(strIndex >= 0)
    {
        reverse[revIndex] = str[strIndex];

        strIndex--;
        revIndex++;
    }
    reverse[revIndex] = '\0';

    printf("\nOriginal string = %s\n", str);
    printf("Reverse string = %s", reverse);

    return 0;
}
```

OR,

```c
/**
 * C program to find reverse of a string using pointers
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE], reverse[MAX_SIZE];
    char *s = str;
    char *r = reverse;
    int len = 0;

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    /* Find length of string */
    while(*(s++)) len++;

    /* 
     * Store each character from end of original string 
     * to reverse string
     */
    s--;
    while(len >= 0)
    {
        *(r++) = *(--s);
        len--;
    }
    *r = '\0';

    printf("\nOriginal string = %s\n", str);
    printf("Reverse string = %s", reverse);

    return 0;
}
```

OR,

```c
/**
 * C program to find reverse of a string using strrev() function
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    printf("Original string = %s\n", str);

    /* Find the reverse of string */
    strrev(str);

    printf("Reverse string = %s", str);

    return 0;
}
```

```
Enter any string: Codeforwin

Original string = Codeforwin
Reverse string = niwrofedoC

```
---
# 12. Check whether a string is palindrome or not.

| ***Input:***        | ***Output:***     |
| ------------------- | ----------------- |
| Input string: madam | Palindrome string |

```c
/**
 * C program to check whether a string is palindrome or not
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    int len, startIndex, endIndex;

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);


    /* Find length of the string */
    len = 0;
    while(str[len] != '\0') len++;

    startIndex = 0;
    endIndex   = len-1;
    

    while(startIndex <= endIndex)
    {
        if(str[startIndex] != str[endIndex])
            break;

        startIndex++;
        endIndex--;
    }

    if(startIndex >= endIndex)
    {
        printf("String is Palindrome.");
    }
    else
    {
        printf("String is Not Palindrome.");
    }

    return 0;
}
```

OR,

```c
/**
 * C program to check whether a string is palindrome or not using string functions
 */

#include <stdio.h>
#include <string.h>

#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE], reverse[MAX_SIZE];
    int flag;

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);


    strcpy(reverse, str); //Copies original string to reverse
    strrev(reverse);      //Finds the reverse of string

    flag = strcmp(str, reverse); //Checks whether both are equal or not

    /* If both strings are equal */
    if(flag == 0)
    {
        printf("String is Palindrome.");
    }
    else
    {
        printf("String is Not Palindrome.");
    }

    return 0;
}
```

```
Enter any string: madam
String is Palindrome.

```
---
# 13. Reverse order of words in a given string.

| ***Input:***                                             | ***Output:***                                                          |
| -------------------------------------------------------- | ---------------------------------------------------------------------- |
| Input string : I love learning programming at Codeforwin | Reversed order of words: <br>Codeforwin at programming learning love I |

```c
/**
 * C program to reverse order of words in a string
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[100], reverse[100];
    int len, i, index, wordStart, wordEnd;

    printf("Enter any string: ");
    gets(str);

    len   = strlen(str);
    index = 0;

    // Start checking of words from the end of string
    wordStart = len - 1;
    wordEnd   = len - 1;

    while(wordStart > 0)
    {
        // If a word is found
        if(str[wordStart] == ' ')
        {
            // Add the word to the reverse string
            i = wordStart + 1;
            while(i <= wordEnd)
            {
                reverse[index] = str[i];

                i++;
                index++;
            }
            reverse[index++] = ' ';

            wordEnd = wordStart - 1;
        }

        wordStart--;
    }

    // Finally add the last word
    for(i=0; i<=wordEnd; i++)
    {
        reverse[index] = str[i];
        index++;
    }

    // Add NULL character at the end of reverse string
    reverse[index] = '\0'; 

    printf("Original string \n%s\n\n", str);
    printf("Reverse ordered words \n%s", reverse);

    return 0;
}
```

```
Enter any string: I love learning programming at Codeforwin
Original string
I love learning programming at Codeforwin

Reverse ordered words
Codeforwin at programming learning love I

```
---
# 14. Find first occurrence of a character in a given string.

| ***Input:***                                                     | ***Output:***           |
| ---------------------------------------------------------------- | ----------------------- |
| Input string: I love Codeforwin.<br>Input character to search: o | 'o' is found at index 3 |

```c
/**
 * C program to find the first occurrence of a character in a string
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
int indexOf(const char * str, const char toFind);


int main()
{
    char str[MAX_SIZE];
    char toFind;
    int index;

    /* Input string from user and character to be searched */
    printf("Enter any string: ");
    gets(str);
    printf("Enter character to be searched: ");
    toFind = getchar();

    index = indexOf(str, toFind);

    if(index == -1)
        printf("'%c' not found.", toFind);
    else
        printf("'%c' is found at index %d.", toFind, index);

    return 0;
}


/**
 * Returns the first index of the given character toFind in the string. 
 * If returns -1 if the given character toFind does not exists in the string.
 */
int indexOf(const char * str, const char toFind)
{
    int i = 0;

    while(str[i] != '\0')
    {
        if(str[i] == toFind)
            return i;
        i++;
    }

    // Return -1 as character not found
    return -1;
}
```

OR,

```c
int indexOf(const char * str, const char toFind)
{
    int i = 0;

    while(*str)
    {
        if(*str == toFind)
            return i;
        i++;
        str++;
    }

    // Return -1 as character not found
    return -1;
}
```

```
Enter any string: I love Codeforwin.
Enter character to be searched: o
'o' is found at index 3.

```
---
# 15. Find last occurrence of a character in a given string.

| ***Input:***                                                     | ***Output:***            |
| ---------------------------------------------------------------- | ------------------------ |
| Input string: I love Codeforwin.<br>Input character to search: o | Last index of 'o' is 12. |

```c
/**
 * C program to find last occurrence of a character in string
 */
#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/*  Function declaration */
int lastIndexOf(const char * str, const char toFind);


int main()
{
    char str[MAX_SIZE];
    char toFind;
    int index;

    printf("Enter any string: ");
    gets(str);

    printf("Enter any character to find: ");
    toFind = getchar();

    index = lastIndexOf(str, toFind);

    printf("\nLast index of '%c' is %d", toFind, index);

    return 0;
}


/**
 * Function to find last index of any character in the given string
 */
int lastIndexOf(const char * str, const char toFind)
{
    int index = -1;
    int i = 0;

    while(str[i] != '\0')
    {
        // Update index if match is found
        if(str[i] == toFind)
        {
            index = i;
        }
        i++;
    }

    return index;
}
```

```
Enter any string: I love Codeforwin.
Enter any character to find: o

Last index of o is 12

```
---
# 16. Search all occurrences of a character in given string.

| ***Input:***                                                                         | ***Output:***                        |
| ------------------------------------------------------------------------------------ | ------------------------------------ |
| Input string: I love programming. I love Codeforwin.<br>Input character to search: o | 'o' found at index: 3, 9, 23, 28, 32 |

```c
/**
 * C program to search all occurrences of a character in a string
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size 

int main()
{
    char str[MAX_SIZE];
    char toSearch;
    int i;

    /* Input string and character to search from user */
    printf("Enter any string: ");
    gets(str);
    printf("Enter any character to search: ");
    toSearch = getchar();

    /* Run loop till the last character of string */
    i=0;
    while(str[i]!='\0')
    {
        /* If character is found in string */
        if(str[i] == toSearch)
        {
            printf("'%c' is found at index %d\n", toSearch, i);
        }

        i++;
    }

    return 0;
}
```

```
Enter any string: I love programming. I love Codeforwin.
Enter any character to search: o
'o' is found at index 3
'o' is found at index 9
'o' is found at index 23
'o' is found at index 28
'o' is found at index 32

```
---
# 17. Count occurrences of a character in given string.

| ***Input:***                                                                         | ***Output:***               |
| ------------------------------------------------------------------------------------ | --------------------------- |
| Input string: I love programming. I love Codeforwin.<br>Input character to search: o | Total occurrences of 'o': 5 |

```c
/**
 * C program to count all occurrences of a character in a given string
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    char toSearch;
    int i, count;

    /* Input string and search character from user */
    printf("Enter any string: ");
    gets(str);
    printf("Enter any character to search: ");
    toSearch = getchar();

    count = 0;
    i=0;
    while(str[i] != '\0')
    {
        /*
         * If character is found in string then
         * increment count variable
         */
        if(str[i] == toSearch)
        {
            count++;
        }

        i++;
    }

    printf("Total occurrence of '%c' = %d", toSearch, count);

    return 0;
}
```

```
Enter any string: I love programming. I love Codeforwin.
Enter any character to search: o
Total occurrence of 'o' = 5

```
---
# 18. Find highest frequency character in a string.

| ***Input:***                     | ***Output:***                    |
| -------------------------------- | -------------------------------- |
| Input string: I love Codeforwin. | Maximum occurring character: 'o' |

```c
/**
 * C program to find maximum occurring character in a string
 */

#include <stdio.h>
#define MAX_SIZE 100  // Maximum string size
#define MAX_CHARS 255 // Maximum characters allowed


int main()
{
    char str[MAX_SIZE];
    int freq[MAX_CHARS]; // Store frequency of each character
    int i = 0, max;
    int ascii;

    printf("Enter any string: ");
    gets(str);

    /* Initializes frequency of all characters to 0 */
    for(i=0; i<MAX_CHARS; i++)
    {
        freq[i] = 0;
    }


    /* Finds frequency of each characters */
    i=0;
    while(str[i] != '\0')
    {
        ascii = (int)str[i];
        freq[ascii] += 1;

        i++;
    }


    /* Finds maximum frequency */
    max = 0;
    for(i=0; i<MAX_CHARS; i++)
    {
        if(freq[i] > freq[max])
            max = i;
    }


    printf("Maximum occurring character is '%c' = %d times.", max, freq[max]);

    return 0;
}
```

```
Enter any string: I love Codeforwin.
Maximum occurring character is 'o' = 3 times.

```
---
# 19. Find lowest frequency character in a string.

| ***Input:***                                             | ***Output:***                          |
| -------------------------------------------------------- | -------------------------------------- |
| Input string: I love learning programming at Codeforwin. | Minimum occurring character is '.' = 1 |

```c
/**
 * C program to find minimum occurring character in a string
 */

#include <stdio.h>
#define MAX_SIZE 100  // Maximum string size
#define MAX_CHARS 255 // Maximum characters allowed


int main()
{
    char str[MAX_SIZE];
    int freq[MAX_CHARS]; //Stores frequency of each character
    int i = 0, min;
    int ascii;

    printf("Enter any string: ");
    gets(str);

    /* Initialize frequency of all characters to 0 */
    for(i=0; i<MAX_CHARS; i++)
    {
        freq[i] = 0;
    }


    /* Finds frequency of each characters */
    i=0;
    while(str[i] != '\0')
    {
        ascii = (int)str[i];
        freq[ascii] += 1;

        i++;
    }


    /* Finds minimum frequency */
    min = 0;
    for(i=0; i<MAX_CHARS; i++)
    {
        if(freq[i] != 0)
        {
            if(freq[min] == 0 || freq[i] < freq[min])
                min = i;
        }
    }


    printf("Minimum occurring character is '%c' = %d.", min, freq[min]);

    return 0;
}
```

```
Enter any string: I love learning programming at Codeforwin.
Minimum occurring character is '.' = 1.

```
---
# 20. Count frequency of each character in a string.

| ***Input:***             | ***Output:***                                                                                                                                       |
| ------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| Input string: Codeforwin | Frequency of all characters in the given string:<br>'c' = 1<br>'d' = 1<br>'e' = 1<br>'f' = 1<br>'i' = 1<br>'n' = 1<br>'o' = 2<br>'r' = 1<br>'w' = 1 |

```c
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    int i, len;
    int freq[26];

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    len = strlen(str);

    /* Initialize frequency of each character to 0 */
    for(i=0; i<26; i++)
    {
        freq[i] = 0;
    }


    /* Find total number of occurrences of each character */
    for(i=0; i<len; i++)
    {
        /* If the current character is lowercase alphabet */
        if(str[i]>='a' && str[i]<='z')
        {
            freq[str[i] - 97]++;
        }
        else if(str[i]>='A' && str[i]<='Z')
        {
            freq[str[i] - 65]++;
        }
    }

    /* Print the frequency of all characters in the string */
    printf("\nFrequency of all characters in the given string: \n");
    for(i=0; i<26; i++)
    {
        /* If current character exists in given string */
        if(freq[i] != 0)
        {
            printf("'%c' = %d\n", (i + 97), freq[i]);
        }
    }

    return 0;
}
```

```
Enter any string: Codeforwin

Frequency of all characters in the given string:
'c' = 1
'd' = 1
'e' = 1
'f' = 1
'i' = 1
'n' = 1
'o' = 2
'r' = 1
'w' = 1

```
---
# 21. Remove first occurrence of a character from string.

| ***Input:***                                                                                         | ***Output:***                                      |
| ---------------------------------------------------------------------------------------------------- | -------------------------------------------------- |
| Input string: I Love programming. I Love Codeforwin. I Love India.<br>Input character to remove: 'I' | Love Programming. I Love Codeforwin. I Love India. |

```c
/**
 * C program to remove first occurrence of a character from the given string.
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
void removeFirst(char *, const char);


int main()
{
    char str[MAX_SIZE];
    char toRemove;

    printf("Enter any string: ");
    gets(str);

    printf("Enter character to remove from string: ");
    toRemove = getchar();

    removeFirst(str, toRemove);

    printf("String after removing first '%c' : %s", toRemove, str);

    return 0;
}


/**
 * Function to remove first occurrence of a character from the string.
 */
void removeFirst(char * str, const char toRemove)
{
    int i = 0;
    int len = strlen(str);

    /* Run loop till the first occurrence of the character is not found */
    while(i<len && str[i]!=toRemove)
        i++;

    /* Shift all characters right to the position found above, to one place left */
    while(i < len)
    {
        str[i] = str[i+1];
        i++;
    }
}
```

```
Enter any string: I Love programming. I Love Codeforwin. I Love India.
Enter character to remove from string: I

String after removing first 'I' : Love programming. I Love Codeforwin. I Love India.

```
---
# 22. Remove last occurrence of a character from string.

| ***Input:***                                                                             | ***Output:***                                                         |
| ---------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| Input string : I love programming. I love Codeforwin.<br>Input character to remove : 'I' | String after removing last 'I' : I love programming. love Codeforwin. |

```c
/**
 * C program to remove last occurrence of a character from the given string.
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
void removeLast(char *, const char);


int main()
{
    char str[MAX_SIZE];
    char toRemove;

    printf("Enter any string: ");
    gets(str);

    printf("Enter character to remove from string: ");
    toRemove = getchar();

    removeLast(str, toRemove);

    printf("String after removing last '%c' : %s", toRemove, str);

    return 0;
}


/**
 * Function to remove last occurrence of a character from the string.
 */
void removeLast(char * str, const char toRemove)
{
    int i, lastPosition;
    int len = strlen(str);

    /* Assume that character does not exist in string */
    lastPosition = -1;
    i=0;

    while(i<len)
    {
        if(str[i] == toRemove)
        {
            lastPosition = i;
        }

        i++;
    }

    /* If character exists in string */
    if(lastPosition != -1)
    {
        i = lastPosition;

        /*
         * Shift all characters right to the position found above to left
         */
        while(i<len)
        {
            str[i] = str[i+1];
            i++;
        }
    }
}
```

```
Enter any string: I love programming. I love Codeforwin.
Enter character to remove from string: I

String after removing last 'I' : I love programming. love Codeforwin.

```
---
# 23. Remove all occurrences of a character from string.

| ***Input:***                                                                             | ***Output:***                                                      |
| ---------------------------------------------------------------------------------------- | ------------------------------------------------------------------ |
| Input string : I Love Programming. I Love Codeforwin.<br>Input character to remove : 'I' | String after removing all 'I' : Love Programming. Love Codeforwin. |

```c
/**
 * C program to remove all occurrences of a character from the given string.
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

/** Function declaration */
void removeAll(char *, const char);


int main()
{
    char str[MAX_SIZE];
    char toRemove;

    printf("Enter any string: ");
    gets(str);

    printf("Enter character to remove from string: ");
    toRemove = getchar();

    removeAll(str, toRemove);

    printf("String after removing '%c': %s", toRemove, str);

    return 0;
}


/**
 * Function to remove all occurrences of a character from the string.
 */
void removeAll(char * str, const char toRemove)
{
    int i, j;
    int len = strlen(str);

    for(i=0; i<len; i++)
    {
        /*
         * If the character to remove is found then shift all characters to one
         * place left and decrement the length of string by 1.
         */
        if(str[i] == toRemove)
        {
            for(j=i; j<len; j++)
            {
                str[j] = str[j+1];
            }

            len--;

            // If a character is removed then make sure i doesn't increments
            i--;
        }
    }
}
```

```
Enter any string: I Love Programming. I Love Codeforwin.
Enter character to remove from string: I

String after removing 'I': Love Programming. Love Codeforwin.

```
---
# 24. Remove all repeated characters from a given string.

| ***Input:***                    | ***Output:***                                           |
| ------------------------------- | ------------------------------------------------------- |
| Input string: Programming in C. | String after removing duplicate characters: Progamin C. |

```c
/**
 * C program to remove all repeated characters from a given string
 */
#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declarations */
void removeDuplicates(char * str);
void removeAll(char * str, const char toRemove, int index);


int main()
{
    char str[MAX_SIZE];

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    printf("String before removing duplicates: %s\n", str);

    removeDuplicates(str);

    printf("String after removing duplicates: %s\n", str);

    return 0;
}


/**
 * Remove all duplicate characters from the given string
 */
void removeDuplicates(char * str)
{
    int i = 0;

    while(str[i] != '\0')
    {
        /* Remove all duplicate of character string[i] */
        removeAll(str, str[i], i + 1);
        i++;
    }
}

/**
 * Remove all occurrences of a given character from string.
 */
void removeAll(char * str, const char toRemove, int index)
{
    int i;

    while(str[index] != '\0')
    {
        /* If duplicate character is found */
        if(str[index] == toRemove)
        {
            /* Shift all characters from current position to one place left */
            i = index;
            while(str[i] != '\0')
            {
                str[i] = str[i + 1];
                i++;
            }
        }
        else
        {
            index++;
        }
    }
}
```

```
Enter any string: Programming in C.
String before removing duplicates: Programming in C.
String after removing duplicates: Progamin C.

```
---
# 25. Replace first occurrence of a character with another in a string.

| ***Input:***                                                                                             | ***Output:***                                            |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------- |
| Input string: I love programming.<br>Input character to replace: .<br>Input character to replace with: ! | String after replacing '.' with '!': I love programming! |

```c
/**
 * C program to replace first occurrence of a character with another in a string
 */
#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
void replaceFirst(char * str, char oldChar, char newChar);


int main()
{
    char str[MAX_SIZE], oldChar, newChar;

    printf("Enter any string: ");
    gets(str);

    printf("Enter character to replace: ");
    oldChar = getchar();

    // Used to skip extra ENTER character
    getchar();

    printf("Enter character to replace '%c' with: ", oldChar);
    newChar = getchar();


    printf("\nString before replacing: %s\n", str);

    replaceFirst(str, oldChar, newChar);

    printf("String after replacing first '%c' with '%c' : %s", oldChar, newChar, str);

    return 0;
}


/**
 * Replace first occurrence of a character with
 * another in given string.
 */
void replaceFirst(char * str, char oldChar, char newChar)
{
    int i=0;

    /* Run till end of string */
    while(str[i] != '\0')
    {
        /* If an occurrence of character is found */
        if(str[i] == oldChar)
        {
            str[i] = newChar;
            break;
        }

        i++;
    }
}
```

```
Enter any string: I love Codeforwin.
Enter character to replace: I
Enter character to replace 'I' with: !

String before replacing: I love Codeforwin.
String after replacing first 'I' with '!' : ! love Codeforwin.

```
---
# 26. Replace last occurrence of a character with another in a string.

| ***Input:***                                                                                                  | ***Output:***                                                       |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------- |
| Input string: Do you love programming.<br>Input character to replace: .<br>Input character to replace with: ? | String after replacing last '.' with '?' : Do you love programming? |

```c
/**
 * C program to replace last occurrence of a character with another in a string
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
void replaceLast(char * str, char oldChar, char newChar);


int main()
{
    char str[MAX_SIZE], oldChar, newChar;

    printf("Enter any string: ");
    gets(str);

    printf("Enter character to replace: ");
    oldChar = getchar();

    // Dummy getchar() to eliminate extra ENTER character
    getchar();

    printf("Enter character to replace '%c' with: ", oldChar);
    newChar = getchar();


    printf("\nString before replacing: \n%s", str);

    replaceLast(str, oldChar, newChar);

    printf("\n\nString after replacing '%c' with '%c': \n%s", oldChar, newChar, str);

    return 0;
}


/**
 * Replace last occurrence of a character with 
 * another in given string.
 */
void replaceLast(char * str, char oldChar, char newChar)
{
    int i, lastIndex;

    lastIndex = -1;
    i = 0;

    /* Run till end of string */
    while(str[i] != '\0')
    {
        /* If an occurrence of character is found */
        if(str[i] == oldChar)
        {
            lastIndex = i;
        }

        i++;
    }

    if(lastIndex != -1)
    {
        str[lastIndex] = newChar;
    }
}
```

```
Enter any string: Do you love programming.
Enter character to replace: .
Enter character to replace '.' with: ?

String before replacing: 
Do you love programming.

String after replacing '.' with '?' : 
Do you love programming?

```
---
# 27. Replace all occurrences of a character with another in a string.

| ***Input:***                                                                                                        | ***Output:***                                                      |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------ |
| Input string: I_love_learning_at_Codeforwin.<br>Input character to replace: _<br>Input character to replace with: - | String after replacing '_' with '-': I-love-learning-at-Codeforwin |

```c
/**
 * C program to replace all occurrence of a character with another in a string
 */
#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
void replaceAll(char * str, char oldChar, char newChar);


int main()
{
    char str[MAX_SIZE], oldChar, newChar;

    printf("Enter any string: ");
    gets(str);

    printf("Enter character to replace: ");
    oldChar = getchar();

    // Dummy getchar() to eliminate extra ENTER character
    getchar();

    printf("Enter character to replace '%c' with: ", oldChar);
    newChar = getchar();


    printf("\nString before replacing: \n%s", str);

    replaceAll(str, oldChar, newChar);

    printf("\n\nString after replacing '%c' with '%c' : \n%s", oldChar, newChar, str);

    return 0;
}


/**
 * Replace all occurrence of a character in given string.
 */
void replaceAll(char * str, char oldChar, char newChar)
{
    int i = 0;

    /* Run till end of string */
    while(str[i] != '\0')
    {
        /* If occurrence of character is found */
        if(str[i] == oldChar)
        {
            str[i] = newChar;
        }

        i++;
    }
}
```

```
Enter any string: I_love_Codeforwin.
Enter character to replace: _
Enter character to replace '_' with: -

String before replacing: 
I_love_Codeforwin.

String after replacing '_' with '-' : 
I-love-Codeforwin.

```
---
# 28. First occurrence of a word in a given string.

| ***Input:***                                                    | ***Output:***               |
| --------------------------------------------------------------- | --------------------------- |
| Input string: I love programming!<br>Input word to search: love | 'love' is found at index 2. |

```c
/**
 * C program to find the first occurrence of a word in a string
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE], word[MAX_SIZE];
    int i, index, found = 0;

    /* Input string and word from user */
    printf("Enter any string: ");
    gets(str);
    printf("Enter word to be searched: ");
    gets(word);


    /* Run loop from start to end of string */
    index = 0;
    while(str[index] != '\0')
    {

        /* If first character of word matches with the given string */
        if(str[index] == word[0])
        {
            /* Match entire word with current found index */
            i=0;
            found = 1;
            while(word[i] != '\0')
            {
                if(str[index + i] != word[i])
                {
                    found = 0;
                    break;
                }

                i++;
            }
        }
        
        /* If the word is found then get out of loop */
        if(found == 1)
        {
            break;
        }

        index++;
    }
    
    /*  Print success message if the word is found */
    if(found == 1)
    {
        printf("\n'%s' is found at index %d.", word, index);
    }
    else
    {
        printf("\n'%s' is not found.", word);
    }

    return 0;
}
```

```
Enter any string: I love programming.
Enter word to be searched: love

'love' is found at index 2.

```
---
# 29. Find last occurrence of a word in a given string.

| ***Input:***                                                             | ***Output:***                |
| ------------------------------------------------------------------------ | ---------------------------- |
| Input string: I love programming. I love Codeforwin.<br>Input word: love | 'love' is found at index: 22 |

```c
/**
 * C program to find last occurrence of a word in given string
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    char word[MAX_SIZE];
    int i, j, index, found;
    int strLen, wordLen;

    /* Input string and word from user */
    printf("Enter any string: ");
    gets(str);
    printf("Enter any word to search: ");
    gets(word);

    index = -1;
    strLen  = strlen(str);   // Find length of string
    wordLen = strlen(word);  // Find length of word


    /*
     * Runs a loop from starting index of string to
     * length of string - word length
     */
    for(i=0; i<=strLen - wordLen; i++)
    {
        // Match word at current position
        found = 1;
        for(j=0; j<wordLen; j++)
        {
            //If word is not matched
            if(str[i + j] != word[j])
            {
                found = 0;
                break;
            }
        }

        // If word have been found then store the current found index
        if(found == 1)
        {
            index = i;
        }
    }

    if(index == -1)
    {
        printf("\n'%s' not found.", word);
    }
    else
    {
        printf("\nLast index of '%s' = %d", word, index);
    }

    return 0;
}
```

```
Enter any string: I love programming. I love Codeforwin.
Enter any word to search: love

Last index of 'love' = 22

```
---
# 30. Search all occurrences of a word in given string.

| ***Input:***                                                                       | ***Output:***                                               |
| ---------------------------------------------------------------------------------- | ----------------------------------------------------------- |
| Input string: I love programming. I love Codeforwin.<br>Input word to search: love | 'love' is found at index: 2<br>'love' is found at index: 22 |

```c
/**
 * C program to find last occurrence of a word in given string
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    char word[MAX_SIZE];
    int i, j, found;
    int strLen, wordLen;

    /* Input string and word from user */
    printf("Enter any string: ");
    gets(str);
    printf("Enter any word to search: ");
    gets(word);

    strLen  = strlen(str);  // Find length of string
    wordLen = strlen(word); // Find length of word


    /*
     * Run a loop from starting index of string to
     * length of string - word length
     */
    for(i=0; i<strLen - wordLen; i++)
    {
        // Match word at current position
        found = 1;
        for(j=0; j<wordLen; j++)
        {
            // If word is not matched
            if(str[i + j] != word[j])
            {
                found = 0;
                break;
            }
        }

        // If word have been found then print found message
        if(found == 1)
        {
            printf("'%s' found at index: %d \n", word, i);
        }
    }

    return 0;
}
```

```
Enter any string: I love programming. I love Codeforwin. I love Computers.
Enter any word to search: love
'love' found at index: 2
'love' found at index: 22
'love' found at index: 41

```
---
# 31. Count occurrences of a word in a given string.

| ***Input:***                                                                       | ***Output:***                  |
| ---------------------------------------------------------------------------------- | ------------------------------ |
| Input string: I love programming. I love Codeforwin.<br>Input word to search: love | Total occurrences of 'love': 2 |

```c
/**
 * C program to count occurrences of a word in a given string
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
int countOccurrences(char * str, char * toSearch);


int main()
{
    char str[MAX_SIZE];
    char toSearch[MAX_SIZE];
    int count;

    /* Input string and word from user */
    printf("Enter any string: ");
    gets(str);
    printf("Enter word to search occurrences: ");
    gets(toSearch);

    count = countOccurrences(str, toSearch);

    printf("Total occurrences of '%s': %d", toSearch, count);

    return 0;
}


/**
 * Get, total number of occurrences of a word in a string
 */
int countOccurrences(char * str, char * toSearch)
{
    int i, j, found, count;
    int stringLen, searchLen;

    stringLen = strlen(str);      // length of string
    searchLen = strlen(toSearch); // length of word to be searched

    count = 0;

    for(i=0; i <= stringLen-searchLen; i++)
    {
        /* Match word with string */
        found = 1;
        for(j=0; j<searchLen; j++)
        {
            if(str[i + j] != toSearch[j])
            {
                found = 0;
                break;
            }
        }

        if(found == 1)
        {
            count++;
        }
    }

    return count;
}
```

```
Enter any string: I love programming. I love Codeforwin.
Enter word to search occurrences: love
Total occurrences of 'love': 2

```
---
# 32. Remove first occurrence of a word from string.

| ***Input:***                                                                    | ***Output:***                                                 |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------- |
| Input string : Learn programming at Codeforwin.<br>Input word to remove : Learn | String after removing 'Learn': <br>programming at Codeforwin. |

```c
/**
 * C program to remove the first occurrence of a word in a string
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

/** Function declaration */
void removeFirst(char * str, const char * toRemove);


int main()
{
    char str[MAX_SIZE];
    char toRemove[MAX_SIZE];

    /* Input string and word to be removed from user  */
    printf("Enter any string: ");
    gets(str);
    printf("Enter string to be removed: ");
    gets(toRemove);

    removeFirst(str, toRemove);

    printf("\nString after removing '%s': \n%s", toRemove, str);

    return 0;
}


/**
 * Remove first occurrence of a word from string
 */
void removeFirst(char * str, const char * toRemove)
{
    int i, j;
    int len, removeLen;
    int found = 0;

    len = strlen(str);
    removeLen = strlen(toRemove);

    for(i=0; i<len; i++)
    {
        found = 1;
        for(j=0; j<removeLen; j++)
        {
            if(str[i+j] != toRemove[j])
            {
                found = 0;
                break;
            }
        }

        /* If word has been found then remove it by shifting characters  */
        if(found == 1)
        {
            for(j=i; j<=len-removeLen; j++)
            {
                str[j] = str[j + removeLen];
            }

            // Terminate from loop so only first occurrence is removed
            break;
        }
    }
}
```

```
Enter any string: Learn programming at Codeforwin.
Enter string to be removed: Learn

String after removing 'Learn':
programming at Codeforwin.

```
---
# 33. Remove last occurrence of a word in given string.

| ***Input:***                                                                       | ***Output:***                                                                             |
| ---------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| Input string: I am a programmer. I learn at Codeforwin.<br>Input word to remove: I | String after removing last occurrence of 'I': <br>I am a programmer.  learn at Codeforwin |

```c
/**
 * C program to remove last occurrence of a word in given string
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    char word[MAX_SIZE];
    int i, j, found, index;
    int stringLen, wordLen;


    /* Input string and word from user */
    printf("Enter any string: ");
    gets(str);
    printf("Enter word to remove: ");
    gets(word);

    stringLen = strlen(str);  // Length of string
    wordLen   = strlen(word); // Length of word


    /*
     * Run loop from start to end of string - word length
     */
    index = -1;
    for(i=0; i<stringLen - wordLen; i++)
    {
        // Match word at current position
        found = 1;
        for(j=0; j<wordLen; j++)
        {
            // If word is not matched
            if(str[i+j] != word[j])
            {
                found = 0;
                break;
            }
        }

        // If word is found then update index
        if(found == 1)
        {
            index = i;
        }
    }

    // If word not found
    if(index == -1)
    {
        printf("'%s' not found.");
    }
    else
    {
        /*
         * Shift all characters from right to left
         */
        for(i=index; i <= stringLen - wordLen; i++)
        {
            str[i] = str[i + wordLen];
        }

        printf("String after removing last '%s': \n%s", word, str);
    }

    return 0;
}
```

```
Enter any string: I am a programmer. I learn at Codeforwin.
Enter word to remove: I
String after removing last 'I': 
I am a programmer.  learn at Codeforwin.

```
---

# 34. Remove all occurrence of a word in given string.

| ***Input:***                                                                    | ***Output:***                                                      |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------ |
| Input string: I love programming. I love Codeforwin.<br>Input word to remove: I | String after removing 'I':<br> love programming.  love Codeforwin. |

```c
/**
 * C program to remove all occurrences of a word in given string
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
void removeAll(char * str, char * toRemove);


int main()
{
    char str[MAX_SIZE];
    char toRemove[MAX_SIZE];

    /* Input string and word from user */
    printf("Enter any string: ");
    gets(str);
    printf("Enter word to remove: ");
    gets(toRemove);

    printf("String before removing '%s' : \n%s", toRemove, str);

    removeAll(str, toRemove);

    printf("\n\nString after removing '%s' : \n%s", toRemove, str);

    return 0;
}


/**
 * Remove all occurrences of a given word in string.
 */
void removeAll(char * str, char * toRemove)
{
    int i, j, stringLen, toRemoveLen;
    int found;

    stringLen   = strlen(str);      // Length of string
    toRemoveLen = strlen(toRemove); // Length of word to remove


    for(i=0; i <= stringLen - toRemoveLen; i++)
    {
        /* Match word with string */
        found = 1;
        for(j=0; j<toRemoveLen; j++)
        {
            if(str[i + j] != toRemove[j])
            {
                found = 0;
                break;
            }
        }

        /* If it is not a word */
        if(str[i + j] != ' ' && str[i + j] != '\t' && str[i + j] != '\n' && str[i + j] != '\0') 
        {
            found = 0;
        }

        /*
         * If word is found then shift all characters to left
         * and decrement the string length
         */
        if(found == 1)
        {
            for(j=i; j<=stringLen - toRemoveLen; j++)
            {
                str[j] = str[j + toRemoveLen];
            }

            stringLen = stringLen - toRemoveLen;

            // We will match next occurrence of word from current index.
            i--;
        }
    }
}
```

```
Enter any string: I love programming. I love Codeforwin.
Enter word to remove: I
String before removing 'I' : 
I love programming. I love Codeforwin.

String after removing 'I' : 
love programming. love Codeforwin.

```
---
# 35. Trim leading white space characters from given string.

| ***Input:***                               | ***Output:***                                                          |
| ------------------------------------------ | ---------------------------------------------------------------------- |
| Input string:       Lots of leading space. | String after removing leading white spaces: <br>Lots of leading space. |

```c
#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

void trimLeading(char * str);


int main()
{
    char str[MAX_SIZE];

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    printf("\nString before trimming leading whitespace: \n%s", str);

    trimLeading(str);

    printf("\n\nString after trimming leading whitespace: \n%s", str);

    return 0;
}


/**
 * Remove leading whitespace characters from string
 */
void trimLeading(char * str)
{
    int index, i, j;

    index = 0;

    /* Find last index of whitespace character */
    while(str[index] == ' ' || str[index] == '\t' || str[index] == '\n')
    {
        index++;
    }


    if(index != 0)
    {
        /* Shit all trailing characters to its left */
        i = 0;
        while(str[i + index] != '\0')
        {
            str[i] = str[i + index];
            i++;
        }
        str[i] = '\0'; // Make sure that string is NULL terminated
    }
}
```

```
Enter any string:       Lots of leading space!

String before trimming leading whitespace:
       Lots of leading space!

String after trimming leading whitespace: 
Lots of leading space!

```
---
# 36. Trim trailing white space characters from given string.

| ***Input:***                                         | ***Output:***                                                                     |
| ---------------------------------------------------- | --------------------------------------------------------------------------------- |
| Input string: "Lots of trailing white spaces.      " | String after removing trailing white spaces: <br>"Lots of trailing white spaces." |

```c
/**
 * C program to trim trailing white space characters from a string
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
void trimTrailing(char * str);


int main()
{
    char str[MAX_SIZE];

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    printf("\nString before trimming trailing white space: \n'%s'", str);

    trimTrailing(str);

    printf("\n\nString after trimming trailing white spaces: \n'%s'", str);

    return 0;
}

/**
 * Remove trailing white space characters from string
 */
void trimTrailing(char * str)
{
    int index, i;

    /* Set default index */
    index = -1;

    /* Find last index of non-white space character */
    i = 0;
    while(str[i] != '\0')
    {
        if(str[i] != ' ' && str[i] != '\t' && str[i] != '\n')
        {
            index= i;
        }

        i++;
    }

    /* Mark next character to last non-white space character as NULL */
    str[index + 1] = '\0';
}

```

```
Enter any string: Lots of trailing white space.           

String before trimming trailing white space: 
'Lots of trailing white space.           '

String after trimming trailing white space: 
'Lots of trailing white space.'

```
---
# 37. Trim both leading and trailing white space characters from given string.

| ***Input:***                                                   | ***Output:***                                                                                       |
| -------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| Input string: "     Lots of leading and trailing spaces.     " | String after removing leading and trailing white spaces: <br>"Lots of leading and trailing spaces." |

```c
/**
 * C program to trim both leading and trailing white space characters from a string
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
void trim(char * str);


int main()
{
    char str[MAX_SIZE];

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    printf("\nString before trimming white space: \n'%s'", str);

    trim(str);

    printf("\n\nString after trimming white space: \n'%s'", str);

    return 0;
}


/**
 * Remove leading and trailing white space characters
 */
void trim(char * str)
{
    int index, i;

    /*
     * Trim leading white spaces
     */
    index = 0;
    while(str[index] == ' ' || str[index] == '\t' || str[index] == '\n')
    {
        index++;
    }

    /* Shift all trailing characters to its left */
    i = 0;
    while(str[i + index] != '\0')
    {
        str[i] = str[i + index];
        i++;
    }
    str[i] = '\0'; // Terminate string with NULL


    /*
     * Trim trailing white spaces
     */
    i = 0;
    index = -1;
    while(str[i] != '\0')
    {
        if(str[i] != ' ' && str[i] != '\t' && str[i] != '\n')
        {
            index = i;
        }

        i++;
    }

    /* Mark the next character to last non white space character as NULL */
    str[index + 1] = '\0';
}
```

```
Enter any string:      Lots of white spaces.

String before trimming white space: 
'     Lots of white spaces.     '

String after trimming white space: 
'Lots of white spaces.'

```
---
# 38. Remove all extra blank spaces from given string.

| ***Input:***                                               | ***Output:***                                                               |
| ---------------------------------------------------------- | --------------------------------------------------------------------------- |
| Input string: Learn     C      programming at  Codeforwin. | String after removing extra blanks: <br>"Learn C programming at Codeforwin" |

```c
/**
 * C program to remove extra blank spaces from a given string
 */

#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100 // Maximum string size

/* Function declaration */
char * removeBlanks(const char * str);


int main()
{
    char str[MAX_SIZE];
    char * newString;

    printf("Enter any string: ");
    gets(str);

    printf("\nString before removing blanks: \n'%s'", str);

    newString = removeBlanks(str);

    printf("\n\nString after removing blanks: \n'%s'", newString);

    return 0;
}


/**
 * Removes extra blank spaces from the given string
 * and returns a new string with single blank spaces
 */
char * removeBlanks(const char * str)
{
    int i, j;
    char * newString;

    newString = (char *)malloc(MAX_SIZE);

    i = 0;
    j = 0;

    while(str[i] != '\0')
    {
        /* If blank space is found */
        if(str[i] == ' ')
        {
            newString[j] = ' ';
            j++;

            /* Skip all consecutive spaces */
            while(str[i] == ' ')
                i++;
        }

        newString[j] = str[i];

        i++;
        j++;
    }
    // NULL terminate the new string
    newString[j] = '\0';

    return newString;
}
```

```
Enter any string: Learn     C      programming at  Codeforwin.

String before removing blanks: 
'Learn     C      programming at  Codeforwin.'

String after removing blanks: 
'Learn C programming at Codeforwin.'

```
---
# 🟢 POINTER

---
# 1. Write a C program to create, initialize and use pointers.

| ***Input:*** | ***Output:*** |
| ------------ | ------------- |
|              |               |

```c
/**
 * C program to create, initialize and use pointers
 */

#include <stdio.h>

int main()
{
    int num = 10;
    int * ptr;

    /* Stores the address of num to pointer type */
    ptr = &num;

    printf("Address of num = %d\n", &num);
    printf("Value of num = %d\n", num);

    printf("Address of ptr = %d\n", &ptr);
    printf("Value of ptr = %d\n", ptr);
    printf("Value pointed by ptr = %d\n", *ptr);

    return 0;
}
```

```
Address of num = 6356748.
Value of num = 10
Address of ptr = 6356744
Value of ptr = 6356748
Value pointed by ptr = 10
```
---
# 2. Add two numbers using pointers.

| ***Input:***                     | ***Output:***                                                 |
| -------------------------------- | ------------------------------------------------------------- |
| Input num1: 10<br>Input num2: 20 | Sum = 30<br>Difference = -10<br>Product = 200<br>Quotient = 0 |

```c
/*
 * C program to add two number using pointers
 */

#include <stdio.h>

int main()
{
    int num1, num2, sum;
    int *ptr1, *ptr2;

    ptr1 = &num1; // ptr1 stores the address of num1
    ptr2 = &num2; // ptr2 stores the address of num2

    printf("Enter any two numbers: ");
    scanf("%d%d", ptr1, ptr2);

    sum = *ptr1 + *ptr2;

    printf("Sum = %d", sum);

    return 0;
}
```

And,

```c
/**
 * C program to perform all arithmetic operations using pointers
 */

#include <stdio.h>

int main()
{
    float num1, num2;    // Normal variables
    float *ptr1, *ptr2;  // Pointer variables

    float sum, diff, mult, div;

    ptr1 = &num1; // ptr1 stores the address of num1
    ptr2 = &num2; // ptr2 stores the address of num2

    /* User input through pointer */
    printf("Enter any two real numbers: ");
    scanf("%f%f", ptr1, ptr2);

    /* Perform arithmetic operation */
    sum  = (*ptr1) + (*ptr2);
    diff = (*ptr1) - (*ptr2);
    mult = (*ptr1) * (*ptr2);
    div  = (*ptr1) / (*ptr2);

    /* Print the results */
    printf("Sum = %.2f\n", sum);
    printf("Difference = %.2f\n", diff);
    printf("Product = %.2f\n", mult);
    printf("Quotient = %.2f\n", div);

    return 0;
}
```

```
Enter any two real numbers: 20
5
Sum = 25.00
Difference = 15.00
Product = 100.00
Quotient = 4.00

```
---
# 3. Swap two numbers using pointers.

| ***Input:***                     | ***Output:***                                    |
| -------------------------------- | ------------------------------------------------ |
| Input num1: 10<br>Input num2: 20 | Values after swapping:<br>Num1 = 20<br>Num2 = 10 |

```c
/**
 * C program to swap two number using call by reference
 */

#include <stdio.h>

/* Swap function declaration */
void swap(int * num1, int * num2);

int main()
{
    int num1, num2;

    /* Input numbers */
    printf("Enter two numbers: ");
    scanf("%d%d", &num1, &num2);

    /* Print original values of num1 and num2 */
    printf("Before swapping in main n");
    printf("Value of num1 = %d \n", num1);
    printf("Value of num2 = %d \n\n", num2);

    /* Pass the addresses of num1 and num2 */
    swap(&num1, &num2);

    /* Print the swapped values of num1 and num2 */
    printf("After swapping in main n");
    printf("Value of num1 = %d \n", num1);
    printf("Value of num2 = %d \n\n", num2);

    return 0;
}


/**
 * Function to swap two numbers
 */
void swap(int * num1, int * num2)
{
    int temp;

    // Copy the value of num1 to some temp variable
    temp = *num1;

    // Copy the value of num2 to num1
    *num1= *num2;

    // Copy the value of num1 stored in temp to num2
    *num2= temp;

    printf("After swapping in swap function n");
    printf("Value of num1 = %d \n", *num1);
    printf("Value of num2 = %d \n\n", *num2);
}
```

```
Enter two numbers: 10 20
Before swapping in main
Value of num1 = 10
Value of num2 = 20

After swapping in swap function
Value of num1 = 20
Value of num2 = 10

After swapping in main
Value of num1 = 20
Value of num2 = 10

```
---
# 4. Input and print array elements using pointer.

| ***Input:***                                                                            | ***Output:***                                 |
| --------------------------------------------------------------------------------------- | --------------------------------------------- |
| Input array size: 10<br>Input elements: 1<br>2<br>3<br>4<br>5<br>6<br>7<br>8<br>9<br>10 | Array elements: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 |

```c

/**
 * C program to input and print array elements using pointers
 */

#include <stdio.h>

#define MAX_SIZE 100 // Maximum array size

int main()
{
    int arr[MAX_SIZE];
    int N, i;
    int * ptr = arr;    // Pointer to arr[0] 

    printf("Enter size of array: ");
    scanf("%d", &N);

    printf("Enter elements in array:\n");
    for (i = 0; i < N; i++)
    {
        scanf("%d", ptr);

        // Move pointer to next array element
        ptr++;   
    }

    // Make sure that pointer again points back to first array element
    ptr = arr;

    printf("Array elements: ");
    for (i = 0; i < N; i++)
    {
        // Print value pointed by the pointer
        printf("%d, ", *ptr);

        // Move pointer to next array element
        ptr++;
    }

    return 0;
}
```

OR,

```c

/**
 * C program to input and print array elements using pointers
 */

#include <stdio.h>

#define MAX_SIZE 100 // Maximum array size

int main()
{
    int arr[MAX_SIZE];
    int N, i;
    int * ptr = arr;    // Pointer to arr[0] 

    printf("Enter size of array: ");
    scanf("%d", &N);

    printf("Enter elements in array:\n");
    for (i = 0; i < N; i++)
    {
        // (ptr + i) is equivalent to &arr[i]
        scanf("%d", (ptr + i));   
    }

    printf("Array elements: ");
    for (i = 0; i < N; i++)
    {
        // *(ptr + i) is equivalent to arr[i]
        printf("%d, ", *(ptr + i));
    }

    return 0;
}
```

OR,

```c

/**
 * C program to input and print array elements using pointer in array notation
 */

#include <stdio.h>

#define MAX_SIZE 100 // Maximum array size

int main()
{
    int arr[MAX_SIZE];
    int N, i;
    int * ptr = arr;    // Pointer to arr[0] 

    printf("Enter size of array: ");
    scanf("%d", &N);

    printf("Enter elements in array:\n");
    for (i = 0; i < N; i++)
    {
        // &ptr[i] is equivalent to &arr[i]
        scanf("%d", &ptr[i]);   
    }

    printf("Array elements: ");
    for (i = 0; i < N; i++)
    {
        // i[ptr] is equivalent to arr[i], i[arr] and ptr[i]
        // I have used i[ptr] syntax for knowledge. You can also use ptr[i]
        printf("%d, ", i[ptr]);
    }

    return 0;
}
```

```
Enter size of array: 10
Enter elements in array:
1
2
3
4
5
6
7
8
9
10
Array elements: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

```
---
# 5. Copy one array to another using pointers.

| ***Input:***                                         | ***Output:***                                                                  |
| ---------------------------------------------------- | ------------------------------------------------------------------------------ |
| Input array1 elements: 10 -1 100 90 87 0 15 10 20 30 | Array1: 10 -1 100 90 87 0 15 10 20 30<br>Array2: 10 -1 100 90 87 0 15 10 20 30 |

```c
/**
 * C program to copy an array to another array using pointers
 */

#include <stdio.h>

#define MAX_SIZE 100 // Maximum array size


/* Function declaration to print array */
void printArray(int arr[], int size);


int main()
{
    int source_arr[MAX_SIZE], dest_arr[MAX_SIZE];
    int size, i;

    int *source_ptr = source_arr;   // Pointer to source_arr
    int *dest_ptr   = dest_arr;     // Pointer to dest_arr

    int *end_ptr;


    /*
     * Input size and elements in source array
     */
    printf("Enter size of array: ");
    scanf("%d", &size);
    printf("Enter elements in array: ");
    for (i = 0; i < size; i++)
    {
        scanf("%d", (source_ptr + i));
    }


    // Pointer to last element of source_arr
    end_ptr = &source_arr[size - 1];


    /* Print source and destination array before copying */
    printf("\nSource array before copying: ");
    printArray(source_arr, size);

    printf("\nDestination array before copying: ");
    printArray(dest_arr, size);



    /*
     * Run loop till source_ptr exists in source_arr
     * memory range.
     */
    while(source_ptr <= end_ptr)
    {
        *dest_ptr = *source_ptr;

        // Increment source_ptr and dest_ptr
        source_ptr++;
        dest_ptr++;
    }


    /* Print source and destination array after copying */
    printf("\n\nSource array after copying: ");
    printArray(source_arr, size);

    printf("\nDestination array after copying: ");
    printArray(dest_arr, size);


    return 0;
}


/**
 * Function to print array elements.
 * 
 * @arr     Integer array to print.
 * @size    Size of array.
 */
void printArray(int *arr, int size)
{
    int i;

    for (i = 0; i < size; i++)
    {
        printf("%d, ", *(arr + i));
    }
}
```

```
Enter size of array: 10
Enter elements in array: 10 -1 100 90 87 0 15 10 20 30

Source array before copying: 10, -1, 100, 90, 87, 0, 15, 10, 20, 30,
Destination array before copying: 0, 0, 127, 127, 0, 1, 0, 16777472, 0, 0,

Source array after copying: 10, -1, 100, 90, 87, 0, 15, 10, 20, 30,
Destination array after copying: 10, -1, 100, 90, 87, 0, 15, 10, 20, 0,

```
---
# 6. Swap two arrays using pointers.

| ***Input:***                                                                                 | ***Output:***                                                                                                   |
| -------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| Input first array: 10 20 30 40 50 60 70 80 90 100<br>Input second array: 0 9 8 7 6 5 4 3 2 1 | First array after swapping: 0 9 8 7 6 5 4 3 2 1<br>Second array after swapping:  10 20 30 40 50 60 70 80 90 100 |

```c
#include <stdio.h>
#define MAX_SIZE 100    // Maximum array size


void inputArray(int *arr, int size);
void printArray(int *arr, int size);
void swapArray(int *sourceArr, int *destArr, int size);
int main()
{
    int sourceArr[MAX_SIZE];
    int destArr[MAX_SIZE];

    int size;


    // Input array size
    printf("Enter size of array: ");
    scanf("%d", &size);

    // Input elements of destination array
    printf("Enter %d elements in source array: ", size);
    inputArray(sourceArr, size);


    // Input element of destination array
    printf("Enter %d elements in destination array: ", size);
    inputArray(destArr, size);


    /*
     * Print elements of both arrays before swapping
     */
    printf("\n\nSource array before swapping: ");
    printArray(sourceArr, size);

    printf("\nDestination array before swapping: ");
    printArray(destArr, size);


    /* Swap elements of both arrays. */
    swapArray(sourceArr, destArr, size);


    /*
     * Print elements of both arrays after swapping
     */
    printf("\n\nSource array after swapping: ");
    printArray(sourceArr, size);

    printf("\nDestination array after swapping: ");
    printArray(destArr, size);

    
    return 0;
}



/**
 * Function used to read input from user in an array.
 *
 * @arr     Pointer to array to store input
 * @size    Size of the array
 */
void inputArray(int *arr, int size)
{
    // Pointer to last element of array.
    int *arrEnd = (arr + (size - 1));


    // Input elements in array using pointer
    while(arr <= arrEnd)
        scanf("%d", arr++);
}



/**
 * Function used to print elements of array.
 * 
 * @arr     Pointer to array, which is to print.
 * @size    Size of the array
 */
void printArray(int *arr, int size)
{
    // Pointer to last element of array.
    int *arrEnd = (arr + (size - 1));


    // Print elements of array one by one
    while(arr <= arrEnd)
        printf("%d, ", *(arr++));
}



/**
 * Function to swap elements of two arrays.
 * 
 * @sourceArr       Pointer to source array to swap.
 * @destArr         Pointer to destination array to swap.
 * @size            Size of array.
 */
void swapArray(int * sourceArr, int * destArr, int size)
{
    // Pointer to last element of source array
    int * sourceArrEnd = (sourceArr + (size - 1));

    // Pointer to last element of destination array
    int * destArrEnd   = (destArr + (size - 1));


    /*
     * Swap individual element of both arrays
     */
    while(sourceArr <= sourceArrEnd && destArr <= destArrEnd)
    {
        *sourceArr ^= *destArr;
        *destArr   ^= *sourceArr;
        *sourceArr ^= *destArr;

        // Increment source array to point to next element
        sourceArr++;

        // Increment destination array to point to next element
        destArr++;
    }
}
```

```
Enter size of array: 10
Enter 10 elements in source array: 1 2 3 4 5 6 7 8 9 10
Enter 10 elements in destination array: 10 20 30 40 50 60 70 80 90 100


Source array before swapping: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Destination array before swapping: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100,

Source array after swapping: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100,
Destination array after swapping: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

```
---
# 7. Reverse an array using pointers.

| ***Input:***                                         | ***Output:***                                  |
| ---------------------------------------------------- | ---------------------------------------------- |
| Input array elements: 10 20 30 40 50 60 70 80 90 100 | Reversed array: 100 90 80 70 60 50 40 30 20 10 |

```c
/**
 * C program to reverse an array using pointers
 */

#include <stdio.h>

#define MAX_SIZE 100

/* Function declaration */
void printArr(int *arr, int size);


int main()
{
    int arr[MAX_SIZE];
    int size;
    int *left = arr;  // Pointer to arr[0]
    int *right;


    // Input size of array
    printf("Enter size of array: ");
    scanf("%d", &size);

    right = &arr[size - 1];  // Pointer to arr[size - 1]

    /*
     * Input elements in array
     */
    printf("Enter elements in array: ");
    while(left <= right)
    {
        scanf("%d", left++);
    }


    printf("\nArray before reverse: ");
    printArr(arr, size);


    // Make sure that left points to arr[0]
    left = arr;


    // Loop to reverse array
    while(left < right) 
    {
        /*
         * Swap element from left of array to right of array.
         */
        *left    ^= *right;
        *right   ^= *left;
        *left    ^= *right;

        // Increment left array pointer and decrement right array pointer
        left++;
        right--;
    }


    printf("\nArray after reverse: ");
    printArr(arr, size);


    return 0;
}



/**
 * Function to print array using pointer.
 *
 * @arr     Pointer to array.
 * @size    Size of the array.
 */
void printArr(int * arr, int size)
{
    // Pointer to arr[size - 1]
    int * arrEnd = (arr + size - 1);

    /* Loop till last array element */
    while(arr <= arrEnd)
    {
        printf("%d, ", *arr);

        // Move pointer to next array element.
        arr++;
    }
}
```

```
Enter size of array: 10
Enter elements in array: 10 20 30 40 50 60 70 80 90 100

Array before reverse: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100,
Array after reverse: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10,

```
---
# 8. Search an element in array using pointers.

| ***Input:***                                                                        | ***Output:***                |
| ----------------------------------------------------------------------------------- | ---------------------------- |
| Input array elements: 10 20 30 40 50 60 70 80 90 100<br>Input element to search: 25 | 25 does not exists in array. |

```c
/**
 * C program to search an element in array using pointers
 */

#include <stdio.h>

#define MAX_SIZE 100


/* Function declaration */
void inputArray(int * arr, int size);
int search(int * arr, int size, int toSearch);



int main()
{
    int array[MAX_SIZE];
    int size, toSearch, searchIndex;


    /*
     * Input size and elements in array
     */
    printf("Enter size of array: ");
    scanf("%d", &size);

    printf("Enter elements in array: ");
    inputArray(array, size);


    // Input element to search from user
    printf("Enter element to search: ");
    scanf("%d", &toSearch);


    // Call search funtion to search element in array
    searchIndex = search(array, size, toSearch);


    // Print search results
    if(searchIndex == -1)
        printf("%d does not exists in array.", toSearch);
    else
        printf("%d is found at %d position.", toSearch, searchIndex + 1);


    return 0;
}




/**
 * Function to input elements in array.
 *
 * @arr     Pointer to integer array
 * @size    Size of the array
 */
void inputArray(int * arr, int size)
{
    // Pointer to last array element arr[0]
    int * arrEnd = (arr + size - 1);


    // Run loop till last array element
    while(arr <= arrEnd)
    {
        scanf("%d", arr++);
    }
}




/**
 * Function to perform linear search in array. The function
 * returns an integer between 0 to size-1 specifying first 
 * index of successful searched element in array.
 *
 * @arr      Pointer to integer array.
 * @size     Size of the array.
 * @toSearch Element to search within array.
 *
 * @return   Returns -1 if element does not exists in array, 
 *           otherwise returns element index.
 */
int search(int * arr, int size, int toSearch)
{
    int index = 0;

    // Pointer to last array element arr[size - 1]
    int * arrEnd = (arr + size - 1);

    /*
     * Run a loop from start of array to last array element (arr <= arrEnd), 
     * until current array element does not match element to search.
     */
    while(arr <= arrEnd && *arr != toSearch) {
        arr++;
        index++;
    }


    // If element is found
    if(arr <= arrEnd)
        return index;
    
    return -1;
}
```

OR,

```c
int search(int * arr, int size, int toSearch)
{
    // Pointer to last array element arr[size - 1]
    int * arrEnd = (arr + size - 1);
    
    while(arr <= arrEnd && *arr != toSearch) arr++;
    
    // If element is found
    if(arr <= arrEnd)
        return (arrEnd - arr) / sizeof(int) + 1;

    return -1;
}
```

```
Enter size of array: 10
Enter elements in array: 10 20 30 40 50 60 70 80 90 100
Enter element to search: 30
30 is found at 3 position.

```
---
# 9. Access two dimensional array using pointers.

| ***Input:***                                              | ***Output:***                                       |
| --------------------------------------------------------- | --------------------------------------------------- |
| Input elements in 3x3 matrix: <br>1 2 3<br>4 5 6<br>7 8 9 | Elements of 3x3 matrix: <br>1 2 3<br>4 5 6<br>7 8 9 |

```c
/**
 * C program to access two dimensional array using pointer.
 */

#include <stdio.h>

#define ROWS 3
#define COLS 3

/* Function declaration to input and print two dimensional array */
void inputMatrix(int matrix[][COLS], int rows, int cols);
void printMatrix(int matrix[][COLS], int rows, int cols);



int main()
{
    int matrix[ROWS][COLS];
    int i, j;

    /* Input elements in matrix */
    printf("Enter elements in %dx%d matrix.\n", ROWS, COLS);
    inputMatrix(matrix, ROWS, COLS);


    /* Print elements in matrix */
    printf("Elements of %dx%d matrix.\n", ROWS, COLS);
    printMatrix(matrix, ROWS, COLS);


    return 0;
}




/**
 * Function to take input in two dimensional array (matrix) 
 * from user.
 *
 * @matrix  2D array to store input.
 * @rows    Total rows in 2D matrix.
 * @cols    Total columns in 2D matrix.
 */
void inputMatrix(int matrix[][COLS], int rows, int cols)
{
    int i, j;


    for(i = 0; i < rows; i++)
    {
        for(j = 0; j < cols; j++)
        {
            // (*(matrix + i) + j is equivalent to &matrix[i][j]
            scanf("%d", (*(matrix + i) + j));
        }
    }
}



/**
 * Function to display elements of two dimensional array (matrix)
 * on console.
 *
 * @matrix  2D array to display as output.
 * @rows    Total rows in 2D matrix.
 * @cols    Total columns in 2D matrix.
 */
void printMatrix(int (*matrix)[COLS], int rows, int cols)
{
    int i, j;


    for (i = 0; i < rows; i++)
    {
        for (j = 0; j < cols; j++)
        {
            // *(*(matrix + i) + j) is equivalent to matrix[i][j]
            printf("%d ", *(*(matrix + i) + j));
        }

        printf("\n");
    }
}
```

```
Enter elements in 3x3 matrix.
1 2 3
4 5 6
7 8 9
Elements of 3x3 matrix.
1 2 3
4 5 6
7 8 9

```
---
# 10. Add two matrix using pointers.

| ***Input:***                                                                             | ***Output:***                                             |
| ---------------------------------------------------------------------------------------- | --------------------------------------------------------- |
| Input matrix1: <br>1 2 3<br>4 5 6<br>7 8 9<br>Input matrix2: <br>9 8 7<br>6 5 4<br>3 2 1 | Sum of both matrices:<br>10 10 10<br>10 10 10<br>10 10 10 |

```c
/**
 * C proogram to add two matrix using pointers.
 */

#include <stdio.h>

#define ROWS 3
#define COLS 3


/* Function declaration to input, add and print matrix */
void matrixInput(int mat[][COLS]);
void matrixPrint(int mat[][COLS]);
void matrixAdd(int mat1[][COLS], int mat2[][COLS], int res[][COLS]);


int main()
{
    int mat1[ROWS][COLS], mat2[ROWS][COLS], res[ROWS][COLS];

    // Input elements in first matrix
    printf("Enter elements in first matrix of size %dx%d: \n", ROWS, COLS);
    matrixInput(mat1);

    // Input element in second matrix
    printf("\nEnter elemetns in second matrix of size %dx%d: \n", ROWS, COLS);
    matrixInput(mat2);

    // Finc sum of both matrices and print result
    matrixAdd(mat1, mat2, res);

    printf("\nSum of first and second matrix: \n");
    matrixPrint(res);
    

    return 0;
}



/**
 * Function to read input from user and store in matrix.
 * 
 * @mat     Two dimensional integer array to store input.
 */
void matrixInput(int mat[][COLS])
{
    int i, j;


    for (i = 0; i < ROWS; i++)
    {
        for (j = 0; j < COLS; j++)
        {
            // (*(mat + i) + j) is equal to &mat[i][j]
            scanf("%d", (*(mat + i) + j));
        }
    }
}



/**
 * Function to print elements of matrix on console.
 * 
 * @mat     Two dimensional integer array to print.
 */
void matrixPrint(int mat[][COLS])
{
    int i, j;

    for (i = 0; i < ROWS; i++)
    {
        for (j = 0; j < COLS; j++)
        {
            // *(*(mat + i) + j) is equal to mat[i][j]
            printf("%d ", *(*(mat + i) + j));
        }
        printf("\n");
    }
}



/**
 * Function to add two matrices and store their result in given res
 * matrix.
 * 
 * @mat1    First matrix to add.
 * @mat2    Second matrix to add.
 * @res     Resultant matrix to store sum of mat1 and mat2.
 */
void matrixAdd(int mat1[][COLS], int mat2[][COLS], int res[][COLS])
{
    int i, j;


    // Iterate over each matrix elements 
    for (i = 0; i < ROWS; i++)
    {
        for (j = 0; j < COLS; j++)
        {
            // res[i][j] = mat1[i][j] + mat2[i][j]
            *(*(res + i) + j) = *(*(mat1 + i) + j) + *(*(mat2 + i) + j);
        }
    }
}
```

```
Enter elements in first matrix of size 3x3:
1 2 3
4 5 6
7 8 9

Enter elemetns in second matrix of size 3x3:
9 8 7
6 5 4
3 2 1

Sum of first and second matrix:
10 10 10
10 10 10
10 10 10

```
---
# 11. Multiply two matrix using pointers.

| ***Input:***                                                                                                            | ***Output:***                                                            |
| ----------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| Input elements of matrix1:<br>10 20 30<br>40 50 60<br>70 80 90<br>Input elements of matrix2:<br>1 2 3<br>4 5 6<br>7 8 9 | Product of matrices is :<br>300 360 420<br>660 810 960<br>1020 1260 1500 |

```c
/**
 * C program to multiply two matrix using pointers
 */

#include <stdio.h>

#define ROW 3
#define COL 3


/* Function declarations */
void matrixInput(int mat[][COL]);
void matrixPrint(int mat[][COL]);
void matrixMultiply(int mat1[][COL], int mat2[][COL], int res[][COL]);



int main()
{
    int mat1[ROW][COL];
    int mat2[ROW][COL];
    int product[ROW][COL];


    /*
     * Input elements in matrices.
     */
    printf("Enter elements in first matrix of size %dx%d\n", ROW, COL);
    matrixInput(mat1);

    printf("Enter elements in second matrix of size %dx%d\n", ROW, COL);
    matrixInput(mat2);


    // Call function to multiply both matrices
    matrixMultiply(mat1, mat2, product);


    // Print product of both matrix
    printf("Product of both matrices is : \n");
    matrixPrint(product);

    return 0;
}



/**
 * Function to input elements in matrix from user.
 *
 * @mat     Two-dimensional array to store user input.
 */
void matrixInput(int mat[][COL])
{
    int row, col;

    for (row = 0; row < ROW; row++)
    {
        for (col = 0; col < COL; col++)
        {
            scanf("%d", (*(mat + row) + col));
        }
    }
}




/**
 * Function to print elements in a two-dimensional array.
 *
 * @mat     Two-dimensional array to print.
 */
void matrixPrint(int mat[][COL])
{
    int row, col;

    for (row = 0; row < ROW; row++)
    {
        for (col = 0; col < COL; col++)
        {
            printf("%d ", *(*(mat + row) + col));
        }

        printf("\n");
    }
}




/**
 * Function to multiply two matrices.
 *
 * @mat1    First matrix
 * @mat2    Second matrix
 * @res     Resultant matrix to store product of both matrices.
 */
void matrixMultiply(int mat1[][COL], int mat2[][COL], int res[][COL])
{
    int row, col, i;
    int sum;


    for (row = 0; row < ROW; row++)
    {
        for (col = 0; col < COL; col++)
        {
            sum = 0;

            /*
             * Find sum of product of each elements of 
             * rows of first matrix and columns of second 
             * matrix.
             */
            for (i = 0; i < COL; i++)
            {
                sum += (*(*(mat1 + row) + i)) * (*(*(mat2 + i) + col));
            }


            /* 
             * Store sum of product of row of first matrix 
             * and column of second matrix to resultant matrix.
             */
            *(*(res + row) + col) = sum;
        }
    }
}
```

```
Enter elements in first matrix of size 3x3
10 20 30
40 50 60
70 80 90
Enter elements in second matrix of size 3x3
1 2 3
4 5 6
7 8 9
Product of both matrices is :
300 360 420
660 810 960
1020 1260 1500

```
---
# 12. Find length of string using pointers.

| ***Input:***                                         | ***Output:***        |
| ---------------------------------------------------- | -------------------- |
| Input string: I love programming. I love Codeforwin. | Length of string: 38 |

```c
/**
 * C program to find length of a string using for loop
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text[MAX_SIZE]; /* Declares a string of size 100 */
    int i;
    int count= 0;

    /* Input a string from user */
    printf("Enter any string: ");
    gets(text);

    /* Iterate till the last character of string */
    for(i=0; text[i]!='\0'; i++)
    {
        count++;
    }

    printf("Length of '%s' = %d", text, count);

    return 0;
}
```

OR,


```c
/**
 * C program to find length of a string using while loop
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text[MAX_SIZE]; /* Declares a string of size 100 */
    int index= 0;

    /* Input string from user */
    printf("Enter any string: ");
    gets(text);

    /* Iterate though last element of the string */
    while(text[index] != '\0')
    {
        index++;
    }

    printf("Length of '%s' = %d", text, index);

    return 0;
}
```

OR,

```c
/**
 * C program to find length of a string using pointer
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text[MAX_SIZE]; /* Declares a string of size 100 */
    char * str = text; /* Declare pointer that points to text */
    int count = 0;

    /* Input string from user */
    printf("Enter any string: ");
    gets(text);

    /* Iterate though last element of the string */
    while(*(str++) != '\0') count++;

    printf("Length of '%s' = %d", text, count);

    return 0;
}
```

OR,

```c
/**
 * C program to find length of a string using strlen() function
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum size of string

int main()
{
    char text[MAX_SIZE]; /* Declares a string of size 100 */
    int length;

    printf("Enter any string: ");
    gets(text);

    /* Call strlen() function to count length of string */
    length = strlen(text);

    printf("Length of '%s' = %d", text, length);

    return 0;
}

```

OR,


```c
/**
 * C program to find length of a string using pointer
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text[MAX_SIZE]; /* Declares a string of size 100 */
    char * str = text; /* Declare pointer that points to text */
    int count = 0;

    /* Input string from user */
    printf("Enter any string: ");
    gets(text);

    /* Iterate though last element of the string */
    while(*(str++)) count++;

    printf("Length of '%s' = %d", text, count);

    return 0;
}
```

```
Enter any string: I love programming. I love Codeforwin.
Length of 'I love programming. I love Codeforwin.' = 38

```
---
# 13. Copy one string to another using pointers.

| ***Input:***                     | ***Output:***                                                            |
| -------------------------------- | ------------------------------------------------------------------------ |
| Input string: I love Codeforwin! | Original string: I love Codeforwin!<br>Copied string: I love Codeforwin! |

```c
/**
 * C program to copy one string to another string without using strcpy()
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text1[MAX_SIZE];
    char text2[MAX_SIZE];
    int i;
    
    /* Input string from user */
    printf("Enter any string: ");
    gets(text1);
    
    /* Copy text1 to text2 character by character */
    for(i=0; text1[i]!='\0'; i++)
    {
        text2[i] = text1[i];
    }

    //Makes sure that the string is NULL terminated
    text2[i] = '\0';

    printf("First string = %s\n", text1);
    printf("Second string = %s\n", text2);
    printf("Total characters copied = %d\n", i);

    return 0;
}
```

OR,

```c
/**
 * C program to copy one string to another string using while loop
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text1[MAX_SIZE];
    char text2[MAX_SIZE];
    int i;
    
    /* Input string from user */
    printf("Enter any string: ");
    gets(text1);
    
    /* Copy text1 to text2 character by character */
    i=0;
    while(text1[i] != '\0')
    {
        text2[i] = text1[i];
        i++;
    }

    //Makes sure that the string is NULL terminated
    text2[i] = '\0';

    printf("First string = %s\n", text1);
    printf("Second string = %s\n", text2);
    printf("Total characters copied = %d\n", i);

    return 0;
}
```

OR,

```c
/**
 * C program to copy one string to another string using while loop
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text1[MAX_SIZE];
    char text2[MAX_SIZE];
    int i;
    
    /* Input string from user */
    printf("Enter any string: ");
    gets(text1);
    
    /* Copy text1 to text2 character by character */
    i=0;
    while(text1[i] != '\0')
    {
        text2[i] = text1[i];
        i++;
    }

    //Makes sure that the string is NULL terminated
    text2[i] = '\0';

    printf("First string = %s\n", text1);
    printf("Second string = %s\n", text2);
    printf("Total characters copied = %d\n", i);

    return 0;
}
```

OR,

```c
/**
 * C program to copy one string to another string using pointer
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char text1[MAX_SIZE], text2[MAX_SIZE];
    char * str1 = text1;
    char * str2 = text2; 
    
    /* Input string from user */
    printf("Enter any string: ");
    gets(text1);
    
    /* Copy text1 to text2 character by character */
    while(*(str2++) = *(str1++));

    printf("First string = %s\n", text1);
    printf("Second string = %s\n", text2);

    return 0;
}
```

OR,

```c
/**
 * C program to copy one string to another string using strcpy()
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum size of string

int main()
{
    char text1[MAX_SIZE], text2[MAX_SIZE];

    /* Input original string from user */
    printf("Enter any string: ");
    gets(text1);

    /* Copy text1 to text2 using strcpy() */
    strcpy(text2, text1);

    printf("First string = %s\n", text1);
    printf("Second string = %s\n", text2);

    return 0;
}
```

```
Enter any string: I love Codeforwin!
First string = I love Codeforwin!
Second string = I love Codeforwin!
Total characters copied = 10

```
---
# 14. Concatenate two strings using pointers.

| ***Input:***                                       | ***Output:***                          |
| -------------------------------------------------- | -------------------------------------- |
| Input string1: I love<br>Input string2: Codeforwin | Concatenated string: I love Codeforwin |

```c
/**
 * C program to concatenate two strings 
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    int i, j;


    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);


    /* Move till the end of str1 */
    i=0;
    while(str1[i] != '\0')
    {
        i++;
    }

    /* Copy str2 to str1 */
    j = 0;
    while(str2[j] != '\0')
    {
        str1[i] = str2[j];
        i++;
        j++;
    }

    // Make sure that str1 is NULL terminated
    str1[i] = '\0';

    printf("Concatenated string = %s", str1);

    return 0;
}
```

OR,

```c
/**
 * C program to concatenate two strings 
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    int i, j;

    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);

    /* Move till the end of str1 */
    i=-1;
    while(str1[++i]);

    /* Copy str2 to str1 */
    j = 0;
    while(str1[i++] = str2[j++]);

    printf("Concatenated string = %s", str1);

    return 0;
}
```

OR,

```c
/**
 * C program to concatenate two strings using pointer
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    char * s1 = str1;
    char * s2 = str2;

    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);

    /* Move till the end of str1 */
    while(*(++s1));

    /* Copy str2 to str1 */
    while(*(s1++) = *(s2++));

    printf("Concatenated string = %s", str1);

    return 0;
}
```

OR, 

```c
/**
 * C program to concatenate two strings using strcat()
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum size of the string

int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];

    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);

    /* Concatenate str1 with str2 */
    strcat(str1, str2);

    printf("Concatenated string = %s", str1);

    return 0;
}
```

```
Enter first string: I love 
Enter second string: Codeforwin
Concatenated string = I love Codeforwin

```

---
# 15. Compare two strings using pointers.

| ***Input:***                                                               | ***Output:***                           |
| -------------------------------------------------------------------------- | --------------------------------------- |
| Input string1: Learn at Codeforwin.<br>Input string2: Learn at Codeforwin. | Both strings are lexographically equal. |

```c
/**
 * C program to compare two string without using string library functions
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Compare function declaration */
int compare(char * str1, char * str2);


int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    int res;

    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);


    /* Call the compare function to compare strings */
    res = compare(str1, str2);

    if(res == 0)
    {
        printf("Both strings are equal.");
    }
    else if(res < 0)
    {
        printf("First string is lexicographically smaller than second.");
    }
    else
    {
        printf("First string is lexicographically greater than second.");
    }

    return 0;
}


/**
 * Compares two strings lexicographically. 
 * Returns 0 if both strings are equal, 
 *         negative if first string is smaller
 *         otherwise returns a positive value
 */
int compare(char * str1, char * str2)
{
    int i = 0;

    /* Iterate till both strings are equal */
    while(str1[i] == str2[i])
    {
        if(str1[i] == '\0' && str2[i] == '\0')
            break;

        i++;
    }

    // Return the difference of current characters.
    return str1[i] - str2[i];
}
```

OR,

```c
/**
 * C program to compare two string without using string library functions
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

/* Compare function declaration */
int compare(char * str1, char * str2);


int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    int res;

    /* Input two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);


    /* Call the compare function to compare strings */
    res = compare(str1, str2);

    if(res == 0)
    {
        printf("Both strings are equal.");
    }
    else if(res < 0)
    {
        printf("First string is lexicographically smaller than second.");
    }
    else
    {
        printf("First string is lexicographically greater than second.");
    }

    return 0;
}


/**
 * Compares two strings lexicographically. 
 */
int compare(char * str1, char * str2)
{
    while((*str1 && *str2) && (*str1 == *str2)) { str1++; str2++; }

    return *str1 - *str2;
}
```

OR,

```c
/**
 * C program to compare two string using strcmp() function
 */

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str1[MAX_SIZE], str2[MAX_SIZE];
    int res;

    /* Reads two strings from user */
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);


    /* Call strcmp() to compare both strings and stores result in res */
    res = strcmp(str1, str2);

    if(res == 0)
    {
        printf("Both strings are equal.");
    }
    else if(res == -1)
    {
        printf("First string is lexicographically smaller than second.");
    }
    else
    {
        printf("First string is lexicographically greater than second.");
    }

    return 0;
}
```

```
Enter first string: Learn at CODEFORWIN.
Enter second string: Learn at Codeforwin.
First string is lexicographically smaller than second.

```
---
# 16. Find reverse of a string using pointers.

| ***Input:***            | ***Output:***         |
| ----------------------- | --------------------- |
| Enter any string: Hello | Reverse string: olleH |

```c
/**
 * C program to find reverse of a string
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE], reverse[MAX_SIZE];
    int i, strIndex, revIndex, len;

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    /* Find length of string */
    i = 0;
    while(str[i] != '\0') i++;

    len = i;

    /* 
     * Store each character from end of original string 
     * to reverse string
     */
    revIndex = 0;
    strIndex = len - 1;
    while(strIndex >= 0)
    {
        reverse[revIndex] = str[strIndex];

        strIndex--;
        revIndex++;
    }
    reverse[revIndex] = '\0';

    printf("\nOriginal string = %s\n", str);
    printf("Reverse string = %s", reverse);

    return 0;
}
```

OR, 

```c
/**
 * C program to find reverse of a string using pointers
 */

#include <stdio.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE], reverse[MAX_SIZE];
    char *s = str;
    char *r = reverse;
    int len = 0;

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    /* Find length of string */
    while(*(s++)) len++;

    /* 
     * Store each character from end of original string 
     * to reverse string
     */
    s--;
    while(len >= 0)
    {
        *(r++) = *(--s);
        len--;
    }
    *r = '\0';

    printf("\nOriginal string = %s\n", str);
    printf("Reverse string = %s", reverse);

    return 0;
}
```

OR, 

```c
/**
 * C program to find reverse of a string using strrev() function
 */
#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    printf("Original string = %s\n", str);

    /* Find the reverse of string */
    strrev(str);

    printf("Reverse string = %s", str);

    return 0;
}
```

```
Enter any string: Codeforwin

Original string = Codeforwin
Reverse string = niwrofedoC

```
---
# 17. Sort array using pointers.

| ***Input:***                                      | ***Output:***                                                                                                                       |
| ------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| Input array elements: 10 -1 0 4 2 100 15 20 24 -5 | Array in ascending order: -5, -1, 0, 2, 4, 10, 15, 20, 24, 100,<br>Array in descending order: 100, 24, 20, 15, 10, 4, 2, 0, -1, -5, |

```c
#include <stdio.h>
#define MAX_SIZE 100


/* Function declaration */
void inputArray(int * arr, int size);
void printArray(int * arr, int size);

/* Sort function declaration */
int sortAscending(int * num1, int * num2);
int sortDescending(int * num1, int * num2);

void sort(int * arr, int size, int (* compare)(int *, int *));



int main()
{
    int arr[MAX_SIZE];
    int size;

    /*
     * Input array size and elements.
     */
    printf("Enter array size: ");
    scanf("%d", &size);
    printf("Enter elements in array: ");
    inputArray(arr, size);


    printf("\n\nElements before sorting: ");
    printArray(arr, size);


    // Sort and print sorted array in ascending order.
    printf("\n\nArray in ascending order: ");
    sort(arr, size, sortAscending);
    printArray(arr, size);


    // Sort and print sorted array in descending order.
    printf("\nArray in descending order: ");
    sort(arr, size, sortDescending);
    printArray(arr, size);

    
    return 0;
}



/**
 * Function to take input in array elements.
 * 
 * @arr     Array to store input.
 * @size    Size of the array.
 */
void inputArray(int * arr, int size)
{
    // Pointer to last element of array
    int * arrEnd = (arr + size - 1);


    // (arr++) Input in current array element and move to next element.
    // Till last array element (arr <= arrEnd)
    while(arr <= arrEnd)
        scanf("%d", arr++);
}




/**
 * Function to print all array elements.
 * 
 * @arr     Array to print.
 * @size    Size of the array.
 */
void printArray(int * arr, int size)
{
    // Pointer to last element of array
    int * arrEnd = (arr + size - 1);


    // *(arr++) Print current array element and move to next element.
    // Till last array element (arr <= arrEnd)
    while(arr <= arrEnd)
        printf("%d, ", *(arr++));
}



/**
 * Function to compare two succesive elements.
 * The function returns difference of first and second integer.
 * 
 * @num1    First integer to compare.
 * @num2    Second integer to compare.
 *
 * @return  Difference of num1 and num2.
 */
int sortAscending(int * num1, int * num2)
{
    return (*num1) - (*num2);
}



/**
 * Function to compare two successive elements. 
 * The function returns difference of second and first parameter.
 *
 * @num1    First integer to compare.
 * @num2    Second integer to compare.
 *
 * @return  Difference of num2 and num1.  
 */
int sortDescending(int * num1, int * num2)
{
    return (*num2) - (*num1);
}



/**
 * Function to sort an array in ascending or descending order.
 * This function is used to sort array in both order ascending or
 * descending.
 *
 * @arr     Array to sort.
 * @size    Size of the array.
 * @compare Function pointer returning integer and takes two int * 
 *          parameter. The function is called to get arrangement of
 *          two successive array elements.
 */
void sort(int * arr, int size, int (* compare)(int *, int *))
{
    // Pointer to last array element
    int * arrEnd  = (arr + size - 1);

    // Pointer to current array element
    int * curElem = arr;
    int * elemToSort;


    // Iterate over each array element
    while(curElem <= arrEnd)
    {
        elemToSort = curElem;


        // Compare each successive elements with current element
        // for proper order.
        while(elemToSort <= arrEnd)
        {
            /*
             * Compare if elements are arranged in order 
             * or not. If elements are not arranged in order
             * then swap them.
             */
            if(compare(curElem, elemToSort) > 0)
            {
                *curElem    ^= *elemToSort;
                *elemToSort ^= *curElem;
                *curElem    ^= *elemToSort;
            }

            elemToSort++;
        }

        // Move current element to next element in array.
        curElem++;
    }
}
```

```
Enter array size: 10
Enter elements in array: 10 -1 0 4 2 100 15 20 24 -5


Elements before sorting: 10, -1, 0, 4, 2, 100, 15, 20, 24, -5,

Array in ascending order: -5, -1, 0, 2, 4, 10, 15, 20, 24, 100,
Array in descending order: 100, 24, 20, 15, 10, 4, 2, 0, -1, -5,

```
---
# 18. Return multiple value from function using pointers.

| ***Input:*** | ***Output:***                                           |
| ------------ | ------------------------------------------------------- |
| NA           | First 10 even numbers are:<br>2 4 6 8 10 12 14 16 18 20 |


```c
/**
 * C program to return multiple value from a function using array.
 */

#include <stdio.h>

#define SIZE 10

/* Function declaration */
int * getNEvenNumbers(const int N, int * numbers);


int main()
{
    int evenNumbers[SIZE];
    int i;

    // Call function to get first 10 even numbers
    getNEvenNumbers(SIZE, evenNumbers);

    // Print all numbers
    printf("First %d even numbers are: \n", SIZE);
    for (i = 0; i < SIZE; i++)
    {
        printf("%d ", *(evenNumbers + i));
    }

    
    return 0;
}



/**
 * Function to get N even numbers.
 */
int * getNEvenNumbers(const int N, int * numbers)
{
    int i;

    for (i = 0; i < N; i++)
    {
        // Calculate and store even number in numbers
        *(numbers + i) = 2 * (i + 1);
    }

    return numbers;
}
```

OR, 

```c
/**
 * C program to return multiple value from a function using structure.
 */

#include <stdio.h>

#define MAX_SIZE 10

typedef struct MinMax
{
    int min;
    int max;
}MinMax;


/* Function declaration */
MinMax getMinMax(int * array, const int SIZE);


int main()
{
    int array[MAX_SIZE];
    int N, i;

    MinMax arrayMinMax;


    printf("Enter size of array: ");
    scanf("%d", &N);

    printf("Enter %d elements in array: ", N);
    for (i = 0; i < N; i++)
    {
        scanf("%d", (array + i));
    }


    arrayMinMax = getMinMax(array, N);


    printf("Minimum value in array : %d \n", arrayMinMax.min);
    printf("Maximum value in array : %d \n", arrayMinMax.max);

    
    return 0;
}



/**
 * Function to find minimum and maximum value in array.
 *
 * @returns     The function returns a struct object containing
 *              minimum and maximum value in array.
 */
MinMax getMinMax(int * numbers, const int SIZE)
{
    int i;
    int min = *(numbers + 0);
    int max = *(numbers + 0);

    MinMax arrayMinMax;


    // Find minmum and maximum value
    for (i = 0; i < SIZE; i++)
    {
        if(*(numbers + i) < min)
            min = *(numbers + i);

        if(*(numbers + i) > max)
            max = *(numbers + i);
    }


    // Copy minimum and maximum vaue to return object.
    arrayMinMax.min = min;
    arrayMinMax.max = max;


    return arrayMinMax;
}
```

```
Enter size of array: 5
Enter 5 elements in array: 1 -2 3 -1 9
Minimum value in array : -2
Maximum value in array : 9

```

OR,

```c
/**
 * C program to return multiple value from function using pointers
 */

#include <stdio.h>

#define MAX_SIZE 100

/* Function declaration */
void getMinMax(int * numbers, int size, int * min, int * max);


int main()
{
    int arr[MAX_SIZE], size, i;

    int min, max;


    /*
     * Input size and elements in array
     */
    printf("Enter size of array: ");
    scanf("%d", &size);

    printf("Enter %d elements in array: ", size);
    for (i = 0; i < size; i++)
    {
        scanf("%d", (arr + i));
    }


    // Call min max function to get minimum and maximum value.
    getMinMax(arr, size, &min, &max);


    printf("Minimum element in array: %d\n", min);
    printf("Maximum element in array: %d\n", max);


    return 0;
}


/**
 * Function to get minimum and maximum element in array.
 *
 * @numbers   Array in which we need to find max and min.
 * @size      Size of the array.
 * @min       Pointer to integer where minimum element is to be stored.
 * @max       Pointer to integer where maximum element is to be stored.
 */
void getMinMax(int * numbers, int size, int * min, int * max)
{
    int i;

    *min = *(numbers + 0);
    *max = *(numbers + 0); 

    for (i = 0; i < size; i++)
    {
        // Check minimum number
        if(*(numbers + i) < *(min))
            *min = *(numbers + i);

        // Check maximum number
        if(*(numbers + i) > *(max))
            *max = *(numbers + i);
    }
}
```

```
Enter size of array: 10
Enter 10 elements in array: -1 0 100 4 9 18 94 -35 10 20
Minimum element in array: -35
Maximum element in array: 100

```
---
# 🟢 STRUCTURES

---







---
# 🟢 FILE HANDLING

---







---
# 🟢 

---







---
# 🟢 

---







---
# 🟢 

---







