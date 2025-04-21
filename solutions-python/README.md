# 🧪 Python Unit Testing Guide

## 🐍 Requirements

- Python 3.x
- (Optional) `pytest` for easier test running

## ✅ How to Run Tests

### Option 1: Run directly with `python3`
```bash
python3 test_two_sum.py
```

### Option 2: Use unittest discovery
```bash
python3 -m unittest discover
```

### Option 3: Use `pytest`
```bash
pip install pytest
pytest
```

## 🔍 Example Output
```
....
----------------------------------------------------------------------
Ran 4 tests in 0.001s

OK
```

# 🧪 Python Debugging Guide

Include this line in your code where you want to start debugging:  
```python
import pdb; pdb.set_trace()
```

Debug options / Common pdb commands:
- `n (next)`: Execute the current line and move to the next line in the current function.
- `s (step)`: Execute the current line and step into a function call.
- `c` (continue): Continue execution until the next breakpoint or the end of the program.
- `p` <expression> (print): Evaluate and print the value of an expression.
- `pp` <expression> (pretty print): Pretty-print the value of an expression (useful for complex data structures).
- `l` (list): Show the code around the current line.
- `q` (quit): Abort the execution of the script.
- `r` (return): Continue execution until the current function returns.
- `b` (breakpoint): Set or list breakpoints. b <lineno> sets a breakpoint at a specific line, b <filename>:<lineno> in another file, and b <function> at the start of a function.
- `cl` <breakpoint_number(s)> (clear): Clear specified breakpoints.
