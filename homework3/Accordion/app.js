const accordion = document.getElementsByClassName('faq-item');
var i;


for (i = 0; i < accordion.length; i++){
    accordion[i].addEventListener('click', function(){
    this.classList.toggle('active');

    let answer = document.getElementsByClassName('answer');
    if (answer.display === "block") {
      answer.display = "none";
    } else {
      answer.display = "block";
    }
});
}
