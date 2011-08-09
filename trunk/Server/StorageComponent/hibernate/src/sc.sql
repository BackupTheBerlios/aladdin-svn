--
-- PostgreSQL database dump
--

-- Started on 2011-08-09 15:00:39 CEST

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

--
-- TOC entry 2012 (class 1262 OID 16384)
-- Name: sc; Type: DATABASE; Schema: -; Owner: -
--

CREATE DATABASE sc WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.UTF-8' LC_CTYPE = 'en_US.UTF-8';


\connect sc

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 1586 (class 1259 OID 53539)
-- Dependencies: 6
-- Name: address; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

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


--
-- TOC entry 1587 (class 1259 OID 53545)
-- Dependencies: 6
-- Name: address_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE address_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1588 (class 1259 OID 53547)
-- Dependencies: 6
-- Name: administrator; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE administrator (
    id integer NOT NULL,
    persondata integer NOT NULL
);


--
-- TOC entry 1589 (class 1259 OID 53550)
-- Dependencies: 6
-- Name: administrator_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE administrator_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1590 (class 1259 OID 53552)
-- Dependencies: 1915 1916 6
-- Name: aladdinuser; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE aladdinuser (
    id integer NOT NULL,
    username character varying(255),
    password character varying(255),
    type integer,
    personid integer,
    CONSTRAINT aladdinuser_personid_check CHECK ((personid > 0)),
    CONSTRAINT aladdinuser_type_check CHECK ((type = ANY (ARRAY[1, 2, 3, 4, 5])))
);


--
-- TOC entry 1591 (class 1259 OID 53560)
-- Dependencies: 6
-- Name: aladdinuser_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE aladdinuser_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1592 (class 1259 OID 53562)
-- Dependencies: 6
-- Name: carer; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE carer (
    id integer NOT NULL,
    persondata integer NOT NULL,
    sd integer
);


--
-- TOC entry 1593 (class 1259 OID 53565)
-- Dependencies: 6
-- Name: carer_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE carer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1594 (class 1259 OID 53567)
-- Dependencies: 6
-- Name: carerassessment; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

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


--
-- TOC entry 1595 (class 1259 OID 53573)
-- Dependencies: 6
-- Name: carerassessment_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE carerassessment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1596 (class 1259 OID 53575)
-- Dependencies: 6
-- Name: clinician; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE clinician (
    id integer NOT NULL,
    persondata integer NOT NULL
);


--
-- TOC entry 1597 (class 1259 OID 53578)
-- Dependencies: 6
-- Name: clinician_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE clinician_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1598 (class 1259 OID 53580)
-- Dependencies: 6
-- Name: communication; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE communication (
    id integer NOT NULL,
    type character varying(255),
    value character varying(255),
    notes character varying(255),
    isprimary boolean,
    persondata integer
);


--
-- TOC entry 1599 (class 1259 OID 53586)
-- Dependencies: 6
-- Name: communication_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE communication_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1600 (class 1259 OID 53588)
-- Dependencies: 6
-- Name: dict; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE dict (
    id integer NOT NULL,
    code character varying(255),
    description character varying(255),
    locale integer,
    type integer
);


--
-- TOC entry 1601 (class 1259 OID 53594)
-- Dependencies: 6
-- Name: dict_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE dict_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1602 (class 1259 OID 53596)
-- Dependencies: 1917 6
-- Name: entertainmentcontent; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE entertainmentcontent (
    id integer NOT NULL,
    title text,
    url text,
    type text,
    category text,
    text text,
    enabled boolean DEFAULT false NOT NULL
);


--
-- TOC entry 1603 (class 1259 OID 53603)
-- Dependencies: 6 1602
-- Name: entertainmentcontent_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE entertainmentcontent_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 2015 (class 0 OID 0)
-- Dependencies: 1603
-- Name: entertainmentcontent_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE entertainmentcontent_id_seq OWNED BY entertainmentcontent.id;


--
-- TOC entry 1604 (class 1259 OID 53605)
-- Dependencies: 6
-- Name: externalservice; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE externalservice (
    id integer NOT NULL,
    address character varying(255),
    description character varying(255),
    type character varying(255)
);


