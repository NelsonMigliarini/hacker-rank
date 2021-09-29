/**
 * @author Nelson Migliarini
 */
function vowelsAndConsonants(s) {
  let characters = s.split('');
  let consonants = [];
  for(let char of characters)
    if(isVowel(char))
      console.log(char);
    else
      consonants.push(char);
  for(let char of consonants)
    console.log(char);
}

function isVowel(char) {
    return 'aeiou'.indexOf(char) != -1;
}