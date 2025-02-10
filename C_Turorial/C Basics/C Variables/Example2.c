#include <stdio.h>

int main() {
  
    // Creating a variable to store age
    // of a student
    int age = 25;
  
    // Updating the age
    age = 18;

    printf("Age: %d\n", age);
      
    // Creating variables to store grades
    // in different subjects
    char math, physics, chemistry, arts, sports;
    math = 'A';
    physics = 'A';
    chemistry = 'B';
    arts = 'C';
    sports = 'C';
    
    printf("---Grades----\n");
    printf("Mathematics: %c\n", math);
    printf("Physics: %c\n", physics);
    printf("Chemistry: %c\n", chemistry);
    printf("Arts: %c\n", arts);
    printf("Sports: %c", sports);
    return 0;
}
