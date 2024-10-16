#include <stdio.h>
#include <string.h>

int main()
{
    char *str = "Mokshagna";
    printf("String is %s\n", str);
    str[5] = 'a';
    printf("String is %s\n", str);
}