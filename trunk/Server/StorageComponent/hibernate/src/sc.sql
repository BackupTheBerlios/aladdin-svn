CREATE TABLE address (
    id integer NOT NULL,
    street character varying(255),
    streetno character varying(255),
    city character varying(255),
    county character varying(255),
    country character varying(255),
    zipcode character varying(255),
    notes character varying(255),
    isprimary boolean,
    persondata integer
);

CREATE SEQUENCE address_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE administrator (
    id integer NOT NULL,
    persondata integer NOT NULL
);

CREATE SEQUENCE administrator_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE aladdinuser (
    id integer NOT NULL,
    username character varying(255),
    password character varying(255),
    type integer,
    personid integer,
    CONSTRAINT aladdinuser_personid_check CHECK ((personid > 0)),
    CONSTRAINT aladdinuser_type_check CHECK ((type = ANY (ARRAY[1, 2, 3, 4])))
);

CREATE SEQUENCE aladdinuser_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE carer (
    id integer NOT NULL,
    persondata integer NOT NULL,
    sd integer
);

CREATE SEQUENCE carer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE carerassessment (
    id integer NOT NULL,
    carer integer,
    dateofassessment timestamp without time zone,
    relevanthealthproblem character varying(255),
    severityofburden integer,
    emotionalormentaldisorder character varying(255),
    psychoactivedrugs character varying(255),
    qualityoflife integer,
    clinician integer
);

CREATE SEQUENCE carerassessment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE clinician (
    id integer NOT NULL,
    persondata integer NOT NULL
);

CREATE SEQUENCE clinician_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE communication (
    id integer NOT NULL,
    type character varying(255),
    value character varying(255),
    notes character varying(255),
    isprimary boolean,
    persondata integer
);

CREATE SEQUENCE communication_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE dict (
    id integer NOT NULL,
    code character varying(255),
    description character varying(255),
    locale integer,
    type integer
);

CREATE SEQUENCE dict_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE entertainmentcontent (
    id integer NOT NULL,
    title text,
    url text,
    type text,
    category text,
    text text,
    enabled boolean DEFAULT false NOT NULL
);

CREATE SEQUENCE entertainmentcontent_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

ALTER SEQUENCE entertainmentcontent_id_seq OWNED BY entertainmentcontent.id;

CREATE TABLE externalservice (
    id integer NOT NULL,
    address character varying(255),
    description character varying(255),
    type character varying(255)
);

CREATE SEQUENCE externalservice_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE identifier (
    id integer NOT NULL,
    type character varying(255),
    number character varying(255),
    issuedate timestamp without time zone,
    issueauthority character varying(255),
    persondata integer
);

CREATE SEQUENCE identifier_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE locale (
    id integer NOT NULL,
    name character varying(255)
);

CREATE SEQUENCE locale_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE measurement (
    id integer NOT NULL,
    type character varying(255),
    value numeric(19,2),
    datetime timestamp without time zone,
    units character varying(255),
    lowerlimit numeric(19,2),
    upperlimit numeric(19,2),
    patientassessment integer,
    task integer,
    value2 numeric(19,2) DEFAULT 0
);

CREATE SEQUENCE measurement_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE patient (
    id integer NOT NULL,
    persondata integer NOT NULL,
    sd integer,
    clinician integer,
    swname character varying(255),
    swphone character varying(255),
    swemail character varying(255),
    ccname character varying(255),
    ccphone character varying(255),
    ccemail character varying(255),
    gpname character varying(255),
    gpphone character varying(255),
    gpemail character varying(255),
    carer integer NOT NULL
);

CREATE SEQUENCE patient_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE patientassessment (
    id integer NOT NULL,
    patient integer,
    dateofassessment timestamp without time zone,
    aetology integer,
    timeelapsedsincediagnose integer,
    severity integer,
    relevantpathologyantecedents character varying(255),
    comorbidity character varying(255),
    charlsoncomobodityindex integer,
    barthelindex integer,
    lawtonindex integer,
    mmse integer,
    mdrs integer,
    blessedscalepart1 numeric(19,2),
    blessedscalepart2 integer,
    blessedscalepart3 integer,
    checklistmbpc integer,
    npqiseverity integer,
    npqistress integer,
    gds integer,
    falls boolean,
    incontinence boolean,
    delirium boolean,
    immobility boolean,
    sensorialdeficits boolean,
    pharmacologytreatment character varying(255)
);

CREATE SEQUENCE patientassessment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE patientcarer (
    id integer NOT NULL,
    patient integer,
    carer integer,
    isprimary boolean
);

CREATE SEQUENCE patientcarer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE persondata (
    id integer NOT NULL,
    surname character varying(255) NOT NULL,
    name character varying(255) NOT NULL
);