--
-- TOC entry 1605 (class 1259 OID 53611)
-- Dependencies: 6
-- Name: externalservice_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE externalservice_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1606 (class 1259 OID 53613)
-- Dependencies: 6
-- Name: identifier; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE identifier (
    id integer NOT NULL,
    type character varying(255),
    number character varying(255),
    issuedate timestamp without time zone,
    issueauthority character varying(255),
    persondata integer
);


--
-- TOC entry 1607 (class 1259 OID 53619)
-- Dependencies: 6
-- Name: identifier_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE identifier_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1608 (class 1259 OID 53621)
-- Dependencies: 6
-- Name: locale; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE locale (
    id integer NOT NULL,
    name character varying(255)
);


--
-- TOC entry 1609 (class 1259 OID 53624)
-- Dependencies: 6
-- Name: locale_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE locale_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1610 (class 1259 OID 53626)
-- Dependencies: 1919 6
-- Name: measurement; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

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


--
-- TOC entry 1611 (class 1259 OID 53633)
-- Dependencies: 6
-- Name: measurement_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE measurement_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1612 (class 1259 OID 53635)
-- Dependencies: 6
-- Name: patient; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

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


--
-- TOC entry 1613 (class 1259 OID 53641)
-- Dependencies: 6
-- Name: patient_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE patient_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1614 (class 1259 OID 53643)
-- Dependencies: 6
-- Name: patientassessment; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

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


--
-- TOC entry 1615 (class 1259 OID 53649)
-- Dependencies: 6
-- Name: patientassessment_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE patientassessment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1616 (class 1259 OID 53651)
-- Dependencies: 6
-- Name: patientcarer; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE patientcarer (
    id integer NOT NULL,
    patient integer,
    carer integer,
    isprimary boolean
);


--
-- TOC entry 1617 (class 1259 OID 53654)
-- Dependencies: 6
-- Name: patientcarer_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE patientcarer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1618 (class 1259 OID 53656)
-- Dependencies: 6
-- Name: persondata; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE persondata (
    id integer NOT NULL,
    surname character varying(255) NOT NULL,
    name character varying(255) NOT NULL
);


--
-- TOC entry 1619 (class 1259 OID 53662)
-- Dependencies: 6
-- Name: persondata_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE persondata_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1620 (class 1259 OID 53664)
-- Dependencies: 6
-- Name: questionnaire; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE questionnaire (
    id integer NOT NULL,
    version numeric(19,2),
    title text
);


--
-- TOC entry 1621 (class 1259 OID 53667)
-- Dependencies: 6
-- Name: questionnaire_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE questionnaire_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1622 (class 1259 OID 53669)
-- Dependencies: 6
-- Name: questionnaireanswer; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE questionnaireanswer (
    id integer NOT NULL,
    question integer,
    value text,
    userid integer,
    "timestamp" timestamp without time zone,
    objectid integer
);


--
-- TOC entry 1623 (class 1259 OID 53672)
-- Dependencies: 6
-- Name: questionnaireanswer_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE questionnaireanswer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1624 (class 1259 OID 53674)
-- Dependencies: 1920 6
-- Name: questionnairequestion; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE questionnairequestion (
    id integer NOT NULL,
    type character varying(255),
    isprimary boolean,
    parentid integer,
    title text,
    quest integer,
    condition integer,
    deleted boolean,
    globalid integer DEFAULT 0 NOT NULL,
    "position" integer
);


--
-- TOC entry 1625 (class 1259 OID 53681)
-- Dependencies: 6
-- Name: questionnairequestion_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE questionnairequestion_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1626 (class 1259 OID 53683)
-- Dependencies: 6
-- Name: questionnairequestionanswer; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE questionnairequestionanswer (
    id integer NOT NULL,
    value integer,
    description text,
    question integer,
    deleted boolean,
    "position" integer
);


--
-- TOC entry 1627 (class 1259 OID 53686)
-- Dependencies: 6
-- Name: questionnairequestionanswer_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE questionnairequestionanswer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1628 (class 1259 OID 53688)
-- Dependencies: 6
-- Name: sociodemographicdata; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE sociodemographicdata (
    id integer NOT NULL,
    gender integer,
    maritalstatus integer,
    children integer,
    livingwith integer,
    birthday timestamp without time zone NOT NULL
);


