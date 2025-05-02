use two_sum::two_sum;

#[test]
fn test_scenario1() {
    let nums = vec![2, 7, 11, 15];
    let target = 9;
    let result = two_sum(nums, target);
    assert_eq!(result, vec![0, 1]);
}

#[test]
fn test_scenario2() {
    let nums = vec![3, 2, 4];
    let target = 6;
    let result = two_sum(nums, target);
    assert_eq!(result, vec![1, 2]);
}

