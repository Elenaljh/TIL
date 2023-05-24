# 파이썬 100일 - 1~10일

1. 칸아카데미 의사난수생성기
https://ko.khanacademy.org/computing/computer-science/cryptography/crypt/v/random-vs-pseudorandom-number-generators

2. ASCII art

3. AskPython

4. 리스트 - 중첩리스트, 음수 인덱스(끝에서부터 거꾸로 세는거)
	- fruits = ["apple", "banana", "kiwi", "blueberry"]
	- fruits[-1] = "blueberry"
	- fruits[-2] = "kiwi"

5. range(): 범위 정하는 함수
	- range(시작값, 종료값, 증분)
	- 주의: 종료값은 포함하지 않는다. 

6. split(): 문자열을 나눠서 리스트를 만든다.
	- `문자열.split(sep='구분자', maxsplit=분할횟수)`
	- 기본: `sep=띄어쓰기와 엔터, maxsplit = -1`
	- `maxsplit = -1`: 아무런 제한 없이 문자열 끝까지 자를 수 있음. 

7. random.randint(a, b): [a, b] 사이의 정수를 랜덤으로 뽑음. a와 b 모두 포함. 

8. create a password generator -> 좀 어려웠던 프로젝트

9. random.choice(list): list 안의 임의의 element를 반환한다.

10. random.shuffle(list): list 안의 원소의 순서를 재구성한다.  

11. "구분자".join(리스트): 리스트의 원소를 합쳐준다.,

12. parameter and argument
```py
def my_funtion(something):
	print(f"Hello, {something}")

my_function("mococo")
```
위의 코드에서 parameter은 something이고, argument는 "mococo"이다. 즉, parameter은 함수에 전달되는 데이터의 이름이고(변수같은 느낌) argument는 parameter에 저장되는 값이다. 

13. 단축키
- 주석처리하고 싶은 부분 드래그해서 블록처리 한 후 `ctrl + /`키 누르면 한꺼번에 주석처리할 수 있음

14. parameter가 2개 이상인 함수
```py
def two_parameters(one, two):
  print(f"Hello, {one}")
  print(f"Did you meet {two} yesterday?")

two_parameters("John", "Mickey")
```
위왕 같이 정의하면 된다. 참고로 파이썬 함수의 parameter에 입력하는 값들은 **positional arguments**인데, argument가 어떤 파라미터의 값이 될지 해당 argument를 입력한 위치가 결정하기 때문이다.     
- keyword Arguments
```py
two_parameters(two="Mickey", one="John")
```
이런식으로 argument를 지정하는 것을 **keyword arguments**라고 한다. 

15. `list.index(element)`
- 사용자가 찾는 element를 list에서 찾아서 (만약 element가 여러개 있다면 첫번째 값의) index를 반환한다.

16. 딕셔너리
```py
# 정의하기
programming_dictionary = {
	"Bug": "A moth in your computer",
	"Function": "A piece of code that you can easily call over and over again",
	"Loop": "The action of doing something over and over again"
}

# 딕셔너리 수정
programming_dictionary["Bug"] = "An unexpected problem with software or hardware"

# 딕셔너리 안에서 루프 돌리기
for key in programming_dictionary:
	print(key) #키 출력
	print(programming_dictionary[key]) #값 출력

# 새로운 키-값 추가
programming_dictionary["Variable"] = "A value that can change, depending on conditions or on information passed to the program"

# 빈 딕셔너리 만들기
empty_dictionary = {}
```
18. Nesting
```py
# Nesting a list in a dictionary
travel_log = {
	"France": ["Paris", "Lille", "Dijon"],
	"Germany": ["Berlin", "Hamburg", "Stuttgart"]
}

# Nesting a dictionary in a dictionary
travel_log = {
	"France": {
		"cities_visited": ["Paris", "Lille", "Dijon"],
		"total_visits": 12
	},
	"Germany": {
		"cities_visited": ["Berlin", "Hamburg", "Stuttgart"],
		"total_visits": 5
	}
}

# Nesting a dictionary in a list
travel_log = [
	{	
		"country": "France",
		"cities_visited": ["Paris", "Lille", "Dijon"],
		"total_visits": 12
	},
	{	
		"country": "Germany",
		"cities_visited": ["Berlin", "Hamburg", "Stuttgart"],
		"total_visits": 5
	}
]
```    
- 리스트: 인덱스값으로 element에 접근
- 딕셔너리: 키값으로 element에 접근

19. str.title()
- 글자의 첫 글자를 대문자로, 나머지 글자를 소문자로 바꿈

20. doc string 만들기
- doc string이란: 함수를 사용할 때 나타나는 작은 설명문이다.
- 만드는 방법
```py
def my_function(a,b):
	"""short explanation of the function"""
	print(f"Hello, {a}. Did you see {b} this morning?")
```
21. 딕셔너리와 함수 결합하기
```py
def add(n1, n2):
  return n1 + n2

def subtract(n1, n2):
  return n1 - n2

def multiply(n1, n2):
  return n1 * n2

def divide(n1, n2):
  return n1 / n2

operations = {
  "+": add,
  "-": subtract,
  "*": multiply,
  "/": divide
}

num1 = int(input("What's the first number? "))
num2 = int(input("What's the second number? "))
for symbol in operations:
  print(symbol)

operation_symbol = input("Pick an operation from the line above: ")

answer = operations[operation_symbol](num1, num2)

print(f"{num1} {operation_symbol} {num2} = {answer}")
  
```

