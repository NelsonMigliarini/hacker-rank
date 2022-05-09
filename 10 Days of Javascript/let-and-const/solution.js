/**
 * @author Nelson Migliarini
 */
const PI = Math.PI;

function getArea(radius) {
  return PI * radius ** 2;
}

function getPerimeter(radius) {
  return 2 * PI * radius;
}

function main() {
  let radius = readLine();
  console.log(getArea(radius));
  console.log(getPerimeter(radius));
}
