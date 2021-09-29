/**
 * @author Nelson Migliarini
 */
function factorial(n) {
	let value;
	if (n > 1)
		value = factorial(n - 1) * n;
	else
		value = 1;
	return value;
}