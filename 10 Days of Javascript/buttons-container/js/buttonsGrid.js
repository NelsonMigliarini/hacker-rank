/**
 * @author Nelson Migliarini
 */
const values = [1, 2, 3, 6, 9, 8, 7, 4];
const ids = [1, 2, 3, 6, 9, 8, 7, 4];

assignValues();

function rotate() {
  values.unshift(values.pop());
  assignValues();
}

function assignValues() {
  for (let i = 0; i < values.length; i++) {
    document.getElementById('btn' + ids[i]).innerHTML = values[i];
  }
}
