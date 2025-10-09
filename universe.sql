--
-- PostgreSQL database dump
--

-- Dumped from database version 12.22 (Ubuntu 12.22-0ubuntu0.20.04.4)
-- Dumped by pg_dump version 12.22 (Ubuntu 12.22-0ubuntu0.20.04.4)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE universe;
--
-- Name: universe; Type: DATABASE; Schema: -; Owner: freecodecamp
--

CREATE DATABASE universe WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C.UTF-8' LC_CTYPE = 'C.UTF-8';


ALTER DATABASE universe OWNER TO freecodecamp;

\connect universe

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: dummy1; Type: TABLE; Schema: public; Owner: freecodecamp
--

CREATE TABLE public.dummy1 (
    dummy_id integer NOT NULL,
    what1 integer NOT NULL,
    what2 integer NOT NULL,
    name character varying,
    dummy1_id integer NOT NULL
);


ALTER TABLE public.dummy1 OWNER TO freecodecamp;

--
-- Name: dummy2; Type: TABLE; Schema: public; Owner: freecodecamp
--

CREATE TABLE public.dummy2 (
    dummy_id integer NOT NULL,
    what2 integer NOT NULL,
    what1 integer NOT NULL,
    name character varying,
    dummy2_id integer NOT NULL
);


ALTER TABLE public.dummy2 OWNER TO freecodecamp;

--
-- Name: galaxy; Type: TABLE; Schema: public; Owner: freecodecamp
--

CREATE TABLE public.galaxy (
    galaxy_id integer NOT NULL,
    name character varying NOT NULL,
    number integer,
    etc1 integer,
    etc2 integer
);


ALTER TABLE public.galaxy OWNER TO freecodecamp;

--
-- Name: galaxy_galaxy_id_seq; Type: SEQUENCE; Schema: public; Owner: freecodecamp
--

CREATE SEQUENCE public.galaxy_galaxy_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.galaxy_galaxy_id_seq OWNER TO freecodecamp;

--
-- Name: galaxy_galaxy_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: freecodecamp
--

ALTER SEQUENCE public.galaxy_galaxy_id_seq OWNED BY public.galaxy.galaxy_id;


--
-- Name: moon; Type: TABLE; Schema: public; Owner: freecodecamp
--

CREATE TABLE public.moon (
    moon_id integer NOT NULL,
    name character varying NOT NULL,
    checking boolean,
    planet_id integer,
    etc1 integer
);


ALTER TABLE public.moon OWNER TO freecodecamp;

--
-- Name: moon_moon_id_seq; Type: SEQUENCE; Schema: public; Owner: freecodecamp
--

CREATE SEQUENCE public.moon_moon_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.moon_moon_id_seq OWNER TO freecodecamp;

--
-- Name: moon_moon_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: freecodecamp
--

ALTER SEQUENCE public.moon_moon_id_seq OWNED BY public.moon.moon_id;


--
-- Name: planet; Type: TABLE; Schema: public; Owner: freecodecamp
--

CREATE TABLE public.planet (
    planet_id integer NOT NULL,
    name character varying NOT NULL,
    shoot numeric(5,1),
    star_id integer,
    etc1 integer
);


ALTER TABLE public.planet OWNER TO freecodecamp;

--
-- Name: planet_planet_id_seq; Type: SEQUENCE; Schema: public; Owner: freecodecamp
--

CREATE SEQUENCE public.planet_planet_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.planet_planet_id_seq OWNER TO freecodecamp;

--
-- Name: planet_planet_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: freecodecamp
--

ALTER SEQUENCE public.planet_planet_id_seq OWNED BY public.planet.planet_id;


--
-- Name: star; Type: TABLE; Schema: public; Owner: freecodecamp
--

CREATE TABLE public.star (
    star_id integer NOT NULL,
    name character varying NOT NULL,
    number integer,
    description text,
    checking boolean,
    galaxy_id integer
);


ALTER TABLE public.star OWNER TO freecodecamp;

--
-- Name: star_star_id_seq; Type: SEQUENCE; Schema: public; Owner: freecodecamp
--

CREATE SEQUENCE public.star_star_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.star_star_id_seq OWNER TO freecodecamp;

--
-- Name: star_star_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: freecodecamp
--

ALTER SEQUENCE public.star_star_id_seq OWNED BY public.star.star_id;


--
-- Name: galaxy galaxy_id; Type: DEFAULT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.galaxy ALTER COLUMN galaxy_id SET DEFAULT nextval('public.galaxy_galaxy_id_seq'::regclass);


