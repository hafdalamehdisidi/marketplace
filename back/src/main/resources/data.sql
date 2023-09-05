/* genres*/
INSERT INTO genres (name) VALUES ("Infantil")
INSERT INTO genres (name) VALUES ("Juvenil")
INSERT INTO genres (name) VALUES ("Manga")
INSERT INTO genres (name) VALUES ("Novela Gráfica")
INSERT INTO genres (name) VALUES ("Humor")
INSERT INTO genres (name) VALUES ("Superhéroes")

INSERT INTO comics (isbn, title, author, price, ishardcover, synopsis, photo, stock) VALUES ("IJJJ","La tormenta","Luis",17.9,true,"jdiojdf joifjd","fkod",20)

INSERT INTO genres_comics (comics_isbn, genres_id) VALUES ("IJJJ", 1)

