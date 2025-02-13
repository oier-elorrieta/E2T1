-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 13-02-2025 a las 10:25:36
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_bidaiaagentzia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agentzia`
--

CREATE TABLE `agentzia` (
  `ID_AGENTZIA` int(11) NOT NULL,
  `IZENA` varchar(50) DEFAULT NULL,
  `LOGOA` varchar(400) DEFAULT NULL,
  `MARKAREN_KOLOREA` varchar(25) DEFAULT NULL,
  `ERABILTZAILEA` varchar(25) DEFAULT NULL,
  `PASAHITZA` varchar(8) DEFAULT NULL,
  `AGENTZIA_MOTA_KODEA` varchar(2) DEFAULT NULL,
  `LANGILE_KOPURUA_KODEA` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `agentzia`
--

INSERT INTO `agentzia` (`ID_AGENTZIA`, `IZENA`, `LOGOA`, `MARKAREN_KOLOREA`, `ERABILTZAILEA`, `PASAHITZA`, `AGENTZIA_MOTA_KODEA`, `LANGILE_KOPURUA_KODEA`) VALUES
(1, 'Agentzia_T1', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6B9Ot3bkvejstpI_j91F-L92wIzh_VG59SA&s', '#6495ED', 'admin', 'admin', NULL, NULL),
(2, 'Agentzia_T2', 'https://images.theconversation.com/files/502570/original/file-20221222-22-mdjwl6.png?ixlib=rb-4.1.0&q=45&auto=format&w=1000&fit=clip', '#FFB6C1', 'aa', 'aa', NULL, NULL),
(3, 'Agentzia_T3', 'https://www.dzoom.org.es/wp-content/uploads/2019/07/fotografia-flores-primavera-consejos-810x540.jpg', '#8FBC8F', 'bb', 'bb', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agentzia_motak`
--

