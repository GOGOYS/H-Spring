document.addEventListener("DOMContentLoaded", () => {
  const table = document.querySelector("TABLE");

  //현재 DOM화면에 있는 모든 TD들을 가져와서
  //모든 TD들에 click이벤트를 부착하기
  // const tds = document.querySelectorAll("TD");
  // for (let i = 0; tds.length; i++) {
  //   tds[i].addEventListener("click", () => {
  //     alert(tds[i].innerText);
  //   });
  // }

  /*
  이 스크립트가 실해되는 DOM화면서 table tag가 있으면
  if(){} 코드를 실행하고 없으면 건너 뛰어라

  만약 이 스크립트가 실행되는 DOM화면에 table tag가 없으면
  변수 table에는 undefined가 담기게 된다.
  그러면 if 조건문에서 false가 발생한다.
  */
  if (table) {
    table.addEventListener("click", (e) => {
      // table에 이벤드 리스너를 걸어서 td의 값을 변수에 담아서 보낸다.
      //td와 tr에는 이벤트 리스너가 없어서 바로 table의 이벤트리스너가 시작.
      //필요한 부분만 뽑아내서 스크립트 작성
      const target = e.target; //이코드의 핵심
      const text = target.innerText;
      const className = target.className;
      const stNum = target.dataset.num;
      if (className === "name") {
        document.location.href = "/app/student/detail?stnum=" + stNum;
      }
    });
  }
});
