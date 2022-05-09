/**
 * @author Nelson Migliarini
 */
function factorial(originalValue) {
  let newValue;
  if (originalValue > 1) {
    newValue = factorial(originalValue - 1) * originalValue;
  } else {
    newValue = 1;
  }
  return newValue;
}

function main() {
  const n = +readLine();
  console.log(factorial(n));
}
