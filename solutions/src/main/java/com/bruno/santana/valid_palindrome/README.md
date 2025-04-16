# Valid Palindrome

A phrase is a **palindrome** if, after:

- Converting all uppercase letters into lowercase letters, and
- Removing all non-alphanumeric characters,

…it reads the same **forward and backward**.

Alphanumeric characters include **letters and numbers**.

---

## 🔍 Problem Statement

Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.

---

## 📘 Example 1:

**Input:**  
`s = "A man, a plan, a canal: Panama"`

**Output:**  
`true`

**Explanation:**  
After processing, the string becomes `"amanaplanacanalpanama"`, which is a palindrome.

---

## 📘 Example 2:

**Input:**  
`s = "race a car"`

**Output:**  
`false`

**Explanation:**  
After processing, the string becomes `"raceacar"`, which is **not** a palindrome.

---

## 📘 Example 3:

**Input:**  
`s = " "`

**Output:**  
`true`

**Explanation:**  
The string becomes `""` (empty) after removing non-alphanumeric characters.  
An empty string is considered a palindrome.

---

## ✅ Constraints:

- `1 <= s.length <= 2 * 10⁵`
- `s` consists only of **printable ASCII characters**
