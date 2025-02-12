#include <stdio.h>
int main(){
    
      // Defining variables with long
    int num;
    long int long_num;
    long long int long_long_num;

    double dub_num;
    long double long_dub_num;

    printf("num: %d", sizeof(num));
    printf("\nlong_num: %d", sizeof(long_num));
    printf("\nlong_long_num: %d",
           sizeof(long_long_num));
    printf("\ndub_num: %d", sizeof(dub_num));
    printf("\nlong_dub_num: %d",
           sizeof(long_dub_num));

    return 0;
}
