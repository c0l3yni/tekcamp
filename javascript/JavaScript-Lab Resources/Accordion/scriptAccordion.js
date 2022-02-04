const question = document.getElementsByClassName('faq-item');
const answer = document.getElementsByClassName('answer');
const arrowIcon = document.getElementsByClassName('arrow-icon')


question[0].addEventListener('click', function() {
  question[0].addEventListener('mouseenter', function() {
    document.body.style.cursor = 'pointer';
  });
  question[0].addEventListener('mouseleave', function() {
    document.body.style.cursor = 'default';
  });
  
  if (answer[0].style.display === 'none') {
    answer[0].style.display = 'block';
    question[0].style.fontWeight = 'bold';
    arrowIcon[0].style.transform = 'rotate(180deg)';
  } else {
    answer[0].style.display = 'none';
    question[0].style.fontWeight = 'normal';
    arrowIcon[0].style.transform = 'rotate(0deg)';
  }
});
