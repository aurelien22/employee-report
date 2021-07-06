# Employee report Kata

## Problem Description

You’re building an employee management system of a local grocery store. The shop-owner wants to open the shop on Sunday and due to legal restrictions employees younger than 18 years are not allowed to work Sundays. The employee asks for a reporting feature so she can schedule work shifts. All employees are already stored somewhere and have the following properties:

- name: string (the name of the employee)
- age: number (the age in years of the employee)

```
const employees = [
    { name: 'Max', age: 17 },
    { name: 'Sepp', age: 18 },
    { name: 'Nina', age: 15 },
    { name: 'Mike', age: 51 },
];
```

## Rules

Start with the first user-story and write at least one test for every requirement. Try not to look on future requirements upfront and follow the TDD-Cycle strictly.

1. As shop owner I want to view a list of all employees, which are older than 18 years, so that I know who is allowed to work on Sundays.
2. As shop owner I want the list of employees to be sorted by their name, so I can find employees easier.
3. As shop owner I want the list of employees to be capitalized, so I can read it better.
4. As shop owner I want the employees to be sorted by their names descending instead of ascending.