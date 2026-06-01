# Digital Nurture JavaFSE - Full Stack Development Learning Platform

![Version](https://img.shields.io/badge/version-1.0.0-blue) ![License](https://img.shields.io/badge/license-MIT-green) ![Status](https://img.shields.io/badge/status-Active-brightgreen)

A complete full-stack development learning platform with **120+ structured exercises** covering HTML5, CSS3, JavaScript, Bootstrap, Java, and SQL.

---

## 📌 What is This Project?

**Digital Nurture JavaFSE** teaches full-stack web development through a real-world project: building a **Local Community Event Portal** where users can register for events, check locations, and access services.

**Perfect for:** Beginners to intermediate developers preparing for tech careers.

---

## 🎯 What You'll Learn

| Technology | Exercises | Level |
|-----------|-----------|-------|
| **HTML5** | 10 | Beginner |
| **CSS3** | 11 | Beginner-Intermediate |
| **JavaScript** | 14 | Intermediate-Advanced |
| **Bootstrap 5** | 19 | Intermediate |
| **SQL & MySQL** | 25 | Beginner-Intermediate |
| **Core Java** | 41 | Beginner-Advanced |

**Total: 120+ Exercises**

---

## 📚 Topics Covered

### Frontend
- Semantic HTML5 & forms
- Responsive CSS3 layouts
- JavaScript DOM manipulation
- Event handling & async programming
- Bootstrap components
- APIs (Geolocation, LocalStorage)

### Backend
- Java OOP & data structures
- Exception handling
- Collections & Streams
- File I/O & multithreading
- JDBC database connectivity
- Socket programming

### Database
- SQL CRUD operations
- Complex queries & joins
- Data modeling
- 6 interconnected tables
- 25 real-world SQL challenges

---

## 🚀 Quick Start

### Prerequisites

Java JDK 11+
MySQL 8.0+
VS Code or IntelliJ IDEA
Git 2.0+

### Setup Instructions

**1. Clone Repository**
```bash
git clone https://github.com/Sareij/Digital-Nurture-JavaFSE.git
cd Digital-Nurture-JavaFSE
```

**2. Setup Database**
```bash
mysql -u root -p
CREATE DATABASE event_portal;
USE event_portal;
SOURCE 05-database-sql/schema/users_table.sql;
SOURCE 05-database-sql/schema/events_table.sql;
SOURCE 05-database-sql/schema/sessions_table.sql;
SOURCE 05-database-sql/schema/registrations_table.sql;
SOURCE 05-database-sql/schema/feedback_table.sql;
SOURCE 05-database-sql/schema/resources_table.sql;
SOURCE 05-database-sql/sample-data/sample_dataset.sql;
```

**3. Frontend (HTML/CSS/JS)**
```bash
# Open VS Code
code .

# Use Live Server extension or
python -m http.server 8000

# Access: http://localhost:8000
```

**4. Backend (Java)**
```bash
cd 06-core-java
javac 01-hello-world/HelloWorld.java
java 01-hello-world.HelloWorld
```

---

## 📂 Project Structure
digital-nurture-javafse/
├── 01-html5-exercises/          (10 exercises)
├── 02-css3-exercises/           (11 exercises)
├── 03-javascript-exercises/     (14 exercises)
├── 04-bootstrap5-exercises/     (19 exercises)
├── 05-database-sql/             (25 exercises)
│   ├── schema/                  (6 tables)
│   └── sample-data/             (100+ records)
├── 06-core-java/                (41 exercises)
├── resources/
└── README.md
---

## 📖 How to Use

1. **Start with HTML5** - Exercises 1-10 (Beginner)
2. **Learn CSS3** - Exercises 1-11 (Styling)
3. **Master JavaScript** - Exercises 1-14 (Interactivity)
4. **Use Bootstrap** - Exercises 1-19 (Components)
5. **Practice SQL** - Exercises 1-25 (Database)
6. **Code Java** - Exercises 1-41 (Backend)

**Each exercise includes:**
- Scenario (real-world context)
- Objective (learning goal)
- Task (what to build)
- Instructions (step-by-step)

---

## 🎓 Learning Outcomes

✅ Frontend: HTML5, CSS3, JavaScript, Bootstrap 5  
✅ Backend: Core Java, OOP, Collections, Streams  
✅ Database: SQL, MySQL, Data Modeling  
✅ Integration: JDBC, API calls, Form submission  
✅ Testing: Chrome DevTools, Debugging, Error handling  

---

## 💼 Why This Project?

### For Students
- 120+ exercises to practice
- Real-world project portfolio
- Industry-standard tech stack
- Interview preparation

### For Job Seekers
- Complete full-stack skills
- Portfolio project to showcase
- Resume builder
- Career advancement

---

## 🧪 Exercise Examples

### HTML5 Exercise 1: Base Template
- Create semantic HTML5 structure
- Test in Chrome DevTools
- Save as index.html

### CSS3 Exercise 10: Media Queries
- Build responsive design
- Test on mobile (768px breakpoint)
- Use Flexbox/Grid

### JavaScript Exercise 6: Array Methods
- Use `.filter()`, `.map()`, `.sort()`
- Build event filtering system
- Handle dynamic data

### SQL Exercise 2: Top Rated Events
- Query events with highest ratings
- Filter by 10+ feedback entries
- Sort by average rating

### Java Exercise 13: Recursive Fibonacci
- Implement recursion
- Calculate nth Fibonacci number
- Handle large numbers

---

## 🔍 Database Schema

**6 Tables:**
1. **Users** - user_id, full_name, email, city, registration_date
2. **Events** - event_id, title, description, city, dates, status, organizer_id
3. **Sessions** - session_id, event_id, title, speaker, times
4. **Registrations** - registration_id, user_id, event_id, registration_date
5. **Feedback** - feedback_id, user_id, event_id, rating, comments, date
6. **Resources** - resource_id, event_id, type, url, uploaded_at

**Sample Data: 100+ records across all tables**

---

## 🛠️ Technologies

**Frontend:**
- HTML5, CSS3, JavaScript (ES6+)
- Bootstrap 5
- APIs (Geolocation, LocalStorage, Fetch)

**Backend:**
- Java (Core, OOP, Collections, Streams, Multithreading)
- JDBC for database connectivity
- Socket programming

**Database:**
- MySQL 8.0+
- SQL queries, joins, aggregations

**Tools:**
- Git & GitHub
- VS Code / IntelliJ IDEA
- Chrome DevTools
- MySQL Workbench

---

## 📊 Exercise Distribution

| Difficulty | Count | Time |
|-----------|-------|------|
| Beginner | 47 | 2-3 weeks |
| Intermediate | 51 | 3-4 weeks |
| Advanced | 22 | 2-3 weeks |
| **TOTAL** | **120** | **7-10 weeks** |

---

## 🤝 Contributing

1. Fork the repository
2. Create feature branch: `git checkout -b feature/improvement`
3. Commit changes: `git commit -m "Add: description"`
4. Push to branch: `git push origin feature/improvement`
5. Open Pull Request

---

## 📄 License

MIT License - Free for personal and educational use.

---

## 👨‍💻 Author

**Sareij**  
GitHub: [@Sareij](https://github.com/Sareij)

---

## 📞 Support

- 🐛 **Issues**: Open GitHub issue for bugs/questions
- 💬 **Discussions**: Use GitHub Discussions
- 📧 **Contact**: saranyawise06@gmail.com
- 📚 **Wiki**: Check project wiki for FAQs

---

## ⭐ If Helpful, Give a Star!

```bash
git pull  # Stay updated with new exercises
```

---

**Built for aspiring developers. Start coding today!** 🚀
