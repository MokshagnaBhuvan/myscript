#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    char buffer[10];

    char *input = (char *)malloc(10 * sizeof(char));
    if (input == NULL)
    {
        printf("Memory allocation failed!\n");
    }
    input = "Mokshagna";
    strcpy(buffer, input);
    printf("Buffer is %s\n", buffer);
}