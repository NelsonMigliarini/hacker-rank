/**
 * @author Nelson Migliarini
 */
class Rectangle {
  constructor(a, b) {
    this.length = a;
    this.width = b;
    this.perimeter = 2 * (this.length + this.width);
    this.area = this.length * this.width;
  }
}

function main() {
  const a = +readLine();
  const b = +readLine();
  const rec = new Rectangle(a, b);
  console.log(rec.length);
  console.log(rec.width);
  console.log(rec.perimeter);
  console.log(rec.area);
}
