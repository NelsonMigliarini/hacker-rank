/**
 * @author Nelson Migliarini
 */
const days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];

function getDayName(dateString) {
  let date = new Date(dateString);
  return getDayNameByNumber(date.getDay());
}

function getDayNameByNumber(dayNumber) {
  return days[dayNumber];
}

function main() {
  const d = +readLine();
  for (let i = 0; i < d; i++) {
    const date = readLine();
    console.log(getDayName(date));
  }
}
