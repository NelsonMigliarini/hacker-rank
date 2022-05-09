/**
 * @author Nelson Migliarini
 */
function modifyArray(nums) {
  let newValues = [];
  nums.forEach(value => newValues.push(value * (value % 2 === 0 ? 2 : 3)));
  return newValues;
}

function main() {
  readLine();
  const a = readLine().split(' ').map(Number);
  console.log(modifyArray(a).toString().split(',').join(' '));
}
