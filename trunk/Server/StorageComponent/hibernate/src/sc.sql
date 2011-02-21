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

ALTER TABLE public.address OWNER TO postgres;

CREATE SEQUENCE address_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

ALTER TABLE public.address_id_seq OWNER TO postgres;

CREATE TABLE administrator (
    id integer NOT NULL,
    persondata integer
);

ALTER TABLE public.administrator OWNER TO postgres;

CREATE SEQUENCE administrator_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

ALTER TABLE public.administrator_id_seq OWNER TO postgres;

CREATE TABLE aladdinuser (
    id integer NOT NULL,
    username character varying(255),
    password character varying(255),
    type integer,
    personid character varying(255)
);

ALTER TABLE public.aladdinuser OWNER TO postgres;

CREATE SEQUENCE aladdinuser_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

ALTER TABLE public.aladdinuser_id_seq OWNER TO postgres;

CREATE TABLE carer (
    id integer NOT NULL,
    persondata integer,
    sd integer
);

ALTER TABLE public.carer OWNER TO postgres;

CREATE SEQUENCE carer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

ALTER TABLE public.carer_id_seq OWNER TO postgres;

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

ALTER TABLE public.carerassessment OWNER TO postgres;

CREATE SEQUENCE carerassessment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

ALTER TABLE public.carerassessment_id_seq OWNER TO postgres;

CREATE TABLE clinician (
    id integer NOT NULL,
    persondata integer
);

ALTER TABLE public.clinician OWNER TO postgres;

CREATE SEQUENCE clinician_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

ALTER TABLE public.clinician_id_seq OWNER TO postgres;

CREATE TABLE communication (
    id integer NOT NULL,
    type character varying(255),
    value character varying(255),
    notes character varying(255),
    isprimary boolean,
    persondata integer
);

ALTER TABLE public.communication OWNER TO postgres;

CREATE SEQUENCE communication_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

ALTER TABLE public.communication_id_seq OWNER TO postgres;

CREATE TABLE dict (
    id integer NOT NULL,
    code character varying(255),
    description character varying(255),
    locale integer,
    type integer
);

ALTER TABLE public.dict OWNER TO postgres;

CREATE SEQUENCE dict_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

ALTER TABLE public.dict_id_seq OWNER TO postgres;

CREATE TABLE entertainmentcontent (
    id integer NOT NULL,
    title text,
    url text,
    type text,
    category text,
    text text,
    enabled boolean DEFAULT false NOT NULL
);

ALTER TABLE public.entertainmentcontent OWNER TO fokus;

--
-- Name: entertainmentcontent_id_seq; Type: SEQUENCE; Schema: public; Owner: fokus
--

CREATE SEQUENCE entertainmentcontent_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.entertainmentcontent_id_seq OWNER TO fokus;

--
-- Name: entertainmentcontent_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: fokus
--

ALTER SEQUENCE entertainmentcontent_id_seq OWNED BY entertainmentcontent.id;


--
-- Name: externalservice; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE externalservice (
    id integer NOT NULL,
    address character varying(255),
    description character varying(255),
    type character varying(255)
);


ALTER TABLE public.externalservice OWNER TO postgres;

--
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
-- Name: identifier; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE identifier (
    id integer NOT NULL,
    type character varying(255),
    number character varying(255),
    issuedate timestamp without time zone,
    issueauthority character varying(255),
    persondata integer
);


ALTER TABLE public.identifier OWNER TO postgres;

--
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
-- Name: locale; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE locale (
    id integer NOT NULL,
    name character varying(255)
);


ALTER TABLE public.locale OWNER TO postgres;

--
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
-- Name: measurement; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
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


ALTER TABLE public.measurement OWNER TO postgres;

--
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
-- Name: patient; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE patient (
    id integer NOT NULL,
    persondata integer,
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
    gpemail character varying(255)
);


ALTER TABLE public.patient OWNER TO postgres;

--
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
-- Name: patientassessment; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
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


ALTER TABLE public.patientassessment OWNER TO postgres;

--
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
-- Name: patientcarer; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE patientcarer (
    id integer NOT NULL,
    patient integer,
    carer integer,
    isprimary boolean
);


ALTER TABLE public.patientcarer OWNER TO postgres;

--
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
-- Name: persondata; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE persondata (
    id integer NOT NULL,
    surname character varying(255),
    name character varying(255)
);


ALTER TABLE public.persondata OWNER TO postgres;

--
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
-- Name: questionnaire; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE questionnaire (
    id integer NOT NULL,
    version numeric(19,2),
    title character varying(255)
);


ALTER TABLE public.questionnaire OWNER TO postgres;

--
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
-- Name: questionnaireanswer; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE questionnaireanswer (
    id integer NOT NULL,
    question integer,
    value character varying(255),
    userid integer,
    "timestamp" timestamp without time zone,
    objectid integer
);


