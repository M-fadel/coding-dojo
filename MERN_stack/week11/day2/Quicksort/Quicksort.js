var arr1=[1, 4, 2, 7, 6, 3, 8, 20, 9, 15, 12, 10, 30 ] 

function Quicksort(array){
    console.log(array)

    var i =0
    var j = array.length-1
    var p =Math.ceil((Math.random() * (j - 1) ) + 1)
    while (array[i] != array[j]) {
        if (array[i]<array[p]){
            i++
            continue
        }else if (array[j]>array[p]){
            j--
            continue
        }else if(array[i]>=array[p]&&array[j]<=array[p]){
            console.log("swap" ,array[i],"with",array[j],"prov",array[p])
            var temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
    
    }
    console.log(array)
}
Quicksort(arr1)