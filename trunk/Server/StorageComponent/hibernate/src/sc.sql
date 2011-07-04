--
-- PostgreSQL database dump
--

-- Started on 2011-06-07 12:26:01 CEST

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = FALSE;
SET client_min_messages = warning;
SET escape_string_warning = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = FALSE;

--
-- TOC entry 1582 (class 1259 OID 52284)
-- Dependencies: 6
-- Name: address; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE address (
    id INTEGER NOT NULL,
    street CHARACTER VARYING(255),
    streetno CHARACTER VARYING(255),
    city CHARACTER VARYING(255),
    county CHARACTER VARYING(255),
    country CHARACTER VARYING(255),
    zipcode CHARACTER VARYING(255),
    notes CHARACTER VARYING(255),
    isprimary BOOLEAN,
    persondata INTEGER
);


ALTER TABLE public.address OWNER TO postgres;

--
-- TOC entry 1583 (class 1259 OID 52290)
-- Dependencies: 6
-- Name: address_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE address_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.address_id_seq OWNER TO postgres;

--
-- TOC entry 1584 (class 1259 OID 52292)
-- Dependencies: 6
-- Name: administrator; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE administrator (
    id INTEGER NOT NULL,
    persondata INTEGER NOT NULL
);


ALTER TABLE public.administrator OWNER TO postgres;

--
-- TOC entry 1585 (class 1259 OID 52295)
-- Dependencies: 6
-- Name: administrator_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE administrator_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.administrator_id_seq OWNER TO postgres;

--
-- TOC entry 1586 (class 1259 OID 52297)
-- Dependencies: 1911 1912 6
-- Name: aladdinuser; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE aladdinuser (
    id INTEGER NOT NULL,
    username CHARACTER VARYING(255),
    password CHARACTER VARYING(255),
    TYPE INTEGER,
    personid INTEGER,
    CONSTRAINT aladdinuser_personid_check CHECK ((personid > 0)),
    CONSTRAINT aladdinuser_type_check CHECK ((TYPE = ANY (ARRAY[1, 2, 3, 4, 5])))
);


ALTER TABLE public.aladdinuser OWNER TO postgres;

--
-- TOC entry 1587 (class 1259 OID 52305)
-- Dependencies: 6
-- Name: aladdinuser_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE aladdinuser_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.aladdinuser_id_seq OWNER TO postgres;

--
-- TOC entry 1588 (class 1259 OID 52307)
-- Dependencies: 6
-- Name: carer; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE carer (
    id INTEGER NOT NULL,
    persondata INTEGER NOT NULL,
    sd INTEGER
);


ALTER TABLE public.carer OWNER TO postgres;

--
-- TOC entry 1589 (class 1259 OID 52310)
-- Dependencies: 6
-- Name: carer_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE carer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.carer_id_seq OWNER TO postgres;

--
-- TOC entry 1590 (class 1259 OID 52312)
-- Dependencies: 6
-- Name: carerassessment; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE carerassessment (
    id INTEGER NOT NULL,
    carer INTEGER,
    dateofassessment TIMESTAMP WITHOUT TIME zone,
    relevanthealthproblem CHARACTER VARYING(255),
    severityofburden INTEGER,
    emotionalormentaldisorder CHARACTER VARYING(255),
    psychoactivedrugs CHARACTER VARYING(255),
    qualityoflife INTEGER,
    clinician INTEGER
);


ALTER TABLE public.carerassessment OWNER TO postgres;

--
-- TOC entry 1591 (class 1259 OID 52318)
-- Dependencies: 6
-- Name: carerassessment_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE carerassessment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.carerassessment_id_seq OWNER TO postgres;

--
-- TOC entry 1592 (class 1259 OID 52320)
-- Dependencies: 6
-- Name: clinician; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE clinician (
    id INTEGER NOT NULL,
    persondata INTEGER NOT NULL
);


ALTER TABLE public.clinician OWNER TO postgres;

--
-- TOC entry 1593 (class 1259 OID 52323)
-- Dependencies: 6
-- Name: clinician_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE clinician_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.clinician_id_seq OWNER TO postgres;

--
-- TOC entry 1594 (class 1259 OID 52325)
-- Dependencies: 6
-- Name: communication; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE communication (
    id INTEGER NOT NULL,
    TYPE CHARACTER VARYING(255),
    VALUE CHARACTER VARYING(255),
    notes CHARACTER VARYING(255),
    isprimary BOOLEAN,
    persondata INTEGER
);