ALTER TABLE public.questionnaireanswer OWNER TO postgres;

--
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
-- Name: questionnairequestion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

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


ALTER TABLE public.questionnairequestion OWNER TO postgres;

--
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
-- Name: questionnairequestionanswer; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE questionnairequestionanswer (
    id integer NOT NULL,
    value integer,
    description character varying(255),
    question integer,
    deleted boolean,
    "position" integer
);


ALTER TABLE public.questionnairequestionanswer OWNER TO postgres;

--
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
-- Name: sociodemographicdata; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE sociodemographicdata (
    id integer NOT NULL,
    age integer,
    gender integer,
    maritalstatus integer,
    children integer,
    livingwith integer
);


ALTER TABLE public.sociodemographicdata OWNER TO postgres;

--
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
-- Name: systemparameter; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE systemparameter (
    id integer NOT NULL,
    code character varying(255),
    description character varying(255)
);


ALTER TABLE public.systemparameter OWNER TO postgres;

--
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
-- Name: task; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
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
    text character varying(255)
);


ALTER TABLE public.task OWNER TO postgres;

--
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
-- Name: translate; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE translate (
    id integer NOT NULL,
    entityid integer,
    entity character varying(255),
    locale integer,
    value character varying(255)
);


ALTER TABLE public.translate OWNER TO postgres;

--
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
-- Name: warning; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE warning (
    id integer NOT NULL,
    typeofwarning integer,
    datetimeofwarning timestamp without time zone,
    effect integer,
    indicator integer,
    risklevel integer,
    justificationtext character varying(255),
    emergencylevel integer,
    patientid character varying(255),
    delivered boolean
);


ALTER TABLE public.warning OWNER TO postgres;

--
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
-- Name: id; Type: DEFAULT; Schema: public; Owner: fokus
--

ALTER TABLE entertainmentcontent ALTER COLUMN id SET DEFAULT nextval('entertainmentcontent_id_seq'::regclass);


--
-- Name: address_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY address
    ADD CONSTRAINT address_pkey PRIMARY KEY (id);


--
-- Name: administrator_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY administrator
    ADD CONSTRAINT administrator_pkey PRIMARY KEY (id);


--
-- Name: aladdinuser_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY aladdinuser
    ADD CONSTRAINT aladdinuser_pkey PRIMARY KEY (id);


--
-- Name: carer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY carer
    ADD CONSTRAINT carer_pkey PRIMARY KEY (id);


--
-- Name: carerassessment_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT carerassessment_pkey PRIMARY KEY (id);


--
-- Name: clinician_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY clinician
    ADD CONSTRAINT clinician_pkey PRIMARY KEY (id);


--
-- Name: communication_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY communication
    ADD CONSTRAINT communication_pkey PRIMARY KEY (id);


--
-- Name: dict_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY dict
    ADD CONSTRAINT dict_pkey PRIMARY KEY (id);


--
-- Name: externalservice_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY externalservice
    ADD CONSTRAINT externalservice_pkey PRIMARY KEY (id);


--
-- Name: identifier_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY identifier
    ADD CONSTRAINT identifier_pkey PRIMARY KEY (id);


--
-- Name: locale_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY locale
    ADD CONSTRAINT locale_pkey PRIMARY KEY (id);


--
-- Name: measurement_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT measurement_pkey PRIMARY KEY (id);


--
-- Name: patient_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT patient_pkey PRIMARY KEY (id);


--
-- Name: patientassessment_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY patientassessment
    ADD CONSTRAINT patientassessment_pkey PRIMARY KEY (id);


--
-- Name: patientcarer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT patientcarer_pkey PRIMARY KEY (id);


--
-- Name: persondata_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY persondata
    ADD CONSTRAINT persondata_pkey PRIMARY KEY (id);


--
-- Name: questionnaire_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY questionnaire
    ADD CONSTRAINT questionnaire_pkey PRIMARY KEY (id);


--
-- Name: questionnaireanswer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY questionnaireanswer
    ADD CONSTRAINT questionnaireanswer_pkey PRIMARY KEY (id);


--
-- Name: questionnairequestion_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT questionnairequestion_pkey PRIMARY KEY (id);


--
-- Name: questionnairequestionanswer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY questionnairequestionanswer
    ADD CONSTRAINT questionnairequestionanswer_pkey PRIMARY KEY (id);


--
-- Name: sociodemographicdata_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY sociodemographicdata
    ADD CONSTRAINT sociodemographicdata_pkey PRIMARY KEY (id);


--
-- Name: systemparameter_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY systemparameter
    ADD CONSTRAINT systemparameter_pkey PRIMARY KEY (id);


