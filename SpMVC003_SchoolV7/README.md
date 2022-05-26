# form과 button 관계

```
<form>
	<button type="submit">
</from>
```
* 위와 같이 form tag에 포함된 button 기본적으로 type이 ```submit```이다
* button type이 ```submit```인 경우 from tag에 포함된  input의 값을 무조건 서버로 전송하는 event가 실행된다.
* 만약 button을 클릭했을때 JS코드를 사용하여 상황을 제어하고 싶으면 button의 type을 ```button```으로 설정한다.
* button type을 ```button```으로 설정하면 모양만 button이고 아무런 역할을 수행하지 못한다.
* button type에는 ```reset```도 있는 데 이 type은 form tag에 포함된 input box 데이터를 모두 제거한다.