ALTER TABLE public.communication OWNER TO postgres;

--
-- TOC entry 1595 (class 1259 OID 52331)
-- Dependencies: 6
-- Name: communication_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE communication_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.communication_id_seq OWNER TO postgres;

--
-- TOC entry 1596 (class 1259 OID 52333)
-- Dependencies: 6
-- Name: dict; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE dict (
    id INTEGER NOT NULL,
    code CHARACTER VARYING(255),
    description CHARACTER VARYING(255),
    locale INTEGER,
    TYPE INTEGER
);


ALTER TABLE public.dict OWNER TO postgres;

--
-- TOC entry 1597 (class 1259 OID 52339)
-- Dependencies: 6
-- Name: dict_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE dict_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.dict_id_seq OWNER TO postgres;

--
-- TOC entry 1598 (class 1259 OID 52341)
-- Dependencies: 1913 6
-- Name: entertainmentcontent; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE entertainmentcontent (
    id INTEGER NOT NULL,
    title text,
    url text,
    TYPE text,
    category text,
    text text,
    enabled BOOLEAN DEFAULT FALSE NOT NULL
);


ALTER TABLE public.entertainmentcontent OWNER TO postgres;

--
-- TOC entry 1599 (class 1259 OID 52348)
-- Dependencies: 1598 6
-- Name: entertainmentcontent_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE entertainmentcontent_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.entertainmentcontent_id_seq OWNER TO postgres;

--
-- TOC entry 2019 (class 0 OID 0)
-- Dependencies: 1599
-- Name: entertainmentcontent_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE entertainmentcontent_id_seq OWNED BY entertainmentcontent.id;


--
-- TOC entry 1600 (class 1259 OID 52350)
-- Dependencies: 6
-- Name: externalservice; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE externalservice (
    id INTEGER NOT NULL,
    address CHARACTER VARYING(255),
    description CHARACTER VARYING(255),
    TYPE CHARACTER VARYING(255)
);


ALTER TABLE public.externalservice OWNER TO postgres;

--
-- TOC entry 1601 (class 1259 OID 52356)
-- Dependencies: 6
-- Name: externalservice_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE externalservice_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.externalservice_id_seq OWNER TO postgres;

--
-- TOC entry 1602 (class 1259 OID 52358)
-- Dependencies: 6
-- Name: identifier; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE identifier (
    id INTEGER NOT NULL,
    TYPE CHARACTER VARYING(255),
    NUMBER CHARACTER VARYING(255),
    issuedate TIMESTAMP WITHOUT TIME zone,
    issueauthority CHARACTER VARYING(255),
    persondata INTEGER
);


ALTER TABLE public.identifier OWNER TO postgres;

--
-- TOC entry 1603 (class 1259 OID 52364)
-- Dependencies: 6
-- Name: identifier_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE identifier_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.identifier_id_seq OWNER TO postgres;

--
-- TOC entry 1604 (class 1259 OID 52366)
-- Dependencies: 6
-- Name: locale; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE locale (
    id INTEGER NOT NULL,
    name CHARACTER VARYING(255)
);


ALTER TABLE public.locale OWNER TO postgres;

--
-- TOC entry 1605 (class 1259 OID 52369)
-- Dependencies: 6
-- Name: locale_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE locale_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.locale_id_seq OWNER TO postgres;

--
-- TOC entry 1606 (class 1259 OID 52371)
-- Dependencies: 1915 6
-- Name: measurement; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE measurement (
    id INTEGER NOT NULL,
    TYPE CHARACTER VARYING(255),
    VALUE NUMERIC(19,2),
    datetime TIMESTAMP WITHOUT TIME zone,
    units CHARACTER VARYING(255),
    lowerlimit NUMERIC(19,2),
    upperlimit NUMERIC(19,2),
    patientassessment INTEGER,
    task INTEGER,
    value2 NUMERIC(19,2) DEFAULT 0
);


ALTER TABLE public.measurement OWNER TO postgres;

--
-- TOC entry 1607 (class 1259 OID 52378)
-- Dependencies: 6
-- Name: measurement_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE measurement_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.measurement_id_seq OWNER TO postgres;

