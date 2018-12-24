function edit() {

	//alert('clicked!');

	var el = document.getElementById('editing');

	el.innerHTML = 'unesi<input id="input1"><br>' 
	+ '<button onclick="insert()">Save</button>';

}

function insert() {

	var unos = document.getElementById('input1').value;
	var el = document.getElementById('editing');

	el.innerHTML = unos;
}