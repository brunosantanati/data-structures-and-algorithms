# 🦀 Rust Basic Guide

A simple guide to writing, running, and organizing unit tests in **Rust**.

---

## 🛠️ Requirements

- Rust installed (`rustc --version` to check)
- Cargo package manager installed (comes with Rust)

---

## 📦 How to Create a Rust Project

To create a new Rust project:

```bash
cargo new my_project
cd my_project
```

This creates the following structure:

```
my_project/
├── Cargo.toml
└── src/
    └── main.rs
```

> To write reusable functions with tests, you can use `lib.rs` instead of `main.rs`.

To create a library crate (a reusable library), you can use the --lib flag when running cargo new:

```bash
cargo new my_project --lib
cd my_project
```

This creates the following structure for a library crate:

```
my_project/
├── Cargo.toml
└── src/
    └── lib.rs
```

In this case, the src/lib.rs file contains the logic of your library. There is no main.rs file by default, as this project is intended to produce a library, not an executable.

---

## 🚀 How to Run a Rust Program

If your entry point is `main.rs`, simply run:

```bash
cargo build
cargo run
```

This will build and execute your program.

If you're using `rustc` manually (for single files):

```bash
rustc my_file.rs
./my_file
```

---

## 🚀 How to Run Tests

Run all tests in your project:

```bash
cargo test
```

---

## 🧪 Run a Specific Test

To run a specific test by name:

```bash
cargo test test_scenario1
```

Use `-- --nocapture` to see `println!()` output during tests:

```bash
cargo test -- --nocapture
```

---

## 📁 Project Structure

For libraries:

```
my_project/
├── Cargo.toml
└── src/
    └── lib.rs
```

For executables:

```
my_project/
├── Cargo.toml
└── src/
    └── main.rs
```

For integration tests (optional):

```
my_project/
└── tests/
    └── some_test.rs
```

---

## 🔍 Example Output

```
running 2 tests
test tests::test_add ... ok
test tests::test_add_negative ... ok

test result: ok. 2 passed; 0 failed
```

---

## 🎉 Bonus: Run Benchmarks (Nightly Only)

```bash
cargo bench
```

> Requires nightly toolchain and the `#[bench]` attribute.

---

Happy coding and testing in Rust! 🧪🦀
 
