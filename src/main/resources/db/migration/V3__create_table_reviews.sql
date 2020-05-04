CREATE TABLE reviews (
   id SERIAL PRIMARY KEY,
   title VARCHAR(255) NOT NULL,
   date DATE NOT NULL,
   review TEXT NOT NULL,
   cleanliness INTEGER NOT NULL,
   on_time INTEGER NOT NULL,
   capacity INTEGER NOT NULL,
   overall_rating INTEGER NOT NULL,
   station_id INTEGER REFERENCES stations(id) NOT NULL,
   user_id INTEGER REFERENCES users(id) NOT NULL
);