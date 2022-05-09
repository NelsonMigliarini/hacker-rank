/**
 * @author Nelson Migliarini
 */
function sides(literals, ...expressions) {
  const values = [];
  values.push(positiveInitialValue(expressions[0], expressions[1]));
  values.push(negativeInitialValue(expressions[0], expressions[1]));
  return values.sort();
}

function positiveInitialValue(area, perimeter) {
  return (perimeter + Math.sqrt(Math.pow(perimeter, 2) - 16 * area)) / 4;
}

function negativeInitialValue(area, perimeter) {
  return (perimeter - Math.sqrt(Math.pow(perimeter, 2) - 16 * area)) / 4;
}

function main() {
  let s1 = +readLine();
  let s2 = +readLine();
  [s1, s2] = [s1, s2].sort();
  const [x, y] = sides`The area is: ${s1 * s2}.\nThe perimeter is: ${2 * (s1 + s2)}.`;
  console.log(s1 === x ? s1 : -1);
  console.log(s2 === y ? s2 : -1);
}
