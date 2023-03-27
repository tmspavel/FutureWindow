create table windows
(
    id             int generated by default AS IDENTITY primary key,
    width          int,
    height         int,
    type           varchar,
    lamination     varchar,
    mounting_Width int,
    cameras        int,
    price          int,
    manufacturer   varchar,
    availability   varchar
)