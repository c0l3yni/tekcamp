// const question = document.getElementsByClassName('faq-item');
// const answer = document.getElementsByClassName('answer');
// const arrowIcon = document.getElementsByClassName('arrow-icon')

const questionList = document.getElementsByClassName('faq-item');
let i;

for (i = 0; i < questionList.length; i++) {
  questionList[i].addEventListener('mouseenter', () => {
    document.body.style.cursor = 'pointer';
  });

  questionList[i].addEventListener('mouseleave', () => {
    document.body.style.cursor = 'default';
  });
  questionList[i].addEventListener("click", function () {
    this.classList.toggle("active");
    let answerList = this.lastElementChild;
    let question = this.firstElementChild;

    if (answerList.style.display === 'block') {
      answerList.style.display = 'none';
      question.style.fontWeight = 'normal';

    } else {
      answerList.style.display = 'block';
      question.style.fontWeight = 'bold';
    }
  });
}



// question[0].addEventListener('mouseenter', function () {
//   document.body.style.cursor = 'pointer';
// });
// question[0].addEventListener('mouseleave', function () {
//   document.body.style.cursor = 'default';
// });
// question[0].addEventListener('click', function () {
//   if (answer[0].style.display === 'block') {
//     answer[0].style.display = 'none';
//     question[0].style.fontWeight = 'normal';
//     arrowIcon[0].style.transform = 'rotate(0deg)';
//   } else {
//     answer[0].style.display = 'block';
//     question[0].style.fontWeight = 'bold';
//     arrowIcon[0].style.transform = 'rotate(180deg)';
//   }
// });

// question[1].addEventListener('mouseenter', function () {
//   document.body.style.cursor = 'pointer';
// });
// question[1].addEventListener('mouseleave', function () {
//   document.body.style.cursor = 'default';
// });
// question[1].addEventListener('click', function () {
//   if (answer[1].style.display === 'block') {
//     answer[1].style.display = 'none';
//     question[1].style.fontWeight = 'normal';
//     arrowIcon[1].style.transform = 'rotate(0deg)';
//   } else {
//     answer[1].style.display = 'block';
//     question[1].style.fontWeight = 'bold';
//     arrowIcon[1].style.transform = 'rotate(180deg)';
//   }
// });

// question[2].addEventListener('mouseenter', function () {
//   document.body.style.cursor = 'pointer';
// });
// question[2].addEventListener('mouseleave', function () {
//   document.body.style.cursor = 'default';
// });
// question[2].addEventListener('click', function () {
//   if (answer[2].style.display === 'block') {
//     answer[2].style.display = 'none';
//     question[2].style.fontWeight = 'normal';
//     arrowIcon[2].style.transform = 'rotate(0deg)'; 
//   } else {
//     answer[2].style.display = 'block';
//     question[2].style.fontWeight = 'bold';
//     arrowIcon[2].style.transform = 'rotate(180deg)';
//   }
// });

// question[3].addEventListener('mouseenter', function () {
//   document.body.style.cursor = 'pointer';
// });
// question[3].addEventListener('mouseleave', function () {
//   document.body.style.cursor = 'default';
// });
// question[3].addEventListener('click', function () {
//   if (answer[3].style.display === 'block') {
//     answer[3].style.display = 'none';
//     question[3].style.fontWeight = 'normal';
//     arrowIcon[3].style.transform = 'rotate(0deg)';
//   } else {
//     answer[3].style.display = 'block';
//     question[3].style.fontWeight = 'bold';
//     arrowIcon[3].style.transform = 'rotate(180deg)';
//   }
// });

// question[4].addEventListener('mouseenter', function () {
//   document.body.style.cursor = 'pointer';
// });
// question[4].addEventListener('mouseleave', function () {
//   document.body.style.cursor = 'default';
// });
// question[4].addEventListener('click', function () {
//   if (answer[4].style.display === 'block') {
//     answer[4].style.display = 'none';
//     question[4].style.fontWeight = 'normal';
//     arrowIcon[4].style.transform = 'rotate(0deg)';
//   } else {
//     answer[4].style.display = 'block';
//     question[4].style.fontWeight = 'bold';
//     arrowIcon[4].style.transform = 'rotate(180deg)';
//   }
// });



