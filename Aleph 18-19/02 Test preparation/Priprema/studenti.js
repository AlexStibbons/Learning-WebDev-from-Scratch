studenti = [
	{ime: 'Ivana',
	prezime: 'Ivanovic',
	indeks: '1'},
	{ime: 'Jovan',
		prezime: 'Jovanovic',
		indeks: '2'},
	{ime: 'Milena',
		prezime: 'Milanovic',
		indeks: '3'}
]

/*function prikazi() {

	tabela = document.getElementById('ispis');
	student = '';

	for (var i = 0; i < studenti.length; i++) {
		student += '<tr><td>'+studenti[i].indeks+'</td>'+
						'<td>'+studenti[i].ime + '</td>' +
						'<td>' + studenti[i].prezime+'</td></tr>';
		//tabela.innerHTML = student;
	}

	tabela.innerHTML = student;
}*/

function prikazi() {

	var tabela = document.getElementById('ispis');

	for (var i = 0; i < studenti.length; i++) {
		
		var row = tabela.insertRow(-1);
		var cell1 = row.insertCell(0); 
		var cell2 = row.insertCell(1);
		var cell3 = row.insertCell(2);

		cell1.innerHTML = studenti[i].indeks;
		cell2.innerHTML = studenti[i].ime;
		cell3.innerHTML = studenti[i].prezime;
	}
}