# AdTech Quiz Application

A simple web-based quiz application built with **Spring Boot**, **MySQL**, and a single HTML file for the frontend. The app presents 10 Java-related multiple-choice questions, allows users to answer them sequentially using a "Next" button, and displays the score with correct and incorrect answers upon submission.

---

## Features

* **Backend**: Spring Boot with MySQL for storing and managing quiz questions.
* **Frontend**: Single HTML file with embedded CSS and JavaScript for a responsive UI.
* **Functionality**:

  * Loads 10 questions from a MySQL database.
  * Users answer questions one at a time with a "Next" button.
  * Submits answers with a "Submit" button to calculate the score.
  * Displays the score and details of correct/incorrect answers.

---

## Database

Stores questions with the following fields:

* `ques_id`
* `title`
* `optionA`
* `optionB`
* `optionC`
* `ans`
* `chose`

---

## Project Structure

```
quizapp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/quizapp/
│   │   │       ├── QuizApplication.java
│   │   │       ├── model/
│   │   │       │   └── Question.java
│   │   │       ├── repository/
│   │   │       │   └── QuestionRepository.java
│   │   │       ├── service/
│   │   │       │   └── QuizService.java
│   │   │       └── controller/
│   │   │           └── QuizController.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/quizapp/
│               └── QuizApplicationTests.java
├── pom.xml
└── questions.sql
```

---

## Prerequisites

* Java 21 (e.g., OpenJDK)
* Maven
* MySQL
* VS Code with extensions:

  * Java Extension Pack (Microsoft)
  * Spring Boot Extension Pack (Pivotal)
* Web browser (Chrome/Firefox)

---

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/PraveenKumar-A02/AdTech_Quiz.git
cd quizapp
```

### 2. Set Up MySQL Database

```sql
mysql -u root -p
CREATE DATABASE quizdb;
```

Run the questions.sql script:

```bash
mysql -u root -p quizdb < questions.sql
```

### 3. Configure Application

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/quizdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run the Application

```bash
mvn spring-boot:run
```

Access the app at: `http://localhost:8080`

---

## Usage

1. Open `http://localhost:8080` in a browser.
2. The quiz loads with the first question and three options.
3. Select an option and click **Next**.
4. After 10 questions, click **Submit**.
5. The result page shows:

   * Your score (e.g., "Your Score: 7/10").
   * Each question with your answer.
   * Correct answers highlighted (green) and incorrect ones (red).

---

## API Endpoints

* **GET** `/api/quiz/questions`: Retrieves all 10 questions.
* **POST** `/api/quiz/submit`: Submits answers and returns result.

  * **Request Body**: JSON mapping question IDs to selected options. Example:

    ```json
    {
      "1": 3,
      "2": 1,
      "3": 2
    }
    ```
  * **Response**: JSON with score, total questions, and per-question results.

---

## Database Schema

```sql
CREATE TABLE IF NOT EXISTS question (
    ques_id BIGINT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    optionA VARCHAR(255) NOT NULL,
    optionB VARCHAR(255) NOT NULL,
    optionC VARCHAR(255) NOT NULL,
    ans INT NOT NULL,
    chose INT NOT NULL
);
```

* `ques_id`: Unique question ID
* `title`: Question text
* `optionA`, `optionB`, `optionC`: Answer options
* `ans`: Correct option index (1, 2, or 3)
* `chose`: User's selected option (default -1, updated on submission)

---

## Contributing

1. Fork the repository
2. Create a feature branch:

```bash
git checkout -b feature/your-feature
```

3. Commit your changes:

```bash
git commit -m "Add your feature"
```

4. Push the branch:

```bash
git push origin feature/your-feature
```

5. Open a pull request

---