CREATE TABLE `agentzia_motak` (
  `KODEA` varchar(2) NOT NULL,
  `DESKRIBAPENA` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `agentzia_motak`
--

INSERT INTO `agentzia_motak` (`KODEA`, `DESKRIBAPENA`) VALUES
('A1', 'Mayorista'),
('A2', 'Minorista'),
('A3', 'Mayorista-minorista');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `airelineak`
--

CREATE TABLE `airelineak` (
  `KODEA` varchar(5) NOT NULL,
  `IZENA` varchar(60) DEFAULT NULL,
  `KOD_HERRIALDEAK` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `airelineak`
--

INSERT INTO `airelineak` (`KODEA`, `IZENA`, `KOD_HERRIALDEAK`) VALUES
('2K', 'AVIANCA-Ecuador dba AVIANCA', 'EC'),
('3P', 'World 2 Fly PT, S.A.', 'PT'),
('6B*', 'TUIfly Nordic AB', 'CN'),
('A.C.', 'Air France', 'FR'),
('A0', 'BA Euroflyer Limited dba British Airways', 'GB'),
('AA', 'American Airlines', 'USA'),
('AM', 'Aerovias de Mexico SA de CV dba AeroMexico', 'MX'),
('AR', 'Aerolineas Argentinas S.A.', 'AR'),
('AV', 'Aerovias del Continente Americano S.A. AVIANCA', 'CO'),
('AY', 'Finnair', 'FI'),
('AZ', 'Alitalia', 'IT'),
('BA', 'British Airways PLC', 'GB'),
('CL', 'Lufthansa CityLine GmbH', 'DE'),
('DE', 'Condor Flugdienst GmbH', 'DE'),
('DL', 'Delta Air Lines Inc', 'USA'),
('DS', 'Easyjet CH S.A', 'CH'),
('GL', 'Air GRL', 'GRL'),
('JJ', 'Tam Linhas Aereas SA dba Latam Airlines Brasil', 'BR'),
('KL', 'KLM', 'NL'),
('KN', 'CN United Airlines', 'CN'),
('LH', 'Lufthansa', 'DE'),
('LX', 'SWISS International Air Lines Ltd', 'CH'),
('M3', 'BSA - Aerolinhas Brasileiras S.A dba LATAM Cargo Br', 'BR'),
('MS', 'Egyptair', 'EG'),
('MT', 'MT Air Travel Ltd dba MT MedAir', 'MT'),
('N0', 'Norse Atlantic Airways AS', 'NO'),
('OU', 'HR Airlines d.d.', 'HR'),
('PC', 'Pegasus Airlines', 'TR'),
('QR', 'QA Airways Group Q.C.S.C dba QA Airways', 'QA'),
('RJ', 'Alia - The Royal JOn Airlines dba Royal JOn', 'JO'),
('RK', 'RYNAIR', 'GB'),
('S4', 'SATA Internacional - Azores Airlines, S.A.', 'PT'),
('SN', 'Brussels Airlines', 'BE'),
('SP', 'SATA (Air Acores)', 'PT'),
('TK', 'Turkish Airlines Inc', 'TR'),
('TP', 'TAP PT', 'PT'),
('TS', 'Air Transat', 'CA'),
('U2', 'EASYJET UK LIMITED', 'GB'),
('UA', 'United Airlines Inc', 'USA'),
('UX', 'Air Europa Lineas Aereas, S.A.', 'ES'),
('VOY', 'Aerolínea Vueling SA', 'ES'),
('VS', 'Virgin Atlantic Airways Ltd', 'GB'),
('WA', 'KLM Cityhopper', 'NL'),
('WFL', 'World2Fly', 'ES'),
('WK', 'Edelweiss Air AG', 'CH'),
('X3*', 'TUIfly Gmbh', 'DE'),
('X7', 'Challenge Airlines (BE) S.A.', 'BE'),
('YW', 'Air Nostrum, Lineas aereas del Mediterraneo SA', 'ES');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bidaiak`
--

CREATE TABLE `bidaiak` (
  `ID_BIDAIA` int(11) NOT NULL,
  `IZENA` varchar(25) DEFAULT NULL,
  `DESKRIBAPENA` mediumtext DEFAULT NULL,
  `HASIERA_DATA` date DEFAULT NULL,
  `AMAIERA_DATA` date DEFAULT NULL,
  `EZ_BARNE_ZERBITZUAK` mediumtext DEFAULT NULL,
  `BIDAIA_MOTA_KODEA` varchar(2) DEFAULT NULL,
  `AGENTZIA_KODEA` int(11) DEFAULT NULL,
  `HERRIALDEAK_KODEA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bidaiak`
--

INSERT INTO `bidaiak` (`ID_BIDAIA`, `IZENA`, `DESKRIBAPENA`, `HASIERA_DATA`, `AMAIERA_DATA`, `EZ_BARNE_ZERBITZUAK`, `BIDAIA_MOTA_KODEA`, `AGENTZIA_KODEA`, `HERRIALDEAK_KODEA`) VALUES
(1, 'lehenbidaia', 'hau lehen bidaia da', '2000-02-02', '2000-02-12', 'zerbitzurik ez', 'B1', 1, 'AR'),
(2, 'bigarrenbidaia', 'hau bigarren bidaia da', '2000-02-02', '2000-02-17', 'zerbitzurik ez', 'B1', 2, 'AR'),
(3, 'hirugarrenbidaia', 'hau hirugarren bidaia da', '2000-02-02', '2000-05-20', 'zerbitzurik ez', 'B1', 3, 'AR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bidaia_motak`
--

CREATE TABLE `bidaia_motak` (
  `KODEA` varchar(2) NOT NULL,
  `DESKRIBAPENA` varchar(55) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bidaia_motak`
--

INSERT INTO `bidaia_motak` (`KODEA`, `DESKRIBAPENA`) VALUES
('B1', 'Ezkongaiak'),
('B2', 'Senior'),
('B3', 'Taldeak'),
('B4', 'Bidaia handiak (helmuga exotikoak+hegaldia+ostatua)'),
('B5', 'Eskapada'),
('B6', 'Familiak (haur txikiekin)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ekitaldiak`
--

CREATE TABLE `ekitaldiak` (
  `ID_EKITALDIA` int(11) NOT NULL,
  `IZENA` varchar(25) DEFAULT NULL,
  `ID_BIDAIA` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ekitaldiak`
--

INSERT INTO `ekitaldiak` (`ID_EKITALDIA`, `IZENA`, `ID_BIDAIA`) VALUES
(1, 'ostatua', 2),
(2, 'ostatua', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `herrialdeak`
--

CREATE TABLE `herrialdeak` (
  `KOD_HERRIALDEAK` varchar(3) NOT NULL,
  `HERRIALDEAK` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `herrialdeak`
--

INSERT INTO `herrialdeak` (`KOD_HERRIALDEAK`, `HERRIALDEAK`) VALUES
('AR', 'ARGENTINA'),
('AT', 'AUSTRIA'),
('BE', 'BÉLGICA'),
('BR', 'BRASIL'),
('CA', 'CANADA'),
('CH', 'SUIZA'),
('CN', 'CHINA'),
('CU', 'CUBA'),
('CY', 'CHIPRE'),
('CZ', 'REPUBLICA CHECA'),
('DE', 'ALEMANIA'),
('DK', 'DINAMARCA'),
('EE', 'ESTONIA'),
('EG', 'EGIPTO'),
('ES', 'ESPAÑA'),
('FI', 'FINLANDIA'),
('FR', 'FRANCIA'),
('GB', 'REINO UNIDO'),
('GR', 'GRECIA'),
('GT', 'GUATEMALA'),
('HK', 'HONG-KONG'),
('HR', 'CROACIA'),
('HU', 'HUNGRIA'),
('ID', 'INDONESIA'),
('IE', 'IRLANDA'),
('IL', 'ISRAEL'),
('IN', 'INDIA'),
('IS', 'ISLANDIA'),
('IT', 'ITALIA'),
('JM', 'JAMAICA'),
('JP', 'JAPÓN'),
('KE', 'KENIA'),
('LU', 'LUXEMBURGO'),
('MA', 'MARRUECOS'),
('MC', 'MÓNACO'),
('MT', 'MALTA'),
('MV', 'MALDIVAS'),
('MX', 'MEXICO'),
('NL', 'PAISES BAJOS'),
('NO', 'NORUEGA'),
('PA', 'PANAMÁ'),
('PE', 'PERÚ'),
('PL', 'POLONIA'),
('PR', 'PUERTO RICO'),
('PT', 'PORTUGAL'),
('QA', 'QATAR'),
('RO', 'RUMANIA'),
('RU', 'RUSIA'),
('SC', 'SEYCHELLES'),
('SE', 'SUECIA'),
('SG', 'SINGAPUR'),
('TH', 'TAILANDIA'),
('TN', 'TÚNEZ'),
('TR', 'TURQUIA'),
('TZ', 'TANZANIA (INCLUYE ZANZIBAR)'),
('US', 'ESTADOS UNIDOS'),
('VE', 'VENEZUELA'),
('VN', 'VIETNAM'),
('ZA', 'SUDÁFRICA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `iata`
--

CREATE TABLE `iata` (
  `AIREPORTUA` varchar(3) NOT NULL,
  `HIRIA` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `iata`
--

INSERT INTO `iata` (`AIREPORTUA`, `HIRIA`) VALUES
('ACA', 'MÉXICO (ACAPULCO)'),
('ACE', 'Lanzarote'),
('AGP', 'MALAGA'),
('ALC', 'Alicante'),
('AMM', 'JO (Ammán) AMM'),
('AMS', 'HOLANDA Amsterdam '),
('ATH', 'GRECIA (Atenas)'),
('BCN', 'barcelona'),
('BER', 'ALEMANIA (Berlín)'),
('BIO', 'Bilbao'),
('BJZ', 'Badajoz'),
('BKK', 'TAILANDIA Bagkok'),
('BOG', 'COLOMBIA Bogotá '),
('BOS', 'Boston'),
('BRU', 'BELGICA (Bruselas)'),
('BSB', 'BRASIL (brasilia)'),
('BUE', 'Buenos Aires'),
('CAI', 'EG El Cairo'),
('CAS', 'MARRUECOS (Casablanca)'),
('CCS', 'VENEZUELA (CARACAS)'),
('CDG', 'FRANCIA,París (aeropuerto Charles de Gaulle)'),
('CPH', 'DINAMARCA '),
('DTT', 'DETROIT'),
('DUB', 'IRLANDA (DUBLIN)'),
('DUS', 'ALEMANIA (Dusseldorf)'),
('EAS', 'SAN SEBASTIAN'),
('FRA', 'ALEMANIA (Frankfurt)'),
('FUE', 'FUERTEVENTURA'),
('GMZ', 'LA GOMERA'),
('GRO', 'Gerona'),
('GRX', 'Granada'),
('GVA', 'SUIZA (Ginebra)'),
('HAM', 'ALEMANIA (hamburgo)'),
('HEL', 'FINLANDIA (Helsinki )'),
('HOU', 'Houston'),
('IBZ', 'Ibiza'),
('IST', 'TR (ESTAMBUL)'),
('JFK', 'Nueva York'),
('KIN', 'JAMAICA (kingston)'),
('LAX', 'LOS ANGELES'),
('LBG', 'FRANCIA, Le Bourget'),
('LCG', 'La Coruña LCG'),
('LGH', 'LONDRES (GATWICK)'),
('LHR', 'LONDRES Heathrow'),
('LIM', 'PERU (Lima)'),
('LIS', 'PT (lisboa)'),
('LPA', 'GRAN CANARIA'),
('LYS', 'FRANCIA (lyon)'),
('MAD', 'Madrid'),
('MAH', 'MAHON'),
('MEL', 'AUSTRALIA Melbourne'),
('MEX', 'México D.F.'),
('MIA', 'Miami'),
('MIL', 'ITALIA (Milán)'),
('MJV', 'Murcia'),
('MOW', 'RUSIA (Moscú) MOW'),
('MRS', 'FRANCIA (Marsella)'),
('MUC', 'ALEMANIA (Munich)'),
('NBO', 'KENIA (Nairobi)'),
('ODB', 'Córdoba'),
('ORY', 'FRANCIA (ORLY)'),
('OSL', 'NORUEGA (oslo)'),
('OVD', 'Asturias'),
('PHL', 'Philadelphia PHL'),
('PMI', 'PALMA DE MALLORCA'),
('PNA', 'Pamplona'),
('PRG', 'REPUBLICA CHECA (Praga)'),
('RAK', 'MARRUECOS (Marrakech)'),
('REU', 'REUS'),
('RIO', 'BRASIL (Rio de Janeiro)'),
('SAO', 'BRASIL (Sao Paulo)'),
('SCQ', 'Santiago de Compostela'),
('SDQ', 'REPUBLICA DOMINICANA (Santo Domingo)'),
('SDR', 'SANTANDER'),
('SEA', 'Seattle'),
('SFO', 'SAN FRANCISCO'),
('SLM', 'Salamanca'),
('SPC', 'Santa Cruz de la Palma'),
('STN', 'LONDRES (Stanted)'),
('STO', 'SUECIA (Estocolmo)'),
('STR', 'ALEMANIA (Stuttgart)'),
('SYD', 'AUSTRALIA (SIYNEY)'),
('TFN', 'Tenerife Norte'),
('TFS', 'Tenerife Sur'),
('TUN', 'Túnez'),
('VDE', 'HIERRO'),
('VGO', 'Vigo'),
('VIE', 'AUSTRIA (Viena)'),
('VIT', 'VITORIA'),
('VLC', 'Valencia'),
('WAS', 'WASHINGTON'),
('WAW', 'POLONIA (Varsovia) WAW'),
('XRY', 'JEREZ DE LA FRONTERA'),
('YMQ', 'Montreal, Québec'),
('YOW', 'CA Ottawa, Ontario YOW'),
('YTO', 'CA Toronto, Ontario YTO'),
('YVR', 'CA VANCOUVER'),
('ZAZ', 'Zaragoza'),
('ZRH', 'SUIZA (Zurich)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jarduerak`
--

CREATE TABLE `jarduerak` (
  `ID_JARDUERA` int(11) NOT NULL,
  `IZENA` varchar(30) DEFAULT NULL,
  `DESKRIBAPENA` mediumtext DEFAULT NULL,
  `DATA` date DEFAULT NULL,
  `PREZIOA` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `joaneko_hegaldia`
--

CREATE TABLE `joaneko_hegaldia` (
  `ID_HEGALDIA` int(11) NOT NULL,
  `KODEA` varchar(10) DEFAULT NULL,
  `IRTEERA_DATA` date DEFAULT NULL,
  `IRTEERA_ORDUA` time DEFAULT NULL,
  `IRAUPENA` time DEFAULT NULL,
  `PREZIOA` double DEFAULT NULL,
  `JATORRIZKO_AIREPORTUA` varchar(3) DEFAULT NULL,
  `HELMUGAKO_AIREPORTUA` varchar(3) DEFAULT NULL,
  `AIRELINEA_KODEA` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `joan_etorriko_hegaldia`
--

CREATE TABLE `joan_etorriko_hegaldia` (
  `ID_HEGALDIA` int(11) NOT NULL,
  `KODEA` varchar(10) DEFAULT NULL,
  `ITZULERA_DATA` date DEFAULT NULL,
  `ITZULERA_ORDUA` time DEFAULT NULL,
  `BUELTAKO_IRAUPENA` time DEFAULT NULL,
  `BUELTAKO_AIRELINEA_KODEA` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lang_kopurua`
--

CREATE TABLE `lang_kopurua` (
  `KODEA` varchar(2) NOT NULL,
  `DESKRIBAPENA` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `lang_kopurua`
--

INSERT INTO `lang_kopurua` (`KODEA`, `DESKRIBAPENA`) VALUES
('L1', '5 gehienez ( 1 - 5 bitartean)'),
('L2', '10 gehienez (1 - 10 bitartean)'),
('L3', '20 gehienez (1 - 20 bitartean)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `logela_motak`
--

CREATE TABLE `logela_motak` (
  `KODEA` varchar(3) NOT NULL,
  `DESKRIBAPENA` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `logela_motak`
--

INSERT INTO `logela_motak` (`KODEA`, `DESKRIBAPENA`) VALUES
('DB', 'Bikoitza'),
('DUI', 'Bakoitza, erabilpen indibiduala'),
('SIN', 'Indibiduala'),
('TPL', 'Hirukoitza');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ostatua`
--

CREATE TABLE `ostatua` (
  `ID_OSTATUA` int(11) NOT NULL,
  `HOTELAREN_IZENA` varchar(25) DEFAULT NULL,
  `HIRIA` varchar(35) DEFAULT NULL,
  `PREZIOA` double DEFAULT NULL,
  `SARRERA_EGUNA` date DEFAULT NULL,
  `IRTEERA_EGUNA` date DEFAULT NULL,
  `LOGELA_MOTA_KODEA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ostatua`
--

INSERT INTO `ostatua` (`ID_OSTATUA`, `HOTELAREN_IZENA`, `HIRIA`, `PREZIOA`, `SARRERA_EGUNA`, `IRTEERA_EGUNA`, `LOGELA_MOTA_KODEA`) VALUES
(1, 'bostgarrenhotela', 'caceres', 65, '2000-12-02', '2000-12-15', 'TPL'),
(2, 'lehenhotela', 'malaga', 50, '2000-12-02', '2000-12-15', 'DUI');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `agentzia`
--
ALTER TABLE `agentzia`
  ADD PRIMARY KEY (`ID_AGENTZIA`),
  ADD UNIQUE KEY `ERABILTZAILEA` (`ERABILTZAILEA`),
  ADD KEY `AGENTZIA_MOTA_KODEA` (`AGENTZIA_MOTA_KODEA`),
  ADD KEY `LANGILE_KOPURUA_KODEA` (`LANGILE_KOPURUA_KODEA`);

--
-- Indices de la tabla `agentzia_motak`
--
ALTER TABLE `agentzia_motak`
  ADD PRIMARY KEY (`KODEA`);

--
-- Indices de la tabla `airelineak`
--
ALTER TABLE `airelineak`
  ADD PRIMARY KEY (`KODEA`);

--
-- Indices de la tabla `bidaiak`
--
ALTER TABLE `bidaiak`
  ADD PRIMARY KEY (`ID_BIDAIA`),
  ADD KEY `BIDAIA_MOTA_KODEA` (`BIDAIA_MOTA_KODEA`),
  ADD KEY `AGENTZIA_KODEA` (`AGENTZIA_KODEA`),
  ADD KEY `HERRIALDEAK_KODEA` (`HERRIALDEAK_KODEA`);

--
-- Indices de la tabla `bidaia_motak`
--
ALTER TABLE `bidaia_motak`
  ADD PRIMARY KEY (`KODEA`);

--
-- Indices de la tabla `ekitaldiak`
--
ALTER TABLE `ekitaldiak`
  ADD PRIMARY KEY (`ID_EKITALDIA`),
  ADD KEY `ID_BIDAIA` (`ID_BIDAIA`);

--
-- Indices de la tabla `herrialdeak`
--
ALTER TABLE `herrialdeak`
  ADD PRIMARY KEY (`KOD_HERRIALDEAK`);

--
-- Indices de la tabla `iata`
--
ALTER TABLE `iata`
  ADD PRIMARY KEY (`AIREPORTUA`);

--
-- Indices de la tabla `jarduerak`
--
ALTER TABLE `jarduerak`
  ADD PRIMARY KEY (`ID_JARDUERA`);

--
-- Indices de la tabla `joaneko_hegaldia`
--
ALTER TABLE `joaneko_hegaldia`
  ADD PRIMARY KEY (`ID_HEGALDIA`),
  ADD KEY `JATORRIZKO_AIREPORTUA` (`JATORRIZKO_AIREPORTUA`),
  ADD KEY `HELMUGAKO_AIREPORTUA` (`HELMUGAKO_AIREPORTUA`),
  ADD KEY `AIRELINEA_KODEA` (`AIRELINEA_KODEA`);

--
-- Indices de la tabla `joan_etorriko_hegaldia`
--
ALTER TABLE `joan_etorriko_hegaldia`
  ADD PRIMARY KEY (`ID_HEGALDIA`),
  ADD KEY `BUELTAKO_AIRELINEA_KODEA` (`BUELTAKO_AIRELINEA_KODEA`);

--
-- Indices de la tabla `lang_kopurua`
--
ALTER TABLE `lang_kopurua`
  ADD PRIMARY KEY (`KODEA`);

--
-- Indices de la tabla `logela_motak`
--
ALTER TABLE `logela_motak`
  ADD PRIMARY KEY (`KODEA`);

--
-- Indices de la tabla `ostatua`
--
ALTER TABLE `ostatua`
  ADD PRIMARY KEY (`ID_OSTATUA`),
  ADD KEY `LOGELA_MOTA_KODEA` (`LOGELA_MOTA_KODEA`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `agentzia`
--
ALTER TABLE `agentzia`
  MODIFY `ID_AGENTZIA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `bidaiak`
--
ALTER TABLE `bidaiak`
  MODIFY `ID_BIDAIA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `ekitaldiak`
--
ALTER TABLE `ekitaldiak`
  MODIFY `ID_EKITALDIA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `agentzia`
--
ALTER TABLE `agentzia`
  ADD CONSTRAINT `agentzia_ibfk_1` FOREIGN KEY (`AGENTZIA_MOTA_KODEA`) REFERENCES `agentzia_motak` (`KODEA`),
  ADD CONSTRAINT `agentzia_ibfk_2` FOREIGN KEY (`LANGILE_KOPURUA_KODEA`) REFERENCES `lang_kopurua` (`KODEA`);

--
-- Filtros para la tabla `bidaiak`
--
ALTER TABLE `bidaiak`
  ADD CONSTRAINT `bidaiak_ibfk_1` FOREIGN KEY (`BIDAIA_MOTA_KODEA`) REFERENCES `bidaia_motak` (`KODEA`),
  ADD CONSTRAINT `bidaiak_ibfk_2` FOREIGN KEY (`AGENTZIA_KODEA`) REFERENCES `agentzia` (`ID_AGENTZIA`) ON DELETE CASCADE,
  ADD CONSTRAINT `bidaiak_ibfk_3` FOREIGN KEY (`HERRIALDEAK_KODEA`) REFERENCES `herrialdeak` (`KOD_HERRIALDEAK`);

--
-- Filtros para la tabla `ekitaldiak`
--
ALTER TABLE `ekitaldiak`
  ADD CONSTRAINT `ekitaldiak_ibfk_1` FOREIGN KEY (`ID_BIDAIA`) REFERENCES `bidaiak` (`ID_BIDAIA`) ON DELETE CASCADE;

--
-- Filtros para la tabla `jarduerak`
--
ALTER TABLE `jarduerak`
  ADD CONSTRAINT `jarduerak_ibfk_1` FOREIGN KEY (`ID_JARDUERA`) REFERENCES `ekitaldiak` (`ID_EKITALDIA`) ON DELETE CASCADE;

--
-- Filtros para la tabla `joaneko_hegaldia`
--
ALTER TABLE `joaneko_hegaldia`
  ADD CONSTRAINT `joaneko_hegaldia_ibfk_1` FOREIGN KEY (`ID_HEGALDIA`) REFERENCES `ekitaldiak` (`ID_EKITALDIA`) ON DELETE CASCADE,
  ADD CONSTRAINT `joaneko_hegaldia_ibfk_2` FOREIGN KEY (`JATORRIZKO_AIREPORTUA`) REFERENCES `iata` (`AIREPORTUA`),
  ADD CONSTRAINT `joaneko_hegaldia_ibfk_3` FOREIGN KEY (`HELMUGAKO_AIREPORTUA`) REFERENCES `iata` (`AIREPORTUA`),
  ADD CONSTRAINT `joaneko_hegaldia_ibfk_4` FOREIGN KEY (`AIRELINEA_KODEA`) REFERENCES `airelineak` (`KODEA`);

--
-- Filtros para la tabla `joan_etorriko_hegaldia`
--
ALTER TABLE `joan_etorriko_hegaldia`
  ADD CONSTRAINT `joan_etorriko_hegaldia_ibfk_1` FOREIGN KEY (`ID_HEGALDIA`) REFERENCES `joaneko_hegaldia` (`ID_HEGALDIA`) ON DELETE CASCADE,
  ADD CONSTRAINT `joan_etorriko_hegaldia_ibfk_2` FOREIGN KEY (`BUELTAKO_AIRELINEA_KODEA`) REFERENCES `airelineak` (`KODEA`);

--
-- Filtros para la tabla `ostatua`
--
ALTER TABLE `ostatua`
  ADD CONSTRAINT `ostatua_ibfk_1` FOREIGN KEY (`ID_OSTATUA`) REFERENCES `ekitaldiak` (`ID_EKITALDIA`) ON DELETE CASCADE,
  ADD CONSTRAINT `ostatua_ibfk_2` FOREIGN KEY (`LOGELA_MOTA_KODEA`) REFERENCES `logela_motak` (`KODEA`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