--
-- Name: moon moon_id; Type: DEFAULT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.moon ALTER COLUMN moon_id SET DEFAULT nextval('public.moon_moon_id_seq'::regclass);


--
-- Name: planet planet_id; Type: DEFAULT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.planet ALTER COLUMN planet_id SET DEFAULT nextval('public.planet_planet_id_seq'::regclass);


--
-- Name: star star_id; Type: DEFAULT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.star ALTER COLUMN star_id SET DEFAULT nextval('public.star_star_id_seq'::regclass);


--
-- Data for Name: dummy1; Type: TABLE DATA; Schema: public; Owner: freecodecamp
--

INSERT INTO public.dummy1 VALUES (1, 1, 1, NULL, 1);
INSERT INTO public.dummy1 VALUES (2, 2, 2, NULL, 2);
INSERT INTO public.dummy1 VALUES (3, 3, 3, NULL, 3);


--
-- Data for Name: dummy2; Type: TABLE DATA; Schema: public; Owner: freecodecamp
--

INSERT INTO public.dummy2 VALUES (1, 1, 1, NULL, 1);
INSERT INTO public.dummy2 VALUES (2, 2, 2, NULL, 2);
INSERT INTO public.dummy2 VALUES (3, 3, 3, NULL, 3);


--
-- Data for Name: galaxy; Type: TABLE DATA; Schema: public; Owner: freecodecamp
--

INSERT INTO public.galaxy VALUES (1, '우리은하', 1, NULL, NULL);
INSERT INTO public.galaxy VALUES (2, '우리은하2', 2, NULL, NULL);
INSERT INTO public.galaxy VALUES (3, '우리은하3', 2, NULL, NULL);
INSERT INTO public.galaxy VALUES (4, '우리은하4', 2, NULL, NULL);
INSERT INTO public.galaxy VALUES (5, '우리은하5', 2, NULL, NULL);
INSERT INTO public.galaxy VALUES (6, '우리은하6', 2, NULL, NULL);


--
-- Data for Name: moon; Type: TABLE DATA; Schema: public; Owner: freecodecamp
--

INSERT INTO public.moon VALUES (2, 'Moon', true, 1, NULL);
INSERT INTO public.moon VALUES (3, 'Moon2', true, 1, NULL);
INSERT INTO public.moon VALUES (4, 'Moon3', true, 1, NULL);
INSERT INTO public.moon VALUES (5, 'Moon4', false, 2, NULL);
INSERT INTO public.moon VALUES (6, 'Moon5', false, 2, NULL);
INSERT INTO public.moon VALUES (7, 'Moon6', false, 2, NULL);
INSERT INTO public.moon VALUES (8, 'Moon7', false, 2, NULL);
INSERT INTO public.moon VALUES (9, 'Moon8', false, 2, NULL);
INSERT INTO public.moon VALUES (10, 'Moon9', false, 2, NULL);
INSERT INTO public.moon VALUES (11, 'Moon10', false, 2, NULL);
INSERT INTO public.moon VALUES (12, 'Moon11', false, 2, NULL);
INSERT INTO public.moon VALUES (13, 'Moon12', false, 2, NULL);
INSERT INTO public.moon VALUES (14, 'Moon13', false, 2, NULL);
INSERT INTO public.moon VALUES (15, 'Moon14', false, 2, NULL);
INSERT INTO public.moon VALUES (16, 'Moon15', false, 2, NULL);
INSERT INTO public.moon VALUES (17, 'Moon16', false, 2, NULL);
INSERT INTO public.moon VALUES (18, 'Moon17', false, 2, NULL);
INSERT INTO public.moon VALUES (19, 'Moon18', false, 2, NULL);
INSERT INTO public.moon VALUES (20, 'Moon19', false, 2, NULL);
INSERT INTO public.moon VALUES (21, 'Moon20', false, 2, NULL);


--
-- Data for Name: planet; Type: TABLE DATA; Schema: public; Owner: freecodecamp
--

INSERT INTO public.planet VALUES (1, 'Earth', 5.1, 1, NULL);
INSERT INTO public.planet VALUES (2, 'Earth2', 5.2, 1, NULL);
INSERT INTO public.planet VALUES (3, 'Earth3', 5.2, 1, NULL);
INSERT INTO public.planet VALUES (4, 'Earth4', 5.2, 1, NULL);
INSERT INTO public.planet VALUES (5, 'Earth5', 5.2, 1, NULL);
INSERT INTO public.planet VALUES (6, 'Earth6', 5.2, 1, NULL);
INSERT INTO public.planet VALUES (7, 'Earth7', 5.2, 1, NULL);
INSERT INTO public.planet VALUES (8, 'Earth8', 5.2, 1, NULL);
INSERT INTO public.planet VALUES (9, 'Earth9', 5.2, 1, NULL);
INSERT INTO public.planet VALUES (10, 'Earth10', 5.2, 1, NULL);
INSERT INTO public.planet VALUES (11, 'Earth11', 5.2, 1, NULL);
INSERT INTO public.planet VALUES (12, 'Earth12', 5.2, 1, NULL);