--
-- TOC entry 1608 (class 1259 OID 52380)
-- Dependencies: 6
-- Name: patient; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE patient (
    id INTEGER NOT NULL,
    persondata INTEGER NOT NULL,
    sd INTEGER,
    clinician INTEGER,
    swname CHARACTER VARYING(255),
    swphone CHARACTER VARYING(255),
    swemail CHARACTER VARYING(255),
    ccname CHARACTER VARYING(255),
    ccphone CHARACTER VARYING(255),
    ccemail CHARACTER VARYING(255),
    gpname CHARACTER VARYING(255),
    gpphone CHARACTER VARYING(255),
    gpemail CHARACTER VARYING(255),
    carer INTEGER NOT NULL
);


ALTER TABLE public.patient OWNER TO postgres;

--
-- TOC entry 1609 (class 1259 OID 52386)
-- Dependencies: 6
-- Name: patient_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE patient_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.patient_id_seq OWNER TO postgres;

--
-- TOC entry 1610 (class 1259 OID 52388)
-- Dependencies: 6
-- Name: patientassessment; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE patientassessment (
    id INTEGER NOT NULL,
    patient INTEGER,
    dateofassessment TIMESTAMP WITHOUT TIME zone,
    aetology INTEGER,
    timeelapsedsincediagnose INTEGER,
    severity INTEGER,
    relevantpathologyantecedents CHARACTER VARYING(255),
    comorbidity CHARACTER VARYING(255),
    charlsoncomobodityindex INTEGER,
    barthelindex INTEGER,
    lawtonindex INTEGER,
    mmse INTEGER,
    mdrs INTEGER,
    blessedscalepart1 NUMERIC(19,2),
    blessedscalepart2 INTEGER,
    blessedscalepart3 INTEGER,
    checklistmbpc INTEGER,
    npqiseverity INTEGER,
    npqistress INTEGER,
    gds INTEGER,
    falls BOOLEAN,
    incontinence BOOLEAN,
    delirium BOOLEAN,
    immobility BOOLEAN,
    sensorialdeficits BOOLEAN,
    pharmacologytreatment CHARACTER VARYING(255)
);


ALTER TABLE public.patientassessment OWNER TO postgres;

--
-- TOC entry 1611 (class 1259 OID 52394)
-- Dependencies: 6
-- Name: patientassessment_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE patientassessment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.patientassessment_id_seq OWNER TO postgres;

--
-- TOC entry 1612 (class 1259 OID 52396)
-- Dependencies: 6
-- Name: patientcarer; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE patientcarer (
    id INTEGER NOT NULL,
    patient INTEGER,
    carer INTEGER,
    isprimary BOOLEAN
);


ALTER TABLE public.patientcarer OWNER TO postgres;

--
-- TOC entry 1613 (class 1259 OID 52399)
-- Dependencies: 6
-- Name: patientcarer_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE patientcarer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.patientcarer_id_seq OWNER TO postgres;

--
-- TOC entry 1614 (class 1259 OID 52401)
-- Dependencies: 6
-- Name: persondata; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE persondata (
    id INTEGER NOT NULL,
    surname CHARACTER VARYING(255) NOT NULL,
    name CHARACTER VARYING(255) NOT NULL
);


ALTER TABLE public.persondata OWNER TO postgres;

--
-- TOC entry 1615 (class 1259 OID 52407)
-- Dependencies: 6
-- Name: persondata_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE persondata_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.persondata_id_seq OWNER TO postgres;

--
-- TOC entry 1616 (class 1259 OID 52409)
-- Dependencies: 6
-- Name: questionnaire; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE questionnaire (
    id INTEGER NOT NULL,
    version NUMERIC(19,2),
    title CHARACTER VARYING(255)
);


ALTER TABLE public.questionnaire OWNER TO postgres;

--
-- TOC entry 1617 (class 1259 OID 52412)
-- Dependencies: 6
-- Name: questionnaire_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE questionnaire_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.questionnaire_id_seq OWNER TO postgres;

--
-- TOC entry 1618 (class 1259 OID 52414)
-- Dependencies: 6
-- Name: questionnaireanswer; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE questionnaireanswer (
    id INTEGER NOT NULL,
    question INTEGER,
    VALUE CHARACTER VARYING(255),
    userid INTEGER,
    "timestamp" TIMESTAMP WITHOUT TIME zone,
    objectid INTEGER
);


ALTER TABLE public.questionnaireanswer OWNER TO postgres;

--
-- TOC entry 1619 (class 1259 OID 52417)
-- Dependencies: 6
-- Name: questionnaireanswer_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE questionnaireanswer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.questionnaireanswer_id_seq OWNER TO postgres;

