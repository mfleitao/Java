
DROP TABLE IF EXISTS CATEGORY;

CREATE TABLE CATEGORY (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	NAME VARCHAR(60) NOT NULL
);

INSERT INTO CATEGORY (name) VALUES
  ('Book'),
  ('Food'),
  ('Medical'),
  ('Cosmetic'),
  ('Eletronics'),
  ('Home Utilities'),
  ('Bath & Shower'),
  ('CD Music');