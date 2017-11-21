
function send_text(){
	var input = document.getElementById("text").value;
	if(input == ""){}
	else{
		document.getElementById("chat-window").innerHTML += "You: ";
		document.getElementById("chat-window").innerHTML += input;
		document.getElementById("chat-window").innerHTML += "<br>Bot: Ok! <br>";
		document.getElementById("text").value = "";
	}
}