/* : Switch to a safer alternative like fgets , which restricts the number
 of characters read into the buffer and prevents overflows.*/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    char *input = (char *)malloc(10 * sizeof(char));
    fgets(input, sizeof(input), stdin);
    input[strlen(input) - 1] = '\0';
    printf("Input is %s\n", input);
}