--
-- Data for Name: star; Type: TABLE DATA; Schema: public; Owner: freecodecamp
--

INSERT INTO public.star VALUES (1, '태양', 1, '1', true, 1);
INSERT INTO public.star VALUES (2, '태양2', 1, '1', true, 1);
INSERT INTO public.star VALUES (3, '태양3', 1, '1', true, 1);
INSERT INTO public.star VALUES (4, '태양4', 1, '1', true, 1);
INSERT INTO public.star VALUES (5, '태양5', 1, '1', true, 1);
INSERT INTO public.star VALUES (6, '태양6', 1, '1', true, 1);


--
-- Name: galaxy_galaxy_id_seq; Type: SEQUENCE SET; Schema: public; Owner: freecodecamp
--

SELECT pg_catalog.setval('public.galaxy_galaxy_id_seq', 6, true);


--
-- Name: moon_moon_id_seq; Type: SEQUENCE SET; Schema: public; Owner: freecodecamp
--

SELECT pg_catalog.setval('public.moon_moon_id_seq', 21, true);


--
-- Name: planet_planet_id_seq; Type: SEQUENCE SET; Schema: public; Owner: freecodecamp
--

SELECT pg_catalog.setval('public.planet_planet_id_seq', 12, true);


--
-- Name: star_star_id_seq; Type: SEQUENCE SET; Schema: public; Owner: freecodecamp
--

SELECT pg_catalog.setval('public.star_star_id_seq', 6, true);


--
-- Name: dummy1 dummy1_dummy_id_key; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.dummy1
    ADD CONSTRAINT dummy1_dummy_id_key UNIQUE (dummy_id);


--
-- Name: dummy1 dummy1_pkey; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.dummy1
    ADD CONSTRAINT dummy1_pkey PRIMARY KEY (dummy1_id);


--
-- Name: dummy2 dummy2_dummy_id_key; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.dummy2
    ADD CONSTRAINT dummy2_dummy_id_key UNIQUE (dummy_id);


--
-- Name: dummy2 dummy2_pkey; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.dummy2
    ADD CONSTRAINT dummy2_pkey PRIMARY KEY (dummy2_id);


--
-- Name: galaxy galaxy_galaxy_id_key; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.galaxy
    ADD CONSTRAINT galaxy_galaxy_id_key UNIQUE (galaxy_id);


--
-- Name: galaxy galaxy_pkey; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.galaxy
    ADD CONSTRAINT galaxy_pkey PRIMARY KEY (galaxy_id);


--
-- Name: moon moon_moon_id_key; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.moon
    ADD CONSTRAINT moon_moon_id_key UNIQUE (moon_id);


--
-- Name: moon moon_pkey; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.moon
    ADD CONSTRAINT moon_pkey PRIMARY KEY (moon_id);


--
-- Name: planet planet_pkey; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.planet
    ADD CONSTRAINT planet_pkey PRIMARY KEY (planet_id);


--
-- Name: planet planet_planet_id_key; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.planet
    ADD CONSTRAINT planet_planet_id_key UNIQUE (planet_id);


--
-- Name: star star_pkey; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.star
    ADD CONSTRAINT star_pkey PRIMARY KEY (star_id);


--
-- Name: star star_star_id_key; Type: CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.star
    ADD CONSTRAINT star_star_id_key UNIQUE (star_id);


--
-- Name: moon moon_planet_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.moon
    ADD CONSTRAINT moon_planet_id_fkey FOREIGN KEY (planet_id) REFERENCES public.planet(planet_id);


--
-- Name: planet planet_star_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.planet
    ADD CONSTRAINT planet_star_id_fkey FOREIGN KEY (star_id) REFERENCES public.star(star_id);


--
-- Name: star star_galaxy_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: freecodecamp
--

ALTER TABLE ONLY public.star
    ADD CONSTRAINT star_galaxy_id_fkey FOREIGN KEY (galaxy_id) REFERENCES public.galaxy(galaxy_id);


--
-- PostgreSQL database dump complete
--

