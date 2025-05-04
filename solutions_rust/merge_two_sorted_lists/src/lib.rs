// Definition for singly-linked list.
// #[derive(PartialEq, Eq, Clone, Debug)]
pub struct ListNode {
    pub val: i32,
    pub next: Option<Box<ListNode>>,
}

impl ListNode {
    #[inline]
    pub fn new(val: i32) -> Self {
        ListNode { next: None, val }
    }

    // Method to print the linked list starting from this node
    pub fn print_list(&self) {
        let mut current = Some(self);
        while let Some(node) = current {
            print!("{} -> ", node.val);
            current = node.next.as_ref().map(|box_node| &**box_node);
        }
        println!("None");
    }
}

pub struct Solution;

impl Solution {
    pub fn merge_two_lists(
        list1: Option<Box<ListNode>>,
        list2: Option<Box<ListNode>>,
    ) -> Option<Box<ListNode>> {
        let mut list1 = list1; // shadowing with mutable binding
        let mut list2 = list2;

        let mut dummy = Box::new(ListNode::new(0));
        let mut current = &mut dummy;

        while list1.is_some() && list2.is_some() {
            let (val1, val2) = (list1.as_ref().unwrap().val, list2.as_ref().unwrap().val);
            if val1 <= val2 {
                let mut node = list1.take().unwrap();
                list1 = node.next.take();
                current.next = Some(node);
            } else {
                let mut node = list2.take().unwrap();
                list2 = node.next.take();
                current.next = Some(node);
            }
            current = current.next.as_mut().unwrap();
        }

        current.next = if list1.is_some() { list1 } else { list2 };

        dummy.next
    }
}
