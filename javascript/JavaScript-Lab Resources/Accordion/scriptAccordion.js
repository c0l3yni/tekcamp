const questionList = document.getElementsByClassName('faq-item');
let i;

for (i = 0; i < questionList.length; i++) {
  questionList[i].addEventListener('mouseenter', () => {
    document.body.style.cursor = 'pointer';
  });

  questionList[i].addEventListener('mouseleave', () => {
    document.body.style.cursor = 'default';
  });

  questionList[i].addEventListener('click', function () {
    this.classList.toggle('active');
    let answerList = this.lastElementChild;
    let question = this.firstElementChild;
    let arrow = question.firstElementChild

    if (answerList.style.display === 'block') {
      answerList.style.display = 'none';
      question.style.fontWeight = 'normal';
      arrow.style.transform = 'rotate(0deg)';

    } else {
      answerList.style.display = 'block';
      question.style.fontWeight = 'bold';
      arrow.style.transform = 'rotate(180deg)';
    }
  });
}