--
-- TOC entry 1620 (class 1259 OID 52419)
-- Dependencies: 1916 6
-- Name: questionnairequestion; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE questionnairequestion (
    id INTEGER NOT NULL,
    TYPE CHARACTER VARYING(255),
    isprimary BOOLEAN,
    parentid INTEGER,
    title CHARACTER VARYING(255),
    quest INTEGER,
    condition INTEGER,
    deleted BOOLEAN,
    globalid INTEGER DEFAULT 0 NOT NULL,
    "position" INTEGER
);


ALTER TABLE public.questionnairequestion OWNER TO postgres;

--
-- TOC entry 1621 (class 1259 OID 52426)
-- Dependencies: 6
-- Name: questionnairequestion_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE questionnairequestion_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.questionnairequestion_id_seq OWNER TO postgres;

--
-- TOC entry 1622 (class 1259 OID 52428)
-- Dependencies: 6
-- Name: questionnairequestionanswer; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE questionnairequestionanswer (
    id INTEGER NOT NULL,
    VALUE INTEGER,
    description CHARACTER VARYING(255),
    question INTEGER,
    deleted BOOLEAN,
    "position" INTEGER
);


ALTER TABLE public.questionnairequestionanswer OWNER TO postgres;

--
-- TOC entry 1623 (class 1259 OID 52431)
-- Dependencies: 6
-- Name: questionnairequestionanswer_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE questionnairequestionanswer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.questionnairequestionanswer_id_seq OWNER TO postgres;

--
-- TOC entry 1624 (class 1259 OID 52433)
-- Dependencies: 6
-- Name: sociodemographicdata; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE sociodemographicdata (
    id INTEGER NOT NULL,
    gender INTEGER,
    maritalstatus INTEGER,
    children INTEGER,
    livingwith INTEGER,
    birthday TIMESTAMP WITHOUT TIME zone NOT NULL
);


ALTER TABLE public.sociodemographicdata OWNER TO postgres;

--
-- TOC entry 1625 (class 1259 OID 52436)
-- Dependencies: 6
-- Name: sociodemographicdata_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sociodemographicdata_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.sociodemographicdata_id_seq OWNER TO postgres;

--
-- TOC entry 1626 (class 1259 OID 52438)
-- Dependencies: 6
-- Name: systemparameter; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE systemparameter (
    id INTEGER NOT NULL,
    code CHARACTER VARYING(255),
    description CHARACTER VARYING(255)
);


ALTER TABLE public.systemparameter OWNER TO postgres;

--
-- TOC entry 1627 (class 1259 OID 52444)
-- Dependencies: 6
-- Name: systemparameter_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE systemparameter_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.systemparameter_id_seq OWNER TO postgres;

--
-- TOC entry 1628 (class 1259 OID 52446)
-- Dependencies: 6
-- Name: task; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE task (
    id INTEGER NOT NULL,
    tasktype INTEGER,
    datetimeassigned TIMESTAMP WITHOUT TIME zone,
    datetimefulfilled TIMESTAMP WITHOUT TIME zone,
    taskstatus INTEGER,
    url CHARACTER VARYING(255),
    questionnaire INTEGER,
    executor INTEGER,
    assigner INTEGER,
    object INTEGER,
    text text
);


ALTER TABLE public.task OWNER TO postgres;

--
-- TOC entry 1629 (class 1259 OID 52452)
-- Dependencies: 6
-- Name: task_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE task_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.task_id_seq OWNER TO postgres;

--
-- TOC entry 1630 (class 1259 OID 52454)
-- Dependencies: 6
-- Name: translate; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE translate (
    id INTEGER NOT NULL,
    entityid INTEGER,
    entity CHARACTER VARYING(255),
    locale INTEGER,
    VALUE text
);


ALTER TABLE public.translate OWNER TO postgres;

--
-- TOC entry 1631 (class 1259 OID 52460)
-- Dependencies: 6
-- Name: translate_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE translate_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.translate_id_seq OWNER TO postgres;

--
-- TOC entry 1632 (class 1259 OID 52462)
-- Dependencies: 6
-- Name: warning; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE warning (
    id INTEGER NOT NULL,
    typeofwarning INTEGER,
    datetimeofwarning TIMESTAMP WITHOUT TIME zone,
    effect INTEGER,
    indicator INTEGER,
    risklevel INTEGER,
    justificationtext CHARACTER VARYING(255),
    emergencylevel INTEGER,
    delivered BOOLEAN,
    patient INTEGER
);


