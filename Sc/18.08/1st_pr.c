#include <unistd.h>
#include <stdio.h>
int main(void){
    int id;
    id=fork();

    if(id<0){
        printf("fork failed");
    } else if(id==0) {
        printf("Child process: PID is %d\n", getpid());
    } else {
        printf("Parent process: PPID is %d, Child PID is %d\n", getppid(), id);
    }

}