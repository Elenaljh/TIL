## 1. ES6 자바스크립트 
### 1. 객체만들기
```js
let  name1  =  'noona';
let  age  =  17
let  person  = {name1, age}
```
이렇게 하면 알아서
```js
person = {
	name1 : 'noona',
	age : 17
}
```
변수 이름을 키값으로 해서 객체를 만들어줌.

### 2. 객체 분해하기
```js
let bts = {
  name : '방탄소년단',
  number : 7
}

let {name, number} = bts
// let name = bts.name
// let number = bts.number

console.log(name,number)
```
결과값
```js
방탄소년단 7
```
#### 갑자기 생각나서 쓰는것
- 변수 이름을 드래그한 다음 ctrl + D 누를때마다 코드 뒷부분에 있는 같은 변수들이 선택됨 -> 한꺼번에 변수 이름 바꿔야할 때 유용하다.  

### 3. 백틱으로 정적인 값과 동적인 값 동시에 쓰기
```js
let name = 'noona';
let age = 18;

console.log(`내 이름은 ${name}이고 나이는 ${age}살입니다.`);
```

### 4. 배열 안의 원소를 변수에 할당하기
#### 각 원소마다 서로 다른 변수 지정하기
```js
let array = [1,2,3];
let [a,b,c] = array;

console.log(a,b,c);
```
결과: `1 2 3`

#### 특정 원소에만 변수 지정하기
```js
let array = [1,2,3];
let [a,...rest] = array;

console.log(a,rest);
```
결과: `1 [2, 3]`
#### 객체버전
```js
let person = {
  name: "noona",
  age: 19,
  cute: true
}

let {name,...restInfo} = person

console.log(name, restInfo)
```
결과: `noona { age: 19, cute: true }`

#### 배열 붙이기
```js
let a = [1,2]
let b = [3,4]
let c = [5,6]

let result = [...a, ...b, ...c]
console.log(result)
```
결과: `[1, 2, 3, 4, 5, 6]`

### 5. 함수 선언
```js
// 기존
function foo(parameter) {
  console.log('hello')
}

// 새로운 방식
let foo = (parameter)=>{
  console.log('hello')
}
```
#### return
```js
// 기존
function foo() {
  return 'haha'
}

// 새로운 방식
let foo = ()=>'haha'
```
#### 새로운 함수문법의 한계
```js
let age = 17
let person = {
  name: 'frog',
  age: 20,
  getInfo: function(){
    console.log(age)
  }
}

person.getInfo()
```
결과: 변수인 `age=17`과 객체의 키값인 `age: 20`중 전자가 나옴 (`17`)    
그렇다면 객체 안의 키값은 어떻게 출력할 수 있을까? this를 사용한다.
```js 
let age = 17
let person = {
  name: 'frog',
  age: 20,
  getInfo: function(){
    console.log(this.age) //this: 함수를 부르는 객체. 
  }
}

person.getInfo() //person이 getInfo()를 불렀으니까 this = person이 된다. 
```
결과: `20`    
화살표함수에서는 `this`를 생성하지 못한다! 화살표 함수 안에서 쓴 this는 함수를 부른 객체(위 경우 person)가 아니라 Window(전체 코드가 작성되는 공간)가 된다. (window = global??)
결론: 프로그래밍 하다가 `this`써야하면 화살표 함수 쓰지 마라.

#### lexical scope (static scope)
5월 말까지 진도를 빨리 빼야하는 관계로..ㅜㅜㅜ 
[6월에는 이 동영상 보고 이해한 후 정리하기](https://www.youtube.com/watch?v=eWDXgsIgTGk&ab_channel=SteveGriffith-Prof3ssorSt3v3)

## 2. 과제
```js
// 객체 정의하기
let name = "noona's fruit store"
let fruits = ['banana', 'apple', 'mango']
let address = 'Seoul'

let store = {name, fruits, address}

// 정적인 값, 동적인 값 출력
console.log(`제 가게 이름은 ${name}입니다. 위치는 ${address}에 있습니다.`)

// destructuring
function calculate(obj) {
  let {a, b, c, ...rest} = obj;
  return a+b+c;
}

console.log(calculate({a:1,b:2,c:3}))

// expected result: { first: 1, third: 3, forth: 4 }
function getNumber() {
  let array = [1, 2, 3, 4, 5, 6]
  let [first,,third,forth] = array
  
  return {first, third, forth}
}
console.log(getNumber())

// 예상결과: true
function getCalendar(first, ...rest) {
  return (
    first === 'January' &&
    rest[0] === 'Febuary' &&
    rest[1] === 'March' &&
    rest[2] === undefined
  );
}

console.log(getCalendar('January','Febuary','March'));

// a, b의 원소중 최솟값 찾기 - 결과: 9
function getMinimum() {
  let a = [45, 23, 78]
  let b = [54, 11, 9]
  return Math.min(...a, ...b) //Math.min(배열 못들어감) -> 배열 넣으면 NaN 출력
}
console.log(getMinimum())

// 화살표함수
function sumNumber() {
  const sum = (a, b)=>a+b; //return을 생략할 수 있다.
  return sum(40, 10);
}
console.log(sumNumber())

// 화살표함수 2
function sumNumber2() {
  let addNumber = (a)=>(b)=>(c)=>a+b+c;
  return addNumber(1)(2)(3);
}

console.log(sumNumber2())
```
#### 참고
function으로 선언된 일반 함수들은 자바스크립트가 시작됨과 동시에 미리 메모리에 선언되어 기억되어진다(호이스팅개념) 따라서 함수를 선언전에 불러도 무관하다 즉,
```
return addNumber(1)(2)(3); // 순서상관없음
  function addNumber(a) {
    return function (b) {
      return function (c) {
        return a + b + c;
      };
    };
  }

```

이거나

```
 function addNumber(a) {
   return function (b) {
     return function (c) {
       return a + b + c;
     };
   };
 }
 return addNumber(1)(2)(3);// 순서상관없음

```

이거나 결과는 같고 에러도 나오지 않는다  
하지만 화살표 함수는 function으로 선언된것이 아니기 때문에 그렇지 않다.반드시 선언과 정의 후에 불러줘야한다  
따라서

```
return addNumber(1)(2)(3);
let addNumber=(a)=>(b)=> (c)=> a + b + c;


```

이렇게 작성을 할 경우 에러가 난다
