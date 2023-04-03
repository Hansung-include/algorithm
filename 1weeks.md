1weeks
=======
fivo
-----
int fivo(int n)
{
    if (n==1) return 0;
    else if (n==2) return 1;
    return fivo(n-1)+fivo(n-2);
}

GCD
------
#include <stdio.h>

/*뺄샘을 이용한 최대공약수*/
int get_gcd1(int u, int v) 
{
    int t;
    while(u){
        if(u < v){
            t=u; u=v; v=t;
        }
        u -= v;
    }
    return v;
}

/* 재귀함수를 이용한 최대공약수*/
Int get_gcd2(int u, int v) 
{
    if (v==0) return u;
    
    else return get_gcd(v, u%v);
}


int main()
{
    int u, v;

    printf("input u: ");
    scanf("%d", &u);
    printf("input v: ");
    scanf("%d", &v);

    printf("GCD of %d & %d: %d\n", u, v, get_gcd(u,v));

    return 0;
}
