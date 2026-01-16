
# 🎯 Java DSA – Interview Questions (Week 1)

This document contains **commonly asked interview questions** based on **Week 1 DSA topics**:

* Constraints & Complexity
* HashMap / HashSet
* Two Sum
* Contains Duplicate
* Buy & Sell Stock
* Maximum Subarray (Kadane)
* Move Zeroes
* Two Pointers
* Greedy Thinking

---

## 🟢 SECTION 1 — BASIC INTERVIEW QUESTIONS

### Q1 What are constraints and why are they important?

**Expected Answer:**
Constraints define input size and limits. They help decide whether a brute force or optimized approach is required.

---

### Q2 What happens if you ignore constraints?

**Expected Answer:**
Your solution may pass small test cases but fail due to **TLE (Time Limit Exceeded)** on large inputs.

---

### Q3  Difference between HashMap and HashSet?

**Expected Answer:**

* HashMap stores **key–value pairs**
* HashSet stores **unique values only**

---

### Q4 When should you use HashMap in DSA problems?

**Expected Answer:**
When you need **fast lookup** and to store **extra information** like index or frequency.

---

### Q5 What does O(n) mean?

**Expected Answer:**
Time complexity grows linearly with input size.

---

## 🟡 SECTION 2 — PROBLEM-SPECIFIC QUESTIONS

### Q6 Explain the Two Sum problem in your own words.

**Expected Answer:**
We need to find two numbers whose sum equals the target and return their indices.

---

### Q7 Why is brute force not optimal for Two Sum?

**Expected Answer:**
Because constraints allow large input sizes, making O(n²) too slow.

---

### Q8 Why do we check before putting into HashMap in Two Sum?

**Expected Answer:**
To avoid using the same element twice.

---

### Q9 What does Contains Duplicate return and why?

**Expected Answer:**
It returns true if any element appears more than once.

---

### Q10 Why is HashSet best for Contains Duplicate?

**Expected Answer:**
Because it stores unique elements and provides O(1) lookup.

---

## 🟡 SECTION 3 — GREEDY THINKING (VERY IMPORTANT)

### Q11 What is a Greedy algorithm?

**Expected Answer:**
A greedy algorithm makes the best decision at the current step without reconsidering past decisions.

---

### Q12 Why does the Greedy approach work in Buy & Sell Stock?

**Expected Answer:**
Because only one transaction is allowed and selling must happen after buying.

---

### Q13 What does `minPrice` represent?

**Expected Answer:**
The lowest stock price seen so far.

---

### Q14 What happens if prices always decrease?

**Expected Answer:**
No profit is possible, so return 0.

---

## 🟠 SECTION 4 — KADANE’S ALGORITHM (INTERMEDIATE)

### Q15 What problem does Kadane’s algorithm solve?

**Expected Answer:**
Maximum subarray sum.

---

### Q16 Why do we reset the current sum in Kadane’s algorithm?

**Expected Answer:**
Because a negative sum reduces future subarray sums.

---

### Q17 Is Kadane’s algorithm Greedy or DP?

**Expected Answer:**
It is a combination of **Greedy + Dynamic Programming**.

---

### Q18 Can Kadane’s algorithm handle all negative numbers?

**Expected Answer:**
Yes, it returns the maximum (least negative) element.

---

## 🟠 SECTION 5 — TWO POINTERS & IN-PLACE LOGIC

### Q19 What is the Two Pointers technique?

**Expected Answer:**
Using two indices to read and write data efficiently in-place.

---

### Q20 Why is Move Zeroes done in two passes?

**Expected Answer:**
First pass moves non-zero elements, second pass fills zeros safely.

---

### Q21 What mistake causes `[0,0,0,0,0]` output in Move Zeroes?

**Expected Answer:**
Writing zeros while still reading the array.

---

## 🔴 SECTION 6 — ADVANCED INTERVIEW THINKING

### Q22 How do constraints guide algorithm selection?

**Expected Answer:**
They indicate whether O(n²), O(n log n), or O(n) solutions are acceptable.

---

### Q23 How would you explain your solution in an interview?

**Expected Answer:**
Start with brute force → analyze complexity → optimize → explain pattern.

---

### Q24 What patterns did you learn in Week 1?

**Expected Answer:**

* Hashing
* Greedy
* Kadane’s Algorithm
* Two Pointers

---

### Q25 What would you revise if given 5 minutes before interview?

**Expected Answer:**
Constraints, patterns, and edge cases.

---

## 🧠 BONUS RAPID-FIRE QUESTIONS (INTERVIEW FAVORITES)

* Difference between O(1) space and O(n) space?
* Why do interviewers prefer optimized solutions?
* What happens if HashMap lookup is not O(1)?
* Can Two Sum be solved without extra space?
* What makes a solution “interview-ready”?

---

## ✅ HOW TO PRACTICE THIS FILE

* Try answering **out loud**
* Time yourself (1–2 minutes per question)
* Focus on **clarity, not speed**
* Practice explaining **without code**

---

## 🎯 WHAT THIS PREPARES YOU FOR

* Fresher interviews
* Internship interviews
* Online assessments
* Technical HR rounds

---

