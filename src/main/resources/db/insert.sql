set foreign_key_checks = 0;
truncate table product;
truncate table feedback;

insert into product ('id', 'name', 'price', 'details', 'currency')
values (110, 'Luxury chair', 1500, 'How fr bro? Isaac get my green shirt??', 'FRC')
       (111, 'Luxury sofa',  2500, 'How else do we learn SpringBoot framework??', 'USD')
       (112, 'Luxury bench', 4500, 'U dey reason say SpringBoot no easy??', 'NGN')
       (113, 'Luxury table', 6000, 'I love springBoot framework!!', 'NGN')

set foreign_key_check = 1;