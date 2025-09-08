//^  1. wap to illustrate fcfs scheduling with different arrival times

#include <stdio.h>
int i, n, sum = 0, bT[20], wT[20], tAt[20], aT[20], fT[20];
float avwt, avtat;
void main()
{
    for (i = 0; i < 10; i++)
    {
        bT[i] = 0;
        wT[i] = 0;
        tAt[i] = 0;
        aT[i] = 0;
        fT[i] = 0;
    }
    printf("Enter number of process:");
    scanf("%d", &n);
    printf("Enter the Burst Time and Arrival Time:\n");
    for (i = 0; i < n; i++)
        scanf("%d%d", &bT[i], &aT[i]);
    wT[0] = bT[0];
    for (i = 0; i < n; i++)
    {
        sum += bT[i];
        fT[i] = sum;
    }
    for (i = 0; i < n; i++)
    {
        tAt[i] = fT[i] - aT[i];
        wT[i] = tAt[i] - bT[i];
        avwt += wT[i];
        avtat += tAt[i];
    }
    avwt /= n;
    avtat /= n;
    for (i = 0; i < n; i++)
    {
        printf("Burst Time:%d\tArrival Time:%d\tWaiting Time:%d\tTurnAround Time:%d\n", bT[i], aT[i], wT[i], tAt[i]);
    }
    printf("\nAverage Waiting Time:%f\n", avwt);
    printf("Average TurnAround Time:%f\n\n", avtat);
}