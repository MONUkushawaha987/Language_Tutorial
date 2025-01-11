// C program to demonstrate 
// const keyword
#include <stdio.h>

// Driver code
int main() {
  const int a = 11;
  //a = a + 2; it will produce error
  printf("%d", a);
  return 0;
}