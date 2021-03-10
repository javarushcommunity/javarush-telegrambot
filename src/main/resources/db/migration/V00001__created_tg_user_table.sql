-- ensure that the table with this name is removed before creating a new one.
DROP TABLE IF EXISTS tg_user;

-- Create tg_user table
CREATE TABLE tg_user (
    chat_id VARCHAR(100),
    active BOOLEAN
);