--
-- Name: task_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY task
    ADD CONSTRAINT task_pkey PRIMARY KEY (id);


--
-- Name: translate_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY translate
    ADD CONSTRAINT translate_pkey PRIMARY KEY (id);


--
-- Name: warning_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY warning
    ADD CONSTRAINT warning_pkey PRIMARY KEY (id);


--
-- Name: fk1501984e4eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY clinician
    ADD CONSTRAINT fk1501984e4eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- Name: fk161dfb211edfd5bd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY questionnaireanswer
    ADD CONSTRAINT fk161dfb211edfd5bd FOREIGN KEY (question) REFERENCES questionnairequestion(id);


--
-- Name: fk165a88c94eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY identifier
    ADD CONSTRAINT fk165a88c94eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- Name: fk17920ba71edfd5bd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY questionnairequestionanswer
    ADD CONSTRAINT fk17920ba71edfd5bd FOREIGN KEY (question) REFERENCES questionnairequestion(id);


--
-- Name: fk1ed033d44eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY address
    ADD CONSTRAINT fk1ed033d44eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- Name: fk207fd6f67d2746; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY dict
    ADD CONSTRAINT fk207fd6f67d2746 FOREIGN KEY (locale) REFERENCES locale(id);


--
-- Name: fk27a9a51cc2e693; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a51cc2e693 FOREIGN KEY (object) REFERENCES aladdinuser(id);


--
-- Name: fk27a9a52a7d6874; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a52a7d6874 FOREIGN KEY (questionnaire) REFERENCES questionnaire(id);


--
-- Name: fk27a9a543b65130; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a543b65130 FOREIGN KEY (assigner) REFERENCES aladdinuser(id);


--
-- Name: fk27a9a5d3883c27; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY task
    ADD CONSTRAINT fk27a9a5d3883c27 FOREIGN KEY (executor) REFERENCES aladdinuser(id);


--
-- Name: fk340c82e54eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e54eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- Name: fk340c82e5b1cf35a5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e5b1cf35a5 FOREIGN KEY (sd) REFERENCES sociodemographicdata(id);


--
-- Name: fk340c82e5f8fc050a; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patient
    ADD CONSTRAINT fk340c82e5f8fc050a FOREIGN KEY (clinician) REFERENCES clinician(id);


--
-- Name: fk3ddf7614eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY carer
    ADD CONSTRAINT fk3ddf7614eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- Name: fk3ddf761b1cf35a5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY carer
    ADD CONSTRAINT fk3ddf761b1cf35a5 FOREIGN KEY (sd) REFERENCES sociodemographicdata(id);


--
-- Name: fk8bef2ad4eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY administrator
    ADD CONSTRAINT fk8bef2ad4eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- Name: fk9be20503513c2a30; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT fk9be20503513c2a30 FOREIGN KEY (carer) REFERENCES carer(id);


--
-- Name: fk9be20503f8fc050a; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY carerassessment
    ADD CONSTRAINT fk9be20503f8fc050a FOREIGN KEY (clinician) REFERENCES clinician(id);


--
-- Name: fkb633112e2d183b26; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY translate
    ADD CONSTRAINT fkb633112e2d183b26 FOREIGN KEY (locale) REFERENCES locale(id);


--
-- Name: fkd4187b9c513c2a30; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT fkd4187b9c513c2a30 FOREIGN KEY (carer) REFERENCES carer(id);


--
-- Name: fkd4187b9c52781db8; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patientcarer
    ADD CONSTRAINT fkd4187b9c52781db8 FOREIGN KEY (patient) REFERENCES patient(id);


--
-- Name: fkdd8afb8752781db8; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY patientassessment
    ADD CONSTRAINT fkdd8afb8752781db8 FOREIGN KEY (patient) REFERENCES patient(id);


--
-- Name: fkded4aa896d8b73b3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT fkded4aa896d8b73b3 FOREIGN KEY (quest) REFERENCES questionnaire(id);


--
-- Name: fkded4aa89aa692d1c; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY questionnairequestion
    ADD CONSTRAINT fkded4aa89aa692d1c FOREIGN KEY (parentid) REFERENCES questionnairequestion(id);


--
-- Name: fkf1e9ffb64eac96b0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY communication
    ADD CONSTRAINT fkf1e9ffb64eac96b0 FOREIGN KEY (persondata) REFERENCES persondata(id);


--
-- Name: fkf75c839c5542f21c; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT fkf75c839c5542f21c FOREIGN KEY (task) REFERENCES task(id);


--
-- Name: fkf75c839cfc90a15c; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY measurement
    ADD CONSTRAINT fkf75c839cfc90a15c FOREIGN KEY (patientassessment) REFERENCES patientassessment(id);

