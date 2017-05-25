
# --- !Downs

alter table task drop foreign key fk_task_project;
drop index ix_task_project on task;

alter table task drop foreign key fk_task_worker;
drop index ix_task_worker on task;

alter table project drop foreign key fk_project_customer;
drop index ix_project_customer on project;

alter table otte drop foreign key fk_otte_task;
drop index ix_otte_task on otte;

drop table if exists project;

drop table if exists user;

drop table if exists otte;

drop table if exists worker;

drop table if exists customer;

drop table if exists task;