ALTER TABLE public.warning OWNER TO postgres;

--
-- TOC entry 1633 (class 1259 OID 52465)
-- Dependencies: 6
-- Name: warning_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE warning_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.warning_id_seq OWNER TO postgres;

--
-- TOC entry 1914 (class 2604 OID 52467)
-- Dependencies: 1599 1598
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE entertainmentcontent ALTER COLUMN id SET DEFAULT NEXTVAL('entertainmentcontent_id_seq'::regclass);


--
-- TOC entry 1918 (class 2606 OID 52469)
-- Dependencies: 1582 1582
-- Name: address_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY address
    ADD CONSTRAINT address_pkey PRIMARY KEY (id);


--
-- TOC entry 1920 (class 2606 OID 52471)
-- Dependencies: 1584 1584
-- Name: administrator_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY administrator
    ADD CONSTRAINT administrator_pkey PRIMARY KEY (id);


--
-- TOC entry 1922 (class 2606 OID 52473)
-- Dependencies: 1586 1586
-- Name: aladdinuser_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY aladdinuser
    ADD CONSTRAINT aladdinuser_pkey PRIMARY KEY (id);


--
-- TOC entry 1924 (class 2606 OID 52475)
-- Dependencies: 1586 1586 1586
-- Name: aladdinuser_type_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY aladdinuser
    ADD CONSTRAINT aladdinuser_type_key UNIQUE (TYPE, personid);


--
-- TOC entry 1927 (class 2606 OID 52477)
-- Dependencies: 1588 1588
-- Name: carer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY carer
    ADD CONSTRAINT carer_pkey PRIMARY KEY (id);


--
-- TOC entry 1929 (class 2606 OID 52479)
-- Dependencies: 1590 1590
-- Name: carerassessment_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT carerassessment_pkey PRIMARY KEY (id);


--
-- TOC entry 1931 (class 2606 OID 52481)
-- Dependencies: 1592 1592
-- Name: clinician_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY clinician
    ADD CONSTRAINT clinician_pkey PRIMARY KEY (id);


--
-- TOC entry 1933 (class 2606 OID 52483)
-- Dependencies: 1594 1594
-- Name: communication_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY communication
    ADD CONSTRAINT communication_pkey PRIMARY KEY (id);


--
-- TOC entry 1935 (class 2606 OID 52485)
-- Dependencies: 1596 1596
-- Name: dict_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY dict
    ADD CONSTRAINT dict_pkey PRIMARY KEY (id);


--
-- TOC entry 1937 (class 2606 OID 52487)
-- Dependencies: 1600 1600
-- Name: externalservice_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY externalservice
    ADD CONSTRAINT externalservice_pkey PRIMARY KEY (id);


--
-- TOC entry 1939 (class 2606 OID 52489)
-- Dependencies: 1602 1602
-- Name: identifier_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY identifier
    ADD CONSTRAINT identifier_pkey PRIMARY KEY (id);


--
-- TOC entry 1941 (class 2606 OID 52491)
-- Dependencies: 1604 1604
-- Name: locale_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY locale
    ADD CONSTRAINT locale_pkey PRIMARY KEY (id);


--
-- TOC entry 1946 (class 2606 OID 52493)
-- Dependencies: 1606 1606
-- Name: measurement_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT measurement_pkey PRIMARY KEY (id);


--
-- TOC entry 1948 (class 2606 OID 52495)
-- Dependencies: 1606 1606 1606 1606 1606
-- Name: measurement_type_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT measurement_type_key UNIQUE (TYPE, VALUE, datetime, task);


--
-- TOC entry 1951 (class 2606 OID 52497)
-- Dependencies: 1608 1608
-- Name: patient_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT patient_pkey PRIMARY KEY (id);


--
-- TOC entry 1955 (class 2606 OID 52499)
-- Dependencies: 1610 1610
-- Name: patientassessment_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY patientassessment
    ADD CONSTRAINT patientassessment_pkey PRIMARY KEY (id);


--
-- TOC entry 1958 (class 2606 OID 52501)
-- Dependencies: 1612 1612
-- Name: patientcarer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT patientcarer_pkey PRIMARY KEY (id);


--
-- TOC entry 1953 (class 2606 OID 52503)
-- Dependencies: 1608 1608
-- Name: pcu; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT pcu UNIQUE (carer);


