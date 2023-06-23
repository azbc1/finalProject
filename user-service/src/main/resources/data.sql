-- Insert roles
MERGE INTO roles (id, name) VALUES
  (1, 'ROLE_ADMIN'),
  (2, 'ROLE_USER'),
  (3, 'ROLE_MANAGER');

-- Insert users with roles
MERGE INTO users (id, organization_id, site_id, name, email, phone, position, username, password)
VALUES
  (1, 1, 1, 'Sayed Mohamed', 'sayed@test.com', '010123456789', 'Manager', 'sayed', '$2a$12$V2IuTBSRrf7aRW6rQd9NgO6.Y8ghDcYIBS9wTeTme1gwvMw4hHy/q'),
  (2, 1, 2, 'Ahmed Mahmoud', 'ahmed@teat.com', '01097654321', 'Developer', 'ahmed', '$2a$12$FU.Wpyz4sReCNuGO6ht.IufVk0JzQqbUodgXqRn1Uh0/Nco/OnnaS'),
  (3, 2, 3, 'Mohammad Ali', 'mohammad@test.com', '010678954321', 'Analyst', 'mohammad', '$2a$12$fICaEBqnTuxoQb6nm8kmnOSHyFvOSmrGfNWvoWhoVI62byI9avJjW'),
  (4, 3, 4, 'Hamada Ibrahim', 'hamada@test.com', '010531247896', 'Developer', 'hamada', '$2a$12$lHkg5NDv6qJ9HKCWSVxgV.gNRQgf09L6Z5FJcUSgxesetitZwxRwm'),
  (5, 2, 3, 'Tamer Hassen', 'tamer@test.com', '010975874321', 'Analyst', 'tamer', '$2a$12$nX328Dw5DBr9/6WFIbP9neHGRZqIUYhjqwBpukEPaAi07Oqsg.SGK'),
  (6, 1, 5, 'Sayed Mohamed', 'sayed@test.com', '010123456789', 'Manager', 'admin', '$2a$12$0UG2jkLjPlQD76DxGzPoT.06OOOoMxdzOHOAdJRl4/2YNaHRldO7m');

-- Associate roles with users
INSERT INTO user_roles (user_id, role_id)
VALUES
  (1, 1), (2, 1), (3, 1), (4, 1), (5, 1), (6, 1); -- Assigning 'ROLE_ADMIN' to all users
