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

alter table product_tag add constraint fk_product_tag_tag foreign key (tag_tag_id) references tag (tag_id) on delete restrict on update restrict;
create index ix_product_tag_tag on product_tag (tag_tag_id);

alter table stock_item add constraint fk_stock_item_warehouse_warehouse_id foreign key (warehouse_warehouse_id) references warehouse (warehouse_id) on delete restrict on update restrict;
create index ix_stock_item_warehouse_warehouse_id on stock_item (warehouse_warehouse_id);

alter table stock_item add constraint fk_stock_item_product_product_id foreign key (product_product_id) references product (product_id) on delete restrict on update restrict;
create index ix_stock_item_product_product_id on stock_item (product_product_id);


# --- !Downs

alter table product_tag drop foreign key fk_product_tag_product;
drop index ix_product_tag_product on product_tag;

alter table product_tag drop foreign key fk_product_tag_tag;
drop index ix_product_tag_tag on product_tag;

alter table stock_item drop foreign key fk_stock_item_warehouse_warehouse_id;
drop index ix_stock_item_warehouse_warehouse_id on stock_item;

alter table stock_item drop foreign key fk_stock_item_product_product_id;
drop index ix_stock_item_product_product_id on stock_item;

drop table if exists product;

drop table if exists product_tag;

drop table if exists stock_item;

drop table if exists tag;

drop table if exists user;

drop table if exists warehouse;

