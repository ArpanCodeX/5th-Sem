#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main(void){
    int num1,num2;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    pid_t pid=fork();
    if(pid<0){
        printf("Fork failed\n");
        return 1;
    }
    if (pid==0){
        printf("Child Process %d\n",num1+num2);
    }else{
        wait(NULL);
    }
}