#include <stdio.h>
#include <stdlib.h>

int main()
{

    int *arr = (int *)malloc(5 * (sizeof(int)));
    if (arr == NULL)
    {
        printf("Memory all0cation is failed!\n");
        return -1;
    }
    else
    {
        printf("Enter the elements to array:\n");
        for (int i = 0; i < 5; i++)
        {
            scanf("%d", &arr[i]);
        }
    }
    int a = sizeof(arr);
    int b = sizeof((arr[0]));
    printf("Size of the array is %d\n", a);
    printf("Size of the array element is %d\n", b);
    int size = sizeof(arr) / sizeof((arr[0]));
    printf("Size of the array is %d", size);
}