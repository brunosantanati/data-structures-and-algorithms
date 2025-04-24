# 🧪 Go Basic Guide

A simple guide to writing and running unit tests in **Go (Golang)**.

---

## 🛠️ Requirements

- Go installed (`go version` to check)
- A Go module initialized (`go mod init <module-name>`)

---

## 📦 How to Create `go.mod`

Before writing or running tests, initialize a Go module in your project directory:

```bash
go mod init example.com/mymodule
```

> Replace `example.com/mymodule` with your actual module path or any name you prefer.

This creates a `go.mod` file that declares your module and tracks dependencies.

Example `go.mod` file:

```
module example.com/mymodule

go 1.21
```

> You only need to do this **once per project** (in the root directory).

---

## 🚀 How to Run a GO program  


```bash
go run two-sum.go
```

## ✅ How to Write Tests

- Test files should be named with `_test.go` suffix.
- Test functions should start with `Test` and take `*testing.T` as a parameter.

📁 Example structure:

```
algorithm-folder/
├── main.go
├── main_test.go
└── go.mod
```

---

## 🚀 How to Run Tests

### 📌 Option 1: Run tests in the current package

```bash
go test
```

---

### 📌 Option 2: Run tests with verbose output

```bash
go test -v
```

---

### 📌 Option 3: Run tests in all subdirectories (e.g., in a monorepo)

```bash
go test ./...
```

---

### 📌 Option 4: Run a specific test function

```bash
go test -run TestFunctionName
```

> Replace `TestFunctionName` with the actual test function name.

---

## 🔍 Example Output

```
=== RUN   TestSum
--- PASS: TestSum (0.00s)
PASS
ok  	example.com/mymodule	0.001s
```

---

Happy coding and testing! 🧪