CREATE SEQUENCE persondata_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE questionnaire (
    id integer NOT NULL,
    version numeric(19,2),
    title character varying(255)
);

CREATE SEQUENCE questionnaire_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE questionnaireanswer (
    id integer NOT NULL,
    question integer,
    value character varying(255),
    userid integer,
    "timestamp" timestamp without time zone,
    objectid integer
);

CREATE SEQUENCE questionnaireanswer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE questionnairequestion (
    id integer NOT NULL,
    type character varying(255),
    isprimary boolean,
    parentid integer,
    title character varying(255),
    quest integer,
    condition integer,
    deleted boolean,
    globalid integer DEFAULT 0 NOT NULL,
    "position" integer
);

CREATE SEQUENCE questionnairequestion_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE questionnairequestionanswer (
    id integer NOT NULL,
    value integer,
    description character varying(255),
    question integer,
    deleted boolean,
    "position" integer
);

CREATE SEQUENCE questionnairequestionanswer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE sociodemographicdata (
    id integer NOT NULL,
    gender integer,
    maritalstatus integer,
    children integer,
    livingwith integer,
    birthday timestamp without time zone NOT NULL
);

CREATE SEQUENCE sociodemographicdata_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE systemparameter (
    id integer NOT NULL,
    code character varying(255),
    description character varying(255)
);

CREATE SEQUENCE systemparameter_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE task (
    id integer NOT NULL,
    tasktype integer,
    datetimeassigned timestamp without time zone,
    datetimefulfilled timestamp without time zone,
    taskstatus integer,
    url character varying(255),
    questionnaire integer,
    executor integer,
    assigner integer,
    object integer,
    text text
);

CREATE SEQUENCE task_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE translate (
    id integer NOT NULL,
    entityid integer,
    entity character varying(255),
    locale integer,
    value character varying(255)
);

CREATE SEQUENCE translate_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

CREATE TABLE warning (
    id integer NOT NULL,
    typeofwarning integer,
    datetimeofwarning timestamp without time zone,
    effect integer,
    indicator integer,
    risklevel integer,
    justificationtext character varying(255),
    emergencylevel integer,
    delivered boolean,
    patient integer
);

CREATE SEQUENCE warning_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

ALTER TABLE entertainmentcontent ALTER COLUMN id SET DEFAULT nextval('entertainmentcontent_id_seq'::regclass);

ALTER TABLE ONLY address
    ADD CONSTRAINT address_pkey PRIMARY KEY (id);

ALTER TABLE ONLY administrator
    ADD CONSTRAINT administrator_pkey PRIMARY KEY (id);

ALTER TABLE ONLY aladdinuser
    ADD CONSTRAINT aladdinuser_pkey PRIMARY KEY (id);

ALTER TABLE ONLY aladdinuser
    ADD CONSTRAINT aladdinuser_type_key UNIQUE (type, personid);

ALTER TABLE ONLY carer
    ADD CONSTRAINT carer_pkey PRIMARY KEY (id);

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT carerassessment_pkey PRIMARY KEY (id);

ALTER TABLE ONLY clinician
    ADD CONSTRAINT clinician_pkey PRIMARY KEY (id);

ALTER TABLE ONLY communication
    ADD CONSTRAINT communication_pkey PRIMARY KEY (id);

ALTER TABLE ONLY dict
    ADD CONSTRAINT dict_pkey PRIMARY KEY (id);

ALTER TABLE ONLY externalservice
    ADD CONSTRAINT externalservice_pkey PRIMARY KEY (id);

ALTER TABLE ONLY identifier
    ADD CONSTRAINT identifier_pkey PRIMARY KEY (id);

ALTER TABLE ONLY locale
    ADD CONSTRAINT locale_pkey PRIMARY KEY (id);

ALTER TABLE ONLY measurement
    ADD CONSTRAINT measurement_pkey PRIMARY KEY (id);

ALTER TABLE ONLY patient
    ADD CONSTRAINT patient_pkey PRIMARY KEY (id);

ALTER TABLE ONLY patientassessment
    ADD CONSTRAINT patientassessment_pkey PRIMARY KEY (id);

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT patientcarer_pkey PRIMARY KEY (id);

ALTER TABLE ONLY patient
    ADD CONSTRAINT pcu UNIQUE (carer);

ALTER TABLE ONLY persondata
    ADD CONSTRAINT persondata_pkey PRIMARY KEY (id);

ALTER TABLE ONLY questionnaire
    ADD CONSTRAINT questionnaire_pkey PRIMARY KEY (id);

