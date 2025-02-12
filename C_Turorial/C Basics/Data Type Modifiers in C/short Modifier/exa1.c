#include <stdio.h>
int main() {
    int a;
  
    // Modify the int using short
    short int b;

    printf("Size of int: %d\n", sizeof(a));  
    printf("Size of short int: %hd", sizeof(b));
    return 0;
}
