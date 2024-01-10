-- Table: public.Answers

-- DROP TABLE IF EXISTS "Answers";

CREATE TABLE IF NOT EXISTS "Answers"
(
    id integer NOT NULL,
    question_id integer,
    answer char[] NOT NULL,
    is_right boolean DEFAULT false,
    CONSTRAINT "Answers_pkey" PRIMARY KEY (id),
    CONSTRAINT "Answers_question_id_fkey" FOREIGN KEY (question_id)
        REFERENCES "Question" (id) MATCH SIMPLE        
)
