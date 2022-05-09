/**
 * @author Nelson Migliarini
 */
function isPositive(value) {
  let positive;
  if (value > 0) {
    positive = 'YES';
  } else if (value === 0) {
    throw new Error('Zero Error');
  } else {
    throw new Error('Negative Error');
  }
  return positive;
}

function main() {
  const n = +readLine();
  for (let i = 0; i < n; i++) {
    const a = +readLine();
    try {
      console.log(isPositive(a));
    } catch (e) {
      console.log(e.message);
    }
  }
}
