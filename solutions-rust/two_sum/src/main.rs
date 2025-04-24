use two_sum::two_sum;

fn main() {
    let nums = vec![2, 7, 11, 15];
    let target = 9;
    let result = two_sum(nums, target);
    println!("{:?}", result); // Output: [0, 1]
}

