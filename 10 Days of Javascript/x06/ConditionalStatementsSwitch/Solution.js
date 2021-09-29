/**
 * @author Nelson Migliarini
 */
function getLetter(s) {
	let letter;
	switch (true) {
		case ('aeiou'.indexOf(s[0]) != -1):
			letter = 'A';
			break;
		case ('bcdfg'.indexOf(s[0]) != -1):
			letter = 'B';
			break;
		case ('hjklm'.indexOf(s[0]) != -1):
			letter = 'C';
			break;
		default:
			letter = 'D';
			break;
	}
	return letter;
}