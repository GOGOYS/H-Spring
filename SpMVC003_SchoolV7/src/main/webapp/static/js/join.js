document.addEventListener("DOMContentLoaded", () => {
  const id_check = document.querySelector("button.id-check");
  const join_btn = document.querySelector("button.join");
  const join_form = document.querySelector("form.join");

  const index = {
    username: 0,
    password: 1,
    re_password: 2,
    name: 3,
    email: 4,
  };

  //form.join 내부에 있는 모든 input box
  //SelectAll을 사용하면 tag요소를 배열로 가져온다
  const inputList = document.querySelectorAll("form.join input");

  //inputList 0번 요소 부터 4번 요소까지
  //form tag 에 작성된 순서대로 담겨있다.
  //index 객체에서 각 요소의 첨자를 가져오고 첨자를 사용하여 input tag를 각 순서대로 변수에 담겠다.
  const username = inputList[index.username];
  const password = inputList[index.password];
  const re_password = inputList[index.re_password];
  const name = inputList[index.name];
  const email = inputList[index.email];

  const username_msg = document.querySelector("div.username");

  const username_isBlank = () => {
    username_msg.classList.remove("ok");
    //div.username 이라는 항목에 warn 이라는 classaList.dd를 덫붙여라
    //css에 들어가는 거 그얀 add를 사용하여 한번에 지정해서 변경할 수 있다!
    //classList.add("class이름")과 같이 사용아면 미리 설정한 속성이 적용된다.
    username_msg.classList.add("warn");
    username_msg.innerText = "* USER NAME을 입력해 주세요";
    username.focus();
    return false;
  };
  //join btn 클릭
  if (join_btn) {
    join_btn.addEventListener("click", () => {
      if (username.value === "") {
        username_isBlank();
        return false;
      }
      if (password.value === "") {
        alert("비밀번호를 입력해 주세요");
        password.focus();
        return false;
      }
      if (re_password.value === "") {
        alert("비밀번호 확인을 입력해 주세요");
        re_password.focus();
        return false;
      }
      if (password.value !== re_password.value) {
        alert("비밀번호 확인 값이 서로 달라요");
        password.value = "";
        re_password.value = "";
        password.focus();
        return false;
      }

      join_form.submit();
    });
  }
  if (id_check) {
    id_check.addEventListener("click", () => {
      if (username.value === "") {
        username_isBlank();
        return false;
      } //end if

      //queryString 방식으로 요청
      //localhost:8080/school/user/idcheck?username=callor
      //URL에 서버에 보내는 변수이름(username)이 노출되는 문자가 있다
      //보내는 데이터의 길이 제한이 있다.

      //URL, PathVarriable 방식으로 데이터(검사하고자 하는 username)를 전송하기
      //REST Ful 방식이라고 한다.
      //localhost:8080/school/user/idcheck/callor로 요청하기
      fetch(`${rootPath}/user/idcheck/${username.value}`)
        .then((res) => {
          console.table(index);
          console.table(res);
          return res.text();
        })
        .then((result) => {
          if (result === "OK") {
            username_msg.classList.remove("warn");
            username_msg.classList.add("ok");
            username_msg.innerText = " * 사용할 수 있는 USER NAME 입니다";
          } else {
            username_msg.classList.remove("ok");
            username_msg.classList.add("warn");
            username_msg.innerText = " * 이미 가입된 USER NAME 입니다";
          }
        });
    });
  }
});
