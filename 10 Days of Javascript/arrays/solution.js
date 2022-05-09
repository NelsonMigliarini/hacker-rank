/**
 * @author Nelson Migliarini
 */
function getSecondLargest(nums) {
  let largestValue = 0;
  let secondLargestValue = 0;
  nums.forEach(value => {
    if (largestValue === 0) {
      largestValue = value;
    } else {
      if (largestValue < value) {
        secondLargestValue = largestValue;
        largestValue = value;
      }
      if (largestValue > value && secondLargestValue < value) {
        secondLargestValue = value;
      }
    }
  });
  return secondLargestValue;
}

function main() {
  const nums = readLine().split(' ').map(Number);
  console.log(getSecondLargest(nums));
}
