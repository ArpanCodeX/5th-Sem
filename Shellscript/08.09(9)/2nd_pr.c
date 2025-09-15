/******************************************************************************
 * ~Title: Preemptive Shortest Job First (PSJF) CPU Scheduling Algorithm
 * ~Description: This program implements the PSJF scheduling algorithm with:
 * ~             - Dynamic process selection based on remaining burst time
 *  ~            - Preemptive execution (can interrupt running processes)
 *              - Support for different arrival times
 *              - Calculates Waiting Time (WT) and Turnaround Time (TAT)
 *              - Displays per-process metrics and overall averages
 ******************************************************************************/

#include <stdio.h>
int total_1, total_2, temp, i, j, pos, n, time, remain;
int burstTime[20], waitTime[20], turnAroundTime[20], arrivalTime[20], process[20];
int remainingTime[20];
float avwt = 0, avtat = 0;
void main()
{
    for (i = 0; i < 20; i++)
    {
        burstTime[i] = 0;
        waitTime[i] = 0;
        turnAroundTime[i] = 0;
        arrivalTime[i] = 0;
        process[i] = 0;
        remainingTime[i] = 0;
    }
    printf("Enter Number of Processes: ");
    scanf("%d", &n);
    remain = n;
    printf("Enter Burst Time and Arrival Time:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d%d", &burstTime[i], &arrivalTime[i]);
        remainingTime[i] = burstTime[i];
        process[i] = i + 1;
    }

    time = 0;
    
    while (remain != 0)
    {
        int min = 999999;
        int shortest = -1;
        
        for (i = 0; i < n; i++)
        {
            if (arrivalTime[i] <= time && remainingTime[i] > 0 && remainingTime[i] < min)
            {
                min = remainingTime[i];
                shortest = i;
            }
        }

        if (shortest == -1)
        {
            time++;
            continue;
        }

        remainingTime[shortest]--;

        if (remainingTime[shortest] == 0)
        {
            remain--;
            turnAroundTime[shortest] = time + 1 - arrivalTime[shortest];
            waitTime[shortest] = turnAroundTime[shortest] - burstTime[shortest];
            
            total_1 += waitTime[shortest];
            total_2 += turnAroundTime[shortest];
        }
        time++;
    }

    avwt = (float)total_1 / n;
    avtat = (float)total_2 / n;

    printf("\nProcess\tBurst Time\tArrival Time\tWaiting Time\tTurnaround Time\n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t%d\t\t%d\t\t%d\t\t%d\n", process[i], burstTime[i], arrivalTime[i], waitTime[i], turnAroundTime[i]);
    }
    printf("\nAverage Waiting Time: %.2f\n", avwt);
    printf("Average Turnaround Time: %.2f\n", avtat);
}
