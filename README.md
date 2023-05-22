# MusicStreaming

- This project is a music management system that allows administrators and users to perform various operations related to music. It provides RESTful APIs for managing admins, users, and music.
----
## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- JSON
- Maven
----
## Getting Started
- To get started with the Music Management System, follow these steps:
----
## Clone the repository:

- git clone <repository_url>
- Open the project in your preferred IDE.
- Configure the MySQL database connection in the application.properties file.
-----
* Build the project using Maven:

- mvn clean install
* Run the application:
- mvn spring-boot:run
----
* API Endpoints
1. AdminController
- POST /api/adminController/addAdmin: Add a new admin. The request body should contain the admin details in JSON format. Returns the ID of the added admin.
- POST /api/adminController/addMusic: Add a new music. The request body should contain the music details in JSON format. Returns the ID of the added music.
- GET /api/adminController/getMusic: Get music details. Optional query parameter id can be used to fetch a specific music by ID. Returns a JSON array of music objects.
- PUT /api/adminController/updateMusic/{id}: Update music details. The request body should contain the updated music details in JSON format. Returns a message indicating the status of the update.
- DELETE /api/adminController/deleteMusic/{id}: Delete music. Deletes the music with the specified ID. Returns a message indicating the status of the delete operation.

2. UserController
- POST /api/userController/addUser: Add a new user. The request body should contain the user details in JSON format. Returns the ID of the added user.
- GET /api/userController/getPlaylist/{id}: Get user playlist. Fetches the playlist of the user with the specified ID. Returns a JSON array of music objects.
- DELETE /api/userController/deleteMusic/{id}/{musicId}: Delete music from user playlist. Deletes the specified music from the user's playlist. Returns a message indicating the status of the delete operation.
---
## Data Models
1. Music
- Represents a music entity.

- musicId: Integer
- name: String
- artists: String
- duration: double
- genre: String

2.MusicAdmin
- Represents an admin entity.

- adminId: Integer
- adminName: String
- firstName: String
- lastName: String
- gender: String
- age: Integer
- email: String
- phoneNumber: String

3. MusicUser
- Represents a user entity.

- userId: Integer
- userName: String
- firstName: String
- lastName: String
- gender: String
- age: Integer
- email: String
- phoneNumber: String
- statusId: UserStatus
- playlist: List<Integer>

4. UserStatus
- Represents the status of a user.

- statusId: int
- statusName: String
---
## Repository Interfaces

- IMusicAdmin: Repository interface for MusicAdmin entity.
- IMusicRepository: Repository interface for Music entity.
- IMusicUserRepository: Repository interface for MusicUser entity.
- IUserStatusRepo: Repository interface for UserStatus entity.
---
## Services
1. AdminService
- addAdmin: Add a new admin to the database.
2. MusicService
- addMusic: Add a new music to the database.
- getMusic: Retrieve music details
- updateMusic: Update the details of a music in the database.
- deleteMusic: Delete a music from the database based on the provided ID.
3. UserService
- addUser: Add a new user to the database.
- getPlaylist: Retrieve the playlist of a user from the database based on the provided user ID.
- deleteMusicFromPlaylist: Delete a music from a user's playlist in the database.
----
## Usage
- Once the Music Management System is up and running, you can interact with it using various API endpoints. Here are some example requests using cURL:

- Add an admin:
```
  Content-Type: application/json" -d '{
    "adminName": "admin",
    "firstName": "John",
    "lastName": "Doe",
    "gender": "Male",
    "age": 30,
    "email": "admin@example.com",
    "phoneNumber": "1234567890"
}' http://localhost:8080/api/adminController/addAdmin
 ```
- Add a music:
```
 "Content-Type: application/json" -d '{
    "name": "Song Title",
    "artists": "Artist 1, Artist 2",
    "duration": 3.5,
    "genre": "Pop"
}' http://localhost:8080/api/adminController/addMusic
 ```
- Get music details:

- Fetch all music:
l. http://localhost:8080/api/adminController/getMusic
- Fetch a specific music by ID:
1. http://localhost:8080/api/adminController/getMusic?id=<music_id>
- Update music details:
```
  "Content-Type: application/json" -d '{
    "name": "New Song Title",
    "artists": "Artist 1, Artist 3",
    "duration": 4.2,
    "genre": "Rock"
}' http://localhost:8080/api/adminController/updateMusic/<music_id>
```
- Delete music:
1. DELETE http://localhost:8080/api/adminController/deleteMusic/<music_id>
- Add a user:
```
 "Content-Type: application/json" -d '{
    "userName": "user1",
    "firstName": "Jane",
    "lastName": "Doe",
    "gender": "Female",
    "age": 25,
    "email": "user1@example.com",
    "phoneNumber": "9876543210"
}' http://localhost:8080/api/userController/addUser
```
- Get user playlist:
1. http://localhost:8080/api/userController/getPlaylist/<user_id>
- Delete music from user playlist:
1. DELETE http://localhost:8080/api/userController/deleteMusic/<user_id>/<music_id>

-Feel free to explore and interact with other API endpoints as well.
----
## Contributing
- Contributions to the Music Management System project are welcome. If you find any issues or have suggestions for improvement, please open an issue or submit a

- pull request on the GitHub repository.
----
## License
- This project is licensed under the MIT License.
----
## Acknowledgments
- OpenAPI Specification - The specification used for documenting the API endpoints.
- Spring Boot - The framework used for building the Music Management System.
- Hibernate - The ORM (Object-Relational Mapping) framework used for interacting with the database.
- MySQL - The relational database management system used for storing music and user data.
----
## Contact
- For any questions or inquiries, please contact:

Project Maintainer: Aniket Yogesh Gosavi
Email: aniket9766228627@gmail.com
