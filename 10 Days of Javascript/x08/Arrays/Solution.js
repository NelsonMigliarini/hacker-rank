/**
 * @author Nelson Migliarini
 */
function getSecondLargest(nums) {
  nums.sort((x, y) => x < y);
  let largest = nums[0];
  let secondLargest;
  for(let num of nums)
    if(num < largest) {
      secondLargest = num;
      break;
    }
  return secondLargest;
}