--
-- TOC entry 1960 (class 2606 OID 52505)
-- Dependencies: 1614 1614
-- Name: persondata_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY persondata
    ADD CONSTRAINT persondata_pkey PRIMARY KEY (id);


--
-- TOC entry 1962 (class 2606 OID 52507)
-- Dependencies: 1616 1616
-- Name: questionnaire_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY questionnaire
    ADD CONSTRAINT questionnaire_pkey PRIMARY KEY (id);


--
-- TOC entry 1965 (class 2606 OID 52509)
-- Dependencies: 1618 1618
-- Name: questionnaireanswer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY questionnaireanswer
    ADD CONSTRAINT questionnaireanswer_pkey PRIMARY KEY (id);


--
-- TOC entry 1968 (class 2606 OID 52511)
-- Dependencies: 1620 1620
-- Name: questionnairequestion_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT questionnairequestion_pkey PRIMARY KEY (id);


--
-- TOC entry 1971 (class 2606 OID 52513)
-- Dependencies: 1622 1622
-- Name: questionnairequestionanswer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY questionnairequestionanswer
    ADD CONSTRAINT questionnairequestionanswer_pkey PRIMARY KEY (id);


--
-- TOC entry 1973 (class 2606 OID 52515)
-- Dependencies: 1624 1624
-- Name: sociodemographicdata_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY sociodemographicdata
    ADD CONSTRAINT sociodemographicdata_pkey PRIMARY KEY (id);


--
-- TOC entry 1975 (class 2606 OID 52517)
-- Dependencies: 1626 1626
-- Name: systemparameter_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY systemparameter
    ADD CONSTRAINT systemparameter_pkey PRIMARY KEY (id);


--
-- TOC entry 1978 (class 2606 OID 52519)
-- Dependencies: 1628 1628
-- Name: task_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY task
    ADD CONSTRAINT task_pkey PRIMARY KEY (id);


--
-- TOC entry 1981 (class 2606 OID 52521)
-- Dependencies: 1630 1630
-- Name: translate_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY translate
    ADD CONSTRAINT translate_pkey PRIMARY KEY (id);


--
-- TOC entry 1944 (class 2606 OID 52728)
-- Dependencies: 1604 1604
-- Name: uname; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY locale
    ADD CONSTRAINT uname UNIQUE (name);


--
-- TOC entry 1984 (class 2606 OID 52523)
-- Dependencies: 1632 1632
-- Name: warning_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY warning
    ADD CONSTRAINT warning_pkey PRIMARY KEY (id);


--
-- TOC entry 1956 (class 1259 OID 52524)
-- Dependencies: 1612
-- Name: cu; Type: INDEX; Schema: public; Owner: postgres; Tablespace:
--

CREATE UNIQUE INDEX cu ON patientcarer USING btree (carer);


--
-- TOC entry 1966 (class 1259 OID 52725)
-- Dependencies: 1620 1620
-- Name: exportQuestionnaire; Type: INDEX; Schema: public; Owner: postgres; Tablespace:
--

CREATE INDEX "exportQuestionnaire" ON questionnairequestion USING btree (quest, parentid);


--
-- TOC entry 1982 (class 1259 OID 52525)
-- Dependencies: 1632
-- Name: fki_; Type: INDEX; Schema: public; Owner: postgres; Tablespace:
--

CREATE INDEX fki_ ON warning USING btree (patient);


--
-- TOC entry 1949 (class 1259 OID 52526)
-- Dependencies: 1608
-- Name: fki_patientcarer; Type: INDEX; Schema: public; Owner: postgres; Tablespace:
--

CREATE INDEX fki_patientcarer ON patient USING btree (carer);


--
-- TOC entry 1963 (class 1259 OID 52729)
-- Dependencies: 1618 1618 1618
-- Name: getQuestionnaireAnswers; Type: INDEX; Schema: public; Owner: postgres; Tablespace:
--

CREATE INDEX "getQuestionnaireAnswers" ON questionnaireanswer USING btree (objectid, "timestamp", question);


--
-- TOC entry 1979 (class 1259 OID 52723)
-- Dependencies: 1630 1630 1630
-- Name: getTranslate; Type: INDEX; Schema: public; Owner: postgres; Tablespace:
--

CREATE INDEX "getTranslate" ON translate USING btree (locale, entity, entityid);


