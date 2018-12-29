
imenik = [

	{ime: 'Marko',
	prezime: 'Markovic',
	zanimanje: 'Software developer',
	konekcija: 'Connected 3 months ago'},

	{ime: 'Petar',
	prezime: 'Petrovic',
	zanimanje: 'Senior Consultant',
	konekcija: 'Connected 2 years ago'},

	{ime: 'Ivana',
	prezime: 'Ivanov',
	zanimanje: 'Project Manager',
	konekcija: 'Connected 11 months ago'},

	{ime: 'Marija',
	prezime: 'Molnar',
	zanimanje: 'Office Manager',
	konekcija: 'Connected 1 year ago'},

	{ime: 'Bojana',
	prezime: 'Petrov',
	zanimanje: 'Frontend Developer',
	konekcija: 'Connected 8 months ago'},
	
	{ime: 'Darko',
	prezime: 'Popovic',
	zanimanje: 'IT solution architect',
	konekcija: 'Connected 3 years ago'},
	
	{ime: 'Nenad',
	prezime: 'Kovac',
	zanimanje: 'Data architect',
	konekcija: 'Connected 2 years ago'},
]

// pretraga po delu imena
function klikni() {

	var a = document.getElementById('listanje');
	a.innerHTML = ' ';

	var looking = document.getElementById('input1').value;
	var lowerlooking = looking.toLowerCase();

	for (var i = 0; i < imenik.length; i++) {
		var lower = imenik[i].ime.toLowerCase();
		if (lower.includes(lowerlooking)) {
			var j = document.getElementById('listanje');
			j.innerHTML += 	'<div class=\"person\">' +
				'<p> <span class=\"namecss\">' + imenik[i].ime + ' ' +
				imenik[i].prezime + '</span><br>' +
				'<span class=\"title\">' + imenik[i].zanimanje + 
				'</span><br>' + '<span class=\"connected\">' + imenik[i].konekcija +
				'</span></p>' + '<button>' + 'Send message' + '</button></div>';
		}
	} 
	

}

/* pravljenje tabele 

	function klikni() {

	var looking = document.getElementById('input1').value;

	for (var i = 0; i < imenik.length; i++) {
		if (imenik[i].ime === looking) {
			var j = document.getElementById('listanje2');
			j.innerHTML = '<tr><td>' + imenik[i].ime +
				'</td><td>' + imenik[i].prezime + '</td>' +
				'<td>' + imenik[i].zanimanje + '</td><td><button>Send Message</td></tr>';

		}
	}

}*/






