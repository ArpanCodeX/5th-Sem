#include<stdio.h>
#include<unistd.h>

int main(){
    int producer, consumer, buffer[3],buffer_size=3,in,out,choice=0;
    in=0;
    out=0;
    while(choice!=3){
        printf("<====================================>");
        printf("\n1.Producer\n2.Consumer\n3.Exit\n");
        printf("Enter your choice: ");
        scanf("%d",&choice); 
        switch(choice){
            case 1:
                if((in+1)%buffer_size==out){
                    printf("Buffer is full\n");
                }else {
                    printf("Enter the value of Producer: ");
                    scanf("%d",&producer);
                    buffer[in]=producer;
                    in=(in+1)%buffer_size;
                }
                break;
            case 2:
                if(in==out)
                    printf("Buffer is Empty");
                else{
                    consumer=buffer[out];
                    printf("The element is: %d\n", consumer);
                    out=(out+1)%buffer_size;
                }
                break;
    
        }
    }
    return 0;
}