--
-- TOC entry 1629 (class 1259 OID 53691)
-- Dependencies: 6
-- Name: sociodemographicdata_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE sociodemographicdata_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1630 (class 1259 OID 53693)
-- Dependencies: 6
-- Name: systemparameter; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE systemparameter (
    id integer NOT NULL,
    code character varying(255),
    description character varying(255)
);


--
-- TOC entry 1631 (class 1259 OID 53699)
-- Dependencies: 6
-- Name: systemparameter_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE systemparameter_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1632 (class 1259 OID 53701)
-- Dependencies: 6
-- Name: task; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

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


--
-- TOC entry 1633 (class 1259 OID 53707)
-- Dependencies: 6
-- Name: task_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE task_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1634 (class 1259 OID 53709)
-- Dependencies: 6
-- Name: translate; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE translate (
    id integer NOT NULL,
    entityid integer,
    entity text,
    locale integer,
    value text
);


--
-- TOC entry 1635 (class 1259 OID 53715)
-- Dependencies: 6
-- Name: translate_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE translate_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1636 (class 1259 OID 53717)
-- Dependencies: 6
-- Name: warning; Type: TABLE; Schema: public; Owner: -; Tablespace: 
--

CREATE TABLE warning (
    id integer NOT NULL,
    typeofwarning integer,
    datetimeofwarning timestamp without time zone,
    effect integer,
    indicator integer,
    risklevel integer,
    justificationtext text,
    emergencylevel integer,
    delivered boolean,
    patient integer
);


--
-- TOC entry 1637 (class 1259 OID 53720)
-- Dependencies: 6
-- Name: warning_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE warning_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


--
-- TOC entry 1918 (class 2604 OID 53722)
-- Dependencies: 1603 1602
-- Name: id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE entertainmentcontent ALTER COLUMN id SET DEFAULT nextval('entertainmentcontent_id_seq'::regclass);


--
-- TOC entry 1922 (class 2606 OID 53724)
-- Dependencies: 1586 1586
-- Name: address_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY address
    ADD CONSTRAINT address_pkey PRIMARY KEY (id);


--
-- TOC entry 1924 (class 2606 OID 53726)
-- Dependencies: 1588 1588
-- Name: administrator_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY administrator
    ADD CONSTRAINT administrator_pkey PRIMARY KEY (id);


--
-- TOC entry 1926 (class 2606 OID 53728)
-- Dependencies: 1590 1590
-- Name: aladdinuser_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY aladdinuser
    ADD CONSTRAINT aladdinuser_pkey PRIMARY KEY (id);


--
-- TOC entry 1928 (class 2606 OID 53730)
-- Dependencies: 1590 1590 1590
-- Name: aladdinuser_type_key; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY aladdinuser
    ADD CONSTRAINT aladdinuser_type_key UNIQUE (type, personid);


--
-- TOC entry 1931 (class 2606 OID 53732)
-- Dependencies: 1592 1592
-- Name: carer_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY carer
    ADD CONSTRAINT carer_pkey PRIMARY KEY (id);


--
-- TOC entry 1933 (class 2606 OID 53734)
-- Dependencies: 1594 1594
-- Name: carerassessment_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT carerassessment_pkey PRIMARY KEY (id);


--
-- TOC entry 1935 (class 2606 OID 53736)
-- Dependencies: 1596 1596
-- Name: clinician_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY clinician
    ADD CONSTRAINT clinician_pkey PRIMARY KEY (id);


--
-- TOC entry 1937 (class 2606 OID 53738)
-- Dependencies: 1598 1598
-- Name: communication_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY communication
    ADD CONSTRAINT communication_pkey PRIMARY KEY (id);


--
-- TOC entry 1939 (class 2606 OID 53740)
-- Dependencies: 1600 1600
-- Name: dict_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY dict
    ADD CONSTRAINT dict_pkey PRIMARY KEY (id);


--
-- TOC entry 1941 (class 2606 OID 53742)
-- Dependencies: 1604 1604
-- Name: externalservice_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY externalservice
    ADD CONSTRAINT externalservice_pkey PRIMARY KEY (id);


--
-- TOC entry 1943 (class 2606 OID 53744)
-- Dependencies: 1606 1606
-- Name: identifier_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY identifier
    ADD CONSTRAINT identifier_pkey PRIMARY KEY (id);


