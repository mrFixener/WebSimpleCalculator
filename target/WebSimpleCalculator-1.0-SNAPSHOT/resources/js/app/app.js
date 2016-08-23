function sendToCalc(event){
    event.preventDefault();
    if(!check())
        return;
    var value1 = document.getElementById("value1").value;
    var value2 = document.getElementById("value2").value;
    var e = document.getElementById("operation");
    var operation= e.options[e.selectedIndex].value;
    var result = document.getElementById("result");
    result.innerHTML = "= ";
    
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (xhttp.readyState == 4 && xhttp.status == 200) {
            result.innerHTML += ((JSON.parse(xhttp.responseText)).result);
        }else if(xhttp.readyState == 4 && xhttp.status !== 200){
            result.innerHTML += ' Error: '+((JSON.parse(xhttp.responseText)).exep.message);
        }
    };

    xhttp.open("POST", "calculate", true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send("value1="+value1+"&value2="+value2+"&oper="+operation);
}
function check(){
    var check = true; 
    if(document.getElementById("value1").value === ''){
        check = false;
        document.getElementById("err1").innerHTML = 'Значение1 обязательно для заполнения';
    }
    else
        document.getElementById("err1").innerHTML = '';
    
    if(document.getElementById("value2").value === ''){
        check = false;
        document.getElementById("err2").innerHTML = 'Значение2 обязательно для заполнения';
    }
    else
        document.getElementById("err2").innerHTML = '';
    return check;
}