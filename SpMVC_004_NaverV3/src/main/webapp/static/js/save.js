document.addEventListener("DOMContentLoaded", () => {
  const join_btn = document.querySelector("button.join");
  const join_form = document.querySelector("form.join");

  const index = {
    isbn: 0,
    title: 1,
    author: 2,
    publisher: 3,
    pudate: 4,
    price: 5,
    link: 6,
    image: 7,
  };

  //form.join 내부에 있는 모든 input box
  //SelectAll을 사용하면 tag요소를 배열로 가져온다
  const inputList = document.querySelectorAll("form.join input");

  //inputList 0번 요소 부터 4번 요소까지
  //form tag 에 작성된 순서대로 담겨있다.
  //index 객체에서 각 요소의 첨자를 가져오고 첨자를 사용하여 input tag를 각 순서대로 변수에 담겠다.
  const isbn = inputList[index.isbn];
  const title = inputList[index.title];
  const author = inputList[index.author];
  const publisher = inputList[index.publisher];
  const pudate = inputList[index.pudate];
  const price = inputList[index.price];
  const link = inputList[index.link];
  const image = inputList[index.image];

  //join btn 클릭
  if (join_btn) {
    join_btn.addEventListener("click", () => {
      join_form.submit();
    });
  }
});