--
-- TOC entry 1945 (class 2606 OID 53746)
-- Dependencies: 1608 1608
-- Name: locale_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY locale
    ADD CONSTRAINT locale_pkey PRIMARY KEY (id);


--
-- TOC entry 1947 (class 2606 OID 53748)
-- Dependencies: 1610 1610
-- Name: measurement_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT measurement_pkey PRIMARY KEY (id);


--
-- TOC entry 1949 (class 2606 OID 53750)
-- Dependencies: 1610 1610 1610 1610 1610
-- Name: measurement_type_key; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT measurement_type_key UNIQUE (type, value, datetime, task);


--
-- TOC entry 1952 (class 2606 OID 53752)
-- Dependencies: 1612 1612
-- Name: patient_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT patient_pkey PRIMARY KEY (id);


--
-- TOC entry 1956 (class 2606 OID 53754)
-- Dependencies: 1614 1614
-- Name: patientassessment_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY patientassessment
    ADD CONSTRAINT patientassessment_pkey PRIMARY KEY (id);


--
-- TOC entry 1959 (class 2606 OID 53756)
-- Dependencies: 1616 1616
-- Name: patientcarer_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT patientcarer_pkey PRIMARY KEY (id);


--
-- TOC entry 1954 (class 2606 OID 53758)
-- Dependencies: 1612 1612
-- Name: pcu; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT pcu UNIQUE (carer);


--
-- TOC entry 1961 (class 2606 OID 53760)
-- Dependencies: 1618 1618
-- Name: persondata_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY persondata
    ADD CONSTRAINT persondata_pkey PRIMARY KEY (id);


--
-- TOC entry 1963 (class 2606 OID 53762)
-- Dependencies: 1620 1620
-- Name: questionnaire_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY questionnaire
    ADD CONSTRAINT questionnaire_pkey PRIMARY KEY (id);


--
-- TOC entry 1965 (class 2606 OID 53764)
-- Dependencies: 1622 1622
-- Name: questionnaireanswer_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY questionnaireanswer
    ADD CONSTRAINT questionnaireanswer_pkey PRIMARY KEY (id);


--
-- TOC entry 1967 (class 2606 OID 53766)
-- Dependencies: 1624 1624
-- Name: questionnairequestion_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT questionnairequestion_pkey PRIMARY KEY (id);


--
-- TOC entry 1969 (class 2606 OID 53768)
-- Dependencies: 1626 1626
-- Name: questionnairequestionanswer_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY questionnairequestionanswer
    ADD CONSTRAINT questionnairequestionanswer_pkey PRIMARY KEY (id);


--
-- TOC entry 1971 (class 2606 OID 53770)
-- Dependencies: 1628 1628
-- Name: sociodemographicdata_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY sociodemographicdata
    ADD CONSTRAINT sociodemographicdata_pkey PRIMARY KEY (id);


--
-- TOC entry 1973 (class 2606 OID 53772)
-- Dependencies: 1630 1630
-- Name: systemparameter_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY systemparameter
    ADD CONSTRAINT systemparameter_pkey PRIMARY KEY (id);


--
-- TOC entry 1975 (class 2606 OID 53774)
-- Dependencies: 1632 1632
-- Name: task_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY task
    ADD CONSTRAINT task_pkey PRIMARY KEY (id);


--
-- TOC entry 1977 (class 2606 OID 53776)
-- Dependencies: 1634 1634
-- Name: translate_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY translate
    ADD CONSTRAINT translate_pkey PRIMARY KEY (id);


--
-- TOC entry 1980 (class 2606 OID 53778)
-- Dependencies: 1636 1636
-- Name: warning_pkey; Type: CONSTRAINT; Schema: public; Owner: -; Tablespace: 
--

ALTER TABLE ONLY warning
    ADD CONSTRAINT warning_pkey PRIMARY KEY (id);


--
-- TOC entry 1957 (class 1259 OID 53779)
-- Dependencies: 1616
-- Name: cu; Type: INDEX; Schema: public; Owner: -; Tablespace: 
--

CREATE UNIQUE INDEX cu ON patientcarer USING btree (carer);


--
-- TOC entry 1978 (class 1259 OID 53780)
-- Dependencies: 1636
-- Name: fki_; Type: INDEX; Schema: public; Owner: -; Tablespace: 
--