ALTER TABLE ONLY questionnaireanswer
    ADD CONSTRAINT questionnaireanswer_pkey PRIMARY KEY (id);

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT questionnairequestion_pkey PRIMARY KEY (id);

ALTER TABLE ONLY questionnairequestionanswer
    ADD CONSTRAINT questionnairequestionanswer_pkey PRIMARY KEY (id);

ALTER TABLE ONLY sociodemographicdata
    ADD CONSTRAINT sociodemographicdata_pkey PRIMARY KEY (id);

ALTER TABLE ONLY systemparameter
    ADD CONSTRAINT systemparameter_pkey PRIMARY KEY (id);

ALTER TABLE ONLY task
    ADD CONSTRAINT task_pkey PRIMARY KEY (id);

ALTER TABLE ONLY translate
    ADD CONSTRAINT translate_pkey PRIMARY KEY (id);

ALTER TABLE ONLY warning
    ADD CONSTRAINT warning_pkey PRIMARY KEY (id);

CREATE UNIQUE INDEX cu ON patientcarer USING btree (carer);

CREATE INDEX fki_ ON warning USING btree (patient);

CREATE INDEX fki_patientcarer ON patient USING btree (carer);

CREATE UNIQUE INDEX uu ON aladdinuser USING btree (username);

ALTER TABLE ONLY clinician
    ADD CONSTRAINT fk1501984e4eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);

ALTER TABLE ONLY questionnaireanswer
    ADD CONSTRAINT fk161dfb211edfd5bd FOREIGN KEY (question) REFERENCES questionnairequestion(id);

ALTER TABLE ONLY identifier
    ADD CONSTRAINT fk165a88c94eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);

ALTER TABLE ONLY questionnairequestionanswer
    ADD CONSTRAINT fk17920ba71edfd5bd FOREIGN KEY (question) REFERENCES questionnairequestion(id);

ALTER TABLE ONLY address
    ADD CONSTRAINT fk1ed033d44eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);

ALTER TABLE ONLY dict
    ADD CONSTRAINT fk207fd6f67d2746 FOREIGN KEY (locale) REFERENCES locale(id);

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a51cc2e693 FOREIGN KEY (object) REFERENCES aladdinuser(id);

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a52a7d6874 FOREIGN KEY (questionnaire) REFERENCES questionnaire(id);

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a543b65130 FOREIGN KEY (assigner) REFERENCES aladdinuser(id);

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a5d3883c27 FOREIGN KEY (executor) REFERENCES aladdinuser(id);

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e54eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e5b1cf35a5 FOREIGN KEY (sd) REFERENCES sociodemographicdata(id);

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e5f8fc050a FOREIGN KEY (clinician) REFERENCES clinician(id);

ALTER TABLE ONLY carer
    ADD CONSTRAINT fk3ddf7614eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);

ALTER TABLE ONLY carer
    ADD CONSTRAINT fk3ddf761b1cf35a5 FOREIGN KEY (sd) REFERENCES sociodemographicdata(id);

ALTER TABLE ONLY administrator
    ADD CONSTRAINT fk8bef2ad4eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT fk9be20503513c2a30 FOREIGN KEY (carer) REFERENCES carer(id);

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT fk9be20503f8fc050a FOREIGN KEY (clinician) REFERENCES clinician(id);

ALTER TABLE ONLY translate
    ADD CONSTRAINT fkb633112e2d183b26 FOREIGN KEY (locale) REFERENCES locale(id);

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT fkd4187b9c513c2a30 FOREIGN KEY (carer) REFERENCES carer(id);

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT fkd4187b9c52781db8 FOREIGN KEY (patient) REFERENCES patient(id);

ALTER TABLE ONLY patientassessment
    ADD CONSTRAINT fkdd8afb8752781db8 FOREIGN KEY (patient) REFERENCES patient(id);

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT fkded4aa896d8b73b3 FOREIGN KEY (quest) REFERENCES questionnaire(id);

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT fkded4aa89aa692d1c FOREIGN KEY (parentid) REFERENCES questionnairequestion(id);

ALTER TABLE ONLY communication
    ADD CONSTRAINT fkf1e9ffb64eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);

ALTER TABLE ONLY measurement
    ADD CONSTRAINT fkf75c839c5542f21c FOREIGN KEY (task) REFERENCES task(id);

ALTER TABLE ONLY measurement
    ADD CONSTRAINT fkf75c839cfc90a15c FOREIGN KEY (patientassessment) REFERENCES patientassessment(id);

ALTER TABLE ONLY patient
    ADD CONSTRAINT patientcarer FOREIGN KEY (carer) REFERENCES carer(id);

ALTER TABLE ONLY warning
    ADD CONSTRAINT warning_patient_fkey FOREIGN KEY (patient) REFERENCES patient(id);
