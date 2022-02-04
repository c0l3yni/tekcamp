const question = document.getElementsByClassName('question');
const answer = document.getElementsByClassName('answer');
const arrowIcon = document.getElementsByClassName('arrow-icon')

question[0].addEventListener('mouseenter', function() {
  document.body.style.cursor = 'pointer';

});
question[0].addEventListener('mouseleave', function() {
  document.body.style.cursor = 'default';

});

question[0].addEventListener('click', function() {
  
  answer[0].style.display = 'block';
  arrowIcon[0].style.transform = 'rotate(180deg)';

});



  