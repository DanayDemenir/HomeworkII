CREATE TABLE IF NOT EXISTS "Question"
(
    id integer NOT NULL,
    question char(200),
    CONSTRAINT "Question_pkey" PRIMARY KEY (id)
)