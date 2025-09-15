/*
 * Title: Dining Philosophers Problem Simulation
 * Description: A program to demonstrate the classic synchronization problem
 */

#include <stdio.h>
#include <stdlib.h>

int tph, philname[20], status[20], howhung, hu[20], cho;

void one()
{
    int i;
    printf("\nOne philosopher can eat at a time:\n");
    for (i = 0; i < howhung; i++)
    {
        int pos = hu[i];
        printf("\nPhilosopher %d is eating", philname[pos]);
        int left = (pos == 0) ? tph - 1 : pos - 1;
        int right = (pos + 1) % tph;
        printf("\nPhilosopher %d is waiting\n", philname[left]);
        printf("Philosopher %d is waiting\n", philname[right]);
        printf("Philosopher %d finishes eating\n", philname[pos]);
    }
}

// *Function to simulate two philosophers eating at a time (not adjacent)
void two()
{
    int i, j;
    printf("\nTwo philosophers can eat at a time:\n");
    int count = 0;
    for (i = 0; i < howhung; i++)
    {
        for (j = i + 1; j < howhung; j++)
        {
            int p1 = hu[i];
            int p2 = hu[j];
            if (abs(p1 - p2) != 1 && abs(p1 - p2) != tph - 1)
            {
                // !Not adjacent (circular table)
                printf("\nPhilosopher %d and Philosopher %d are eating", philname[p1], philname[p2]);
                count++;
            }
        }
    }
    if (count == 0)
    {
        printf("\nNo two non-adjacent hungry philosophers found.");
    }
}

int main()
{
    int i;
    printf("\n\nDINING PHILOSOPHER PROBLEM");
    printf("\nEnter the total number of philosophers: ");
    scanf("%d", &tph);

    for (i = 0; i < tph; i++)
    {
        philname[i] = i + 1;
        status[i] = 1; //~ thinking
    }

    printf("How many are hungry: ");
    scanf("%d", &howhung);

    if (howhung == tph)
    {
        printf("\nAll are hungry..\nDeadlock stage will occur");
        printf("\nExiting..");
        return 0;
    }
    else
    {
        for (i = 0; i < howhung; i++)
        {
            printf("Enter hungry philosopher %d position (0 to %d): ", (i + 1), tph - 1);
            scanf("%d", &hu[i]);
            if (hu[i] >= tph || hu[i] < 0)
            {
                printf("Invalid philosopher position.\n");
                return 1;
            }
            status[hu[i]] = 2; // &hungry
        }

        do
        {
            printf("\n<-------------Menu-------------->\n");
            printf("1. One can eat at a time\n");
            printf("2. Two can eat at a time\n");
            printf("3. Exit\n");
            printf("Enter your choice: ");
            scanf("%d", &cho);

            switch (cho)
            {
            case 1:
                one();
                break;
            case 2:
                two();
                break;
            case 3:
                exit(0);
            default:
                printf("Invalid option..\n");
            }
        } while (cho != 3);
    }

    return 0;
}