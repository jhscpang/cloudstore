// JavaScript Documentvar h=document.getElementById("tabnav").getElementsByTagName("li");

var d=document.getElementById("tabnav02").getElementsByTagName("li");

function go_to(s){

for(var i=1;i<=h.length;i++){

if(s==i){

h[i-1].className="current";

d[i-1].className="current";

document.getElementById("tabcon_"+i).className="tabcon block";

}

else{

h[i-1].className="";

d[i-1].className="";

document.getElementById("tabcon_"+i).className="tabcon";

}

}

}