const accordion = document.getElementsByClassName("infoContainer");
var i;

for (i = 0; i < accordion.length; i++) {
  accordion[i].addEventListener("click", function () {
    this.classList.toggle("active");

    let answer = this.children[1];
    if (answer.display === "block") {
      answer.display = "none";
    } else {
      answer.display = "block";
    }
  });
}
