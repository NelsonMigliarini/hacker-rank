/**
 * @author Nelson Migliarini
 */
function reverseString(string) {
	try {
		console.log(string.split("").reverse().join(""));
	} catch (e) {
		console.log("s.split is not a function\n" + string);
	}
}
