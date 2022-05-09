/**
 * @author Nelson Migliarini
 */
function getArea(length, width) {
  return length * width;
}

function getPerimeter(length, width) {
  return (length + width) * 2;
}

function main() {
  const length = +readLine();
  const width = +readLine();
  console.log(getArea(length, width));
  console.log(getPerimeter(length, width));
}
