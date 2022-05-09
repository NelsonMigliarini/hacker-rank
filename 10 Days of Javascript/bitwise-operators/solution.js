/**
 * @author Nelson Migliarini
 */
function getMaxLessThanK(n, k) {
  let bitwiseValue = 0;
  for (let i = 1; i <= n; i++) {
    for (let j = i + 1; j <= n; j++) {
      let result = i & j;
      if (result > bitwiseValue && result < k) {
        bitwiseValue = result;
      }
    }
  }
  return bitwiseValue;
}

function main() {
  const q = +readLine();
  for (let i = 0; i < q; i++) {
    const [n, k] = readLine().split(' ').map(Number);
    console.log(getMaxLessThanK(n, k));
  }
}
