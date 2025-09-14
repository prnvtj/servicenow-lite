# ServiceNow Lite 🚀

This is a personal project where I’m trying to build a **lightweight version of ServiceNow** in Java.
The idea is to understand how enterprise tools like ServiceNow manage **users, roles, and access control**, while also practicing **System Design** and **Low-Level Design (LLD)**.

I’m documenting my progress day by day, so this repo will slowly evolve into a more complete system.

---

## 📅 Progress So Far

* **Day 1**: Finalized the idea and decided on the modules (User Management, Roles, Incidents, Knowledge Base, Catalog).
* **Day 2**: Got the project running locally and set up the package structure.
* **Day 3**: Implemented User and Role classes, set up a `UserRole` mapping for many-to-many relationships, created a `UserManager` service, and added a placeholder for `UserNotFoundException`.

---

## 📂 Project Structure

```
src/com/servicenowlite/
│
├── model/
│   ├── User.java
│   ├── Role.java
│   ├── UserRole.java
│
├── service/
│   └── UserManager.java
│
├── exception/
│   └── UserNotFoundException.java
│
└── Main.java
```

* **model** → all core entities like `User`, `Role`, `UserRole`.
* **service** → service layer to handle business logic (currently `UserManager`).
* **exception** → custom exceptions (to be expanded later).
* **Main.java** → entry point to run and test features.

---

## 🔑 Features Implemented

* Unique `sys_id` generated for every record (mimicking ServiceNow’s approach).
* Users can have multiple roles and roles can belong to multiple users (many-to-many mapping like `sys_user_has_role`).
* Basic User Manager service for creating and fetching users.

---

## ⚙️ Tech Stack

* **Language**: Java
* **Version Control**: Git + GitHub
* **Design**: UML class diagrams (in progress)

---

## 🚀 How to Run

1. Clone the repo

   ```bash
   git clone https://github.com/prnvtj/servicenow-lite.git
   ```
2. Compile and run

   ```bash
   cd serviceNow-lite/src
   javac com/servicenowlite/Main.java
   java com.servicenowlite.Main
   ```

---

## 🔮 Next Steps

* Finish `UserNotFoundException` implementation.
* Add **Incident Management** module.
* Start documenting UML diagrams under `/docs`.

---

## 👤 Author

I’m **Pranav Tej**, currently working as a ServiceNow developer and learning **System Design + LLD** to grow into a Software Engineer role.

* GitHub: [github.com/prnvtj](https://github.com/prnvtj)


