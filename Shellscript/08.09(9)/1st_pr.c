/*
 ! CPU Scheduling - Shortest Job First (SJF) Algorithm
 * This program implements SJF scheduling and calculates:
 * - Waiting time for each process
 * - Turnaround time for each process
 * - Average waiting time
 * - Average turnaround time
 */

#include <stdio.h>
int t1, t2, tmp, i, j, pos, n;
int bt[20], wt[20], tat[20], at[20], p[20];
float awt = 0, atat = 0;
void main()
{
    // Initialize arrays
    for (i = 0; i < 20; i++) // Using 20 as array size
    {
        bt[i] = 0;
        wt[i] = 0;
        tat[i] = 0;
        at[i] = 0;
        p[i] = 0;
    }

    // Reset total counters
    t1 = 0;
    t2 = 0;
    printf("Enter Number of Processes: ");
    scanf("%d", &n);
    printf("Enter Burst Time and Arrival Time:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d%d", &bt[i], &at[i]);
        p[i] = i + 1;
    }
    for (i = 0; i < n; i++)
    {
        pos = i;
        for (j = i + 1; j < n; j++)
            if (bt[j] < bt[pos])
                pos = j;
        tmp = bt[i];
        bt[i] = bt[pos];
        bt[pos] = tmp;
        tmp = p[i];
        p[i] = p[pos];
        p[pos] = tmp;
    }
    // Calculate waiting time
    wt[0] = 0; // First process has 0 waiting time
    for (i = 1; i < n; i++)
    {
        wt[i] = 0;
        for (j = 0; j < i; j++)
        {
            wt[i] += bt[j]; // Sum of all previous burst times
        }
        t1 += wt[i];
    }

    // Calculate turnaround time and total
    for (i = 0; i < n; i++)
    {
        tat[i] = bt[i] + wt[i];
        t2 += tat[i];
    }
    awt = t1 / n;
    atat = t2 / n;
    printf("\nProcess\tBurst Time\tArrival Time\tWaiting Time\tTurnaround Time\n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t%d\t\t%d\t\t%d\t\t%d\n", p[i], bt[i], at[i], wt[i], tat[i]);
    }
    printf("\nAverage Waiting Time: %.2f\n", awt);
    printf("Average Turnaround Time: %.2f\n", atat);
}



