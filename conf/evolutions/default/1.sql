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


