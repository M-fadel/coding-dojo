console.log("page loaded...");

function changeName(element) {
    element.parentElement.querySelector('h1').innerText = "Mohammed Fadel";


}
function accept(e) {
    var t = []
    t = document.querySelectorAll(".badge");
    t[0].innerText--;
    // t[1].innerText++;


}

function decline(e) {
    t = document.querySelectorAll(".badge");
    t[0].innerText--;
    e.parentElement.parentElement.remove();

}