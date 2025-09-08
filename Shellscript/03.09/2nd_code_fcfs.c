//^ wap to illustrate fcfs scheduling with same arrival times

#include <stdio.h>
int n, i, FT = 0, bT[20], wT[20], tAT[20], aT[20], fT[20];
float avwt = 0, avtat = 0;
void main()
{
    for (i = 0; i < 10; i++)
    {
        bT[i] = 0;
        wT[i] = 0;
        tAT[i] = 0;
        aT[i] = 0;
        fT[i] = 0;
    }
    printf("Enter Number of Processes: ");
    scanf("%d", &n);
    printf("Enter Burst Time and Arrival Time:\n");
    for (i = 0; i < n; i++)
        scanf("%d%d", &bT[i], &aT[i]);
    wT[0] = bT[0];
    for (i = 0; i < n; i++)
    {
        fT[i] += bT[i] + FT;
        FT = fT[i];
    }
    for (i = 0; i < n; i++)
    {
        tAT[i] = fT[i] - aT[i];
        wT[i] = tAT[i] - bT[i];
        avwt += wT[i];
        avtat += tAT[i];
    }
    avwt = avwt / n;
    avtat = avtat / n;
    for (i = 0; i < n; i++)
        printf("Burst Time:%d\tWaiting Time:%d\tTurnaround Time:%d\n", bT[i], wT[i], tAT[i]);
    printf("\nAverage Waiting Time:%f\n", avwt);
    printf("\nAverage Turnaround Time:%f\n", avtat);
}