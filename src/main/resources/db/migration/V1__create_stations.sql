CREATE TABLE stations (
   id SERIAL PRIMARY KEY,
   network VARCHAR(255) NOT NULL,
   name VARCHAR(255) NOT NULL,
   line_name VARCHAR(255) NOT NULL,
   address VARCHAR(255) NOT NULL,
   city VARCHAR (255) NOT NULL,
   state VARCHAR(255) NOT NULL,
   zip VARCHAR(10) NOT NULL,
   country VARCHAR(255) NOT NULL,
   image_url VARCHAR(255) NOT NULL,
   description text NOT NULL,
   calculated_cost VARCHAR(255) NOT NULL,
   admin_approved BOOLEAN NOT NULL
);
