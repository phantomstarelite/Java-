

# 📘 Java DSA Notes – LeetCode Foundations

This document contains **detailed notes** for understanding **core DSA concepts and patterns** using **Java**, based on beginner-level LeetCode problems.

These notes focus on:

* Understanding **why** a solution works
* Learning **patterns**, not memorizing code
* Preparing for **coding interviews**

---

## 📌 How to Use These Notes

* Read **before** solving a new problem
* Revisit **after** solving problems
* Use for **revision before interviews**
* Link concepts to problems in `PROBLEMS.md`

---

# 1️⃣ Understanding Constraints (MOST IMPORTANT)

## What Are Constraints?

Constraints define:

* Input size limits
* Value ranges
* Guarantees given by the problem

They decide:

* Which algorithms are valid
* Which data structures to use

---

## How Constraints Affect Your Solution

### Example:

```
nums.length <= 10^5
```

* ❌ O(n²) → TOO SLOW
* ✅ O(n) or O(n log n) → ACCEPTABLE

### Golden Rules

* `n ≤ 10²` → O(n²) might work
* `n ≥ 10⁴ or 10⁵` → O(n²) ❌
* Large value range → avoid array indexing tricks

> **Always read constraints before coding.**

---

# 2️⃣ Time & Space Complexity (Quick Reference)

## Time Complexity

| Complexity | Meaning      | Usage               |
| ---------- | ------------ | ------------------- |
| O(1)       | Constant     | Best                |
| O(n)       | Single loop  | Ideal               |
| O(n log n) | Sorting      | Acceptable          |
| O(n²)      | Nested loops | Avoid for large `n` |

## Space Complexity

| Space | Meaning                 |
| ----- | ----------------------- |
| O(1)  | No extra data structure |
| O(n)  | HashMap / HashSet       |

---

# 3️⃣ Hashing Fundamentals

## HashMap vs HashSet

### HashMap

Used when you need to store **extra information**.

```
Key → Value
```

Examples:

* Value → Index
* Number → Frequency

### HashSet

Used when you only care about:

* Uniqueness
* Existence

---

### Golden Rule

> Need **position/info** → HashMap
> Need **uniqueness only** → HashSet

---

# 4️⃣ Two Sum (HashMap Pattern)

## Problem Goal

Find two numbers such that:

```
nums[i] + nums[j] = target
```

Return their **indices**.

---

## Key Idea

For each element:

```
needed = target - current
```

Check if `needed` already exists.

---

## Why HashMap?

* Fast lookup → O(1)
* Stores value → index

---

## Pattern

```
Hashing (Complement Lookup)
```

---

# 5️⃣ Contains Duplicate (HashSet Pattern)

## Problem Goal

Check if any number appears more than once.

---

## Key Idea

Ask:

> “Have I seen this number before?”

---

## Why HashSet?

* Stores unique values
* O(1) lookup

---

## Pattern

```
Hashing (Uniqueness Check)
```

---

# 6️⃣ Greedy Algorithm (Core Concept)

## What is Greedy?

* Make the **best decision at the current step**
* Never change past decisions

---

## When Greedy Works

* Only one pass required
* Local optimal → global optimal
* Constraints restrict choices

---

# 7️⃣ Best Time to Buy and Sell Stock (Greedy)

## Problem Goal

* Buy once
* Sell once
* Maximize profit

---

## Key Idea

* Track **minimum price so far**
* Calculate profit every day

---

## Why Greedy Works Here

* Only one transaction allowed
* Selling must be after buying

---

## Pattern

```
Greedy (Track min / max)
```

---

# 8️⃣ Kadane’s Algorithm (Maximum Subarray)

## Problem Goal

Find maximum sum of a **contiguous subarray**.

---

## Key Question

> “Should I extend the previous subarray or start new?”

---

## Core Formula

```
currSum = max(nums[i], currSum + nums[i])
maxSum = max(maxSum, currSum)
```

---

## Why It Works

* Drops negative contributions
* Keeps best running sum

---

## Pattern

```
Greedy + DP (Kadane’s Algorithm)
```

---

# 9️⃣ Two Pointers Technique

## When to Use

* In-place array modification
* Maintain order
* No extra space allowed

---

## Core Idea

* One pointer reads
* One pointer writes

---

## Examples

* Move Zeroes
* Remove Duplicates
* Valid Palindrome

---

# 🔟 Move Zeroes (Two Pointers)

## Problem Goal

* Move all zeros to end
* Keep non-zero order
* Modify array in-place

---

## Correct Strategy

1. Move non-zero elements forward
2. Fill remaining positions with zero

---

## Common Mistake ❌

* Writing zeros while still reading input

---

## Pattern

```
Two Pointers (In-Place Array)
```

---

# 1️⃣1️⃣ LeetCode vs VS Code (IMPORTANT)

| VS Code        | LeetCode           |
| -------------- | ------------------ |
| Needs `main()` | ❌ No `main()`      |
| Print output   | ❌ No printing      |
| Any class name | Must be `Solution` |

---

# 1️⃣2️⃣ Standard Problem-Solving Approach

Always follow this order:

1. Read problem carefully
2. Read constraints
3. Think brute force
4. Analyze complexity
5. Optimize using a pattern
6. Dry run with example
7. Code
8. Test edge cases

---

# 🧠 Pattern Summary Table

| Pattern      | Problems           |
| ------------ | ------------------ |
| HashMap      | Two Sum            |
| HashSet      | Contains Duplicate |
| Greedy       | Buy & Sell Stock   |
| Kadane       | Maximum Subarray   |
| Two Pointers | Move Zeroes        |

---

# ⭐ Final Takeaways

* Constraints decide everything
* Patterns repeat across problems
* Code clarity > clever tricks
* Interviewers test thinking, not syntax

---

## 👤 Author

**Pratik**
Java | DSA | LeetCode Practice

---

## 🚀 Next Topics (Planned)

* Remove Duplicates from Sorted Array
* Valid Palindrome
* Sliding Window
* Recursion basics
* Stack & Queue

