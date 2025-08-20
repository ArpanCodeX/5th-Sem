#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int isPrime(int n) {
    if (n <= 1) return 0;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return 0;
    }
    return 1;
}

int main(void){
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    
    pid_t id=fork();
    
    if(id<0){
        printf("Parent process: %d\n", getpid());
        return 1;
    }
    if(id==0){
        if(id%2==0){
            printf("\neven");
        }else{
            printf("\nodd");
        }
    }else{
        wait(NULL);
        if(isPrime(num)){
            printf("\nPrime\n");
        }else{
            printf("\nNot prime\n");
        }
    }
}
