document.addEventListener("DOMContentLoaded", () => {
  //어딘가에 있을 nav tag를 객체 변수에 담아오기
  const nav = document.querySelector("nav");
  //nav tag를 정말 가져왔을때
  if (nav) {
    nav.addEventListener("click", (e) => {
      /*
        e.target
        현재 nav > ul > li 형태로 layout이 구성되어 있다.
        이 레이아웃의 제일 바깥쪽인 nav tag에 click event를 설정했다.
        마우스로 nav태그의 어느곳을 클릭하면 
        event가 nav > ul > li 로 점점 전파된다.: event Bublling 이라고 한다.
        이 현상을 이용하여 실제 li 에 click이 되었음을 감지한다.

        nav  > li tag를 클릭하면
        li tag에 대한 정보가 e.target에 담기게 된다.
        결국 js 코드에서 다수의 id tag에 일일이 event를 설정한 것처럼
        사용할 수 있게 된다.
        */
      const target = e.target;
      const navText = target.innertext;

      let url = `${rootPath}`;
      if (navText === "학생정보") {
        url += "/student";
      } else if (navText === "성적정보") {
        alert("성적정보를 입력하자");
      } else if (navText === "로그인") {
        alert("로그인 창을 띄웁니다");
      } else if (navText === "회원가입") {
        alert("회원가입 안받음");
      }
      document.location.href = url;
    });
  }
});
