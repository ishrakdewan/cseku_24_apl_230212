#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;struct node *next;
};
void Print(struct node *x)
{
    int i=1;
    while(x!=NULL)
    {
    printf("Element %d : %d\n",i,x->data);
    x=x->next;i++;}
}

int main()
{
    struct node *head,*temp,*tail,*n1,*n2,*n3;
    n1=(struct node *)malloc(sizeof(struct node));
    n2=(struct node *)malloc(sizeof(struct node));
    n3=(struct node *)malloc(sizeof(struct node));
    n1->data=200;
    n2->data=300;
    n3->data=400;
    n1->next=n2;
    n2->next=n3;
    n3->next=NULL;temp=n1;
    int n;
    printf("Enter numbers of nodes : ");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        int num;
        printf("Enter %d Element : ",i+1);
        scanf("%d",&num);
        struct node *s=(struct node *)malloc(sizeof(struct node));
        s->data=num;
        s->next=NULL;
        if(i==0)
        {
        head=s; tail=s;
        }
        else{
            tail->next=s;tail=s; } }Print(head);
return 0;
}
