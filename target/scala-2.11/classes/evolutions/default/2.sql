# --- !Ups

alter table task add constraint fk_task_project foreign key (task_id) references project (project_id) on delete restrict on update restrict;
create index ix_task_project on task (task_id);

alter table task add constraint fk_task_worker foreign key (task_id) references worker (worker_id) on delete restrict on update restrict;
create index ix_task_worker on task (task_id);

alter table project add constraint fk_project_customer foreign key (project_id) references customer (customer_id) on delete restrict on update restrict;
create index ix_project_customer on project (project_id);

alter table otten add constraint fk_otten_task foreign key (otten_id) references task (task_id) on delete restrict on update restrict;
create index ix_otten_task_id on otten (otten_id);



# --- !Downs

alter table task drop foreign key fk_task_project;
drop index ix_task_project on task;

alter table task drop foreign key fk_task_worker;
drop index ix_task_worker on task;

alter table project drop foreign key fk_project_customer;
drop index ix_project_customer on project;

alter table otten drop foreign key fk_otten_task;
drop index ix_otten_task on otten;

drop table if exists project;

drop table if exists user;

drop table if exists otten;

drop table if exists worker;

drop table if exists customer;

drop table if exists task;