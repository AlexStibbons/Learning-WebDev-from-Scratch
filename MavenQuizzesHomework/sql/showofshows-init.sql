use showofshows;

insert into quiz (name, date) values ("quiz1", "01.02.2019.");
insert into quiz (name, date) values ("quiz2", "02.03.2019");
insert into quiz (name, date) values ("quiz3", "03.04.2019.");

insert into question (number, question, quiz_id) values (1, "question 1", 1);
insert into question (number, question, quiz_id) values (2, "question 2 quiz1", 1);
insert into question (number, question, quiz_id) values (3, "question 3 quiz 1", 1);

insert into question (number, question, quiz_id) values (1, "question 1 quiz 2", 2);
insert into question (number, question, quiz_id) values (2, "question 2 quiz 2", 2);
insert into question (number, question, quiz_id) values (3, "question 3 quiz 2", 2);
insert into question (number, question, quiz_id) values (4, "question 4 quiz 2", 2);
insert into question (number, question, quiz_id) values (5, "question 5 quiz 2", 2);

insert into question (number, question, quiz_id) values (1, "question 1 quiz 3", 1);
