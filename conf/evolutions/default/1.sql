# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table product (
  product_id                    bigint auto_increment not null,
  ean                           varchar(255),
  name                          varchar(255),
  description                   varchar(255),
  image                         varbinary(255),
  constraint pk_product primary key (product_id)
);

create table product_tag (
  product_product_id            bigint not null,
  tag_tag_id                    bigint not null,
  constraint pk_product_tag primary key (product_product_id,tag_tag_id)
);

create table stock_item (
  stockitem_id                  bigint auto_increment not null,
  warehouse_warehouse_id        bigint,
  product_product_id            bigint,
  quantity                      bigint,
  constraint pk_stock_item primary key (stockitem_id)
);

create table tag (
  tag_id                        bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_tag primary key (tag_id)
);

create table warehouse (
  warehouse_id                  bigint auto_increment not null,
  name                          varchar(255),
  street                        varchar(255),
  postal_code                   varchar(255),
  city                          varchar(255),
  constraint pk_warehouse primary key (warehouse_id)
);

alter table product_tag add constraint fk_product_tag_product foreign key (product_product_id) references product (product_id) on delete restrict on update restrict;
create index ix_product_tag_product on product_tag (product_product_id);

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

drop table if exists warehouse;

