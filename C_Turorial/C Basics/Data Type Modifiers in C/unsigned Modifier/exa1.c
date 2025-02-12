#include <stdio.h>
int main() {
  
    // Maximum value for unsigned int (32-bit system)
    unsigned int n1 = 4294967296;          
  
    // Larger value stored in unsigned long int
    unsigned long int n2 = 4294967296;     

    printf("Unsigned int (n1): %u\n", n1); 
    printf("Unsigned long int (n2): %lu\n", n2);
    return 0;
}
