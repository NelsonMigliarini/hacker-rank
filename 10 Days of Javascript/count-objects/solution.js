/**
 * @author Nelson Migliarini
 */
function getCount(objects) {
  let count = 0;
  for (let object of objects) {
    if (object.x === object.y) {
      count++;
    }
  }
  return count;
}

function main() {
  const n = +readLine();
  let objects = [];
  for (let i = 0; i < n; i++) {
    const [a, b] = readLine().split(' ');
    objects.push({ x: +a, y: +b });
  }
  console.log(getCount(objects));
}
