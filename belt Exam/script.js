function remove(Element) {
    Element.parentElement.remove();

}

function play(e) {
    e.setAttribute('src', 'images/assets/succulents-1.jpg');

    console.log(e.innerText);
}
function back(e) {
    e.setAttribute('src', 'images/assets/succulents-2.jpg')

}