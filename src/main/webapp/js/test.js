    var lista=[];
    $.getJSON('http://localhost:8080/periodico-1.0/webresources/Seccion', function (data){
        lista = data;
        console.log(JSON.stringify(data));
    });   
    console.log("hola");

