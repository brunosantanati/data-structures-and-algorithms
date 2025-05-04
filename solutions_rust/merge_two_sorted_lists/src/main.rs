use merge_two_sorted_lists::{ListNode, Solution};

fn main() {
    let node3_1 = Box::new(ListNode::new(4));
    let mut node2_1 = Box::new(ListNode::new(2));
    let mut node1_1 = Box::new(ListNode::new(1));

    // Linking nodes together
    node2_1.next = Some(node3_1);
    node1_1.next = Some(node2_1);

    let node4_2 = Box::new(ListNode::new(4));
    let mut node3_2 = Box::new(ListNode::new(3));
    let mut node1_2 = Box::new(ListNode::new(1));

    // Linking nodes together
    node3_2.next = Some(node4_2);
    node1_2.next = Some(node3_2);

    let merged_list = Solution::merge_two_lists(Some(node1_1), Some(node1_2));

    if let Some(merged_list) = merged_list {
        merged_list.print_list();
    }
}