CREATE INDEX fki_ ON warning USING btree (patient);


--
-- TOC entry 1950 (class 1259 OID 53781)
-- Dependencies: 1612
-- Name: fki_patientcarer; Type: INDEX; Schema: public; Owner: -; Tablespace: 
--

CREATE INDEX fki_patientcarer ON patient USING btree (carer);


--
-- TOC entry 1929 (class 1259 OID 53782)
-- Dependencies: 1590
-- Name: uu; Type: INDEX; Schema: public; Owner: -; Tablespace: 
--

CREATE UNIQUE INDEX uu ON aladdinuser USING btree (username);


--
-- TOC entry 1987 (class 2606 OID 53783)
-- Dependencies: 1618 1960 1596
-- Name: fk1501984e4eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY clinician
    ADD CONSTRAINT fk1501984e4eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 2000 (class 2606 OID 53788)
-- Dependencies: 1966 1624 1622
-- Name: fk161dfb211edfd5bd; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY questionnaireanswer
    ADD CONSTRAINT fk161dfb211edfd5bd FOREIGN KEY (question) REFERENCES questionnairequestion(id);


--
-- TOC entry 1990 (class 2606 OID 53793)
-- Dependencies: 1618 1960 1606
-- Name: fk165a88c94eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY identifier
    ADD CONSTRAINT fk165a88c94eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 2003 (class 2606 OID 53798)
-- Dependencies: 1626 1624 1966
-- Name: fk17920ba71edfd5bd; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY questionnairequestionanswer
    ADD CONSTRAINT fk17920ba71edfd5bd FOREIGN KEY (question) REFERENCES questionnairequestion(id);


--
-- TOC entry 1981 (class 2606 OID 53803)
-- Dependencies: 1586 1618 1960
-- Name: fk1ed033d44eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY address
    ADD CONSTRAINT fk1ed033d44eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 1989 (class 2606 OID 53808)
-- Dependencies: 1608 1944 1600
-- Name: fk207fd6f67d2746; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY dict
    ADD CONSTRAINT fk207fd6f67d2746 FOREIGN KEY (locale) REFERENCES locale(id);


--
-- TOC entry 2004 (class 2606 OID 53813)
-- Dependencies: 1632 1590 1925
-- Name: fk27a9a51cc2e693; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a51cc2e693 FOREIGN KEY (object) REFERENCES aladdinuser(id);


--
-- TOC entry 2005 (class 2606 OID 53818)
-- Dependencies: 1962 1620 1632
-- Name: fk27a9a52a7d6874; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a52a7d6874 FOREIGN KEY (questionnaire) REFERENCES questionnaire(id);


--
-- TOC entry 2006 (class 2606 OID 53823)
-- Dependencies: 1632 1925 1590
-- Name: fk27a9a543b65130; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a543b65130 FOREIGN KEY (assigner) REFERENCES aladdinuser(id);


--
-- TOC entry 2007 (class 2606 OID 53828)
-- Dependencies: 1925 1632 1590
-- Name: fk27a9a5d3883c27; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a5d3883c27 FOREIGN KEY (executor) REFERENCES aladdinuser(id);


--
-- TOC entry 1993 (class 2606 OID 53833)
-- Dependencies: 1612 1960 1618
-- Name: fk340c82e54eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e54eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 1994 (class 2606 OID 53838)
-- Dependencies: 1628 1970 1612
-- Name: fk340c82e5b1cf35a5; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e5b1cf35a5 FOREIGN KEY (sd) REFERENCES sociodemographicdata(id);


--
-- TOC entry 1995 (class 2606 OID 53843)
-- Dependencies: 1612 1934 1596
-- Name: fk340c82e5f8fc050a; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e5f8fc050a FOREIGN KEY (clinician) REFERENCES clinician(id);


--
-- TOC entry 1983 (class 2606 OID 53848)
-- Dependencies: 1960 1592 1618
-- Name: fk3ddf7614eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY carer
    ADD CONSTRAINT fk3ddf7614eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 1984 (class 2606 OID 53853)
-- Dependencies: 1628 1592 1970
-- Name: fk3ddf761b1cf35a5; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY carer
    ADD CONSTRAINT fk3ddf761b1cf35a5 FOREIGN KEY (sd) REFERENCES sociodemographicdata(id);


