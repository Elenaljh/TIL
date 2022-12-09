# 마크다운
## 1. 줄바꿈
- 문장 끝에 공백 2칸 입력
- `</br>` 입력

</br>

## 2. 코드블록 입력
- ` ``` `나 `~~~`로 감싸기
~~~
```
코드 입력
``` 
~~~
- `인라인 코드`는 \`로 감싼다
```
`인라인 코드`
```


</br>

## 3. 이모지 입력
- :bear: 아주 귀엽다
```
:bear:
```

</br>

## 4. 인용
>인용하면 이렇게 됨
>>이렇게
>>>이렇게
```
>인용하면 이렇게 됨
>>이렇게
>>>이렇게
```

</br>

## 5. 접기/펼치기 입력
<details markdown="1">
<summary>접기/펼치기</summary>
어케하는지 궁금하지?
</details>  

```
<details markdown="1">
<summary>접기/펼치기</summary>
어케하는지 궁금하지?
</details>
```

### 5.1. 추가: 접기/펼치기 글씨 굵게 하는 법
<details markdown="1">
<summary><b>접기/펼치기</b></summary>
접기/펼치기 제목 글씨가 굵어진다
</details>

```
<details markdown="1">
<summary><b>접기/펼치기</b></summary>
접기/펼치기 제목 글씨가 굵어진다
</details>
```
  + 이유를 생각해봤는데(뇌피셜) 접기/펼치기 기능은 마크다운 문법이 아니라 html 문법을 사용해서 구현한다.</br>details를 이용해 html을 쓸거라고 선언했기 때문에 글씨를 `**`를 사용해 **굵게** 만들 수는 없고 `<b>와 </b>`를 이용해 굵게 만드는 것이 아닐까 싶다. 뇌피셜이니까 정확한 정보 찾아볼것!!!

</br>

## 6. 특수문자 입력하기
### 6.1. 첫번째 방법: HTML Number 입력
|특수문자|HTML Number|HTML Name|Description|
|---|---|---|---|
|~|\&#126;||equivalency sign - tilde|
### 6.2. 두번째 방법: 백슬래쉬(\) 입력
\~
```
\~
```

</br>

## 7. 표 입력하기
6번 표 마크다운 문법
```
|특수문자|HTML Number|HTML Name|Description|
|---|---|---|---|
|~|\&#126;||equivalency sign - tilde|
```

</br>

## 8. 링크 걸기
[네이버](https://www.naver.com)  
~~~
[네이버](https://www.naver.com)
~~~
