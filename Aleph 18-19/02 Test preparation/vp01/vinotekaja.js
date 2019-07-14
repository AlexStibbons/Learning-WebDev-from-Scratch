function dom() {

	alert("clicked!");

	var el = document.getElementById('todo');

	var row = el.insertRow(-1);
	var cell1 = row.insertCell(0);
	var cell2 = row.insertCell(1);
	var cell3 = row.insertCell(2);

	cell1.innerHTML = "vino";
	cell2.innerHTML = "podrum";
	cell3.innerHTML = "godina";
}