--
-- TOC entry 1982 (class 2606 OID 53858)
-- Dependencies: 1960 1588 1618
-- Name: fk8bef2ad4eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY administrator
    ADD CONSTRAINT fk8bef2ad4eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 1985 (class 2606 OID 53863)
-- Dependencies: 1594 1592 1930
-- Name: fk9be20503513c2a30; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT fk9be20503513c2a30 FOREIGN KEY (carer) REFERENCES carer(id);


--
-- TOC entry 1986 (class 2606 OID 53868)
-- Dependencies: 1934 1594 1596
-- Name: fk9be20503f8fc050a; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT fk9be20503f8fc050a FOREIGN KEY (clinician) REFERENCES clinician(id);


--
-- TOC entry 2008 (class 2606 OID 53873)
-- Dependencies: 1944 1608 1634
-- Name: fkb633112e2d183b26; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY translate
    ADD CONSTRAINT fkb633112e2d183b26 FOREIGN KEY (locale) REFERENCES locale(id);


--
-- TOC entry 1998 (class 2606 OID 53878)
-- Dependencies: 1592 1930 1616
-- Name: fkd4187b9c513c2a30; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT fkd4187b9c513c2a30 FOREIGN KEY (carer) REFERENCES carer(id);


--
-- TOC entry 1999 (class 2606 OID 53883)
-- Dependencies: 1616 1612 1951
-- Name: fkd4187b9c52781db8; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT fkd4187b9c52781db8 FOREIGN KEY (patient) REFERENCES patient(id);


--
-- TOC entry 1997 (class 2606 OID 53888)
-- Dependencies: 1612 1951 1614
-- Name: fkdd8afb8752781db8; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY patientassessment
    ADD CONSTRAINT fkdd8afb8752781db8 FOREIGN KEY (patient) REFERENCES patient(id);


--
-- TOC entry 2001 (class 2606 OID 53893)
-- Dependencies: 1624 1962 1620
-- Name: fkded4aa896d8b73b3; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT fkded4aa896d8b73b3 FOREIGN KEY (quest) REFERENCES questionnaire(id);


--
-- TOC entry 2002 (class 2606 OID 53898)
-- Dependencies: 1966 1624 1624
-- Name: fkded4aa89aa692d1c; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT fkded4aa89aa692d1c FOREIGN KEY (parentid) REFERENCES questionnairequestion(id);


--
-- TOC entry 1988 (class 2606 OID 53903)
-- Dependencies: 1598 1618 1960
-- Name: fkf1e9ffb64eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY communication
    ADD CONSTRAINT fkf1e9ffb64eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- TOC entry 1991 (class 2606 OID 53908)
-- Dependencies: 1974 1632 1610
-- Name: fkf75c839c5542f21c; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT fkf75c839c5542f21c FOREIGN KEY (task) REFERENCES task(id);


--
-- TOC entry 1992 (class 2606 OID 53913)
-- Dependencies: 1955 1614 1610
-- Name: fkf75c839cfc90a15c; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT fkf75c839cfc90a15c FOREIGN KEY (patientassessment) REFERENCES patientassessment(id);


--
-- TOC entry 1996 (class 2606 OID 53918)
-- Dependencies: 1612 1930 1592
-- Name: patientcarer; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT patientcarer FOREIGN KEY (carer) REFERENCES carer(id);


--
-- TOC entry 2009 (class 2606 OID 53923)
-- Dependencies: 1951 1636 1612
-- Name: warning_patient_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY warning
    ADD CONSTRAINT warning_patient_fkey FOREIGN KEY (patient) REFERENCES patient(id);


--
-- TOC entry 2014 (class 0 OID 0)
-- Dependencies: 6
-- Name: public; Type: ACL; Schema: -; Owner: -
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2011-08-09 15:00:40 CEST

--
-- PostgreSQL database dump complete
--

INSERT INTO persondata (id, surname, name) VALUES (1000041, 'Admin', 'Mr.');
INSERT INTO administrator (id, persondata) VALUES (1000010, 1000041);
INSERT INTO aladdinuser (id, username, password, TYPE, personid) VALUES (1000036, 'nhnn', 'nhnn', 1, 1000010);
  
