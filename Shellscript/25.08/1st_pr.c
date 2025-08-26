#include<stdio.h>
#include<unistd.h>

int main(void){
    int p=5,id=fork();
    if(id<0){
        printf("fork failed");
    }else if(id==0){
        p++;
        printf("Child process: p=%d\n",p);
        printf("Child process: PID is %d\n", getpid());
        printf("Parent process: PPID is %d\n", getppid());
        sleep(1000);
    }else{
        
        printf("Parent process: p=%d\n",p);
        printf("Child process: PID is %d\n", getpid());
        printf("Parent process: PPID is %d\n", getppid());
        printf("Parent process Terminated\n");
    }
}