--
-- TOC entry 1976 (class 1259 OID 52724)
-- Dependencies: 1628 1628
-- Name: getUserPlannedTasks; Type: INDEX; Schema: public; Owner: postgres; Tablespace:
--

CREATE INDEX "getUserPlannedTasks" ON task USING btree (datetimeassigned, executor);


--
-- TOC entry 1942 (class 1259 OID 52722)
-- Dependencies: 1604
-- Name: name; Type: INDEX; Schema: public; Owner: postgres; Tablespace:
--

CREATE INDEX name ON locale USING btree (name);


--
-- TOC entry 1969 (class 1259 OID 52726)
-- Dependencies: 1622 1622
-- Name: qqa; Type: INDEX; Schema: public; Owner: postgres; Tablespace:
--

CREATE INDEX qqa ON questionnairequestionanswer USING btree (question, deleted);


--
-- TOC entry 1925 (class 1259 OID 52527)
-- Dependencies: 1586
-- Name: uu; Type: INDEX; Schema: public; Owner: postgres; Tablespace:
--

CREATE UNIQUE INDEX uu ON aladdinuser USING btree (username);


--
-- TOC entry 1991 (class 2606 OID 52528)
-- Dependencies: 1959 1592 1614
-- Name: fk1501984e4eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY clinician
    ADD CONSTRAINT fk1501984e4eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 2004 (class 2606 OID 52533)
-- Dependencies: 1618 1967 1620
-- Name: fk161dfb211edfd5bd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY questionnaireanswer
    ADD CONSTRAINT fk161dfb211edfd5bd FOREIGN KEY (question) REFERENCES questionnairequestion(id);


--
-- TOC entry 1994 (class 2606 OID 52538)
-- Dependencies: 1959 1614 1602
-- Name: fk165a88c94eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY identifier
    ADD CONSTRAINT fk165a88c94eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 2007 (class 2606 OID 52543)
-- Dependencies: 1622 1967 1620
-- Name: fk17920ba71edfd5bd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY questionnairequestionanswer
    ADD CONSTRAINT fk17920ba71edfd5bd FOREIGN KEY (question) REFERENCES questionnairequestion(id);


--
-- TOC entry 1985 (class 2606 OID 52548)
-- Dependencies: 1614 1959 1582
-- Name: fk1ed033d44eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY address
    ADD CONSTRAINT fk1ed033d44eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 1993 (class 2606 OID 52553)
-- Dependencies: 1940 1596 1604
-- Name: fk207fd6f67d2746; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY dict
    ADD CONSTRAINT fk207fd6f67d2746 FOREIGN KEY (locale) REFERENCES locale(id);


--
-- TOC entry 2008 (class 2606 OID 52558)
-- Dependencies: 1628 1586 1921
-- Name: fk27a9a51cc2e693; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a51cc2e693 FOREIGN KEY (object) REFERENCES aladdinuser(id);


--
-- TOC entry 2009 (class 2606 OID 52563)
-- Dependencies: 1961 1628 1616
-- Name: fk27a9a52a7d6874; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a52a7d6874 FOREIGN KEY (questionnaire) REFERENCES questionnaire(id);


--
-- TOC entry 2010 (class 2606 OID 52568)
-- Dependencies: 1586 1921 1628
-- Name: fk27a9a543b65130; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a543b65130 FOREIGN KEY (assigner) REFERENCES aladdinuser(id);


--
-- TOC entry 2011 (class 2606 OID 52573)
-- Dependencies: 1628 1921 1586
-- Name: fk27a9a5d3883c27; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a5d3883c27 FOREIGN KEY (executor) REFERENCES aladdinuser(id);


--
-- TOC entry 1997 (class 2606 OID 52578)
-- Dependencies: 1614 1608 1959
-- Name: fk340c82e54eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e54eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 1998 (class 2606 OID 52583)
-- Dependencies: 1972 1624 1608
-- Name: fk340c82e5b1cf35a5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e5b1cf35a5 FOREIGN KEY (sd) REFERENCES sociodemographicdata(id);


--
-- TOC entry 1999 (class 2606 OID 52588)
-- Dependencies: 1608 1930 1592
-- Name: fk340c82e5f8fc050a; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e5f8fc050a FOREIGN KEY (clinician) REFERENCES clinician(id);


--
-- TOC entry 1987 (class 2606 OID 52593)
-- Dependencies: 1614 1588 1959
-- Name: fk3ddf7614eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY carer
    ADD CONSTRAINT fk3ddf7614eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 1988 (class 2606 OID 52598)
