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
    strncpy(buffer, input, sizeof(buffer) - 1);
    buffer[sizeof(buffer) - 1] = '\0';
    printf("Buffer is %s\n", buffer);
}