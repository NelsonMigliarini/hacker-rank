/**
 * @author Nelson Migliarini
 */
function getLetter(text) {
  let letter;
  const firstCharacter = text.charAt(0);
  switch (true) {
    case 'aeiou'.includes(firstCharacter):
      letter = 'A';
      break;
    case 'bcdefg'.includes(firstCharacter):
      letter = 'B';
      break;
    case 'hjklm'.includes(firstCharacter):
      letter = 'C';
      break;
    default:
      letter = 'D';
      break;
  }
  return letter;
}

function main() {
  const s = readLine();
  console.log(getLetter(s));
}
