/**
 * @author Nelson Migliarini
 */
function regexVar() {
  return /^([aeiou]).*\1$/;
}

function main() {
  const re = regexVar();
  const s = readLine();
  console.log(re.test(s));
}
