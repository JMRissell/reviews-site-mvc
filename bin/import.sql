// initialize Categories
INSERT INTO category(id, name) VALUES (1, 'FPS')
INSERT INTO category(id, name) VALUES (2, 'RPG') 
INSERT INTO	category(id, name) VALUES (3, 'Puzzle')

// initialize Reviews
INSERT INTO Review(title, img_Url, category_id, content) VALUES('Overwatch', 'images/overwatch-logo.png', 1, 'Here is some content about Overwatch')
INSERT INTO Review(title, img_Url, category_id, content) VALUES('Witcher', 'images/witcher-logo.jpg', 2, 'Here is some content about The Witcher 3')
INSERT INTO Review(title, img_Url, category_id, content) VALUES('Tetris', 'images/tetris-logo.jpg', 3, 'Here is some content for Tetris')