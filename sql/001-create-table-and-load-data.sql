CREATE TABLE names (
    id int unsigned AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    age INT,
    job VARCHAR(20),
    PRIMARY KEY(id)
);

INSERT INTO names (name,age,job) VALUES ('Kana', 31, 'police');
INSERT INTO names (name,age,job) VALUES ('Naoko', 63,'housekeeper');
INSERT INTO names (name,age,job) VALUES ('Cisco', 32,'IT');
INSERT INTO names (name,age,job) VALUES ('Minori', 25,'sales');
INSERT INTO names (name,age,job) VALUES ('Tarou', 20,'student');
INSERT INTO names (name,age,job) VALUES ('Kazunori',62,'architect');

