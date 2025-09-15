/******************************************************************************
 * !Title: Round Robin CPU Scheduling Algorithm Implementation
 * Description: This program implements the Round Robin scheduling algorithm
 *              with the following features:
 *              - Process scheduling based on time quantum
 *              - Calculates Completion Time (CT), Turnaround Time (TAT), 
 *                and Waiting Time (WT) for each process
 *              - Supports dynamic arrival times
 *              - Displays average TAT and WT
 ******************************************************************************/

#include<stdio.h>

struct Process{
    int id;
    int at;
    int bt;
    int ct;
    int tat;
    int wt;
    int rt;
};

int main (){
    int n ,tq,time=0,completed=0;
    printf("Enter number of processes: ");
    scanf("%d",&n);
    struct Process p[n];
    for(int i=0;i<n;i++){
        p[i].id=i+1;
        printf("Enter arrival time and burst time for each process ");
        for(int i=0;i<n;i++){
            p[i].id=i+1;
            printf("P%d AT BT: ", i + 1);
            scanf("%d %d", &p[i].at, &p[i].bt);
            p[i].rt = p[i].bt; 
        }
        printf("Enter time quantum: ");
        scanf("%d",&tq);

        int queue[100], front=0, rear=0, visited[n];
        for(int i=0;i<n;i++) visited[i]=0;

        for(int i=0;i<n;i++){
            if(p[i].at<=time && visited[i]==0){
                queue[rear++]=i;;
                visited[i]=1;
            }
        }
        while(completed < n){
            if(front==rear){
                time++;
                for(int i=0;i<n;i++){
                    if(p[i].at<=time && visited[i]==0){
                        queue[rear++]=i;
                        visited[i]=1;
                    }
                }
                continue;
            }
            int idx=queue[front++];
            if(p[idx].rt>tq){
                p[idx].rt-=tq;
                time+=tq;
            }else{
                time+=p[idx].rt;
                p[idx].rt=0;
                completed++;
                p[idx].ct=time;
                p[idx].tat=p[idx].ct - p[idx].at;
                p[idx].wt=p[idx].tat - p[idx].bt;
            }
            for(int i=0;i<n;i++){
                if(p[i].at<=time && visited[i]==0){
                    queue[rear++]=i;
                    visited[i]=1;
                }
            }
            if(p[idx].rt>0){
                queue[rear++]=idx;
            }
        }
        
        float avgTAT=0, avgWT=0;
        printf("P#\tAT\tBT\tCT\tTAT\tWT\n");
        for(int i=0;i<n;i++){   
            avgTAT+=p[i].tat;
            avgWT+=p[i].wt;
            printf("P%d\t%d\t%d\t%d\t%d\t%d\n",p[i].id,p[i].at,p[i].bt,p[i].ct,p[i].tat,p[i].wt);
        }
        avgTAT/=n;
        avgWT/=n;
        printf("Average Turnaround Time: %.2f\n", avgTAT);
        printf("Average Waiting Time: %.2f\n", avgWT);  
    }
}