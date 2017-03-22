// initialize Categories
INSERT INTO Category(id, name) VALUES (1, 'FPS')
INSERT INTO Category(id, name) VALUES (2, 'RPG')
INSERT INTO Category(id, name) VALUES(3, 'Puzzle')

// initialize Reviews
INSERT INTO Review(title, img_url, category_id, content, date) VALUES(1, 'Overwatch', '/images/overwatch-logo.png', 'FPS', 'Here is some content about Overwatch', '3-11-2017')
INSERT INTO Review(title, img_url, category_id, content, date) VALUES(2, 'Witcher 3', '/images/witcher-logo.jpg', 'RPG', 'Here is some content about Witcher 3', '3-11-2017')
INSERT INTO Review(title, img_url, category_id, content, date) VALUES(3, 'Tetris', '/images/tetris-logo.jpg', 'Puzzle', 'Here is some content for Tetris', '3-11-2017')