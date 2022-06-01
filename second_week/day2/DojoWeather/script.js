function remove(Element){
Element.parentElement.remove( );
// Element.remove();

}
function tempChange(Element){
 
        
        
    if (Element.value==="F"){
        for (let index = 1; index <= 8; index++) {
            var y=  document.getElementById(index).innerText;
            
            y=  (y *1.8) +32;
            y = y.toFixed(0)
            document.getElementById(index).innerText = y;
            
        }
        
        
        
    }
    else{
        // console.log(Element.value);
        for (let index = 1; index <= 8; index++) {
        var y=  document.getElementById(index).innerText;
        y=  (y -32)/1.8;
        y = y.toFixed(0)
        document.getElementById(index).innerText = y;
        
        }
        
    }

}
