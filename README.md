
# 🎬 Book My Show - Machine Coding Problem (Core Java)

This repository contains a **machine coding solution** for a simplified version of the **Book My Show** ticket booking application. It is implemented using **Core Java**, adhering to clean code principles, object-oriented design, and scalable architecture.

---

## 🚀 Features

- 🎟️ **Movie and Show Management**
  - Add and manage movies, cities, theatres, and showtimes.
  
- 🪑 **Seat Booking**
  - Real-time seat selection and booking.
  - Prevents double bookings via basic concurrency-safe mechanisms.

- 🧾 **Ticket Generation**
  - Generates a unique booking ID with user and show details.

- 📍 **City-based Search**
  - Find available shows by city and date.

- 🛠️ **Modular Design**
  - Follows **SOLID** principles.
  - Extensible classes for Movies, Theatres, Shows, Bookings, and Users.

---

## 🏗️ Tech Stack

- 💻 **Language:** Java 17+ (Core Java)
- ⚙️ **Paradigm:** Object-Oriented Programming
- 🧪 **Testing:** Manual test cases (CLI )

---

## 📂 Project Structure

```
book-my-show/
│
├── models/              # Movie, Theatre, Seat, Show, User, Booking
├── services/            # BookingService, ShowService, TheatreService
├── repository(client.db)/          # In-memory data store
└── BookMyShowApplication.java            # Entry point with sample interactions
```

---

## ✅ Sample Functionalities

- Add new **movies** and **theatres**.
- List shows in a **specific city**.
- Book available **seats** for a selected show.
- Display booking confirmation.

---

## 🎯 Future Enhancements

- Integrate with a **Web UI** or **REST API**.
- Implement **database layer** (MySQL/PostgreSQL).
- Add **unit tests** using JUnit/TestNG.
- Introduce **cancellation and refund logic**.
- Improve concurrency with Java locks/semaphores.

---

## 📸 Demo (Optional)

> 
══════════════════════════════════════════
          🎬 Welcome to BookMyShow 🎟️
══════════════════════════════════════════

Please select a city
    1   BANGALORE
    2   DELHI
    3   MUMBAI
👉 Enter choice (1-3): 1
    Please select a movie   
1  Hulchal
2  Bhagam Bhag
3  Krish
4  Iron Man
5  Avengers
👉 Enter choice (1-5): 1
    Please select a Theater   
1  PVR Nexus time  2025-05-25T15:30
2  PVR Nexus time  2025-05-25T18:30
3  Inox Phonix time  2025-05-25T15:30
4  Inox Phonix time  2025-05-25T18:30
5  PVR Nexus time  2025-05-25T15:30
6  PVR Nexus time  2025-05-25T18:30
7  Inox Phonix time  2025-05-25T15:30
8  Inox Phonix time  2025-05-25T18:30
9  PVR Nexus time  2025-05-25T15:30
10  PVR Nexus time  2025-05-25T18:30
11  Inox Phonix time  2025-05-25T15:30
12  Inox Phonix time  2025-05-25T18:30
👉 Enter choice (1-12): 1
    Please select a show in Theater  PVR Nexus
1 row 1 class NORMAL Amount 250.0
2 row 1 class NORMAL Amount 250.0
3 row 1 class NORMAL Amount 250.0
4 row 1 class NORMAL Amount 250.0
5 row 1 class NORMAL Amount 250.0
6 row 2 class PREMIUM Amount 350.0
7 row 2 class PREMIUM Amount 350.0
8 row 2 class PREMIUM Amount 350.0
9 row 2 class PREMIUM Amount 350.0
10 row 2 class PREMIUM Amount 350.0
11 row 3 class DELUX Amount 450.0
12 row 3 class DELUX Amount 450.0
13 row 3 class DELUX Amount 450.0
14 row 3 class DELUX Amount 450.0
15 row 3 class DELUX Amount 450.0
👉 Enter choice (1-15): 2
=========Ticket Booked ==========
========= Movie: Hulchal==========
=========Seat Number 2==========
=========Amount paid 250.0==========
    Wan to book another ticket ?    
Enter
 1: Yes 
 2: No 
👉 Enter choice (1-2): 

---

## 🧠 Why This Project?

This project was built as part of machine coding interview preparation. It emphasizes **design quality**, **modularity**, and **readability** — key aspects for cracking top product-based company interviews.

---

## 📬 How to Run

1. Clone the repository:

```bash
git clone https://github.com/kumarmukesh3774/BookMyShow.git
cd BookMyShow
```

2. Compile and run using your IDE or:

```bash
javac BookMyShowApplication.java
java Main
```

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).
