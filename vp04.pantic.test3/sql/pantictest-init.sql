use pantictest;

-- insert users
-- password is 12345 (bcrypt encoded) 
insert into security_user (username, password, first_name, last_name) values 
	('admin', '$2a$04$4pqDFh9SxLAg/uSH59JCB.LwIS6QoAjM9qcE7H9e2drFuWhvTnDFi', 'Admin', 'Admin');
-- password is abcdef (bcrypt encoded)
insert into security_user (username, password, first_name, last_name) values 
	('petar', '$2a$04$Yr3QD6lbcemnrRNLbUMLBez2oEK15pdacIgfkvymQ9oMhqsEE56EK', 'Petar', 'Petrovic');

-- insert authorities
insert into security_authority (name) values ('ROLE_ADMIN'); -- super user
insert into security_authority (name) values ('ROLE_USER'); -- normal user

-- insert mappings between users and authorities
insert into security_user_authority (user_id, authority_id) values (1, 1); -- admin has ROLE_ADMIN
insert into security_user_authority (user_id, authority_id) values (1, 2); -- admin has ROLE_USER too
insert into security_user_authority (user_id, authority_id) values (2, 2); -- petar has ROLE_USER

insert into item (licitation_price, name, sale_price, sold) values (10, "item 1", 15, false);
insert into item (licitation_price, name, sale_price, sold) values (8, "item 2", 10, false);
insert into item (licitation_price, name, sale_price, sold) values (20, "item 3", 30, false);
insert into item (licitation_price, name, sale_price, sold) values (10, "item 4", 15, true);
insert into item (licitation_price, name, sale_price, sold) values (20, "item 5", 35, true);

insert into licitation (first_name, jmbg, last_name, offer, item_id) values ("fname 1", "12589517", "lname 1", 11, 1);
insert into licitation (first_name, jmbg, last_name, offer, item_id) values ("fname 1", "12589517", "lname 1", 14, 1);
insert into licitation (first_name, jmbg, last_name, offer, item_id) values ("fname 1", "12589517", "lname 1", 15, 4);

insert into licitation (first_name, jmbg, last_name, offer, item_id) values ("fname 2", "3258977", "lname 2", 12, 1);
insert into licitation (first_name, jmbg, last_name, offer, item_id) values ("fname 2", "3258977", "lname 2", 8, 2);
insert into licitation (first_name, jmbg, last_name, offer, item_id) values ("fname 2", "3258977", "lname 2", 21, 3);
insert into licitation (first_name, jmbg, last_name, offer, item_id) values ("fname 2", "3258977", "lname 2", 35, 5);