#include <stdio.h>
int total_1, total_2, temp, i, j, pos, n;
int burstTime[20], waitTime[20], turnAroundTime[20], arrivalTime[20], process[20];
float avwt = 0, avtat = 0;
void main()
{
    // Initialize arrays
    for (i = 0; i < 20; i++)  // Using 20 as array size
    {
        burstTime[i] = 0;
        waitTime[i] = 0;
        turnAroundTime[i] = 0;
        arrivalTime[i] = 0;
        process[i] = 0;
    }
    
    // Reset total counters
    total_1 = 0;
    total_2 = 0;
    printf("Enter Number of Processes: ");
    scanf("%d", &n);
    printf("Enter Burst Time and Arrival Time:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d%d", &burstTime[i], &arrivalTime[i]);
        process[i] = i + 1;
    }
    for (i = 0; i < n; i++)
    {
        pos = i;
        for (j = i + 1; j < n; j++)
            if (burstTime[j] < burstTime[pos])
                pos = j;
        temp = burstTime[i];
        burstTime[i] = burstTime[pos];
        burstTime[pos] = temp;
        temp = process[i];
        process[i] = process[pos];
        process[pos] = temp;
    }
    // Calculate waiting time
    waitTime[0] = 0;  // First process has 0 waiting time
    for (i = 1; i < n; i++)
    {
        waitTime[i] = 0;
        for (j = 0; j < i; j++)
        {
            waitTime[i] += burstTime[j];  // Sum of all previous burst times
        }
        total_1 += waitTime[i];
    }

    // Calculate turnaround time and total
    for (i = 0; i < n; i++)
    {
        turnAroundTime[i] = burstTime[i] + waitTime[i];
        total_2 += turnAroundTime[i];
    }
    avwt = total_1 / n;
    avtat = total_2 / n;
    printf("\nProcess\tBurst Time\tArrival Time\tWaiting Time\tTurnaround Time\n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t%d\t\t%d\t\t%d\t\t%d\n", process[i], burstTime[i], arrivalTime[i], waitTime[i], turnAroundTime[i]);
    }
    printf("\nAverage Waiting Time: %.2f\n", avwt);
    printf("Average Turnaround Time: %.2f\n", avtat);
}