/*Vulnerable Code Explanation: Using deprecated functions
 like gets allows users to input more characters than the buffer can hold, leading 
 to buffer overflows. This makes it vulnerable to attacks such as stack smashing*/

#include <stdio.h>
#include <stdlib.h>

int main(){
    char *input = (char*)malloc(10*sizeof(char));
    gets(input);
    printf("Input is %s\n", input);
}