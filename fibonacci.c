#include<stdio.h>

int fibonacci(int n)
{
	if (n == 1 || n == 2)
	{
		return 1;
	}
	else
	{
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

} 
int main()
{
	int n = 0;
	int ret = 0;
	scanf("%d", &n);
	ret = fibonacci(n);
	printf("ret=%d", ret);
	return 0;
}
