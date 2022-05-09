/**
 * @author Nelson Migliarini
 */
function regexVar() {
  return /(\d)+/g;
}

function main() {
  const re = regexVar();
  const s = readLine();
  const r = s.match(re);
  for (const e of r) {
    console.log(e);
  }
}
