/**
 * @author Nelson Migliarini
 */
function vowelsAndConsonants(text) {
  let consonants = [];
  for (let i = 0; i < text.length; i++) {
    const letter = text.charAt(i);
    if (isVowel(letter)) {
      console.log(letter);
    } else {
      consonants.push(letter);
    }
  }
  for (let consonant of consonants) {
    console.log(consonant);
  }
}

function isVowel(letter) {
  return 'aeiou'.includes(letter);
}

function main() {
  const s = readLine();
  vowelsAndConsonants(s);
}