-- Dependencies: 1624 1588 1972
-- Name: fk3ddf761b1cf35a5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY carer
    ADD CONSTRAINT fk3ddf761b1cf35a5 FOREIGN KEY (sd) REFERENCES sociodemographicdata(id);


--
-- TOC entry 1986 (class 2606 OID 52603)
-- Dependencies: 1959 1614 1584
-- Name: fk8bef2ad4eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY administrator
    ADD CONSTRAINT fk8bef2ad4eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 1989 (class 2606 OID 52608)
-- Dependencies: 1590 1926 1588
-- Name: fk9be20503513c2a30; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT fk9be20503513c2a30 FOREIGN KEY (carer) REFERENCES carer(id);


--
-- TOC entry 1990 (class 2606 OID 52613)
-- Dependencies: 1590 1930 1592
-- Name: fk9be20503f8fc050a; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT fk9be20503f8fc050a FOREIGN KEY (clinician) REFERENCES clinician(id);


--
-- TOC entry 2012 (class 2606 OID 52618)
-- Dependencies: 1940 1604 1630
-- Name: fkb633112e2d183b26; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY translate
    ADD CONSTRAINT fkb633112e2d183b26 FOREIGN KEY (locale) REFERENCES locale(id);


--
-- TOC entry 2002 (class 2606 OID 52623)
-- Dependencies: 1926 1588 1612
-- Name: fkd4187b9c513c2a30; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT fkd4187b9c513c2a30 FOREIGN KEY (carer) REFERENCES carer(id);


--
-- TOC entry 2003 (class 2606 OID 52628)
-- Dependencies: 1950 1608 1612
-- Name: fkd4187b9c52781db8; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT fkd4187b9c52781db8 FOREIGN KEY (patient) REFERENCES patient(id);


--
-- TOC entry 2001 (class 2606 OID 52633)
-- Dependencies: 1608 1950 1610
-- Name: fkdd8afb8752781db8; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patientassessment
    ADD CONSTRAINT fkdd8afb8752781db8 FOREIGN KEY (patient) REFERENCES patient(id);


--
-- TOC entry 2005 (class 2606 OID 52638)
-- Dependencies: 1620 1616 1961
-- Name: fkded4aa896d8b73b3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT fkded4aa896d8b73b3 FOREIGN KEY (quest) REFERENCES questionnaire(id);


--
-- TOC entry 2006 (class 2606 OID 52643)
-- Dependencies: 1620 1967 1620
-- Name: fkded4aa89aa692d1c; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT fkded4aa89aa692d1c FOREIGN KEY (parentid) REFERENCES questionnairequestion(id);


--
-- TOC entry 1992 (class 2606 OID 52648)
-- Dependencies: 1959 1594 1614
-- Name: fkf1e9ffb64eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY communication
    ADD CONSTRAINT fkf1e9ffb64eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 1995 (class 2606 OID 52653)
-- Dependencies: 1628 1606 1977
-- Name: fkf75c839c5542f21c; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT fkf75c839c5542f21c FOREIGN KEY (task) REFERENCES task(id);


--
-- TOC entry 1996 (class 2606 OID 52658)
-- Dependencies: 1606 1954 1610
-- Name: fkf75c839cfc90a15c; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT fkf75c839cfc90a15c FOREIGN KEY (patientassessment) REFERENCES patientassessment(id);


--
-- TOC entry 2000 (class 2606 OID 52663)
-- Dependencies: 1926 1588 1608
-- Name: patientcarer; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT patientcarer FOREIGN KEY (carer) REFERENCES carer(id);


--
-- TOC entry 2013 (class 2606 OID 52668)
-- Dependencies: 1950 1608 1632
-- Name: warning_patient_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY warning
    ADD CONSTRAINT warning_patient_fkey FOREIGN KEY (patient) REFERENCES patient(id);


--
-- TOC entry 2018 (class 0 OID 0)
-- Dependencies: 6
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2011-06-07 12:26:02 CEST

--
-- PostgreSQL database dump complete
--

INSERT INTO persondata (id, surname, name) VALUES (1000041, 'Admin', 'Mr.');
INSERT INTO administrator (id, persondata) VALUES (1000010, 1000041);
INSERT INTO aladdinuser (id, username, password, TYPE, personid) VALUES (1000036, 'nhnn', 'nhnn', 1, 1000010);
  
