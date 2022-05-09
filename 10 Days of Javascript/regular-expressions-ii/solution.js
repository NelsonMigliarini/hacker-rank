/**
 * @author Nelson Migliarini
 */
function regexVar() {
  return /^(Mr|Mrs|Ms|Dr|Er)(\.)[a-zA-Z]*$/;
}

function main() {
  const re = regexVar();
  const s = readLine();
  console.log(!!s.match(re));
}
