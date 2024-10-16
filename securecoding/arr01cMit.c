#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 5

int main()
{
    int arr[MAX_SIZE];
    printf("Enter the elements to the array:\n");

    for (int i = 0; i < MAX_SIZE; i++)
    {
        scanf("%d", &arr[i]);
    }

    int a = sizeof(arr);
    int b = sizeof(arr[0]);
    int size = sizeof(arr) / sizeof(arr[0]);
    printf("Size of the array is %d\n", size);
    printf("Size of the element in array is %d\n", b);
    printf("Size of the array(type-2) is %d\n", a);
}