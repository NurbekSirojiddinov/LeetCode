CREATE TABLE worker
(
    id UUID PRIMARY KEY,
    username TEXT,
    degree TEXT,
    phone_number TEXT,
    experience VARCHAR,
    address TEXT,
    work_time VARCHAR
)

CREATE TABLE products
(
    fruit TEXT,
    vegetable TEXT,
    meat TEXT,
    flour TEXT,
    seafood TEXT,
    drink TEXT
)

CREATE TABLE deliver_service
(
    country TEXT,
    vehicle_type TEXT,
    email TEXT,
    phone TEXT
)

CREATE TABLE branch
(
    address TEXT,
    capacity TEXT,
    work_time VARCHAR,
    workers VARCHAR
)
