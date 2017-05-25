# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table worker (
  worker_id                     bigint auto_increment not null,
  prename                       varchar(255),
  lastname                      varchar(255),
  id                            varchar(255),
  constraint pk_worker primary key (worker_id)
);

create table customer (
  customer_id                   bigint auto_increment not null,
  prename                       varchar(255),
  lastname                      varchar(255),
  address                       varchar(255),
  email                         varchar(255),
  constraint pk_customer primary key (customer_id)
);

create table project (
  project_id                    bigint auto_increment not null,
  name                          varchar(255),
  duration                      bigint,
  constraint pk_project primary key (project_id)
);

create table task (
  task_id                       bigint auto_increment not null,
  name                          varchar(255),
  duration                      bigint,
  constraint pk_task primary key (task_id)
);

create table otten (
  otten_id                      bigint auto_increment not null,
  name                          varchar(255),
  rasse                         varchar(255),
  constraint pk_otten primary key (otten_id)
);

create table user (
  user_id                       bigint auto_increment not null,
  email                         varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (user_id)
);

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

