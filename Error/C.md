1. floating point exception (core dumped)  
: 나누기를 할 때 변수/0이 있으면 발생 (0으로 나누면 안된다)  

2. garbage value를 가진 변수로는 연산을 할 수 없다.  
```
int s;
int n;
n = n + scanf("Score = ", &s);
```
이 연산을 할 때, n은 0이 아니라 garbage value를 가지고 있으므로 연산 자체가 안된다. 따라서 처음 변수 선언시 int n = 0; 이라고 값을 할당해줘야 한다.   

3. redefinition of 'i' error in for loop  
`for (int i=0, i<n, i++)`  
이따구로 인자를 콤마(,)로 나눴을 때 발생  
`for (int i=0; i<n; i++)`  
로 고쳐야 함. 정신차리자ㅋㅋ
